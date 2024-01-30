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

WebUI.navigateToUrl('https://lab.powerfolder.net:8666/login')

WebUI.setText(findTestObject('Object Repository/Preferences/Page_Login - PowerFolder/input_Username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Preferences/Page_Login - PowerFolder/input_Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Preferences/Page_Login - PowerFolder/input_KeepLoggedIn'))

WebUI.click(findTestObject('Object Repository/Preferences/Page_Login - PowerFolder/input_Login'))

//WebUI.click(findTestObject('Object Repository/Preferences/Page_Dashboard - PowerFolder/lang_Preferences'))

WebUI.click(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/h5_Network'))

WebUI.rightClick(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/h5_Network'))

WebUI.click(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/p_Hostname, server name, network ID'))

WebUI.rightClick(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/p_Hostname, server name, network ID'))

WebUI.click(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/p_Hostname, server name, network ID'))

WebUI.rightClick(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/a_Configure'))

WebUI.click(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/div_GeneralLogging, licensing, accounts, fe_b8efaf'))

WebUI.click(findTestObject('Object Repository/Preferences/Page_Preferences - PowerFolder/a_Configure'))

WebUI.closeBrowser()

