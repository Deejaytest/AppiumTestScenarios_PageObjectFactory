package objectsRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class actionBar_consolidatedObjects {
	
	public actionBar_consolidatedObjects(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	public WebElement actionbar_ActionBarMechanics_Share  ;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='1']")
	public WebElement actionbar_ActionBarMechanics_MoreButton  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Normal item']")
	public WebElement actionbar_ActionBarMechanics_MoreButton_Items  ;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/btn_add_tab")
	public WebElement actionbar_actionBarTabs_AddNewTab  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/btn_remove_tab")
	public WebElement actionbar_actionBarTabs_RemoveLastTab  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/btn_toggle_tabs")
	public WebElement actionbar_actionBarTabs_ToggleTab  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/btn_remove_all_tabs")
	public WebElement actionbar_actionBarTabs_RemoveAll  ;
	
	@AndroidFindBy(id="android:id/search_button")
	public WebElement actionbar_actionBarUsage_Search  ;
	
	@AndroidFindBy(id="android:id/search_src_text")
	public WebElement actionbar_actionBarUsage_Search_textBox  ;
	
	@AndroidFindBy(id="android:id/search_close_btn")
	public WebElement actionbar_actionBarUsage_Search_textBox_cleartext  ;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/action_edit")
	public WebElement actionbar_actionBarUsage_Edit  ;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	public WebElement actionbar_actionBarUsage_MoreButon  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sort']")
	public WebElement actionbar_actionBarUsage_MoreButon_ParentList  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Alphabetically']")
	public WebElement actionbar_actionBarUsage_MoreButon_ChildList  ;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Share Action Provider']")
	public WebElement actionbar_actionProvider_Subscreen  ;
	
	@AndroidFindBy(id="android:id/image")
	public WebElement actionbar_actionProvider_Subscreen_Share  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='See all']")
	public WebElement actionbar_actionProvider_Subscreen_Share_ExpandMoreOption  ;
	
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='1']")
	public WebElement actionbar_actionProvider_Subscreen_MoreButton  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Share with...']")
	public WebElement actionbar_actionProvider_Subscreen_MoreButton_ParentItem  ;
	
	
	
	
	

}
