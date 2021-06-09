package pages;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class Gamepage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//ͨ�����췽������driver��ʼ��
	public Gamepage(AndroidDriver<AndroidElement> driver) {
		
		this.driver=driver;
		this.action=new BaseAction(driver);
		
	}
	public AndroidElement get_uname() {//姓名
		return driver.findElementById("net.onest.timestoryprj:id/et_phone");
	}
	public AndroidElement get_pwd() {//密码
		return driver.findElementById("net.onest.timestoryprj:id/et_pwd");
	}
	public AndroidElement btn_login() {//登录按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_login");
	}
	
	public AndroidElement header() {//左上角头像
		return driver.findElementById("net.onest.timestoryprj:id/iv_header");
	}
	public AndroidElement mycard() {//我的卡片
		return driver.findElementById("net.onest.timestoryprj:id/btn_my_card");
	}
	public AndroidElement dynasty() {//秦朝
		return driver.findElementById("net.onest.timestoryprj:id/dynasty");
	}
	public AndroidElement back1() {//返回1
		return driver.findElementById("net.onest.timestoryprj:id/back");
	}
	public AndroidElement level() {//重生按钮
		return driver.findElementById("net.onest.timestoryprj:id/tv_level");
	}
	public AndroidElement btn_card() {//抽卡按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_card");
	}
	public AndroidElement btn_confirm() {//确定按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_confirm");
	}
	public AndroidElement btn_go() {//出行
		return driver.findElementById("net.onest.timestoryprj:id/btn_go_dynasty");
	}
	public AndroidElement point() {//积分按钮
		return driver.findElementById("net.onest.timestoryprj:id/tv_point");
	}
	
	public AndroidElement voice() {//声音按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_voice");
	}
	public AndroidElement set() {//设置按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_set");
	}
	public AndroidElement save() {//保存按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_save");
	}
	public AndroidElement name() {//名字按钮箭头
		return driver.findElementById("net.onest.timestoryprj:id/iv_jiantou1");
	}
	
	public AndroidElement namesave() {//保存按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_nickname_save");
	}

	public AndroidElement signature() {//个性签名
		return driver.findElementById("net.onest.timestoryprj:id/iv_jiantou2");
	}

	public AndroidElement save1() {//保存按钮
		return driver.findElementById("net.onest.timestoryprj:id/btn_signature_save");
	}
	public AndroidElement back2() {//个性签返回按钮
		return driver.findElementById("net.onest.timestoryprj:id/iv_back2");
	}
	public AndroidElement back3() {//名字返回按钮
		return driver.findElementById("net.onest.timestoryprj:id/iv_back");
	}
	public AndroidElement woman() {//性别
		return driver.findElementById("net.onest.timestoryprj:id/woman");
	}
	public AndroidElement number() {//手机号
		return driver.findElementById("net.onest.timestoryprj:id/rela_number");
	}
	public AndroidElement voset() {//音量设置
		return driver.findElementById("net.onest.timestoryprj:id/btn_voice_set");
	}
	public AndroidElement rule() {//查看规则
		return driver.findElementById("net.onest.timestoryprj:id/btn_rule");
	}
	public AndroidElement problem() {//反馈问题
		return driver.findElementById("net.onest.timestoryprj:id/btn_problem");
	}

	public MainPage login_sucess(String username,String password) {
		action.type(get_uname(), username);
		action.type(get_pwd(), password);
		action.click(btn_login());
		return new MainPage(driver);
	}
	
	public String login_fail(String username,String password) {
		action.type(get_uname(), username);
		action.type(get_pwd(), password);
		action.click(btn_login());
		return action.getToast();
	}

	public String mycard_1() throws InterruptedException {
		action.click(header());
		Thread.sleep(3000);
		action.click(mycard());
		action.click(dynasty());
		return action.getToast();
	}
	public MainPage clickback1() {
		action.longPress(back1());
		action.click(back1());

		return new MainPage(driver);
	}
	public MainPage clicklevel() {
		action.click(level());
		action.click(level());
		return new MainPage(driver);
	}
	public MainPage clickbtncard() {
		action.click(btn_card());
		action.click(btn_confirm());
		return new MainPage(driver);
	}
	public String mycard_2() throws InterruptedException {
		action.click(mycard());
		action.click(dynasty());
		return action.getToast();
	}

	public MainPage clickgo() throws InterruptedException {
		action.click(btn_go());
		Thread.sleep(2000);
		action.click(header());
		return new MainPage(driver);
	}
	public MainPage clickpoint() throws InterruptedException {
		action.click(point());
		action.click(back1());
		return new MainPage(driver);
	}
	public MainPage clickvoice() throws InterruptedException {
		action.click(voice());
		Thread.sleep(2000);
		action.click(voice());
		return new MainPage(driver);
	}
	public MainPage clickset(){
		action.click(set());
		return new MainPage(driver);
	}
	public String clicksave(){
		action.click(save());
		return action.getToast();
	}
	public MainPage clickname() throws InterruptedException{
		action.click(name());
		Thread.sleep(2000);
		action.click(back3());
		return new MainPage(driver);
	}

	public MainPage clicksignname(){
		action.click(signature());
		action.click(back2());
		return new MainPage(driver);
	}

	public MainPage clicknumber(){
		action.click(number());
		return new MainPage(driver);
	}
	public MainPage clicksex(){
		action.click(woman());
		return new MainPage(driver);
	}

	public MainPage clickvoset(){
		action.click(voset());
		return new MainPage(driver);
	}
	public MainPage clickrule(){
		action.click(rule());
		return new MainPage(driver);
	}
	public MainPage clickproblem(){
		action.click(problem());
		return new MainPage(driver);
	}	

}
