import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.CartPage
import pages.AllProductsPage
import pages.LoginSignupPage
import pages.SignupDetailPage
import pages.AccountCreatedPage
import pages.PaymentPage
import pages.AccountDeletedPage

def homePage = new HomePage()
def cartPage = new CartPage()
def allProductsPage = new AllProductsPage()
def loginSignupPage = new LoginSignupPage()
def paymentPage = new PaymentPage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickSignupLogin()

loginSignupPage.verifyText()

loginSignupPage.login('febritesting1@gmail.com', 'h1bZaoNZrXJGImBBMGIoZQ==')

WebUI.verifyTextPresent('Logged in as', false)

WebUI.takeScreenshot()

homePage.header.verifyLoggedIn()

allProductsPage.addToCart("2")

allProductsPage.clickViewCart()

cartPage.verifyProductsAreInCart(["2"])

cartPage.clickProceedToCheckout()

cartPage.verifyAddressAndReviewOrder()

cartPage.inputCommentAndPlaceOrder()

paymentPage.verifyInPaymentPage()

paymentPage.inputPaymentDetails("Melissa", "123 456 789 333", "123", "04", "2030")

paymentPage.clickPayButton()

paymentPage.verifyOrderPlaced()