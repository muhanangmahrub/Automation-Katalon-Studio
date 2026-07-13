package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class HomePage {
	def clickDeleteAccount() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Delete Account'))
	}
	
	def clickLogout() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Logout'))
	}
	
	def clickSignupLogin() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Signup _ Login'))
	}
	
	def clickCart() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Cart'))
	}
	
	def clickContactUs() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Contact us'))
	}
	
	def clickTestCases() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Test Cases'))
	}
	
	def clickProducts() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Products'))
	}
	
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
	
	def verifyLoginSignupVisible() {
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Signup _ Login'))
		WebUI.takeScreenshot()
	}
	
	def verifyLoggedIn() {
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Logout'))
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Delete Account'))
		WebUI.takeScreenshot()
	}
	
	def viewCategoryProducts() {
		WebUI.click(findTestObject('Page_Automation Exercise/div_Category Women'))
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/div_SubCategory Women'), 1)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Page_Automation Exercise/div_Category Men'))
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise/div_SubCategory Women'), 1)
		WebUI.takeScreenshot()
	}
	
}
