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

WebUI.setText(findTestObject('Object Repository/PIM Module/input_Password_oxd-input oxd-input--active'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PIM Module/input_Password_oxd-input oxd-input--active'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/PIM Module/button_Login'))

WebUI.click(findTestObject('Object Repository/PIM Module/PIMLink'))

WebUI.click(findTestObject('Object Repository/PIM Module/a_Reports'))

WebUI.click(findTestObject('Object Repository/PIM Module/UserTypeDropDownInAddPage'))

WebUI.setText(findTestObject('Object Repository/PIM Module/input_Password_oxd-input oxd-input--active'), 'Test Repot')

WebUI.click(findTestObject('Object Repository/PIM Module/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/PIM Module/div_Current Employees Only'))

WebUI.click(findTestObject('Object Repository/PIM Module/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/PIM Module/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/PIM Module/button_Save'))

WebUI.click(findTestObject('Object Repository/PIM Module/UserTypeDropDownInAddPage'))

WebUI.click(findTestObject('Object Repository/PIM Module/span_Show Deprecated Fields_oxd-switch-inpu_894c62'))

WebUI.click(findTestObject('Object Repository/PIM Module/button_Save'))

WebUI.click(findTestObject('Object Repository/PIM Module/p_Successfully Saved'))

