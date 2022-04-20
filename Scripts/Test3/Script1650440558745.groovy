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

// Open Browser
WebUI.openBrowser('https://lifecharger.org')

//Set Text on Search abar
WebUI.setText(findTestObject('Test3_OR/Page_Life Charger   a new beginning/input_Search for_s'), 'Life')

//Click Search Button
WebUI.click(findTestObject('Test3_OR/Page_Life Charger   a new beginning/button_Search for_search-submit'))

//Click the First Article
WebUI.click(findTestObject('Test3_OR/Page_Make the rest of your life the best of your life  Life Charger/a_Make the rest of your life the best of your life'))

//Verify the header on the page
WebUI.verifyElementPresent(findTestObject('Test3_OR/Page_Search Results for life  Life Charger/a_Make the rest of your life the best of your life'), 
    0)

//Close browser
WebUI.closeBrowser()