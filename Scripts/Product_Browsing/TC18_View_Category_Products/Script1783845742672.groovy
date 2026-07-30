import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.LoginSignupPage
import pages.SignupDetailPage
import pages.HomePage
import pages.AccountCreatedPage
import pages.AccountDeletedPage

def registerPage = new LoginSignupPage()
def registerDetailPage = new SignupDetailPage()
def homePage = new HomePage()
def accountCreatedPage = new AccountCreatedPage()
def accountDeletedPage = new AccountDeletedPage()

homePage.header.verifyLoginSignupVisible()

homePage.sidebar.viewCategoryProducts()