package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class CartPage {
	def scrollToFooter() {
		WebUI.scrollToElement(findTestObject('Page_Automation Exercise/h2_Subscription'), 1)
	}
	
	def subscribeEmail(String email) {
		WebUI.setText(findTestObject('Page_Automation Exercise/input_Subscription_susbscribe_email'), email)
	}
	
	def verifySubscriptionVisible() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/h2_Subscription'), 1)
		WebUI.takeScreenshot()
	}
	
	def verifySubscriptionSuccess() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/div_You have been successfully subscribed'), 1)
		WebUI.takeScreenshot()
	}
	
	def verifyProductsAreInCart(List<String> productIDs) {
		productIDs.each { productID ->
			WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Cart/row_Dynamic - Product', [("id"): productID]), 2)
		}
		WebUI.takeScreenshot()
	}
	
	def verifyProductDetails(String productID, String expectedPrice, String expectedQuantity, String expectedTotal) {
		String actualPrice = WebUI.getText(findTestObject('Object Repository/Page_Automation Exercise - Cart/price_Dynamic - Product', [("id"): productID]))
		String actualQuantity = WebUI.getText(findTestObject('Object Repository/Page_Automation Exercise - Cart/quantity_Dynamic - Product', [("id"): productID]))
		String actualTotal = WebUI.getText(findTestObject('Object Repository/Page_Automation Exercise - Cart/total_Dynamic - Product', [("id"): productID]))
		
		WebUI.verifyMatch(actualTotal, expectedTotal, false)
		WebUI.verifyMatch(actualQuantity, expectedQuantity, false)
		WebUI.verifyMatch(actualTotal, expectedTotal, false)
	}
}
