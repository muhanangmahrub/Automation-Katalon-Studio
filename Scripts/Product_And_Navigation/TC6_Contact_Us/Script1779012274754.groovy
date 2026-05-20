import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.ContactUsPage

def homePage = new HomePage()
def contactUsPage = new ContactUsPage()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

homePage.verifyLoginSignupVisible()

homePage.clickContactUs()

contactUsPage.fillInForm()

homePage.verifyLoginSignupVisible()

WebUI.closeBrowser()