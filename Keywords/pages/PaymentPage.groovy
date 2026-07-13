package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class PaymentPage {
	def verifyInPaymentPage() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Cart/Payment/h_Payment'), 1)
		WebUI.takeScreenshot()
	}
	
	def inputPaymentDetails(String name, String cardnumber, String cvc, String expirationmonth, String expirationyear) {
		WebUI.setText(findTestObject('Page_Automation Exercise - Cart/Payment/input_Name on Card'), name)
		WebUI.setText(findTestObject('Page_Automation Exercise - Cart/Payment/input_Card Number'), cardnumber)
		WebUI.setText(findTestObject('Page_Automation Exercise - Cart/Payment/input_CVC'), cvc)
		WebUI.setText(findTestObject('Page_Automation Exercise - Cart/Payment/input_Expiration'), expirationmonth)
		WebUI.setText(findTestObject('Page_Automation Exercise - Cart/Payment/input_Expiry Year'), expirationyear)
	}
	
	def clickPayButton() {
		WebUI.click(findTestObject('Page_Automation Exercise - Cart/Payment/button_Pay Button'))
	}
	
	def verifyOrderPlaced() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Cart/Payment/h_ORDER PLACED'), 1)
		WebUI.verifyTextPresent('Congratulations! Your order has been confirmed!', false)
		WebUI.takeScreenshot()
	}
}
