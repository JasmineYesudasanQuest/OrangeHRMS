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


/* Write a Katalon Studio test case to perform the following steps.
* 1. Open browser to the URL stored in G_SiteURL
* 2. Click the make appointment button
* 3. Fill in the username and password fields based on the variables
* 4. Click the login button
* 5. Verify that the appointment div exists
* 6. Close the browser
* */
// Open browser to the URL stored in G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the make appointment button
WebUI.click(findTestObject('button_make_appointment'))

// Fill in the username and password fields based on the variables
WebUI.setText(findTestObject('input_username'), username)
WebUI.setText(findTestObject('input_password'), password)

// Click the login button
WebUI.click(findTestObject('button_login'))

// Verify that the appointment div exists
WebUI.verifyElementPresent(findTestObject('div_appointment'))

// Close the browser
WebUI.closeBrowser()