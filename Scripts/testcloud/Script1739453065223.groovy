import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

 

import org.openqa.selenium.WebDriver

 

import org.openqa.selenium.remote.LocalFileDetector

 

import org.openqa.selenium.remote.RemoteWebDriver

 

import com.kms.katalon.core.configuration.RunConfiguration

      /*
      *  Import necessary classes for remote web driver and run configuration.
      *
      *  1. Import the RemoteWebDriver class from the Selenium library to enable remote browser automation.
      *  2. Import the RunConfiguration class to manage the configuration settings for the test execution.
      *
      */
 

import com.kms.katalon.core.webui.driver.DriverFactory

 

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.chrome.ChromeDriver


 

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ps.uci.edu/~franklin/doc/file_upload.html')

 

WebDriver driver = DriverFactory.getWebDriver()

 

if (driver instanceof RemoteWebDriver && !(driver instanceof ChromeDriver)) {


try {


((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector())


} catch (Exception e) {


WebUI.comment("Failed to set file detector for remote WebDriver: " + e.getMessage())


}


} else {


WebUI.comment("Local WebDriver detected or driver is ChromeDriver. No need to set file detector.")


}



String filePath = new File(RunConfiguration.getProjectDir() + '/' + 'Include/resources/Payments to Contractor - Sheet1.pdf').getCanonicalPath()

 

WebUI.uploadFile(findTestObject('Object Repository/Page_File Upload Test/input_Send this file_userfile'), filePath)

 

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()