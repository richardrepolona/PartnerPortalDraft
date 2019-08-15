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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://novareteam.outsystemscloud.com/PartnerPortal/Registration_Login.aspx')

'Checkpoint - Registration & Login'
WebUI.verifyElementVisible(findTestObject('Event Screen/Page_Registration Login/Button_Login'))

'Process - Login'
WebUI.setText(findTestObject('Event Screen/Page_Registration Login/Input_Username'), 'LeadPortalAdmin')

WebUI.setEncryptedText(findTestObject('Event Screen/Page_Registration Login/Input_Password'), 'szTn/IhDFpu+ntmyyywx+Q==')

WebUI.click(findTestObject('Event Screen/Page_Registration Login/Button_Login'))

'Checkpoint - Admin Homepage'
WebUI.verifyElementVisible(findTestObject('Event Screen/Page_LeadPortalAdmin/Button_MenuBurger'))

'Process - Navigation'
WebUI.click(findTestObject('Event Screen/Page_LeadPortalAdmin/Button_MenuBurger'))

WebUI.click(findTestObject('Event Screen/Page_LeadPortalAdmin/SideMenu_Event'))

WebUI.click(findTestObject('Event Screen/Page_LeadPortalAdmin/SideSubMenu_CreateEvent'))

'Checkpoint - Event Details'
WebUI.verifyElementVisible(findTestObject('Event Screen/Page_EventDetail/Button_SaveEvent'))

'Process - Create or Update Event'
WebUI.setText(findTestObject('Event Screen/Page_EventDetail/Input_EventTitle'), Topic)

WebUI.setText(findTestObject('Event Screen/Page_EventDetail/Input_EventLocation'), Location)

WebUI.setText(findTestObject('Event Screen/Page_EventDetail/Input_StartDate'), Start)

WebUI.setText(findTestObject('Event Screen/Page_EventDetail/Input_EndDate'), End)

WebUI.selectOptionByValue(findTestObject('Event Screen/Page_EventDetail/Select_EventType'), EventType, true)

WebUI.setText(findTestObject('Event Screen/Page_EventDetail/Input_Topic'), EventTopic)

WebUI.click(findTestObject('Event Screen/Page_EventDetail/Button_SaveEvent'))

