package objectsRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_activity_orientation {
	
	public app_activity_orientation(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id="io.appium.android.apis:id/orientation")
	public WebElement Orientation_list  ;
	
	@AndroidFindBy(className="android.widget.CheckedTextView")
	public List<WebElement> Orientation_list_Items ;
	

}
