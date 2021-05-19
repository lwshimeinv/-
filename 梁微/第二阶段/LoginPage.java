package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class LoginPage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//ͨ�����췽������driver��ʼ��
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		
		this.driver=driver;
		this.action=new BaseAction(driver);
		
	}
	
	public AndroidElement btn_signup() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_register");
	}
	
	public AndroidElement edit_phone() {
		return driver.findElementById("net.onest.timestoryprj:id/et_res_phone");
	}
	
	public AndroidElement edit_pwd() {
		return driver.findElementById("net.onest.timestoryprj:id/et_res_pwd");
	}
	
	public AndroidElement btn_signup2() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_res");
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
	
	public AndroidElement btn_settings() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_settings");
	}
	public AndroidElement btn_name() {
		return driver.findElementById("net.onest.timestoryprj:id/tv_niname");
	}
	public AndroidElement btn_nickname() {
		return driver.findElementById("net.onest.timestoryprj:id/et_nickname");
	}
	public AndroidElement btn_save1() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_nickname_save");
	}
	public AndroidElement btn_back1() {
		return driver.findElementById("net.onest.timestoryprj:id/iv_back");
	}
	
	public AndroidElement btn_signature() {
		return driver.findElementById("net.onest.timestoryprj:id/rela_signature");
	}
	public AndroidElement ed_signature() {
		return driver.findElementById("net.onest.timestoryprj:id/et_signature");
	}
	public AndroidElement btn_save2() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_signature_save");
	}
	public AndroidElement btn_sex() {
		return driver.findElementById("net.onest.timestoryprj:id/man");
	}
	public AndroidElement btn_save3() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_save");
	}
	public AndroidElement btn_logout() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_exit_login");
	}
	public AndroidElement btn_logoutsure() {
		return driver.findElementById("net.onest.timestoryprj:id/rightlinear");
	}
	
//	记得改一下定位
	public AndroidElement btn_logoutNo() {
		return driver.findElementById("net.onest.timestoryprj:id/rightlinear");
	}
	public MainPage signup_sucess(String username,String password) {
		action.click(btn_signup());
		action.type(edit_phone(), username);
		action.type(edit_pwd(), password);
		action.click(btn_signup2());
		return new MainPage(driver);	
	}
	
	public String signup_fail(String username,String password) {
		action.click(btn_signup());
		action.type(edit_phone(), username);
		action.type(edit_pwd(), password);
		action.click(btn_signup2());
		return action.getToast();
	}
	
	
	public MainPage login_sucess(String username,String password) {
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_login());
		return new MainPage(driver);	
	}
	
	public String login_fail(String username,String password) {
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_login());
		return action.getToast();
	
	}
	
	public MainPage logout(String username,String password) {
		login_sucess(username, password);
		action.click(btn_logout());
		action.click(btn_settings());
		action.click(btn_logoutsure());
		return new MainPage(driver);	
	}
	public MainPage logout_fail(String username,String password) {
		login_sucess(username, password);
		action.click(btn_settings());
		action.click(btn_logout());
		action.click(btn_logoutNo());
		return new MainPage(driver);	
	}
	
	public String update_name(String username,String password,String nickname) {
		login_sucess(username, password);
		action.click(btn_settings());
		action.click(btn_name());
		action.type(btn_nickname(), nickname);
		action.click(btn_save1());
		action.click(btn_back1());
		return action.getToast();	
	}
	
	public String update_namefail(String username,String password,String nickname) {
		login_sucess(username, password);
		action.click(btn_settings());
		action.click(btn_name());
		action.type(btn_nickname(), nickname);
		action.click(btn_back1());
		return action.getToast();	
	}
	
	public String update_signature(String username,String password,String signature) {
		login_sucess(username, password);
		action.click(btn_settings());
		action.click(btn_signature());
		action.type(ed_signature(), signature);
		return action.getToast();	
	}
	public String update_signatureFail(String username,String password) {
		login_sucess(username, password);
		action.click(btn_settings());
		action.click(btn_signature());
		return action.getToast();	
	}
	public String update_sex(String username,String password) {
		login_sucess(username, password);
		action.click(btn_settings());
		action.click(btn_sex());
		action.click(btn_save2());
		return action.getToast();	
	}
	

}
