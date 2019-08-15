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
import org.openqa.selenium.Keys as Keys

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

'Navigation'
WebUI.click(findTestObject('Event Screen/Page_LeadPortalAdmin/Button_MenuBurger'))

WebUI.click(findTestObject('Event Screen/Page_LeadPortalAdmin/SideMenu_Event'))

WebUI.click(findTestObject('Event Screen/Page_LeadPortalAdmin/SideSubMenu_EventDetails'))

'Checkpoint - Event Screen'
WebUI.verifyElementVisible(findTestObject('Event Screen/Page_Events/Button_Search'))

'Search'
WebUI.setText(findTestObject('Event Screen/Page_Events/Input_Search'), 'Katalon Automation Testing')

WebUI.click(findTestObject('Event Screen/Page_Events/Button_Search'))

'Select Event'
WebUI.click(findTestObject('Event Screen/Page_Events/EventDummy'))

'Checkpoint - Event Detail (Delete)'
WebUI.verifyElementVisible(findTestObject('Event Screen/Page_EventDetail/Button_DeleteEvent'))

'Process - Delete Event'
WebUI.click(findTestObject('Event Screen/Page_EventDetail/Button_DeleteEvent'))

'Confirmation Message'
WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Event Screen/Page_Events/Button_Clear'))

WebUI.refresh()

'Validate if deleted'
WebUI.setText(findTestObject('Event Screen/Page_Events/Input_Search'), 'Katalon Automation Testing')

WebUI.click(findTestObject('Event Screen/Page_Events/Button_Search'))

