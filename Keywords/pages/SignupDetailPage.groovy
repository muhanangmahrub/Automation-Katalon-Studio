package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class SignupDetailPage {
	def fillDetails(String password, String day, String month, String year, String firstname,
		String lastname, String company, String address, String address2, String country,
		String state, String city, String zipcode, String mobile) {
		WebUI.waitForElementPresent(findTestObject('Page_Automation Exercise - Signup/div_uniform-id_gender1'), 2)
		WebUI.verifyTextPresent('ENTER ACCOUNT INFORMATION', false)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Page_Automation Exercise - Signup/div_uniform-id_gender1'))
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Password _'), password)
		WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_days'), day, false)
		WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_months'), month, false)
		WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_years'), year, false)
		WebUI.click(findTestObject('Page_Automation Exercise - Signup/label_Receive special offers from our partners'))
		WebUI.click(findTestObject('Page_Automation Exercise - Signup/label_Sign up for our newsletter'))
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_First name _'), firstname)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Last name _'), lastname)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Company'), company)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address _ (Street address, P.O. Box, Compa'), address)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address 2'), address2)
		WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Country _'), country, false)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_State _'), state)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_City _'), city)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_zipcode'), zipcode)
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Mobile Number _'), mobile)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Page_Automation Exercise - Signup/button_Create Account'))
	}
}
