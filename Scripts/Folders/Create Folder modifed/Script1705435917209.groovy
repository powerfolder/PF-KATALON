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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

// Generate a random string of length 10
String folderN = RandomStringUtils.randomAlphanumeric(5)

// Set the global variable with the random string
GlobalVariable.folderN = folderN

// Print the random string to the console (optional)
println('Folder Name: ' + folderN)

WebUI.callTestCase(findTestCase('Folders/Should Go to Folderstable'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/span_Paste_pica-glyph glyphicons glyphicons_ca92f0'))

WebUI.click(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/lang_Create Folder'))

WebUI.setText(findTestObject('Folders/Page_Folders - PowerFolder/input_Create a new Folder_pencil'), GlobalVariable.folderN)

WebUI.sendKeys(findTestObject('Object Repository/Folders/Page_Folders - PowerFolder/input_Create a new Folder_pencil'), 
    Keys.chord(Keys.ENTER))

WebElement folderElement = CustomKeywords.'folder.FolderHelper.findFolder'(folderN)

assert folderElement != null ;



