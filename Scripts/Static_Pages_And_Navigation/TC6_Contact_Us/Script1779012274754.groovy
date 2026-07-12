import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.ContactUsPage

def homePage = new HomePage()
def contactUsPage = new ContactUsPage()

homePage.verifyLoginSignupVisible()

homePage.clickContactUs()

contactUsPage.fillInForm()

homePage.verifyLoginSignupVisible()
