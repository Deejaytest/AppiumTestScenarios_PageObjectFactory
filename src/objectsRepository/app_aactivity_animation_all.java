package objectsRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class app_aactivity_animation_all {
	
	public app_aactivity_animation_all(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id="io.appium.android.apis:id/fade_animation")
	public WebElement app_activity_animation_screen1  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/two_buttons2")
	public WebElement screen2_TwoButtons_longMessage  ;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement screen2_TwoButtons_longMessage_OKButton  ;
	
	@AndroidFindBy(id="android:id/message")
	public WebElement screen2_TwoButtons_longMessage_Text  ;
		
	@AndroidFindBy(id="io.appium.android.apis:id/two_buttons2ultra")
	public WebElement screen2_TwoButtons_UltralongMessage  ;
	
	@AndroidFindBy(id="android:id/message")
	public WebElement screen2_TwoButtons_UltralongMessage_Text  ;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/select_button")
	public WebElement screen2_TwoButtons_ListDialog  ;
	
	@AndroidFindBy(id="android:id/alertTitle")
	public WebElement screen2_TwoButtons_ListDialog_title  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Command two']")
	public WebElement screen2_TwoButtons_ListDialog_button  ;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/progress_button")
	public WebElement screen2_TwoButtons_ProgressDialog  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/radio_button")
	public WebElement screen2_TwoButtons_Single_Choice_List  ;
	
	@AndroidFindBy(id="android:id/alertTitle")
	public WebElement screen2_TwoButtons_Single_Choice_List_Title  ;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Traffic']")
	public WebElement screen2_TwoButtons_Single_Choice_List_Item  ;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/checkbox_button2")
	public WebElement screen2_TwoButtons_MultiSelectList  ;
	
	@AndroidFindBy(className="android.widget.CheckedTextView")
	public List<WebElement> screen2_TwoButtons_MultiSelectList_Items  ;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/text_entry_button")
	public WebElement screen2_TwoButtons_TextEntryDialog  ;

	@AndroidFindBy(id="io.appium.android.apis:id/username_edit")
	public WebElement screen2_TwoButtons_TextEntryDialog_Username  ;

	@AndroidFindBy(id="io.appium.android.apis:id/password_edit")
	public WebElement screen2_TwoButtons_TextEntryDialog_password  ;

	
	
	
	

}
