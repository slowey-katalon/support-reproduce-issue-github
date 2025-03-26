//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.configuration.RunConfiguration
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//
//String appPath = new File(RunConfiguration.getProjectDir() + '/' + 'Include/resources/iOS.Simulator.SauceLabs.Mobile.Sample.app.2.7.1.app').getCanonicalPath()
//
//Mobile.startApplication(appPath, true)
//
//Mobile.setText(findTestObject('Object Repository/XCUIElementTypeTextField - test-Username'), 'user01', 0)
//
//Mobile.closeApplication()


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

// Dynamically fetch the app path
String appPath = new File(RunConfiguration.getProjectDir() + '/' + 'Include/resources/TestApp.app').getCanonicalPath()
println(appPath)

// Start the application
Mobile.startApplication(appPath, false)

//Mobile.verifyElementVisible(findTestObject('Object Repository/XCUIElementTypeStaticText - Continue as a Guest'), 0)
//
//Mobile.getText(findTestObject('Object Repository/XCUIElementTypeStaticText - Continue as a Guest'), 0)
//
//Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Continue as a Guest'), 0)
//
//Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - menu'), 0)
//
//Mobile.getText(findTestObject('Object Repository/XCUIElementTypeStaticText - Terms Conditions'), 0)
//
//Mobile.verifyElementExist(findTestObject('Object Repository/XCUIElementTypeStaticText - Terms Conditions'), 0)
//
//Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Terms Conditions'), 0)

Mobile.delay(10)

Mobile.closeApplication()