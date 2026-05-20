package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class HomePage {
	def verifyLoginSignupVisible() {
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Signup _ Login'))
		WebUI.takeScreenshot()
	}
	
	def verifyLoggedIn() {
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Logout'))
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Delete Account'))
		WebUI.takeScreenshot()
	}
	
	def clickDeleteAccount() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Delete Account'))
	}
	
	def clickLogout() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Logout'))
	}
	
	def clickSignupLogin() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Signup _ Login'))
	}
	
	def clickContactUs() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Contact us'))
	}
}
