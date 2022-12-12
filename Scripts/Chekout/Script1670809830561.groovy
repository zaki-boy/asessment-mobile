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

Mobile.tap(findTestObject('Checkout/android.widget.TextView - Apple watch series 3 GPS 42mm Black'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Apple watch series 3 GPS 42mm Black (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - 400 USD'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - 5 item(s)'), 0)

Mobile.tap(findTestObject('Checkout/android.widget.Button - ADD TO CART'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Number of order'), 0)

Mobile.setText(findTestObject('Checkout/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Checkout/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Checkout/android.widget.TextView'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Shopping Cart'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Apple watch series 3 GPS 42mm Black (2)'), 
    0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - 400 USD x 1'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Total  440 USD'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Tax  10'), 0)

Mobile.tap(findTestObject('Checkout/android.widget.Button - CHECKOUT'), 0)

Mobile.setText(findTestObject('Checkout/android.widget.EditText - Your Name'), 'agung', 0)

Mobile.setText(findTestObject('Checkout/android.widget.EditText - your.emailgmail.com'), 'agungmuzaki@Gmail.com', 0)

Mobile.setText(findTestObject('Checkout/android.widget.EditText - 628123456789'), '08112255512', 0)

Mobile.setText(findTestObject('Checkout/android.widget.EditText - Your Address'), 'cibodas', 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - TNT Express'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.EditText - 1 Apple watch series 3 GPS 42mm Black 400 USD,Order  400 USDTax  10   40 USDTotal  440 USD'), 
    0)

Mobile.setText(findTestObject('Checkout/android.widget.EditText - Comment'), 'packing rapi', 0)

Mobile.tap(findTestObject('Checkout/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Process Checkout'), 0)

Mobile.verifyElementExist(findTestObject('Checkout/android.widget.TextView - Are you sure want to checkout'), 0)

Mobile.tap(findTestObject('Checkout/android.widget.Button - YES'), 0)
Mobile.closeApplication()

