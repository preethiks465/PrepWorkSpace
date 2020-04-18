package Misc;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		TestNG runner = new TestNG();
		List<String>alist = new ArrayList<String>();
		alist.add("C:\\Users\\PreethikrishnaSankur\\PREP\\SeleIntQA\\testng.xml");
		runner.setTestSuites(alist);
		runner.run();
	}

}
