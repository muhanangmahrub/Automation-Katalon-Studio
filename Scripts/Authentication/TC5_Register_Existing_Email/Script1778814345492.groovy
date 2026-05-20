import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.LoginSignupPage

def homePage = new HomePage()
def loginSignupPage = new LoginSignupPage()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

homePage.verifyLoginSignupVisible()

homePage.clickSignupLogin()

loginSignupPage.verifyText()

loginSignupPage.signup("Febri Septian", "febritesting1@gmail.com")

WebUI.verifyTextPresent('Email Address already exist!', false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

