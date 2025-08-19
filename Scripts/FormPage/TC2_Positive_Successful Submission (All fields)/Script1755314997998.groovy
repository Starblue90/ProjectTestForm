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

WebUI.setText(findTestObject('Module/Test Form/input_First Name'), 'Mag')

WebUI.setText(findTestObject('Module/Test Form/input_Last Name'), 'Tan')

WebUI.setText(findTestObject('Module/Test Form/input_Email'), 'jt@gmail.com')

WebUI.check(findTestObject('Module/Test Form/radiobutton_Female'))

WebUI.setText(findTestObject('Module/Test Form/input_Mobile number'), '91234567')

WebUI.click(findTestObject('Module/Test Form/input_Date of Birth'))

WebUI.focus(findTestObject('Module/Test Form/input_Date of Birth'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Module/Test Form/input_Date of Birth'), '20/01/1990')

WebUI.click(findTestObject('Module/Test Form/checkbox_Music'))

WebUI.click(findTestObject('Module/Test Form/checkbox_Sports'))

WebUI.click(findTestObject('Module/Test Form/checkbox_Reading'))

WebUI.delay(3)

'Uncheck Music Checkbox'
WebUI.click(findTestObject('Module/Test Form/checkbox_Music'))

WebUI.delay(3)

'Uncheck Reading Checkbox'
WebUI.click(findTestObject('Module/Test Form/checkbox_Reading'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Module/Test Form/DragandDropArea'), 'C:\\Users\\Winnie Lim\\Downloads\\TestForm.pdf')

WebUI.verifyElementPresent(findTestObject('Module/Test Form/buttonRemoveFile'), 3)

WebUI.verifyTextPresent('.pdf', false)

WebUI.click(findTestObject('Module/Test Form/dropdown_SelectLocation'))

WebUI.setText(findTestObject('Module/Test Form/input_Location(optional)'), 'West', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Module/Test Form/input_Location(optional)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Module/Test Form/textarea_Address(optional)'))

WebUI.setText(findTestObject('Module/Test Form/textarea_Address(optional)'), '100 Pasir Panjang #07-10 Singapore 580124')

WebUI.click(findTestObject('Module/Test Form/button_Submit now'))

WebUI.delay(3)

WebUI.verifyTextPresent('Thank you for filling out the form.', false)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Common/TC_Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

