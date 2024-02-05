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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Login/Admin login modifed'), [:], FailureHandling.STOP_ON_FAILURE)

// Generate a random
String useraccount = ('user' + RandomStringUtils.randomNumeric(4)) + '@test.com'

WebUI.click(findTestObject('Login/login_normal/Page_Dashboard - PowerFolder/Accounts_buttom'))

WebUI.click(findTestObject('Login/login_normal/Page_Accounts - PowerFolder/Add_buttom'))

WebUI.click(findTestObject('Login/login_normal/Page_Accounts - PowerFolder/lang_Create Account'))

WebUI.setText(findTestObject('Login/login_normal/Page_Accounts - PowerFolder/Email_place'), useraccount)

WebUI.setEncryptedText(findTestObject('Login/login_normal/Page_Accounts - PowerFolder/password_case'), '0tdbEVTnxfwKL9J2FF/zz7q3BczDp+yX')

WebUI.click(findTestObject('Login/login_normal/Page_Accounts - PowerFolder/button_Save'))

WebUI.verifyElementPresent(findTestObject('Login/login_normal/Page_Accounts - PowerFolder/span_Account created'), 2)

WebUI.navigateToUrl('https://lab.powerfolder.net:8666/login')

WebUI.setText(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_register new account_Username'), useraccount)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_Recover password_Password'), 
    '0tdbEVTnxfwKL9J2FF/zz7q3BczDp+yX')

WebUI.click(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_register new account_Login'))

WebUI.verifyElementVisible(findTestObject('Login/login_normal/Page_Dashboard - PowerFolder/log_icon'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/my-icon'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/a_Log out'))

