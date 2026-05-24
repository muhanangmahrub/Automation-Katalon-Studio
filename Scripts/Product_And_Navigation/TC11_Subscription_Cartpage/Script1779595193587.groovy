import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.CartPage

def homePage = new HomePage()
def cartPage = new CartPage()

homePage.verifyLoginSignupVisible()

homePage.clickCart()

cartPage.scrollToFooter()

cartPage.verifySubscriptionVisible()

cartPage.subscribeEmail("zulfian2018@gmail.com")

cartPage.verifySubscriptionSuccess()
