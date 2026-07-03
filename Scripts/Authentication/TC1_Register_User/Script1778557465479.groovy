
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

homePage.verifyLoginSignupVisible()

homePage.clickSignupLogin()

registerPage.signup(name)

registerDetailPage.fillDetails(
	password,
	day,
	month,
	year,
	firstname,
	lastname,
	company,
	address,
	address2,
	country,
	state,
	city,
	zipcode,
	mobile)

accountCreatedPage.verifyAccountCreated()

accountCreatedPage.clickContinue()

homePage.verifyLoggedIn()

homePage.clickDeleteAccount()

accountDeletedPage.verifyAccountDeleted()

accountDeletedPage.clickContinue()
