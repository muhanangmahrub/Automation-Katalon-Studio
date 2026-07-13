import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.LoginSignupPage
import pages.HomePage
import internal.GlobalVariable as GlobalVariable

def loginPage = new LoginSignupPage()
def homePage = new HomePage()

homePage.verifyLoginSignupVisible()

homePage.clickSignupLogin()

loginPage.verifyText()

loginPage.login(GlobalVariable.email, GlobalVariable.encryptedPassword)

WebUI.verifyTextPresent('Logged in as', false)

WebUI.takeScreenshot()

homePage.verifyLoggedIn()

homePage.clickLogout()

WebUI.takeScreenshot()
