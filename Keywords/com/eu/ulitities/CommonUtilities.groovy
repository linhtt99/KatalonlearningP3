package com.eu.ulitities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.support.ui.Select
import internal.GlobalVariable

public class CommonUtilities {
	
	@Keyword
	
	def CheckDropdownListElementExit(TestObject object, String option) {
		boolean flag = false;
		
		WebElement element = WebUiCommonHelper.findWebElement(object, 20); //20 is timeout(s)
		
		Select ddl = new Select(element);
		
		for(WebElement elem: ddl.getOptions()) {
			if(elem.getText().equals(option)) {
			
				system.out.println("Element Exists")
				return flag = true			
			}
			else {
				system.out.println("Element does not Exists")
				}
			
		}
	}
	
}
