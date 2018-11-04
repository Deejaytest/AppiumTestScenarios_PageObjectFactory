package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_activity_customTitle_all {
	
	public app_activity_customTitle_all(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id="io.appium.android.apis:id/left_text_edit")
	public WebElement customTitle_LeftTextBox  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/right_text_edit")
	public WebElement customTitle_RightTextBox  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/left_text_button")
	public WebElement customTitle_LeftButton  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/right_text_button")
	public WebElement customTitle_RightButton ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/left_text")
	public WebElement customTitle_LeftTitle  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/right_text")
	public WebElement customTitle_rightTitle ;
	

}
