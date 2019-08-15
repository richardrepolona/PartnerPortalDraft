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

'Open Browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://novareteam.outsystemscloud.com/PartnerPortal/Registration_Login.aspx')

'Login'
WebUI.setText(findTestObject('Event Screen/Page_Registration Login/Input_Username'), 'LeadPortalAdmin')

WebUI.setEncryptedText(findTestObject('Event Screen/Page_Registration Login/Input_Password'), 'szTn/IhDFpu+ntmyyywx+Q==')

WebUI.click(findTestObject('Event Screen/Page_Registration Login/Button_Login'))

'Navigate to User Management'
WebUI.click(findTestObject('Admin - UserManagement/Page_LeadPortalAdmin/SideMenu'))

WebUI.click(findTestObject('Admin - UserManagement/Page_LeadPortalAdmin/SideMenu_UserManagement'))

'Hover to User to see details'
WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/User_Name_Table'))

WebUI.doubleClick(findTestObject('Admin - UserManagement/Page_UserManagement/Input_Search'))

'Filter Search'
WebUI.setText(findTestObject('Admin - UserManagement/Page_UserManagement/Input_Search'), 'Client')

WebUI.selectOptionByValue(findTestObject('Admin - UserManagement/Page_UserManagement/Select_Role'), '14', true)

WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/Button_Search'))

'Select Action to User'
WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/Select_Action'))

'Changing Role'
WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/Select_SelectRole'))

WebUI.selectOptionByValue(findTestObject('Admin - UserManagement/Page_UserManagement/Select_SelectRolePop'), '12', true)

WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/Button_ChangeRole'))

'Refresh'
WebUI.refresh()

WebUI.selectOptionByValue(findTestObject('Admin - UserManagement/Page_UserManagement/Select_Role'), '12', true)

'Search newly assigned role'
WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/Button_Search'))

WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/Select_Action'))

'Edit user'
WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagement/Select_EditUser'))

WebUI.setText(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Input_Name'), 'ClientEdited')

WebUI.setText(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Input_Username'), 'ClientEdited')

WebUI.setText(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Input_Email'), 'ClientEdited@NP.com')

WebUI.setText(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Input_Mobile'), '09158885321')

WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Button_SaveChanges'))

'Change Password'
WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagementDetail/PopLinkButton_PasswordReset'))

WebUI.setEncryptedText(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Input_NewPassword'), 'OtKsQwgDWEK5BRTxC3xW/A==')

WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Button_ChangePassword'))

WebUI.click(findTestObject('Admin - UserManagement/Page_UserManagementDetail/Button_Cancel'))

WebUI.refresh()

