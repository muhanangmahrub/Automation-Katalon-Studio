import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.ContactUsPage

def homePage = new HomePage()
def contactUsPage = new ContactUsPage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickContactUs()

contactUsPage.fillInForm()

homePage.header.verifyLoginSignupVisible()
