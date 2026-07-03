package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class LoginSignupPage {
	def login(String email, String password) {
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Email Address Login'), email)
		WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup  Login/input_Password'), password)
		WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Login'))
	}
	
	def signup(String name) {
		def pool = ('a'..'z') + ('A'..'Z') + ('0'..'9')
		def randomString = (1..10).collect { pool[new Random().nextInt(pool.size())] }.join()
		def randomEmail = "${randomString}@example.com"
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Name'), name)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Email Address'), randomEmail)
		WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))
	}
	
	def signupExisting(String name, String email) {
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
