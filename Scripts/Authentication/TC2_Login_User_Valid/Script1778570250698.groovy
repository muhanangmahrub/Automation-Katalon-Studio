import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.LoginSignupPage
import pages.HomePage
import internal.GlobalVariable as GlobalVariable

def loginPage = new LoginSignupPage()
def homePage = new HomePage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickSignupLogin()

loginPage.verifyText()

loginPage.login(GlobalVariable.email, GlobalVariable.encryptedPassword)

WebUI.verifyTextPresent('Logged in as', false)

WebUI.takeScreenshot()

homePage.header.verifyLoggedIn()

homePage.header.clickLogout()

WebUI.takeScreenshot()
