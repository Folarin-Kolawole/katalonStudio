package automationpractice

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class User {
	
	
	/**
	 * Log in to automationpractice.com
	 * @param user email address for logging in
	 * @param user password for logging in
	 */
	@Keyword
	def Login(String emailAddress, String password) {
		
		WebUI.click(findTestObject('Home Page/Button_Sign in'))
		WebUI.setText(findTestObject('User Account Pages/Login Page/Login Section/input_Email address'), emailAddress)
		WebUI.setText(findTestObject('User Account Pages/Login Page/Login Section/input_Password'), password)
		WebUI.click(findTestObject('User Account Pages/Login Page/Login Section/Button_Sign in'))
			
	}
	
	/**
	 * Log out of automationpractice.com
	 */
	@Keyword
	def Logout() {
		WebUI.navigateToUrl('automationpractice.com')
		
	}
	
}
