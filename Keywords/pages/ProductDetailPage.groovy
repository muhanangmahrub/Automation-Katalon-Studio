package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ProductDetailPage {
	def verifyProductDetail() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/h2_Blue Top'), 1)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Category Women  Tops'), 1)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/span_Rs. 500'), 1)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Availability In Stock'), 1)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Condition New'), 1)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Brand Polo'), 1)
		WebUI.takeScreenshot()
	}
}
