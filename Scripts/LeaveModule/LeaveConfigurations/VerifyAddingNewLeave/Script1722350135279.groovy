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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Leave/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Leave/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Leave/button_Login'))

WebUI.click(findTestObject('Object Repository/Leave/a_Leave'))

WebUI.click(findTestObject('Object Repository/Leave/li_Configure'))

WebUI.click(findTestObject('Object Repository/Leave/a_Holidays'))

WebUI.click(findTestObject('Object Repository/Leave/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/Leave/div_2'))

WebUI.click(findTestObject('Object Repository/Leave/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/Leave/div_10'))

WebUI.click(findTestObject('Object Repository/Leave/button_Search'))

WebUI.click(findTestObject('Object Repository/Leave/button_Add'))

WebUI.setText(findTestObject('Object Repository/Leave/input_Password_oxd-input oxd-input--active'), 'Test leave')

WebUI.click(findTestObject('Object Repository/Leave/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/Leave/div_1'))

WebUI.click(findTestObject('Object Repository/Leave/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/Leave/div_2'))

WebUI.click(findTestObject('Object Repository/Leave/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/Leave/span_Yes_oxd-radio-input oxd-radio-input--a_530dc0'))

WebUI.click(findTestObject('Object Repository/Leave/div_Add HolidayNameDateFull Day Half DayHal_6ade88'))

WebUI.click(findTestObject('Object Repository/Leave/button_Save'))

WebUI.click(findTestObject('Object Repository/Leave/div_SuccessSuccessfully Saved'))

