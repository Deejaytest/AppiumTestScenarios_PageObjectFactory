package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class App_actionBar_ActionBarMechanics {
	
	public App_actionBar_ActionBarMechanics(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Action Bar Mechanics']")
	public WebElement actionbar_ActionBarMechanics  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Action Bar Tabs']")
	public WebElement actionbar_actionBarTabs  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Action Bar Usage']")
	public WebElement actionbar_actionBarUsage  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Action Provider']")
	public WebElement actionbar_actionProvider  ;
	
	

}
