import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import pages.HomePage
import pages.AllProductsPage
import pages.ProductDetailPage
import pages.CartPage
import pages.LoginSignupPage

def homePage = new HomePage()
def productsPage = new AllProductsPage()
def productDetailPage = new ProductDetailPage()
def cartPage = new CartPage()
def loginSignupPage = new LoginSignupPage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickProducts()

productsPage.verifyProductsPage()

productsPage.searchProduct("dress")

productsPage.verifyResultSearch()

Map productInfo = productsPage.getFirstSearchResultInfo()

productsPage.addFirstSearchResultToCart()

productsPage.clickViewCart()

cartPage.verifyProductDetails(productInfo.productId, productInfo.price, productInfo.quantity, productInfo.price)

homePage.header.clickSignupLogin()

loginSignupPage.login(GlobalVariable.email, GlobalVariable.encryptedPassword)

homePage.header.clickCart()

cartPage.verifyProductDetails(productInfo.productId, productInfo.price, productInfo.quantity, productInfo.price)

cartPage.removeProductFromCart(productInfo.productId)
