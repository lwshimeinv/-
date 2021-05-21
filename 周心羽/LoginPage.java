package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class LoginPage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//通过构造方法对于driver初始化
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		
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
	
	public AndroidElement btn_qq() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_qq");
	}
	
//	public AndroidElement btn_weixin() {
//		return driver.findElementById("net.onest.timestoryprj:id/btn_weixin");
//	}
	
	public AndroidElement btn_register() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_register");
	}
	
	public AndroidElement et_res_phone() {
		return driver.findElementById("net.onest.timestoryprj:id/et_res_phone");
	}
	
	public AndroidElement et_res_pwd() {
		return driver.findElementById("net.onest.timestoryprj:id/et_res_pwd");
	}
	
	public AndroidElement btn_res() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_res");
	}
	
	public AndroidElement btn_remember() {
		return driver.findElementById("net.onest.timestoryprj:id/remember");
	}

	public AndroidElement btn_settings() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_settings");
	}

	public AndroidElement tv_niname() {
		return driver.findElementById("net.onest.timestoryprj:id/tv_niname");
	}
	
	public AndroidElement et_nickname() {
		return driver.findElementById("net.onest.timestoryprj:id/et_nickname");
	}
	
	public AndroidElement btn_nickname_save() {
		return driver.findElementById("net.onest.timestoryprj:id/net.onest.timestoryprj:id/btn_nickname_save");
	}

	public AndroidElement btn_student() {
		return driver.findElementById("net.onest.timestoryprj:id/tv_level");
	}
	
	public AndroidElement btn_card() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_card");
	}
	
	public AndroidElement btn_my_card() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_my_card");
	}
	
	public AndroidElement btn_dynasty() {
		return driver.findElementById("net.onest.timestoryprj:id/dynasty");
	}
	public AndroidElement btn_confirm() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_confirm");
	}
	
	public AndroidElement btn_setup() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_settings");
	}
	
//	public AndroidElement btn_setName() {
//		return driver.findElementById("net.onest.timestoryprj:id/tv_niname");
//	}
//	
//	public AndroidElement btn_edit() {
//		return driver.findElementById("net.onest.timestoryprj:id/et_nickname");
//	}
	
	public AndroidElement btn_savename() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_nickname_save");
	}
	
	public AndroidElement btn_signature() {
		return driver.findElementById("net.onest.timestoryprj:id/iv_jiantou2");
	}
	
	public AndroidElement btn_etsignature() {
		return driver.findElementById("net.onest.timestoryprj:id/et_signature");
	}
	
	public AndroidElement btn_savesignature() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_signature_save");
	}
	
	public AndroidElement btn_sex() {
		return driver.findElementById("net.onest.timestoryprj:id/woman");		
	}
	
	public AndroidElement btn_save() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_save");		
	}
	
	public AndroidElement btn_rule() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_rule");
	}
	public AndroidElement btn_logout() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_exit_login");
	}
	
	public AndroidElement btn_rightlinear() {
		return driver.findElementById("net.onest.timestoryprj:id/rightlinear");
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
	
	public MainPage login_qq() {
		action.click(btn_qq());
		return new MainPage(driver);
	}
	
	public String et_fail(String username,String password) {
		action.click(btn_register());
		action.type(et_res_phone(), username);
		action.type( et_res_pwd(), password);
		action.click(btn_res());
		return action.getToast();
	
	}
	
	public MainPage et_success(String username,String password) {
		action.click(btn_register());
		action.type(et_res_phone(), username);
		action.type( et_res_pwd(), password);
		action.click(btn_res());
		return new MainPage(driver);	
	}

	public MainPage change_nickname(String nickname) {
		action.click(btn_settings());
		action.click(tv_niname());
		action.type( et_nickname(), nickname);
		action.click(btn_nickname_save());
		return new MainPage(driver);
	}
	
	public MainPage regester_n(String username,String password) {
		action.click(btn_register());
		action.type(et_res_phone(),username);
		action.type(et_res_pwd(),password);
		action.click(btn_res());
		return new MainPage(driver);
	}
		
		public MainPage login_card(String username,String password){		
			action.type(edit_username(), username);
			action.type(edit_password(), password);
			action.click(btn_remember());
			action.click(btn_login());
			action.click(btn_card());
			action.click(btn_confirm());
			return new MainPage(driver);
	}
		public MainPage login_my_card(String username,String password) {		
			action.type(edit_username(), username);
			action.type(edit_password(), password);
			action.click(btn_remember());
			action.click(btn_login());
			action.click(btn_my_card());
			action.click(btn_dynasty());
			return new MainPage(driver);
		}
		
		public MainPage login_signature(String username,String password,String signature) {		
			action.type(edit_username(), username);
			action.type(edit_password(), password);
			action.click(btn_remember());
			action.click(btn_login());
			action.click(btn_setup());
			action.click(btn_signature());
			action.type(btn_etsignature(),signature);
			action.click(btn_savesignature());
			return new MainPage(driver);
			
		}
		
		public MainPage login_Student(String username,String password) {		
			action.type(edit_username(), username);
			action.type(edit_password(), password);
			action.click(btn_remember());
			action.click(btn_login());
			action.click(btn_student());
			return new MainPage(driver);
		}
		
		public MainPage login_sex(String username,String password) {		
			action.type(edit_username(), username);
			action.type(edit_password(), password);
			action.click(btn_remember());
			action.click(btn_login());
			action.click(btn_setup());
			action.click(btn_sex());
			action.click(btn_save());	
			return new MainPage(driver);
		}
		
		public MainPage login_rule(String username,String password) {		
			action.type(edit_username(), username);
			action.type(edit_password(), password);
			action.click(btn_remember());
			action.click(btn_login());
			action.click(btn_setup());
			action.click(btn_rule());
			return new MainPage(driver);
		}

		public MainPage login_logout(String username,String password) {		
			action.type(edit_username(), username);
			action.type(edit_password(), password);
			action.click(btn_remember());
			action.click(btn_login());
			action.click(btn_setup());
			action.click(btn_logout());
			action.click(btn_rightlinear());
			return new MainPage(driver);
			
		}
}
