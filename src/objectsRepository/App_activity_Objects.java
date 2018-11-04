package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class App_activity_Objects {
	
	public App_activity_Objects(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Animation']")
	public WebElement app_activity_animation  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Custom Title']")
	public WebElement app_activity_Custom_Title  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Receive Result']")
	public WebElement app_activity_ReceiveREsult  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Redirection']")
	public WebElement app_activity_Redirection  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Screen Orientation']")
	public WebElement app_activity_Custom_Screen_Orientation  ;
	
	
	

}
