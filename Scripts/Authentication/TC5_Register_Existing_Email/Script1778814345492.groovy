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

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Signup _ Login'))

WebUI.click(findTestObject('Page_Automation Exercise/a_Signup _ Login'))

WebUI.verifyTextPresent('New User Signup!', false)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Name'), 'Febri Septian')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_Email Address'), 'febritesting1@gmail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.verifyTextPresent('Email Address already exist!', false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

