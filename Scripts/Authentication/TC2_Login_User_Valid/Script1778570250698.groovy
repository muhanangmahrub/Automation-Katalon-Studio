import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.LoginSignupPage
import pages.HomePage

def loginPage = new LoginSignupPage()
def homePage = new HomePage()

homePage.verifyLoginSignupVisible()

homePage.clickSignupLogin()

loginPage.verifyText()

loginPage.login('febritesting1@gmail.com', 'h1bZaoNZrXJGImBBMGIoZQ==')

WebUI.verifyTextPresent('Logged in as', false)

WebUI.takeScreenshot()

homePage.verifyLoggedIn()

homePage.clickLogout()

WebUI.takeScreenshot()
