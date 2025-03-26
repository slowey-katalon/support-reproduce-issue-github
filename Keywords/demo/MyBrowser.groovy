package demo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyBrowser {
	/**
	 * https://github.com/SeleniumHQ/selenium/issues/13837
	 * https://issues.chromium.org/issues/336164423
	 * 
	 * Besides, please add these arguments to the desired capabilities: "--disable-renderer-backgrounding", "--disable-features=SharedBitmapToSharedImage"
	 * (Add to under the "args" property)
	 */
	@Keyword
	static def closeBrowser() {
		def driver = DriverFactory.getWebDriver();
		if (!driver) {
			return;
		}
		try {
			driver.close();
		} catch (Exception error) {
			//
		}
		try {
			driver.quit();
		} catch (Exception error) {
			//
		}
	}
}
