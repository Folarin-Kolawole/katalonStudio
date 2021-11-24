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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Home Page/Button_Sign in'))

WebUI.setText(findTestObject('User Account Pages/Login Page/Registration Section/input_Email address'), 'testing103@automation.com')

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Section/Button_Create an account'))

WebUI.click(findTestObject('User Account Pages/Registration Page/Personal Info Section/radio_Gender_Mr'))

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_First Name'), 'Learning')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_Last Name'), 'Katalon')

WebUI.setEncryptedText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_Password'), 'JltEQgaE0YE=')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DOB_Days'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DOB_Months'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DOB_Years'), 
    '1995', true)

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Company'), 'Autolife')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Address1'), 'Living the life, costa rica')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_City'), 'Jumbo')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Address Section/select_State'), '3', true)

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Postcode'), '00000')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Phone Mobile'), '08088334567')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Alias_Address'), 'About to get it, the life.')

WebUI.click(findTestObject('User Account Pages/Registration Page/Button_Register'))

WebUI.delay(7)

WebUI.closeBrowser()

