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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Folders/Create Folder modifed'), [:], FailureHandling.STOP_ON_FAILURE)

// WebUI.setText(findTestObject('Object Repository/Page_Folders - PowerFolder/input_search_input'), GlobalVariable.folderN)
WebElement table = DriverFactory.getWebDriver().findElement(By.xpath('//table[@id=\'files_files_table\']'))

List<WebElement> rows = table.findElements(By.tagName('tr'))

// Initialize a variable to store the row number
int rowNum = -1

String folderName = GlobalVariable.folderN

// GlobalVariable.folderN = folderName
println("Folder name : $folderName")

// Iterate through each row to find the desired text
for (int i = 0; i < rows.size(); i++) {
    WebElement row = rows.get(i)

    String cellValue = table.findElement(By.xpath(('//table/tbody/tr[' + (i + 1).toString()) + ']/td[2]')).getText()

    println("Cell value: $cellValue")

    // Check each column in the row for the desired text
    if (cellValue.contains(folderName)) {
        rowNum = (i + 1 // Adding 1 since row numbers are usually 1-based
        )

        break
    }
}

GlobalVariable.rowNum = rowNum.toString()

// Specify the new selector properties
String newLocatorStrategy = 'xpath'

String newLocatorValue = "//table/tbody/tr[$GlobalVariable.rowNum]/td[1]/span"

// Create a new TestObject with the updated properties
TestObject createdFolder = new TestObject().addProperty(newLocatorStrategy, ConditionType.EQUALS, newLocatorValue)

println("LOCATOR var: $newLocatorValue")

// Now, you can use the modified Test Object in your test case
WebUI.click(createdFolder)

// WebUI.click(findTestObject('Folders/Page_Folders - PowerFolder/createdFolder'))
WebUI.click(findTestObject('Object Repository/Page_Folders - PowerFolder/lang_Rename'))

String folderNewName = RandomStringUtils.randomAlphanumeric(5)

GlobalVariable.folderN = folderNewName

WebUI.setText(findTestObject('Object Repository/Page_Folders - PowerFolder/input_Enter a new Name_pencil'), folderNewName)

WebUI.click(findTestObject('Object Repository/Page_Folders - PowerFolder/button_Ok'))

WebUI.verifyElementPresent(findTestObject('folder/Page_Folders - PowerFolder/Page_Folders - PowerFolder/rename_notification'), 
    3)

WebUI.closeBrowser()

