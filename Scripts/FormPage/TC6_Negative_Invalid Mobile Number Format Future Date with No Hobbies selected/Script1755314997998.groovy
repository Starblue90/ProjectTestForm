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

WebUI.setText(findTestObject('Module/Test Form/input_First Name'), 'John')

WebUI.setText(findTestObject('Module/Test Form/input_Last Name'), 'Tan')

WebUI.setText(findTestObject('Module/Test Form/input_Email'), 'jt123@gmail.com')

WebUI.check(findTestObject('Module/Test Form/radiobutton_Male'))

'Verify field validation for invalid mobile'
WebUI.setText(findTestObject('Module/Test Form/input_Mobile number'), '023 45 22')

WebUI.click(findTestObject('Module/Test Form/input_Date of Birth'))

WebUI.delay(3)

WebUI.verifyTextPresent('Please enter a valid mobile number', false)

WebUI.focus(findTestObject('Module/Test Form/input_Date of Birth'), FailureHandling.STOP_ON_FAILURE)

'Verify for future date field validation'
WebUI.sendKeys(findTestObject('Module/Test Form/input_Date of Birth'), '20/01/2026')

WebUI.click(findTestObject('Module/Test Form/checkbox_Sports'))

WebUI.scrollToElement(findTestObject('Module/Test Form/button_Submit now'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Module/Test Form/button_Submit now'))

WebUI.verifyTextPresent('Only dates today or before are allowed', false)

'Verify validation at least 1 Hobby need to be selected'
WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_None_Hobbies_Check'), 'This field is required')

WebUI.verifyElementVisible(findTestObject('Module/Test Form/button_Submit now'))

WebUI.scrollToElement(findTestObject('Module/Test Form/input_Mobile number'), 3)

WebUI.scrollToElement(findTestObject('Module/Test Form/input_Date of Birth'), 3)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Common/TC_Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

