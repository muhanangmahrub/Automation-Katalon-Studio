package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement

public class AllProductsPage {
	
	def addToCart(String productID) {
		WebUI.mouseOver(findTestObject('Object Repository/Page_Automation Exercise - Products/div_Dynamic - Product', [("id"): productID]))
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Products/a_Dynamic - Add to Cart', [("id"): productID]))
	}
	
	def clickContinueShopping() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Products/b_Continue Shopping'))
	}
	
	def clickViewCart() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Products/a_View Cart'))
	}
	
	def clickViewProduct(String productID) {
		WebUI.click(findTestObject('Page_Automation Exercise - Products/a_Dynamic - View Product', [("id"): productID]))
	}
	
	def searchProduct(String keyword) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Products/input_Search_product'), keyword)
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Products/button_Submit_search'))
	}
	
	def verifyProductsPage() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Products/h2_All Products'), 2)
		WebUI.takeScreenshot()
	}
	
	def verifyResultSearch() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Products/h2_Searched Products'), 1)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Products/p_Product Names'), 1)
		WebUI.takeScreenshot()
	}
}
