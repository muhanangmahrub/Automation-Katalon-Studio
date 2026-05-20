package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ContactUsPage {
	def fillInForm() {
		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Contact Us/h2_Get In Touch'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_name'), 'Mahmudin')
		WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_email'), 'mahmudinmajid@gmail.com')
		WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_subject'), 'Help to checkout')
		WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/textarea_Get In Touch_message'), 'Hey, i need your help to checkout')
		WebUI.uploadFile(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_upload_file'), '/Users/muhamadanangmahrub/Downloads/ML Project Doc Template.docx')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))
		WebUI.acceptAlert()
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Contact Us/div_Success Your details have been submitted successfully'), 3)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Page_Automation Exercise - Contact Us/a_Home'))
		WebUI.takeScreenshot()
	}
}
