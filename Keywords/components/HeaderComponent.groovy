package components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class HeaderComponent {
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
	
	def verifyLoggedIn() {
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Logout'))
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Delete Account'))
		WebUI.takeScreenshot()
	}
	
	def verifyLoginSignupVisible() {
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Signup _ Login'))
		WebUI.takeScreenshot()
	}
}
