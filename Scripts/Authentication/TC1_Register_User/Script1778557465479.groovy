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
import pages.LoginSignupPage
import pages.SignupDetailPage
import pages.HomePage
import pages.AccountCreatedPage
import pages.AccountDeletedPage
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

def registerPage = new LoginSignupPage()
def registerDetailPage = new SignupDetailPage()
def homePage = new HomePage()
def accountCreatedPage = new AccountCreatedPage()
def accountDeletedPage = new AccountDeletedPage()


WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

homePage.verifyLoginSignupVisible()

homePage.clickSignupLogin()

registerPage.signup(name, email)

registerDetailPage.fillDetails(
	password,
	day,
	month,
	year,
	firstname,
	lastname,
	company,
	address,
	address2,
	country,
	state,
	city,
	zipcode,
	mobile)

accountCreatedPage.verifyAccountCreated()

accountCreatedPage.clickContinue()

homePage.verifyLoggedIn()

homePage.clickDeleteAccount()

accountDeletedPage.verifyAccountDeleted()

accountDeletedPage.clickContinue()

WebUI.closeBrowser()

