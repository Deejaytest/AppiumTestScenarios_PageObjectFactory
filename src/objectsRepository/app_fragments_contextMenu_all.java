package objectsRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_fragments_contextMenu_all {
	
	public app_fragments_contextMenu_all(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id="io.appium.android.apis:id/long_press")
	public WebElement contextMenu_LongPressButton  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Menu B']")
	public WebElement contextMenu_ListItems  ;	
	
	@AndroidFindBy(id="android:id/text1")
	public List<WebElement> ListArray_ListItems  ;
	
	

}
