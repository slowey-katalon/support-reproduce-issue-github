package demo

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.driver.internal.DriverCleanerCollector


public class demoKey {
	@Keyword
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseVariables()
		DriverCleanerCollector dc = new DriverCleanerCollector()
		
	}
}
