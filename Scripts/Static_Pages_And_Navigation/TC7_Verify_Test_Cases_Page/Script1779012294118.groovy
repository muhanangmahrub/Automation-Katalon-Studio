import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.TestCasesPage

def homePage = new HomePage()
def testCasesPage = new TestCasesPage()

homePage.verifyLoginSignupVisible()

homePage.clickTestCases()

testCasesPage.verifyInTestCasesPage()
