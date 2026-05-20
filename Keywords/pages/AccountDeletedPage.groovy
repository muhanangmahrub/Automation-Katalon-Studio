package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class AccountDeletedPage {
	def clickContinue() {
		WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))
	}
	
	def verifyAccountDeleted() {
		WebUI.verifyTextPresent('ACCOUNT DELETED!', false)
		WebUI.takeScreenshot()
	}
}
