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
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lab.powerfolder.net:8666/login')

assert WebUI.getWindowTitle().equals('Login - PowerFolder')

WebUI.setText(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_register new account_Username'), 'katalon@yopmail.com')

WebUI.click(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_register new account_Login'))

isPresent = WebUI.waitForElementVisible(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_Recover password_Password'), 
    2)

assert isPresent

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_Recover password_Password'), 
    'MHSUC33hkPl3yWe8G8QdXQ==')

WebUI.click(findTestObject('Object Repository/Login/Page_Login - PowerFolder/input_register new account_Login'))

assert WebUI.getWindowTitle().equals('Dashboard - PowerFolder')

WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/lang_Folders'))

originfolderCount = getFoldersCount()

String folderName = org.apache.commons.lang.RandomStringUtils.random(9, true, true)



WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/span_Paste_pica-glyph glyphicons glyphicons_ca92f0'))

WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/lang_Create Folder'))

WebUI.setText(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/input_Create a new Folder_pencil'), folderName)

WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/button_Ok'))

assert getFoldersCount() > originfolderCount

assert true == tableContainsFolder(folderName)


//WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/div_Folder created'))
//
//WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/span_Folder created'))
//
//WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/td_test (katalon katalon)'))
//
//WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/lang_Delete'))
//
//WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/button_Yes'))

WebUI.closeBrowser()


 int getFoldersCount(){
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement tbody = driver.findElement(By.xpath("//table[@id='files_files_table']/tbody"))
	assert tbody
	List<WebElement> rows_table = tbody.findElements(By.tagName('tr'))
	return rows_table.size()
}
 
 boolean tableContainsFolder(String fileName){
	 WebDriver driver = DriverFactory.getWebDriver()
	 WebElement tbody = driver.findElement(By.xpath("//table[@id='files_files_table']/tbody"))
	 List<WebElement> rows_table = tbody.findElements(By.tagName('tr'))
	 return rows_table.any{item -> item.getText().contains(fileName)}
	
 }
 

   
