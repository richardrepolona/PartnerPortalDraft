import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://novareteam.outsystemscloud.com/PartnerPortal/Registration_Login.aspx')

WebUI.setText(findTestObject('Homepage - Client/Page_Registration Login/Input_Login_Username'), 'Client')

WebUI.setEncryptedText(findTestObject('Homepage - Client/Page_Registration Login/Input_Login_Password'), '1cjy193v/5g=')

WebUI.click(findTestObject('Homepage - Client/Page_Registration Login/Button_Login'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/PopButton_New_Schedule'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/Pop_New_Schedule_Close'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/Accordion_Open'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/PopButton_Compose_Email'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/Pop_Compose_Email_Close'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/PopButton_Opportunity'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/Pop_Opportunity_Close'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/Link_Select_Opportunity'))

WebUI.click(findTestObject('Homepage - Client/Page_OpportunityDetailFromHomepageClient/Image_Link_OppFromHomepage'))

WebUI.closeBrowser()

