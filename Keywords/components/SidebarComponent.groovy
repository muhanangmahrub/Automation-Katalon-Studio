package components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class SidebarComponent {
	def viewCategoryProducts() {
		WebUI.click(findTestObject('Page_Automation Exercise/div_Category Women'))
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/div_SubCategory Women'), 1)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Page_Automation Exercise/div_Category Men'))
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/div_SubCategory Men'), 1)
		WebUI.takeScreenshot()
	}
	
	def verifyBrandsSidebar() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise/div_brands_products'), 1)
	}
	
	def clickBrandsName(String brandName) {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Dynamic brands name', [("brandName"): brandName]))
	}
	
	def verifyBrandsHeading(String brandName) {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/h2_Dynamic brand products', [("brandName"): brandName]))
	}
}
