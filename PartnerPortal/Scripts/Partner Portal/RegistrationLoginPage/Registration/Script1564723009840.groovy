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

WebUI.setText(findTestObject('Registration and Login Page/WebBlock_Registration/Register_Name_Input'), 'Dummy5')

WebUI.setText(findTestObject('Registration and Login Page/WebBlock_Registration/Register_Username_Input'), 'Dummy5')

WebUI.setText(findTestObject('Registration and Login Page/WebBlock_Registration/Register_Email_Input'), 'Dummy5@NP.com')

WebUI.setText(findTestObject('Registration and Login Page/WebBlock_Registration/Register_CompanyName_Input'), 'Dummy5 Inc')

WebUI.setText(findTestObject('Registration and Login Page/WebBlock_Registration/Register_CompanyTitle_Input'), 'Dummy5 Role')

WebUI.setText(findTestObject('Registration and Login Page/WebBlock_Registration/Register_MobilePhone_Input'), '00000000000')

WebUI.setEncryptedText(findTestObject('Registration and Login Page/WebBlock_Registration/Password_Input'), 'nrrItTIpp/4=')

WebUI.check(findTestObject('Registration and Login Page/WebBlock_Registration/Register_Male_RadioButton'))

WebUI.click(findTestObject('Registration and Login Page/WebBlock_Registration/Register_Button'))

WebUI.closeBrowser()

