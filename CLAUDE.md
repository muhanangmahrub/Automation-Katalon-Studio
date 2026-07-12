# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project overview

This is a Katalon Studio (v11.1.3, Web UI project type) test automation project targeting
the public site https://automationexercise.com. Test logic is written in Groovy. There is no
application source code here — this repo *is* the test suite.

## Running tests

Tests are run through Katalon Studio (GUI or CLI), not through gradle/npm/etc. `build.gradle`
only exists to pull in the Katalon Gradle plugin and has no custom tasks defined.

Locally, run/debug through the Katalon Studio IDE by opening `Automation_Exercise.prj`.

From the Katalon CLI (used in CI, see below), a single suite is run like:

```
katalonc -noSplash -retry=0 \
  -testSuitePath="Test Suites/TS_Authentication" \
  -browserType="Chrome (headless)"
```

A single test case can be targeted the same way with `-testCasePath="Test Cases/Authentication/TC1_Register_User"`.

### CI

`.github/workflows/katalon-test.yml` runs on push/PR to `main`, on `macos-latest`, matrixed over:
- `TS_Authentication` (Chrome headless)
- `TS_Product_And_Navigation` (Chrome headless)
- `TSC_Regression_CrossBrowser` (a test suite *collection* — runs its member suites in parallel across Chrome/Firefox, see below)

Katalon Studio Engine itself is downloaded and cached per-version under `~/.katalon`. Note the
macOS-specific step that strips the space out of `Katalon Studio Engine.app` — the space breaks
an internal `file:` URI lookup for `katalon.ini`; don't reintroduce a bundle path with a space.

## Architecture

Katalon enforces a fixed directory layout; the important structural pattern on top of it is a
**Page Object Model implemented as Groovy classes under `Keywords/pages/`**, e.g. `HomePage.groovy`,
`LoginSignupPage.groovy`, `SignupDetailPage.groovy`, `AccountCreatedPage.groovy`,
`AccountDeletedPage.groovy`, `ContactUsPage.groovy`, `AllProductsPage.groovy`,
`ProductDetailPage.groovy`, `CartPage.groovy`, `TestCasesPage.groovy`. Each class wraps one page
of the site: methods call `WebUI.*` keywords against `TestObject`s pulled from `Object Repository/`
via `findTestObject('Page_.../element_name')`. When the site UI changes, the fix belongs in the
matching page object, not in the test script.

Flow through the layers:

- **`Object Repository/`** — recorded element locators (`.rs` files), grouped into folders named
  after the page (e.g. `Page_Automation Exercise - Signup`). Referenced by string path from page
  object methods.
- **`Keywords/pages/*.groovy`** — page objects; the only place that should call `WebUI` keywords directly.
- **`Test Cases/<Category>/TCn_Name.tc`** — Katalon test case *metadata* (XML): declares the test
  data binding and variable list, but not logic.
- **`Scripts/<Category>/TCn_Name/Script*.groovy`** — the actual Groovy body for that test case.
  Instantiates the page objects and calls their methods in sequence; test data variables (e.g.
  `name`, `email`, `password`) are injected automatically from the linked Data File, not declared
  locally.
- **`Test Suites/TS_*.ts` (+ matching `.groovy`)** — group test cases into a runnable suite, each
  with its own variable bindings and browser/profile config. The `.groovy` file next to each `.ts`
  is Katalon's optional suite-level setup/teardown hook file (mostly stubs here, all skipped).
- **`Test Suites/TSC_*.ts`** — a *test suite collection*: runs multiple suites together, optionally
  in parallel (`executionMode`) and across multiple browser `runConfigurationId`s (see
  `TSC_Regression_CrossBrowser.ts`, which fans `TS_Product_And_Navigation` out to Chrome headless
  and `TS_Authentication` out to Firefox headless).
- **`Data Files/*.dat` / `.xlsx`** — externalized test data (e.g. `register_data_new.dat` feeds
  `TC1_Register_User`). Test cases reference these by name in their `.tc` XML, not by path in code.
- **`Profiles/default.glbl`** — the default global variable profile referenced by
  `Libs/internal/GlobalVariable.groovy` (auto-generated, do not hand-edit).
- **`Libs/`** — auto-generated/compiled Groovy backing files for test cases and custom keywords
  (`S05xx_*.groovy`, `TempTestCase*.groovy`) plus `CustomKeywords.groovy`. These mirror content
  under `Scripts/`/`Keywords/`; edit the source under `Scripts/`/`Keywords/` and let Katalon
  regenerate these, don't edit `Libs/` directly.
- **`Test Listeners/BrowserExecutionListener.groovy`** — global listener hooked into every test run
  (browser lifecycle logic), independent of individual test cases.
- **`bin/`, `Reports/`, `.cache/`, `.gradle/`, `dump.rdb`** — build/execution artifacts (compiled
  classes, run reports with screenshots, self-healing object cache). Not source; safe to ignore
  when reading code, and generally not worth committing.

## Working conventions

- When adding a new test case: add a `.tc` file under `Test Cases/<Category>/`, its paired
  `Scripts/<Category>/<name>/Script*.groovy` body, wire any new locators into `Object Repository/`,
  add/extend page-object methods in `Keywords/pages/` rather than inlining `WebUI` calls in the
  script, and register the case in the relevant `Test Suites/*.ts`.
- Categories currently in use: `Authentication` (signup/login/logout flows) and
  `Product_And_Navigation` (browsing, cart, contact us, subscription).
