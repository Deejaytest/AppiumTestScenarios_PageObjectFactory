package objectsRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_notifications_objects {
	
	public app_notifications_objects(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='NotifyWithText']")
	public WebElement notifyWithText  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='IncomingMessage']")
	public WebElement IncomingMessage  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/notify_interstitial")
	public WebElement IncomingMessage_interstiitialNotif  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/notify_interstitial")
	public WebElement notifyWithText_LongNotification  ;
	
	@AndroidFindBy(id="android:id/title")
	public List<WebElement> IncomingMessage_interstiitialNotif_Title_Items  ;
	
	

}
