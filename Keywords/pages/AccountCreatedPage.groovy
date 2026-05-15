package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class AccountCreatedPage {
	def verifyAccountCreated() {
		WebUI.verifyTextPresent('ACCOUNT CREATED!', false)
		WebUI.takeScreenshot()
	}
	
	def clickContinue() {
		WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))
	}
}
