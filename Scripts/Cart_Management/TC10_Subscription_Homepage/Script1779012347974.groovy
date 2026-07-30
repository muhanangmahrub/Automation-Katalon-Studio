import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage

def homePage = new HomePage()

homePage.footer.scrollToFooter()

homePage.footer.verifySubscriptionVisible()

homePage.footer.subscribeEmail("denny_caknan@gmail.com")

homePage.footer.verifySubscriptionSuccess()
