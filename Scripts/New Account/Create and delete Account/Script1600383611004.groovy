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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//TODO rewrite account test cases
//WebUI.callTestCase(findTestCase('Login/Pretest - Admin Login'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Dashboard/lang_Accounts'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/span_Lschen_pica-glyph glyphicons glyphicon_aee676'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/a_Konto erstellen'))
//
//String name = org.apache.commons.lang.RandomStringUtils.random(9, true, true)
//
//WebUI.setText(findTestObject('Object Repository/Page_Accounts - PowerFolder/Email_place'), name+'_user@powerfolder.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Accounts - PowerFolder/password_case'), 
//    'PpFy9OM6JMVjJ8cBivBeSg==')
//
//WebUI.setText(findTestObject('Object Repository/Page_Accounts - PowerFolder/input_Notizen_pica_account_first_name'), 'Happy')
//
//WebUI.setText(findTestObject('Object Repository/Page_Accounts - PowerFolder/input_Notizen_pica_account_last_name'), 'End User')
//
//WebUI.setText(findTestObject('Object Repository/Page_Accounts - PowerFolder/input_Notizen_pica_account_phone'), '12345')
//
//WebUI.setText(findTestObject('Object Repository/Page_Accounts - PowerFolder/input_Notizen_pica_account_quota'), '1')
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Accounts - PowerFolder/select_English                             _781106'), 
//    'en', true)
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/input_Aktiv_pica_account_valid_till'))
//
////WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/td_15'))
//
////WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/i_Aktiv_glyphicons glyphicons-delete'))
//
////WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/a_E-Mails'))
//
////WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Ordner'))
//
////WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Organisationen'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Notizen'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Accounts - PowerFolder/textarea_Nichts anzuzeigen_pica_account_notes'), 
//    'Hello World!')
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Konto'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Speichern'))
//
//WebUI.click(findTestObject('Page_Accounts - PowerFolder/a_Max End User'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Avatar'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_E-Mails'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Ordner'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Gruppen'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Organisationen'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Notizen'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Speichern'))
//
//WebUI.click(findTestObject('Page_Accounts - PowerFolder/Add_Buttom'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Lschen'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/lang_Ja'))
//
//WebUI.click(findTestObject('Object Repository/Page_Accounts - PowerFolder/span_Konto existiert bereits_caret'))
//
//WebUI.closeBrowser()

