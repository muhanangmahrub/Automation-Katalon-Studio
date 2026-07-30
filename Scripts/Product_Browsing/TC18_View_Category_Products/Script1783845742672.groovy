import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage

def homePage = new HomePage()

homePage.header.verifyLoginSignupVisible()

homePage.sidebar.viewCategoryProducts()