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
		String actualPrice = WebUI.getText(findTestObject('Page_Automation Exercise - Cart/price_Dynamic - Product', [("id"): productID]))
		String actualQuantity = WebUI.getText(findTestObject('Page_Automation Exercise - Cart/quantity_Dynamic - Product', [("id"): productID]))
		String actualTotal = WebUI.getText(findTestObject('Page_Automation Exercise - Cart/total_Dynamic - Product', [("id"): productID]))
		
		WebUI.verifyMatch(actualPrice, expectedPrice, false)
		WebUI.verifyMatch(actualQuantity, expectedQuantity, false)
		WebUI.verifyMatch(actualTotal, expectedTotal, false)
	}
	
	def clickProceedToCheckout() {
		WebUI.click(findTestObject('Page_Automation Exercise - Cart/a_Proceed To Checkout'))
	}
	
	def verifyAddressAndReviewOrder() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Cart/Checkout/h_Address Details'), 2)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Cart/Checkout/ul_Address Delivery'), 2)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Cart/Checkout/ul_Address Invoice'), 2)
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Cart/Checkout/h_Review Your Order'), 2)
		WebUI.takeScreenshot()
	}
	
	def inputCommentAndPlaceOrder() {
		WebUI.setText(findTestObject('Page_Automation Exercise - Cart/Checkout/textarea_Comment Message'), 'Test Katalon')
		WebUI.click(findTestObject('Page_Automation Exercise - Cart/Checkout/button_Place Order'))
	}
	
	def signupOrLogin() {
		WebUI.click(findTestObject('Page_Automation Exercise - Cart/a_Register or Login'))
	}
	
	def removeProductFromCart(String productID) {
		WebUI.click(findTestObject('Page_Automation Exercise - Cart/i_Remove Product', [("id"): productID]))
	}
	
	def verifyProductsAreNotInCart(List<String> productIDs) {
		productIDs.each { productID ->
			WebUI.verifyElementNotPresent(findTestObject('Page_Automation Exercise - Cart/row_Dynamic - Product', [("id"): productID]), 2)
		}
		WebUI.takeScreenshot()
	}
}
