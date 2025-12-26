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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Force Chrome Driver specifically
//WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/', RunConfiguration.DRIVER_NAME_CHROME_DRIVER)

WebUI.click(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/input_Username_txt-username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/input_Password_txt-password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/input_Apply for hospital readmission_chk_ho_9218d5'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/input_Visit Date (Required)_txt_visit_date'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/td_31'))

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/textarea_Comment_txt_comment'), 
    'this is to test whole body checkup')

WebUI.click(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

