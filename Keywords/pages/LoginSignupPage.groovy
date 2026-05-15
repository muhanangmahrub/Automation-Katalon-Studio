package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class LoginSignupPage {
	def login(String email, String password) {
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Email Address Login'), email)
		WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup  Login/input_Password'), password)
		WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Login'))
	}
	
	def signup(String name, String email) {
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Name'), name)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Email Address'), email)
		WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))
	}
	
	def verifyText() {
		WebUI.verifyTextPresent('Login to your account', false)
		WebUI.verifyTextPresent('New User Signup!', false)
		WebUI.takeScreenshot()
	}
}
