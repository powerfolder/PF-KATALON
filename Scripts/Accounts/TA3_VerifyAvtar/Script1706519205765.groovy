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

WebUI.setText(findTestObject('Object Repository/Accounts/Page_Login - PowerFolder/input_Username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Accounts/Page_Login - PowerFolder/input_Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Accounts/Page_Login - PowerFolder/input_Login'))

//WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard - PowerFolder/lang_Accounts'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Accounts - PowerFolder/a_a_fd27_jan_2024_04_10_41a.com (Deactivated)'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Accounts - PowerFolder/lang_Avatar'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Accounts - PowerFolder/a_Change'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Accounts - PowerFolder/button_Close'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Accounts - PowerFolder/lang_Delete'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Accounts - PowerFolder/lang_Yes'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Accounts - PowerFolder/lang_Cancel'))

WebUI.closeBrowser()

