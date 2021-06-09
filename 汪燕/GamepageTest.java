package testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.Gamepage;

public class GamepageTest extends BaseDriver{
	Gamepage gamepage;
	@BeforeClass
	public void initPage() {
		gamepage=new Gamepage(driver);
	}
	@Test(description = "登录",priority = 1)
	public void test_login_success() {
		
		gamepage.login_sucess("18831176581", "123456");
		//assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}

	@Test(description = "我的卡片2",priority = 2)
	public void test_clickmycard() throws InterruptedException {
		String message=gamepage.mycard_2();
		assertEquals(message, "没有此朝代的卡片，请重新选择朝代吧");
	}
	@Test(description = "返回2",priority = 3)
	public void test_clickback2() throws InterruptedException {
		gamepage.clickback1();
	}
	@Test(description = "童生",priority = 4)
	public void test_clicklevel1() throws InterruptedException {
		gamepage.clicklevel();
	}
	@Test(description = "抽卡",priority = 5)
	public void test_clickbtncard1() throws InterruptedException {
		gamepage.clickbtncard();
		
	}
	@Test(description = "声音",priority = 6)
	public void test_clickbtnvoice() throws InterruptedException {
		gamepage.clickvoice();
		
	}
	@Test(description = "我的卡片1",priority = 7)
	public void test_headerclick() throws InterruptedException {
		
		String message=gamepage.mycard_1();
		assertEquals(message, "没有此朝代的卡片，请重新选择朝代吧");
		
	}
	@Test(description = "返回1",priority = 8)
	public void test_clickback1() throws InterruptedException {
		gamepage.clickback1();
	}
	@Test(description = "童生",priority = 9)
	public void test_clicklevel() throws InterruptedException {
		gamepage.clicklevel();
	}
	@Test(description = "抽卡",priority = 10)
	public void test_clickbtncard() throws InterruptedException {
		gamepage.clickbtncard();
		
	}
	@Test(description = "出行",priority = 11)
	public void test_clickgo() throws InterruptedException {
		gamepage.clickgo();
	}
	@Test(description = "出行",priority = 12)
	public void test_clickset(){
		gamepage.clickset();
	}
	@Test(description = "保存",priority = 13)
	public void test_clicksave(){
		String message=gamepage.clicksave();
		assertEquals(message, "保存成功");
	}
	@Test(description = "名字",priority = 14)
	public void test_clickname() throws InterruptedException{
		gamepage.clickname();
	}

	@Test(description = "个性签名",priority = 15)
	public void test_signname(){
		gamepage.clicksignname();
	}

	@Test(description = "手机号",priority = 16)
	public void test_clicknumber(){
		gamepage.clicknumber();
	}
	@Test(description = "性别",priority = 17)
	public void test_clickwoman(){
		gamepage.clicksex();
	}
	@Test(description = "音量设置",priority = 18)
	public void test_clickvoset(){
		gamepage.clickvoset();
	}
	@Test(description = "查看规则",priority = 19)
	public void test_clickrule(){
		gamepage.clickvoset();
	}
	@Test(description = "查看规则",priority = 20)
	public void test_clickproblem(){
		gamepage.clickproblem();
	}
	
	
	
	
}
