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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

WebUI.callTestCase(findTestCase('Common/TC_Launch Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Module/Test Form/input_First Name'), 'Brandy')

WebUI.setText(findTestObject('Module/Test Form/input_Last Name'), 'Tan')

WebUI.setText(findTestObject('Module/Test Form/input_Email'), 'jbtt@gmail.com')

WebUI.check(findTestObject('Module/Test Form/radiobutton_Male'))

WebUI.setText(findTestObject('Module/Test Form/input_Mobile number'), '91234567')

WebUI.click(findTestObject('Module/Test Form/input_Date of Birth'))

WebUI.focus(findTestObject('Module/Test Form/input_Date of Birth'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Module/Test Form/input_Date of Birth'), '20/01/1990')

WebUI.click(findTestObject('Module/Test Form/checkbox_Sports'))

WebUI.click(findTestObject('Module/Test Form/checkbox_Reading'))

WebUI.click(findTestObject('Module/Test Form/button_Submit now'))

WebUI.delay(3)

WebUI.verifyTextPresent('Thank you for filling out the form.', false)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Common/TC_Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

