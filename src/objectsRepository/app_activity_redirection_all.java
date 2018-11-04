package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_activity_redirection_all {
	
	public app_activity_redirection_all(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id="io.appium.android.apis:id/go")
	public WebElement Redirection_GoButton  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/text")
	public WebElement Redirection_TextInput  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/apply")
	public WebElement Redirection_ApplyTextButton  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/clear")
	public WebElement Redirection_ClearExitButton  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/newView")
	public WebElement Redirection_NewTextButton ;
	

}
