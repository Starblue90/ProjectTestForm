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

WebUI.callTestCase(findTestCase('Common/TC_Launch Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Module/Test Form/input_First Name'), 'Yen')

WebUI.setText(findTestObject('Module/Test Form/input_Last Name'), 'Ho')

WebUI.setText(findTestObject('Module/Test Form/input_Email'), 'bn@gmail.12')

WebUI.check(findTestObject('Module/Test Form/radiobutton_Female'))

'Verify field validation for email '
WebUI.verifyTextPresent('Please enter a valid email', false)

WebUI.click(findTestObject('Module/Test Form/input_Mobile number'))

WebUI.setText(findTestObject('Module/Test Form/input_Mobile number'), '898878883')

WebUI.click(findTestObject('Module/Test Form/input_Date of Birth'))

'Verify field validation for mobile'
WebUI.verifyTextPresent('Please enter a valid mobile number', false)

WebUI.click(findTestObject('Module/Test Form/button_Submit now'))

WebUI.verifyElementVisible(findTestObject('Module/Test Form/button_Submit now'))

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Common/TC_Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

