import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.AllProductsPage
import pages.ProductDetailPage

def homePage = new HomePage()
def productsPage = new AllProductsPage()
def productDetailPage = new ProductDetailPage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickProducts()

productsPage.verifyProductsPage()

productsPage.searchProduct("dress")

productsPage.verifyResultSearch()
