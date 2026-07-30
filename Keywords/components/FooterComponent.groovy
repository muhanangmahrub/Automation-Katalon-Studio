package components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class FooterComponent {
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
}
