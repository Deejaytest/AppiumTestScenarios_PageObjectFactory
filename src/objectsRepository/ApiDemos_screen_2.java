package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ApiDemos_screen_2 {
	
	public ApiDemos_screen_2(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Action Bar']")
	public WebElement apidemos_app_actionbar  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Activity']")
	public WebElement apidemos_app_Activity  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Fragment']")
	public WebElement apidemos_app_Fragment  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Notification']")
	public WebElement apidemos_app_Notification  ;
	
	
	
	
	
	
}
