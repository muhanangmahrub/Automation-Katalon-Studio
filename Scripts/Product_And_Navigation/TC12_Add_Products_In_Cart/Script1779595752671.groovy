import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.CartPage
import pages.AllProductsPage

def homePage = new HomePage()
def cartPage = new CartPage()
def allProductsPage = new AllProductsPage()

homePage.verifyLoginSignupVisible()

homePage.clickProducts()

allProductsPage.verifyProductsPage()

allProductsPage.addToCart("1")

allProductsPage.clickContinueShopping()

allProductsPage.addToCart("2")

allProductsPage.clickViewCart()

cartPage.verifyProductsAreInCart(["1", "2"])

cartPage.verifyProductDetails("1", "Rs. 500", "1", "Rs. 500")

cartPage.verifyProductDetails("2", "Rs. 400", "1", "Rs. 400")
