import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.CartPage
import pages.AllProductsPage
import pages.ProductDetailPage

def homePage = new HomePage()
def cartPage = new CartPage()
def allProductsPage = new AllProductsPage()
def productDetailPage = new ProductDetailPage()

homePage.verifyLoginSignupVisible()

homePage.clickProducts()

allProductsPage.verifyProductsPage()

allProductsPage.clickViewProduct("2")

productDetailPage.verifyProductDetail()

productDetailPage.setQuantity("4")

productDetailPage.clickAddToCart()

productDetailPage.clickViewCart()

cartPage.verifyProductDetails("2", "Rs. 400", "4", "Rs. 1600")

