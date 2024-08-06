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

WebUI.setText(findTestObject('Object Repository/Recruitment/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Recruitment/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Recruitment/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/Recruitment/li_Vacancies'))

WebUI.click(findTestObject('Object Repository/Recruitment/UserTypeDropDownInAddPage'))

WebUI.setText(findTestObject('Object Repository/Recruitment/input_Password_oxd-input oxd-input--active'), 'Junior Account Assistant edit')

WebUI.click(findTestObject('Object Repository/Recruitment/div_Account Assistant'))

WebUI.setText(findTestObject('Object Repository/Recruitment/textarea_Description_oxd-textarea oxd-texta_fed1e5'), 'asbdhbasdhadsbhsdx')

WebUI.setText(findTestObject('Object Repository/Recruitment/input_Password_oxd-input oxd-input--active'), ' (Deleted)')

WebUI.click(findTestObject('Object Repository/Recruitment/input_Password_oxd-input oxd-input--active'))

WebUI.doubleClick(findTestObject('Object Repository/Recruitment/input_Password_oxd-input oxd-input--active'))

WebUI.setText(findTestObject('Object Repository/Recruitment/input_Password_oxd-input oxd-input--active'), 'te')

WebUI.setText(findTestObject('Object Repository/Recruitment/input_Number of Positions_oxd-input oxd-inp_b37faf'), '9')

WebUI.click(findTestObject('Object Repository/Recruitment/button_Save'))

WebUI.click(findTestObject('Object Repository/Recruitment/div_SuccessSuccessfully Saved'))
