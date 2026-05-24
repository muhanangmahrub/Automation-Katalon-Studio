import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.LoginSignupPage

def homePage = new HomePage()
def loginPage = new LoginSignupPage()

homePage.clickSignupLogin()

loginPage.verifyText()

loginPage.login("priskavan@gmail.com", "h1bZaoNZrXJGImBBMGIoZQ==")

WebUI.verifyTextPresent('Your email or password is incorrect!', false)

WebUI.takeScreenshot()
