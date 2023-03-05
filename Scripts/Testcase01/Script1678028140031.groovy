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

WebUI.navigateToUrl('https://pongvarid.github.io/probation_client_nuxt/?fbclid#/auth/login/')

WebUI.click(findTestObject('Object Repository/Testcase/Page_/Page_/span_'))

WebUI.click(findTestObject('Object Repository/Testcase/Page_/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/Testcase/Page_/Page_/input__input-46'), 'namemy')

WebUI.click(findTestObject('Object Repository/Testcase/Page_/Page_/div_'))

WebUI.setEncryptedText(findTestObject('Object Repository/Testcase/Page_/Page_/input__input-49'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Testcase/Page_/Page_/div__1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Testcase/Page_/Page_/input__input-52'), 'tzH6RvlfSTg=')

WebUI.setText(findTestObject('Object Repository/Testcase/Page_/Page_/input__input-55'), 'namemy@gmail.com')

WebUI.setText(findTestObject('Object Repository/Testcase/Page_/Page_/input__input-58'), 'namemy')

WebUI.click(findTestObject('Object Repository/Testcase/Page_/Page_/div__1_2'))

WebUI.setText(findTestObject('Object Repository/Testcase/Page_/Page_/input__input-61'), 'namemy')

WebUI.click(findTestObject('Object Repository/Testcase/Page_/Page_/span__1'))

WebUI.click(findTestObject('Object Repository/Testcase/Page_/Page_/button_'))

