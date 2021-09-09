import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class DemoLog4j {
	public static void main (String args[]) {
	Logger mylogger = Logger.getLogger(DemoLog4j.class.getName());
	PropertyConfigurator.configure("resource/log4j.properties");
	int a=1;
	boolean flag = false;
	mylogger.info("Logging information for DemoLog4j");
	mylogger.debug("code debuggin started");
	
	if(a<0) {
		mylogger.warn("This is last time warning");
		
	}
	
	if(flag == false) {
		mylogger.error("error occured due to false value");
		
	
}
}
}