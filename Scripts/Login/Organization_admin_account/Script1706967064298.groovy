import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import org.openqa.selenium.WebElement as WebElement
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Call the test case
WebUI.callTestCase(findTestCase('Login/Admin login modifed'), [:], FailureHandling.STOP_ON_FAILURE)

// Generate a random email admin
String adminOrganization = ('organizationadmin' + RandomStringUtils.randomNumeric(4)) + '@test.com'

//create an admin account
WebUI.click(findTestObject('Object Repository/Login/login_normal/Page_Dashboard - PowerFolder/Accounts_buttom'))

WebUI.click(findTestObject('Object Repository/Login/login_normal/Page_Accounts - PowerFolder/Add_buttom'))

WebUI.click(findTestObject('Object Repository/Login/login_normal/Page_Accounts - PowerFolder/lang_Create Account'))

WebUI.setText(findTestObject('Object Repository/Login/login_normal/Page_Accounts - PowerFolder/Email_place'), adminOrganization)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/login_normal/Page_Accounts - PowerFolder/password_case'), 
    '0tdbEVTnxfwKL9J2FF/zz7q3BczDp+yX')

WebUI.click(findTestObject('Object Repository/Login/login_normal/Page_Accounts - PowerFolder/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/login_normal/Page_Accounts - PowerFolder/lang_Create Account'), 
    1)

// create a new variable called organization
String organizationName = 'organization' + RandomStringUtils.randomNumeric(4)

WebUI.click(findTestObject('Object Repository/Page_Organizations - PowerFolder/lang_Organizations'))

WebUI.click(findTestObject('Object Repository/Login/Organization_admin/Page_Organizations - PowerFolder/Page_Organizations - PowerFolder/add_organization'))

WebUI.click(findTestObject('Object Repository/Login/Organization_admin/Page_Organizations - PowerFolder/Page_Organizations - PowerFolder/lang_Create Organization'))

WebUI.setText(findTestObject('Object Repository/Page_Organizations - PowerFolder/input_organization_name'), organizationName)

WebUI.setText(findTestObject('Object Repository/Page_Organizations - PowerFolder/add_member'), '100')

WebUI.setText(findTestObject('Object Repository/Page_Organizations - PowerFolder/Add_Quota'), '100')

WebUI.click(findTestObject('Object Repository/Page_Organizations - PowerFolder/Click_Members'))

WebUI.setText(findTestObject('Object Repository/Page_Organizations - PowerFolder/add_admin_to_organization'), adminOrganization)

WebUI.click(findTestObject('Login/Organization_admin/Page_Organizations - PowerFolder/Page_Organizations - PowerFolder/Admin_plus_buttom'))

WebUI.verifyElementText(findTestObject('Login/Organization_admin/Page_Organizations - PowerFolder/Email_admin__verify'), 
    adminOrganization)

WebUI.click(findTestObject('Login/Organization_admin/Page_Organizations - PowerFolder/button_to_role'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Organizations - PowerFolder/Page_Organizations - PowerFolder/admin_case'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Organizations - PowerFolder/lang_Save'))

WebUI.navigateToUrl('https://lab.powerfolder.net:8666/login')

WebUI.setText(findTestObject('Login/Page_Login - PowerFolder/input_register new account_Username'), adminOrganization)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_Recover password_Password'), 
    '0tdbEVTnxfwKL9J2FF/zz7q3BczDp+yX')

WebUI.click(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_register new account_Login'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/my-icon'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/lang_My account'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/my-organization'))

WebUI.verifyElementText(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/verify_button_Admin'), 'Admin')

WebUI.click(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/my-icon'))

WebUI.click(findTestObject('Login/Organization_admin/Page_Profile - PowerFolder/a_Log out'))

