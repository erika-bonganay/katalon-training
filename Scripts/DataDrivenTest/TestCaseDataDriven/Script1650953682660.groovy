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

WebUI.openBrowser('https://demo-store.katalon.com/')

WebUI.click(findTestObject('Object Repository/DataDriven_OR/Page_Zack Market/div_Zack Market_userHeader_tag__2vbdQ'))

//For Test Case looping of Test data
/*for (def rowNum=1; rowNum <=findTestData("TestDataLogin").getRowNumbers(); rowNum++)
{

WebUI.setText(findTestObject('Object Repository/DataDriven_OR/Page_Zack Market/input_Email_email'), findTestData("TestDataLogin").getValue(1,rowNum))

WebUI.setText(findTestObject('Object Repository/DataDriven_OR/Page_Zack Market/input_Password_password'), findTestData("TestDataLogin").getValue(2, rowNum))

Thread.sleep(3000)

}*/
WebUI.setText(findTestObject('Object Repository/DataDriven_OR/Page_Zack Market/input_Email_email'), Username)

WebUI.setText(findTestObject('Object Repository/DataDriven_OR/Page_Zack Market/input_Password_password'), Password)

WebUI.click(findTestObject('Object Repository/DataDriven_OR/Page_Zack Market/input_Required_button_btn__2lzmo'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DataDriven_OR/Page_Zack Market/div_Zack Market'), 0)

WebUI.closeBrowser()

