package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_activity_receiveResult_allobj {

	public app_activity_receiveResult_allobj(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id="io.appium.android.apis:id/get")
	public WebElement receiveResult_GetResultButton  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/corky")
	public WebElement receiveResult_SelectionButton1  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/violet")
	public WebElement receiveResult_SelectionButton2  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/results")
	public WebElement receiveResult_GetResultsText  ;
	
	
}
