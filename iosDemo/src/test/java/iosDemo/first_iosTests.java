package iosDemo;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
public class first_iosTests {

	
	public static void main(String[] args) throws Exception {
		firstTest();
		
	}
	
	
	public static void firstTest() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities	();
		
		caps.setCapability("platformName", "ios");
		caps.setCapability("platformVersion", "17.0.2");
		caps.setCapability("deviceName", "iPhone 8");
		caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		IOSDriver driver = new IOSDriver(url,caps);
	}
}
