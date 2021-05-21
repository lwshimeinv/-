package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class LoginPage1 {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//通过构造方法对于driver初始化
	public LoginPage1(AndroidDriver<AndroidElement> driver) {
		
		this.driver=driver;
		this.action=new BaseAction(driver);
		
	}
	
	public AndroidElement edit_username() {
		return driver.findElementById("net.onest.timestoryprj:id/et_phone");
	}
	
	public AndroidElement edit_password() {
		return driver.findElementById("net.onest.timestoryprj:id/et_pwd");
	}
	
	public AndroidElement btn_login() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_login");
		
	}
	public AndroidElement btn_qin() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
		
	}
	
	public AndroidElement btn_panorama() {
		return driver.findElementById( "net.onest.timestoryprj:id/btn_img ");
	}
	
	public AndroidElement btn_dynasties () {
		return driver.findElementById("net.onest.timestoryprj:id/btn_questions");
	}
	
	public AndroidElement btn_details  () {
		return driver.findElementById("net.onest.timestoryprj:id/btn_details");
	}
	
	public AndroidElement btn_xihan() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
		
	}
	
	public AndroidElement btn_xihanpanorama() {
		return driver.findElementById( "net.onest.timestoryprj:id/btn_img");
	}
	
	
	public AndroidElement btn_xihandynasties() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_questions");
	}
	
	public AndroidElement btn_xihandetails() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_details");
	}
	
	public AndroidElement btn_xinchao() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
		
	}
	
	public AndroidElement btn_xinchaopanorama() {
		return driver.findElementById( "net.onest.timestoryprj:id/btn_img");
	}
	
	public AndroidElement btn_xinchaodynasties() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_questions");
	}
	
	public AndroidElement btn_xinchaodetails() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_details");
	}
	
	public AndroidElement btn_donhan() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[2] ");
		
	}
	
	public AndroidElement btn_donhanpanorama() {
		return driver.findElementById( "net.onest.timestoryprj:id/btn_img");
	}
	
	public AndroidElement btn_donhandynasties() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_questions");
	}
	
	public AndroidElement btn_donhandetails() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_details");
	}
	
	public AndroidElement btn_sanguo() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[3] ");
		
	}
	
	public AndroidElement btn_sanguopanorama() {
		return driver.findElementById( "net.onest.timestoryprj:id/btn_img");
	}
	
	public AndroidElement btn_sanguodynasties() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_questions");
	}
	
	public AndroidElement btn_sanguodetails() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_details");
	}
	
	public AndroidElement btn_voice() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_voice");
	}
	
	
	
	
	
	
	
	
	public MainPage login_sucess(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		return new MainPage(driver);
		
	}
	public MainPage login_qinMainPage(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_qin());
		return new MainPage(driver);
		
	}
	public MainPage login_panorama(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_qin());
		action.click(btn_panorama());
		return new MainPage(driver);	
	}
	public MainPage login_dynasties(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_qin());
		action.click(btn_dynasties ());
		return new MainPage(driver);	
	}
	public MainPage login_details(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_qin());		 
		action.click( btn_details());		
		return new MainPage(driver);	
	}
	
	public MainPage login_xihanMainPage(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xihan());
		return new MainPage(driver);
		
	}
	
	public MainPage login_xihanpanorama(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xihan());
		action.click(btn_xihanpanorama());
		return new MainPage(driver);	
	}
	
	public MainPage login_xihandynasties(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xihan());
		action.click(btn_xihandynasties ());
		return new MainPage(driver);	
	}
	
	public MainPage login_xihandetails(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xihan());		 
		action.click(btn_xihandetails());		
		return new MainPage(driver);	
	}
	
	
	public MainPage login_xinchaoMainPage(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xinchao());
		return new MainPage(driver);
		
	}
	
	public MainPage login_xinchaopanorama(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xinchao());
		action.click(btn_xinchaopanorama());
		return new MainPage(driver);	
	}
	
	public MainPage login_xinchaodynasties(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xinchao());
		action.click(btn_xinchaodynasties());
		return new MainPage(driver);	
	}
	
	public MainPage login_xinchaodetails(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_xinchao());		 
		action.click(btn_xinchaodetails());		
		return new MainPage(driver);	
	}
	
	
	public MainPage login_donhanMainPage(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_donhan());
		return new MainPage(driver);
		
	}
	
	public MainPage login_donhanpanorama(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_donhan());
		action.click(btn_donhanpanorama());
		return new MainPage(driver);	
	}
	
	public MainPage login_donhandynasties(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_donhan());
		action.click(btn_donhandynasties());
		return new MainPage(driver);	
	}
	
	
	public MainPage login_donhandetails(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_donhan());		 
		action.click(btn_donhandetails());		
		return new MainPage(driver);	
	}
	
	
	public MainPage login_sanguoMainPage(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click( btn_sanguo());
		return new MainPage(driver);
		
	}
	
	
	public MainPage login_sanguopanorama(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_sanguo());
		action.click(btn_sanguopanorama());
		return new MainPage(driver);	
	}
	
	public MainPage login_sanguodynasties(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_sanguo());
		action.click(btn_sanguodynasties());
		return new MainPage(driver);	
	}
	
	
	public MainPage login_sanguodetails(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click(btn_sanguo());		 
		action.click(btn_sanguodetails());		
		return new MainPage(driver);	
	}
	
	public MainPage login_clickvoice(String string, String string2) {
		action.type(edit_username(), string);
		action.type(edit_password(), string2);
		action.click(btn_login());
		action.click( btn_voice());		 	
		return new MainPage(driver);	
	}
	
	
	
	
	
	
	
	
}