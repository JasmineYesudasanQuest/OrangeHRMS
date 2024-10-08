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

WebUI.setText(findTestObject('Object Repository/input_Password_oxd-input oxd-input--active'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_oxd-input oxd-input--active'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/button_Login'))

WebUI.click(findTestObject('Object Repository/PIMLink'))

WebUI.click(findTestObject('Object Repository/li_Configuration'))

WebUI.click(findTestObject('Object Repository/AdminPage/a_Custom Fields'))

WebUI.click(findTestObject('Object Repository/AddUserButton'))

WebUI.setText(findTestObject('Object Repository/input_Password_oxd-input oxd-input--active'), 'Test Custom Field')

WebUI.click(findTestObject('Object Repository/AdminPage/div_Screen-- Select --'))

WebUI.click(findTestObject('Object Repository/UserHintOption'))

WebUI.click(findTestObject('Object Repository/UserHintOption'))

WebUI.click(findTestObject('Object Repository/AdminPage/div_Text or Number'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_OrangeHRM/div_TypeText or Number'))

WebUI.click(findTestObject('Object Repository/button_Save'))

WebUI.click(findTestObject('Object Repository/PIM Module/p_Successfully Saved (1)'))

