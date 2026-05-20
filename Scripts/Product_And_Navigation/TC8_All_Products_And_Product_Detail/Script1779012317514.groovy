import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.AllProductsPage
import pages.ProductDetailPage

def homePage = new HomePage()
def productsPage = new AllProductsPage()
def productDetailPage = new ProductDetailPage()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

homePage.verifyLoginSignupVisible()

homePage.clickProducts()

productsPage.verifyProductsPage()

productsPage.clickViewProduct()

productDetailPage.verifyProductDetail()

WebUI.closeBrowser()