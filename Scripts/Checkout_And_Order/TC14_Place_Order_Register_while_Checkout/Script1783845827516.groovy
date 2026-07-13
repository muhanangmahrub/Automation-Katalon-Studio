import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.CartPage
import pages.AllProductsPage
import pages.ProductDetailPage
import pages.LoginSignupPage
import pages.SignupDetailPage
import pages.AccountCreatedPage
import pages.PaymentPage
import pages.AccountDeletedPage

def homePage = new HomePage()
def cartPage = new CartPage()
def allProductsPage = new AllProductsPage()
def productDetailPage = new ProductDetailPage()
def loginSignupPage = new LoginSignupPage()
def signupDetailPage = new SignupDetailPage()
def accountCreatedPage = new AccountCreatedPage()
def paymentPage = new PaymentPage()
def accountDeletedPage = new AccountDeletedPage()

homePage.verifyLoginSignupVisible()

homePage.clickProducts()

allProductsPage.verifyProductsPage()

allProductsPage.addToCart("3")

allProductsPage.clickViewCart()

cartPage.verifyProductsAreInCart(["3"])

cartPage.clickProceedToCheckout()

cartPage.signupOrLogin()

loginSignupPage.signup(name)

signupDetailPage.fillDetails(password,
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

homePage.clickCart()

cartPage.clickProceedToCheckout()

cartPage.verifyAddressAndReviewOrder()

cartPage.inputCommentAndPlaceOrder()

paymentPage.verifyInPaymentPage()

paymentPage.inputPaymentDetails("Melissa", "123 456 789 333", "123", "04", "2030")

paymentPage.clickPayButton()

paymentPage.verifyOrderPlaced()

homePage.clickDeleteAccount()

accountDeletedPage.verifyAccountDeleted()

accountDeletedPage.clickContinue()