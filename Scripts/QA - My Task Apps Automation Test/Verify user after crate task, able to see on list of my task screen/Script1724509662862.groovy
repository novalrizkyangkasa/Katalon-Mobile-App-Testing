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

Mobile.startApplication('/Users/noval/Downloads/com.yoesuv.androidroom-v1(2.1.6)-production-release.apk', true)

Mobile.tap(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.widget.ImageButton'), 
    0)

Mobile.setText(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.widget.EditText - Task Title'), 
    'Learn Automation Testing', 0)

Mobile.setText(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.widget.EditText - Task Content'), 
    'learn time', 0)

Mobile.tap(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.widget.Button - SAVE'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.widget.LinearLayout'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.widget.TextView - Learn Automation Testing'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.widget.TextView - learn time (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/My Task Android App/Create and validate user able to see their task/android.view.ViewGroup'), 
    0)

Mobile.closeApplication()

