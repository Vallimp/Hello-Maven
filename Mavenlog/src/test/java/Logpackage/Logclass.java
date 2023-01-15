package Logpackage;

import org.testng.annotations.Test;
import Utilities.LoggerLoad;

public class Logclass {
	@Test

	public void TestLog() {
		LoggerLoad.info("Test info");
		LoggerLoad.info("Test warnings");
		LoggerLoad.info("Test Errors");
	}
}
