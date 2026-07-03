import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.LoginSignupPage

def homePage = new HomePage()
def loginSignupPage = new LoginSignupPage()

homePage.verifyLoginSignupVisible()

homePage.clickSignupLogin()

loginSignupPage.verifyText()

loginSignupPage.signupExisting("Febri Septian", "febritesting1@gmail.com")

WebUI.verifyTextPresent('Email Address already exist!', false)

WebUI.takeScreenshot()
