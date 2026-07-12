import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage

def homePage = new HomePage()

homePage.scrollToFooter()

homePage.verifySubscriptionVisible()

homePage.subscribeEmail("denny_caknan@gmail.com")

homePage.verifySubscriptionSuccess()
