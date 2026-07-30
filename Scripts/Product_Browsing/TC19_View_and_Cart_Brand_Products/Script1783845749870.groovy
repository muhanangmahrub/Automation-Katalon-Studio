import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage

def homePage = new HomePage()

homePage.header.verifyLoginSignupVisible()

homePage.sidebar.verifyBrandsSidebar()

homePage.sidebar.clickBrandsName("Polo")

homePage.sidebar.verifyBrandsHeading("Polo")

homePage.sidebar.clickBrandsName("Madame")

homePage.sidebar.verifyBrandsHeading("Madame")