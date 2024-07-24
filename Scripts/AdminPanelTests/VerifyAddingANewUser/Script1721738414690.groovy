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

WebUI.setText(findTestObject('LoginPage/UserNameField'), 'Admin')

WebUI.setEncryptedText(findTestObject('LoginPage/PasswordField'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.click(findTestObject('Object Repository/AdminPage/AddUser/span_Admin'))

WebUI.click(findTestObject('Object Repository/AdminPage/AddUser/AddUserButton'))

WebUI.click(findTestObject('Object Repository/AdminPage/AddUser/UserTypeDropDownInAddPage'))

WebUI.setText(findTestObject('Object Repository/AdminPage/AddUser/UserHintTextBox'), 'a')

WebUI.click(findTestObject('Object Repository/AdminPage/AddUser/UserHintOption'))

WebUI.setText(findTestObject('Object Repository/AdminPage/AddUser/input_Username_oxd-input oxd-input--focus'), 'Jas12345')

WebUI.setEncryptedText(findTestObject('Object Repository/AdminPage/AddUser/input_Password_oxd-input oxd-input--active'), 
    'PJhMHmON9HDHgTfDu48tsA==')

WebUI.click(findTestObject('Object Repository/AdminPage/AddUser/button_Save'))
