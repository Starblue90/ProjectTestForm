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

WebUI.setText(findTestObject('Module/Test Form/input_First Name'), FirstName)

WebUI.setText(findTestObject('Module/Test Form/input_Last Name'), LastName)

WebUI.setText(findTestObject('Module/Test Form/input_Email'), Email)

// Select Gender radio button
if (Gender == 'Male') {
    WebUI.click(findTestObject('Module/Test Form/radiobutton_Male'))
} else {
    WebUI.click(findTestObject('Module/Test Form/radiobutton_Female'))
}


WebUI.setText(findTestObject('Module/Test Form/input_Mobile number'), MobileNumber)

WebUI.click(findTestObject('Module/Test Form/input_Date of Birth'))

WebUI.delay(3)

WebUI.focus(findTestObject('Module/Test Form/input_Date of Birth'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Module/Test Form/input_Date of Birth'), DateOfBirth)

// Select Hobby check box
if (Hobby == 'Sport') {
    WebUI.click(findTestObject('Module/Test Form/checkbox_Sports'))
} else if (Hobby == 'Music') {
    WebUI.click(findTestObject('Module/Test Form/checkbox_Music'))
} else {
    WebUI.click(findTestObject('Module/Test Form/checkbox_Reading'))
}

WebUI.click(findTestObject('Module/Test Form/dropdown_SelectLocation'))

WebUI.setText(findTestObject('Module/Test Form/input_Location(optional)'), Location, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Module/Test Form/input_Location(optional)'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Module/Test Form/textarea_Address(optional)'), Address)

WebUI.click(findTestObject('Module/Test Form/button_Submit now'))

WebUI.verifyTextPresent('Thank you for filling out the form.', false)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Common/TC_Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

