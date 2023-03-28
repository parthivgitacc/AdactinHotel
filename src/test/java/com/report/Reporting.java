package com.report;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author Parthiban
 * @see Generate the JVM report
 * @date 16/02/2023
 *
 */
public class Reporting extends BaseClass {
	
	/**
	 * @see JVM report
	 * @param jsonFile
	 * @throws IOException
	 * @throws Exception
	 */
	
	public static void generateJvmReport(String jsonFile) throws IOException, Exception {
		
		File file = new File(getProjectPath()+getPropertyFileValue("jvmPath"));
		
		Configuration configuration = new Configuration(file, "Adactin Hotel");
		
		configuration.addClassifications("BrowserName", "Chrome");
		configuration.addClassifications("Browser Version", "109");
		configuration.addClassifications("OS", "Windows10");
		configuration.addClassifications("Sprint", "20");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
