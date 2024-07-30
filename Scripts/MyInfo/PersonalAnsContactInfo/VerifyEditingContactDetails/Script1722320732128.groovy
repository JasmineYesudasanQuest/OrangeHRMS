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

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/MyInfo/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/MyInfo/button_Login'))

WebUI.click(findTestObject('Object Repository/MyInfo/span_My Info'))

WebUI.click(findTestObject('Object Repository/MyInfo/a_Contact Details'))

WebUI.doubleClick(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'Street One')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'Street Two')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'New York')

WebUI.doubleClick(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'Trivandrum')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'Kerala')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '691765')

WebUI.click(findTestObject('Object Repository/MyInfo/div_-- Select --_oxd-select-text--after'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '98765432')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '987568875')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '112-898-7612')

WebUI.doubleClick(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '7364792534')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'john@orange.com')

WebUI.doubleClick(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), '')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'anbajdb@sjndjd.vi')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Password_oxd-input oxd-input--active'), 'anbajdb@sjndjd.vin')

WebUI.click(findTestObject('Object Repository/MyInfo/button_Save'))

WebUI.click(findTestObject('Object Repository/MyInfo/p_Successfully Updated'))

