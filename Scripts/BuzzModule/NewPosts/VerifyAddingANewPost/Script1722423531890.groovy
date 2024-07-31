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

WebUI.setText(findTestObject('Object Repository/BuzzModule/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/BuzzModule/input_Password_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/BuzzModule/button_Login'))

WebUI.setText(findTestObject('Object Repository/BuzzModule/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/BuzzModule/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/BuzzModule/button_Login'))

WebUI.click(findTestObject('Object Repository/BuzzModule/a_Buzz'))

WebUI.setText(findTestObject('Object Repository/BuzzModule/textarea_Upgrade_oxd-buzz-post-input'), 'gyug')

WebUI.click(findTestObject('Object Repository/BuzzModule/button_Post'))

WebUI.click(findTestObject('Object Repository/BuzzModule/div_SuccessSuccessfully Saved'))

WebUI.doubleClick(findTestObject('Object Repository/BuzzModule/p_gyug'))

WebUI.click(findTestObject('Object Repository/BuzzModule/button_Most Recent Posts'))

WebUI.doubleClick(findTestObject('Object Repository/BuzzModule/p_gyug'))

