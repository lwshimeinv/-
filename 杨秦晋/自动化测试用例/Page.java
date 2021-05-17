package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class Page {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//通过构造方法对于driver初始化
	public Page(AndroidDriver<AndroidElement> driver) {
		
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
	public AndroidElement btn_Qq(){
		return driver.findElementById("net.onest.timestoryprj:id/btn_qq");	
	}
	public AndroidElement btn_regster() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_register");
	}
	public AndroidElement edit_reuserName() {
		return driver.findElementById("net.onest.timestoryprj:id/et_res_phone");
	}
	
	public AndroidElement edit_rePassword() {
		return driver.findElementById("net.onest.timestoryprj:id/et_res_pwd");
	}
	
	public AndroidElement edit_reRegester() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_res");
	}
	
	public AndroidElement btn_remember() {
		return driver.findElementById("net.onest.timestoryprj:id/remember");
	}
	
	public AndroidElement btn_student() {
		return driver.findElementById("net.onest.timestoryprj:id/tv_level");
	}
	
	public AndroidElement btn_card() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_card");
	}
	public AndroidElement btn_sure() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_confirm");
	}
	public AndroidElement btn_myCard() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_my_card");
	}
	public AndroidElement btn_Qin() {
		return driver.findElementById("net.onest.timestoryprj:id/dynasty");
	}

	public AndroidElement btn_mycollect() {
		return driver.findElementById("net.onest.timestoryprj:id/dynasty");
	}
	public AndroidElement btn_score() {
		return driver.findElementById( "net.onest.timestoryprj:id/btn_plus");
	}
	public AndroidElement btn_buy() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button");
		
	}
		
	public AndroidElement btn_pic() {
		return driver.findElementById("net.onest.timestoryprj:id/iv_header");
	}
	
	public AndroidElement btn_setup() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_settings");
	}
	public AndroidElement btn_logout() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_exit_login");
	}
	public AndroidElement btn_logoutsure() {
		return driver.findElementById("net.onest.timestoryprj:id/rightlinear");
	}
	public AndroidElement btn_setName() {
		return driver.findElementById("net.onest.timestoryprj:id/tv_niname");
	}
	public AndroidElement btn_edit() {
		return driver.findElementById("net.onest.timestoryprj:id/et_nickname");
	}
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
	public AndroidElement btn_code() {
		return driver.findElementById("net.onest.timestoryprj:id/iv_jiantou4");		
	}
	public AndroidElement btn_back3() {
		return driver.findElementById("net.onest.timestoryprj:id/iv_back3");		
	}
	public AndroidElement btn_sex() {
		return driver.findElementById("net.onest.timestoryprj:id/woman");		
	}
	public AndroidElement btn_save() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_save");		
	}
	public AndroidElement btn_setvoice() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_voice_set");		
	}
	public AndroidElement btn_rule() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_rule");		
	}
	public AndroidElement btn_problm() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_problem");		
	}
	public AndroidElement btn_cproblm() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText");
	}
	public AndroidElement btn_problmcom() {
		return driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button");
	}
	public AndroidElement btn_clockvoice() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_voice");		
	}
	public AndroidElement btn_repic() {
		return driver.findElementById("net.onest.timestoryprj:id/iv_header_set");		
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
	
	public String login_fail1() {
		action.click(btn_Qq());
		return action.getToast();
	}
	
	public MainPage regester_n(String username,String password) {
		action.click(btn_regster());
		action.type(edit_reuserName(),username);
		action.type(edit_rePassword(),password);
		action.click(edit_reRegester());
		return new MainPage(driver);
	}
	
	public String regester_f(String username,String password) {
		action.click(btn_regster());
		action.type(edit_reuserName(),username);
		action.type(edit_rePassword(),password);
		action.click(edit_reRegester());
		return action.getToast();
	}
	
	public MainPage login_remember(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
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
	
	public MainPage login_card(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_card());
		action.click(btn_sure());
		return new MainPage(driver);
	}
	public MainPage login_mycard(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_myCard());
		action.click(btn_Qin());
		return new MainPage(driver);
	}

	public MainPage login_mycollect(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_mycollect());
		return new MainPage(driver);
	}

	public MainPage login_score(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_score());
		action.click(btn_buy());
		return new MainPage(driver);
	}
	public MainPage login_pic(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_pic());
		return new MainPage(driver);
	}
	
	public MainPage login_setup(String username,String password,String rename) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_setup());
		action.click(btn_setName());
		action.type(btn_edit(), rename);
		action.click(btn_savename());
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
	public MainPage login_code(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_setup());
		action.click(btn_code());
		action.click(btn_back3());
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
	public MainPage login_setvoice(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_setup());
		action.click(btn_setvoice());
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
	public MainPage login_problem(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_setup());
		action.click(btn_problm());
		return new MainPage(driver);
		
	}
	
	public MainPage login_cproblem(String username,String password,String problrm) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_setup());
		action.click(btn_problm());
		action.type(btn_cproblm(),problrm);
		action.click(btn_problmcom());
		return new MainPage(driver);
		
	}
	public MainPage login_clockvoice(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_clockvoice());
		return new MainPage(driver);
		
	}
	public MainPage login_repicdelete(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_setup());
		action.click(btn_repic());
		return new MainPage(driver);
		
	}
	public MainPage login_logout(String username,String password) {		
		action.type(edit_username(), username);
		action.type(edit_password(), password);
		action.click(btn_remember());
		action.click(btn_login());
		action.click(btn_setup());
		action.click(btn_logout());
		action.click(btn_logoutsure());
		return new MainPage(driver);
		
	}
}
