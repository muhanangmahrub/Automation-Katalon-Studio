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
}
