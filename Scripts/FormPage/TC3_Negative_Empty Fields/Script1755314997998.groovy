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

WebUI.scrollToElement(findTestObject('Module/Test Form/input_Last Name'), 3)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Module/Test Form/input_Mobile number'), 3)

WebUI.delay(0)

WebUI.scrollToElement(findTestObject('Module/Test Form/checkbox_Hobbies'), 3)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Module/Test Form/textarea_Address(optional)'), 3)

WebUI.click(findTestObject('Module/Test Form/button_Submit now'))

'Verify the error messages are displayed for all the mandate fields'
WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_First Name'), 'This field is required', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_Last Name'), 'This field is required')

WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_Email'), 'This field is required')

WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_Gender'), 'This field is required', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_Mobile number'), 'This field is required')

WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_Date of Birth'), 'This field is required')

WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_Mobile number'), 'This field is required')

WebUI.verifyElementText(findTestObject('Module/Test Form/errorMsg_Hobbies'), 'This field is required')

WebUI.scrollToElement(findTestObject('Module/Test Form/input_Last Name'), 3)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Module/Test Form/input_Mobile number'), 3)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Module/Test Form/checkbox_Hobbies'), 3)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Module/Test Form/button_Submit now'), 3)

'Verify the form is not submitted when the fields are not entered'
WebUI.verifyElementPresent(findTestObject('Module/Test Form/button_Submit now'), 5)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Common/TC_Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

