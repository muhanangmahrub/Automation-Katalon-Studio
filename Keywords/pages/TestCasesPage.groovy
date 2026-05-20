package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class TestCasesPage {
	def verifyInTestCasesPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Practice Website for UI Testing - Test Cases/b_Test Cases'), 3)
		WebUI.takeScreenshot()
	}
}
