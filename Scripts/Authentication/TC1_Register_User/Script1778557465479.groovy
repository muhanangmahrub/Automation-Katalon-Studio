import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Automation Exercise/a_Signup _ Login'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Name'), 'Diki Suhendi')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Email Address Register'), 'diki.suhendi16@gmail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.verifyTextPresent('ENTER ACCOUNT INFORMATION', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Automation Exercise - Signup/div_uniform-id_gender1'))

WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup/input_Password _'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_days'), '1', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_months'), '1', false)

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_years'), '2001', false)

WebUI.click(findTestObject('Page_Automation Exercise - Signup/label_Sign up for our newsletter'))

WebUI.click(findTestObject('Page_Automation Exercise - Signup/label_Receive special offers from our partners'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_First name _'), 'Diki')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Last name _'), 'Suhendi')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Company'), 'PT Testing 1999')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address _ (Street address, P.O. Box, Compa'), 'Jalan Kebenaran Tuhan')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address 2'), 'Jalan Kebaikan')

WebUI.selectOptionByValue(findTestObject('Page_Automation Exercise - Signup/select_Country _'), 'United States', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_State _'), 'Michigan')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_City _'), 'Detroit')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_zipcode'), '19999')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Mobile Number _'), '087555666777')

WebUI.click(findTestObject('Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyTextPresent('ACCOUNT CREATED!', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.click(findTestObject('Page_Automation Exercise/a_Delete Account'))

WebUI.verifyTextPresent('ACCOUNT DELETED!', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

