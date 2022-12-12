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

Mobile.tap(findTestObject('Howtoorder/android.widget.TextView - How to order'), 0)

Mobile.verifyElementExist(findTestObject('Howtoorder/android.widget.TextView - How to order (1)'), 0)

Mobile.verifyElementExist(findTestObject('Howtoorder/android.view.View - How To Shop At Solomerce Apps'), 0)

Mobile.verifyElementExist(findTestObject('Howtoorder/android.view.View - Shopping through the shopping cart, select the items that will be purchased in accordance with your wishes'), 
    0)

Mobile.verifyElementExist(findTestObject('Howtoorder/android.view.View - Continue by filling the form e-mail with details of the total price'), 
    0)

Mobile.verifyElementExist(findTestObject('Howtoorder/android.view.View - Upon confirmation from us, please send  transfer payment to one of the following bank account'), 
    0)

Mobile.verifyElementExist(findTestObject('Howtoorder/android.view.View - We only accept cash payments by wire transfer to a bank account'), 
    0)

Mobile.closeApplication()

