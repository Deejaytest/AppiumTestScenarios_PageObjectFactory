package TestCases;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ValidateNotifications extends Baseclass {
	
	public void NotifValidation() throws Exception {
		 
		   driver.findElementByName("App").click();
		   driver.findElementByName("Notification").click();
		   driver.findElementByName("IncomingMessage").click();
		   driver.findElementByName("Show Interstitial Notification").click();
		   Thread.sleep(3000);
		 
		   driver.openNotifications();
		   Thread.sleep(2000);
		   List<MobileElement> allnotifications = driver.findElements(By.id("android:id/title"));
		   System.out.println("no of notifications " + allnotifications.size());
		 
		   for (MobileElement webElement : allnotifications) {
		       System.out.println(webElement.getText());
		       if(webElement.getText().contains("Dianne")){
		          System.out.println("Notification found");
		          break;
		   }
		}
	}
}

