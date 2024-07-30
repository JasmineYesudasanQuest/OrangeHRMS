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

WebUI.click(findTestObject('Object Repository/MyInfo/a_My Info'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Full Name_firstName'), 'mandaJohnJohn edited')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Full Name_middleName'), 'akhil edited')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Full Name_lastName'), 'userDoe edited')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--active'), 'muser')

WebUI.doubleClick(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--focus'), '1067442')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--active'), '4957589')

WebUI.doubleClick(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--focus'), '65497')

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--active'), '56788')

WebUI.doubleClick(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Employee Id_oxd-input oxd-input--focus'), '983982778216e')

WebUI.click(findTestObject('Object Repository/MyInfo/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.click(findTestObject('Object Repository/MyInfo/i_License Expiry Date_oxd-icon bi-chevron-right'))

WebUI.click(findTestObject('Object Repository/MyInfo/div_30'))

WebUI.click(findTestObject('Object Repository/MyInfo/i_American_oxd-icon bi-caret-up-fill oxd-se_bc7220'))

WebUI.click(findTestObject('Object Repository/MyInfo/i_American_oxd-icon bi-caret-up-fill oxd-se_bc7220'))

WebUI.click(findTestObject('Object Repository/MyInfo/span_Female_oxd-radio-input oxd-radio-input_59a84c'))

WebUI.click(findTestObject('Object Repository/MyInfo/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.click(findTestObject('Object Repository/MyInfo/i_Date of Birth_oxd-icon bi-caret-down-fill_d48360'))

WebUI.click(findTestObject('Object Repository/MyInfo/li_1979'))

WebUI.click(findTestObject('Object Repository/MyInfo/div_31'))

WebUI.click(findTestObject('Object Repository/MyInfo/i_A_oxd-icon bi-caret-up-fill oxd-select-te_692938'))

WebUI.setText(findTestObject('Object Repository/MyInfo/input_Test_Field_oxd-input oxd-input--focus'), '445eee')

WebUI.click(findTestObject('Object Repository/MyInfo/button_Save'))

WebUI.click(findTestObject('Object Repository/MyInfo/p_Successfully Updated'))

WebUI.click(findTestObject('Object Repository/MyInfo/button_Save'))

WebUI.click(findTestObject('Object Repository/MyInfo/p_Successfully Saved'))

