package report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class ReportGeneration {
	public static void GenerationReport(String json) {
		File f = new File("C:\\Users\\aravind\\eclipse-workspace\\cucumber\\reportJVM\\reportjson");
		Configuration c= new Configuration(f, "snbfhdvgfd");
		
		List<String> l =new LinkedList<String>();
		l.add(json);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
		
		
	}

}
