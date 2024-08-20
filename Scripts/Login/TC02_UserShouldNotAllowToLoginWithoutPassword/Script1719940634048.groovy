import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.URL)

assert WebUI.getWindowTitle().equals('Login - PowerFolder')

WebUI.click(findTestObject('Login/loginSubmit'))

WebUI.closeBrowser()

