package TestCases;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.sourceforge.tess4j.TesseractException;
import objectsRepository.ApiDemos_screen_2;
import objectsRepository.App_activity_Objects;
import objectsRepository.apidemosHome;
import objectsRepository.app_aactivity_animation_all;
import objectsRepository.app_activity_customTitle_all;
import objectsRepository.app_activity_orientation;
import objectsRepository.app_activity_receiveResult_allobj;
import objectsRepository.app_activity_redirection_all;
import objectsRepository.app_fragments_contextMenu_all;
import objectsRepository.app_fragments_screen;
import objectsRepository.app_notifications_objects;
import objectsRepository.fragment_Menu_Stack_Tabs;

public class App_activity_DialogBoxCases extends Baseclass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver driver=capabilities();
		
		apidemosHome homeobj = new apidemosHome(driver);
		ApiDemos_screen_2 screen_2 = new ApiDemos_screen_2(driver);
		app_fragments_screen fragment_screen = new app_fragments_screen(driver);
		app_notifications_objects notif_obj = new app_notifications_objects(driver);
		
		homeobj.Home_app.click();
		screen_2.apidemos_app_Notification.click();
		notif_obj.IncomingMessage.click();
		notif_obj.IncomingMessage_interstiitialNotif.click();
		
		driver.openNotifications();
		Thread.sleep(2000);
		System.out.println("Number of notifs are " + notif_obj.IncomingMessage_interstiitialNotif_Title_Items.size());
		
		for(WebElement element: notif_obj.IncomingMessage_interstiitialNotif_Title_Items )
		{
			System.out.println(element.getText());
			if(element.getText().contains("Dianne"))
				System.out.println("Notif is found");
			break;
		}
	}

}
