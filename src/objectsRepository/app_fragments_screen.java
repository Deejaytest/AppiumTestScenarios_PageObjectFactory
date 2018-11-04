package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_fragments_screen {
	
	public app_fragments_screen(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Context Menu']")
	public WebElement fragment_contextMenu  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='List Array']")
	public WebElement fragment_ListArray  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='9']")
	public WebElement fragment_Menu  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Stack']")
	public WebElement fragment_Stack  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Tabs']")
	public WebElement fragment_Tabs  ;

}
