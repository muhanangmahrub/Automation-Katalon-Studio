import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.LoginSignupPage

def homePage = new HomePage()
def loginPage = new LoginSignupPage()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

homePage.verifyLoginSignupVisible()

homePage.clickSignupLogin()

loginPage.verifyText()

loginPage.login('febritesting1@gmail.com', 'h1bZaoNZrXJGImBBMGIoZQ==')

WebUI.verifyTextPresent('Logged in as', false)

WebUI.takeScreenshot()

homePage.clickLogout()

homePage.verifyLoginSignupVisible()

WebUI.closeBrowser()

