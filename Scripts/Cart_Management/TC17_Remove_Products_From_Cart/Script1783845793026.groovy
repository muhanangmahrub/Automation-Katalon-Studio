import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.CartPage
import pages.AllProductsPage

def homePage = new HomePage()
def cartPage = new CartPage()
def allProductsPage = new AllProductsPage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickProducts()

allProductsPage.verifyProductsPage()

allProductsPage.addToCart("1")

allProductsPage.clickViewCart()

cartPage.verifyProductsAreInCart(["1"])

cartPage.verifyProductDetails("1", "Rs. 500", "1", "Rs. 500")

cartPage.removeProductFromCart("1")

cartPage.verifyProductsAreNotInCart(['1'])