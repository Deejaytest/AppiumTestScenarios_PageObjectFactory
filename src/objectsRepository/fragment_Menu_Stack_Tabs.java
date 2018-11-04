package objectsRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class fragment_Menu_Stack_Tabs {
	
	public fragment_Menu_Stack_Tabs(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id="io.appium.android.apis:id/menu1")
	public WebElement menu_checkbox1  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/menu2")
	public WebElement menu_checkbox2  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[text='MENU 1A']")
	public WebElement menu_tab_1A  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[text='MENU 1B']")
	public WebElement menu_tab_1B  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MENU 2']")
	public WebElement menu_tab_2  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='SIMPLE']")
	public WebElement Tabs_SimpleTab  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Fragment #1']")
	public WebElement Tabs_SimpleTab_FragmentText  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='CONTACTS']")
	public WebElement Tabs_ContactTab  ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='APPS']")
	public WebElement Tabs_AppsTab  ;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	public WebElement Tabs_ContactsTab_search  ;
	
	@AndroidFindBy(id="android:id/search_src_text")
	public WebElement Tabs_ContactsTab_search_Input  ;
	
	@AndroidFindBy(xpath="android.widget.ImageButton[index='0']")
	public WebElement Tabs_ContactsTab_search_backbutton  ;
	
	@AndroidFindBy(id="android:id/text1")
	public List<WebElement> Tabs_ContactsTab_search_resultList  ;
	
	@AndroidFindBy(id="io.appium.android.apis:id/text")
	public List<WebElement> Tabs_AppsTab_search_resultList  ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
