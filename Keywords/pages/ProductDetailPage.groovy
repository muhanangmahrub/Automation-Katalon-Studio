package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ProductDetailPage {
	def verifyProductDetail() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/h2_Product Title'), 1)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/p_Category'), 1)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/span_Price'), 1)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/p_Availability'), 1)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/p_Condition'), 1)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/p_Brand'), 1)
		WebUI.takeScreenshot()
	}
	
	def setQuantity(String quantity) {
		WebUI.clearText(findTestObject('Page_Automation Exercise - Product Details/input_Quantity'))
		WebUI.setText(findTestObject('Page_Automation Exercise - Product Details/input_Quantity'), quantity)
		WebUI.takeScreenshot()
	}
	
	def clickAddToCart() {
		WebUI.click(findTestObject('Page_Automation Exercise - Product Details/button_Add to Cart'))
	}
	
	def clickViewCart() {
		WebUI.click(findTestObject('Page_Automation Exercise - Cart/a_View Cart'))
	}
}
