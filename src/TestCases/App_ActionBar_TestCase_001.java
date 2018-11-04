package TestCases;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import objectsRepository.ApiDemos_screen_2;
import objectsRepository.App_actionBar_ActionBarMechanics;
import objectsRepository.actionBar_consolidatedObjects;
import objectsRepository.apidemosHome;

public class App_ActionBar_TestCase_001 extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver=capabilities();
		apidemosHome homeobj = new apidemosHome(driver);
		ApiDemos_screen_2 screen_2 = new ApiDemos_screen_2(driver);
		App_actionBar_ActionBarMechanics actionbar_menu = new App_actionBar_ActionBarMechanics(driver);
		actionBar_consolidatedObjects allobjects = new actionBar_consolidatedObjects(driver);
		
		homeobj.Home_app.click();
		screen_2.apidemos_app_actionbar.click();
		actionbar_menu.actionbar_actionProvider.click();
		allobjects.actionbar_actionProvider_Subscreen.click();
		allobjects.actionbar_actionProvider_Subscreen_MoreButton.click();
		allobjects.actionbar_actionProvider_Subscreen_MoreButton_ParentItem.click();
	}

}
