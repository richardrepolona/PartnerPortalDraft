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

'Checkpoint - Registration & Login Page'
WebUI.verifyElementVisible(findTestObject('Homepage - Client/Page_Registration Login/Button_Login'))

'Login Screen'
WebUI.setText(findTestObject('Homepage - Client/Page_Registration Login/Input_Login_Username'), 'Client')

WebUI.setText(findTestObject('Homepage - Client/Page_Registration Login/Input_Login_Password'), 'Client')

WebUI.click(findTestObject('Homepage - Client/Page_Registration Login/Button_Login'))

'Checkpoint - Homepage'
WebUI.verifyElementVisible(findTestObject('Homepage - Client/Page_HomePage_Client/PopButton_New_Schedule'), FailureHandling.STOP_ON_FAILURE)

'Client Homepage'
WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/IconLink_Dropdown'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/Link_Myprofile'))

'Checkpoint - My Info'
WebUI.verifyElementVisible(findTestObject('Homepage - Client/Page_MyInfoFromHomePage/Button_MyProfile_Save'))

WebUI.click(findTestObject('Homepage - Client/Page_MyInfoFromHomePage/ImageLink_Home'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/IconLink_Dropdown'))

WebUI.click(findTestObject('Homepage - Client/Page_HomePage_Client/Button_Logout'))

WebUI.closeBrowser()

