import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage
import pages.CartPage

def homePage = new HomePage()
def cartPage = new CartPage()

homePage.header.verifyLoginSignupVisible()

homePage.header.clickCart()

cartPage.footer.scrollToFooter()

cartPage.footer.verifySubscriptionVisible()

cartPage.footer.subscribeEmail("zulfian2018@gmail.com")

cartPage.footer.verifySubscriptionSuccess()
