import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.LoginSignupPage

def homePage = new HomePage()
def loginPage = new LoginSignupPage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickSignupLogin()

loginPage.verifyText()

loginPage.login('febritesting1@gmail.com', 'h1bZaoNZrXJGImBBMGIoZQ==')

WebUI.verifyTextPresent('Logged in as', false)

WebUI.takeScreenshot()

homePage.header.clickLogout()

homePage.header.verifyLoginSignupVisible()
