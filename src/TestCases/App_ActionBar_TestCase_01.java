package TestCases;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import objectsRepository.ApiDemos_screen_2;
import objectsRepository.App_actionBar_ActionBarMechanics;
import objectsRepository.actionBar_consolidatedObjects;
import objectsRepository.apidemosHome;

public class App_ActionBar_TestCase_01 extends Baseclass{
	
	apidemosHome homeobj = new apidemosHome(driver);
	ApiDemos_screen_2 screen_2 = new ApiDemos_screen_2(driver);
	App_actionBar_ActionBarMechanics actionbar_menu = new App_actionBar_ActionBarMechanics(driver);
	actionBar_consolidatedObjects allobjects = new actionBar_consolidatedObjects(driver);
	
	public void actionbarmechanics_share()
	{
		apidemosHome homeobj = new apidemosHome(driver);
		ApiDemos_screen_2 screen_2 = new ApiDemos_screen_2(driver);
		App_actionBar_ActionBarMechanics actionbar_menu = new App_actionBar_ActionBarMechanics(driver);
		actionBar_consolidatedObjects allobjects = new actionBar_consolidatedObjects(driver);
		
		homeobj.Home_preference.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_ActionBarMechanics.click();
		allobjects.actionbar_ActionBarMechanics_Share.click();
	}
	
	public void actionbarmechanics_More()
	{
		apidemosHome homeobj = new apidemosHome(driver);
		ApiDemos_screen_2 screen_2 = new ApiDemos_screen_2(driver);
		App_actionBar_ActionBarMechanics actionbar_menu = new App_actionBar_ActionBarMechanics(driver);
		actionBar_consolidatedObjects allobjects = new actionBar_consolidatedObjects(driver);
		
		homeobj.Home_app.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_ActionBarMechanics.click();
		allobjects.actionbar_ActionBarMechanics_MoreButton.click();
		allobjects.actionbar_ActionBarMechanics_MoreButton_Items.click();

	}
	
	public void actionBar_tabs()
	{
		
		homeobj.Home_app.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_actionBarTabs.click();
		allobjects.actionbar_actionBarTabs_ToggleTab.click();
		allobjects.actionbar_actionBarTabs_AddNewTab.click();
		allobjects.actionbar_actionBarTabs_AddNewTab.click();
		allobjects.actionbar_actionBarTabs_RemoveLastTab.click();
		allobjects.actionbar_actionBarTabs_RemoveAll.click();

	
	}
	
	public void actionbarusage_Search()
	{
		homeobj.Home_app.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_actionBarUsage.click();
		allobjects.actionbar_actionBarUsage_Search.click();
		allobjects.actionbar_actionBarUsage_Search_textBox.sendKeys("Input");
		allobjects.actionbar_actionBarUsage_Search_textBox_cleartext.click();
		allobjects.actionbar_actionBarUsage_Search_textBox.sendKeys("Input");
	    driver.pressKey(new KeyEvent(AndroidKey.ENTER)); 
	    driver.hideKeyboard();
	    
	}



	
}
