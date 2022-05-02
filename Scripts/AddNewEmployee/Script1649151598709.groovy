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

WebUI.navigateToUrl('https://hr.my/go/')

WebUI.setText(findTestObject('Object Repository/Page_HR.my  Unlimited Employee. Free Forever/input_Email_input-16'), 'hoxad53654@zneep.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HR.my  Unlimited Employee. Free Forever/input_Password_input-20'), 
    'xlFCwTAnKhbpKmjS/59nhQ==')

WebUI.click(findTestObject('Object Repository/Page_HR.my  Unlimited Employee. Free Forever/span_Administrator Login'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/div_Management'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_IT Support Specialist_q-icon mdi mdi-plus'))

WebUI.setText(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/input_In a rush Just fill up this page and _6c6fbb'), 
    '0007')

WebUI.setText(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/input_ID_f_2ad84dec-e82f-4b1d-be58-9937a4f2bf80'), 
    'Employee')

WebUI.setText(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/input_First Name_f_04d6620b-9548-4e1f-ab17-_07ad8d'), 
    '0007')

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_arrow_drop_down'))

WebUI.doubleClick(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_event'))

WebUI.doubleClick(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_chevron_left'))

WebUI.doubleClick(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_chevron_right'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_chevron_right'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/button_17'))

WebUI.setText(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/input_Nationality_f_24417394-2f56-4640-a056_6cb0a8'), 
    '647393872309821')

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_add_circle'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_chevron_left'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/span_Customer Support Specialist'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_account_balance'))

WebUI.setText(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/input_Effective Date_f_4965d062-c2eb-4be6-b_052d29'), 
    '17000')

WebUI.setText(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/input_Basic Salary_f_ac3943cd-b8d2-44d2-a0e_a39b12'), 
    'inr')

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/span_INR'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_Earning_q-icon mdi mdi-plus'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/div_Earning star'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/div_101'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_Earning_q-icon mdi mdi-check'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_Earning_q-icon mdi mdi-plus'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/div_Tax'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_Earning_q-icon mdi mdi-check'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/span_Bonus_q-btn__content text-center col i_c82c84'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/div_Bonus star'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/span_Bonus for IT department'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_Earning_q-icon mdi mdi-check'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/span_Statutory Contribution_q-btn__content _975d0d'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/span_Employee Income Tax'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/span_Statutory Contribution_q-btn__content _975d0d_1'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_Employee_q-icon mdi mdi-check'))

WebUI.click(findTestObject('Object Repository/Page_My Organization HR Center  HR.my/i_chevron_left'))

WebUI.closeBrowser()

