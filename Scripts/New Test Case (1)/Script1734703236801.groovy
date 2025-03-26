import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI







 

'----------------------------------------------------'

String baseUrl = 'https://google.com'

 

WebUI.openBrowser('')

 

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

 

selenium.open('/', '')