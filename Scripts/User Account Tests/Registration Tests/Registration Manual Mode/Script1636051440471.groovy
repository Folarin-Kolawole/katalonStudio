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

WebUI.navigateToUrl('automationpractice.com')

'Home Page'
WebUI.click(findTestObject('Home Page/Button_Sign in'))

'Sign in/Registration Page'
WebUI.setText(findTestObject('User Account Pages/Login Page/Registration Section/input_Email address'), 'fola11@gg.com')

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Section/Button_Create an account'))

'User Registration Page/Personal Info Section'
WebUI.check(findTestObject('User Account Pages/Registration Page/Personal Info Section/radio_Gender_Mr'))

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_First Name'), 'Akin')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_Last Name'), 'Folarin')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_Email'), 'fola1@gg.com')

WebUI.setEncryptedText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_Password'), 'RiNOcJvOEA084PqBygjDSQ==')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DOB_Days'), 
    '8', false)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DOB_Months'), 
    '12', false)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DOB_Years'), 
    '2020', false)

WebUI.check(findTestObject('User Account Pages/Registration Page/Personal Info Section/Check_Sign Up For Newsletter'))

WebUI.check(findTestObject('User Account Pages/Registration Page/Personal Info Section/Check_Special Offers From Patrners'))

'Address Section'
WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_First Name'), 'Akin')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Last Name'), 'Folarin')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Company'), 'Horizon Tech')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Address1'), 'AA, Young Life Matters, Accra')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Address2'), 'CC, Old life matters, Accra')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_City'), 'Kumasi')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Address Section/select_State'), '14', false)

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Postcode'), '12345')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Address Section/select_Country'), '21', false)

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/textarea_Additional information_other'), 
    'Keeping it professional, hoping to make it some day')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Phone Home'), '08033581019')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Phone Mobile'), '09033581910')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Alias_Address'), 'CC, All lives matters, Accra ')

WebUI.click(findTestObject('User Account Pages/Registration Page/Button_Register'))

WebUI.verifyElementVisible(findTestObject('User Account Pages/My Account Page/h1_My account'))

WebUI.delay(4)

WebUI.closeBrowser()

