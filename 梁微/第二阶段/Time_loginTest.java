package testcase;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.LoginPage;
import pages.MainPage;

public class Time_loginTest extends BaseDriver {
	LoginPage loginPage;
	@BeforeClass
	public void initPage() {
		loginPage=new LoginPage(driver);
	}
	
	

//	1注册成功
	@Test
	public void test_signup_success() {
		loginPage.signup_sucess("19831128153", "123456");	
		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}

//	2注册失败-输入已注册的的手机号
	@Test
	public void test_signup_fail1() {
		String message=loginPage.signup_fail("19831128152", "123456");	
		assertEquals(message, "注册失败，该用户已存在");
	}
//	3注册失败-输入错误的手机号格式
	@Test
	public void test_signup_fail2() {
		String message=loginPage.signup_fail("19831128152", "123456");	
		assertEquals(message, "请检查您的信息格式");
	}
	
//	4注册失败-不输入密码
	@Test
	public void test_signup_fail3() {
		String message=loginPage.signup_fail("19831128152", "");	
		assertEquals(message, "注册失败，该用户已存在");
	}
//	5注册失败-不输入直接点击确认
	@Test
	public void test_signup_fail4() {
		String message=loginPage.signup_fail("19831128152", "");	
		assertEquals(message, "注册失败，该用户已存在");
	}
	
//	特殊字符-在手机号中输入特殊字符，正常密码
	
	
////	6登录成功
//	@Test
//	public void test_login_success() {
//		loginPage.login_sucess("19831128152", "123456");
//		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
//	}
//	
////	7登陆失败-输入未注册的手机号
//	@Test
//	public void test_login_fail() {
//		String message=loginPage.login_fail("19831128153", "2");	
//		assertEquals(message, "登录失败");
//	}

//	8登陆失败-输入错误格式的手机号
	@Test
	public void test_login_fail2() {
		String message=loginPage.login_fail("1", "2");	
		assertEquals(message, "您的格式不正确，请重新检查");
	}

//	9登陆失败-输入错误的密码
	@Test
	public void test_login_fail3() {
		String message=loginPage.login_fail("19831128152", "2");	
		assertEquals(message, "登录失败");
	}
	
//	10登陆失败-不输入手机号输入密码
	@Test
	public void test_login_fail4() {
		String message=loginPage.login_fail("", "2");	
		assertEquals(message, "登录失败");
	}
	
//	11登陆失败-输入手机号不输入密码
	@Test
	public void test_login_fail5() {
		String message=loginPage.login_fail("19831128152", "");	
		assertEquals(message, "登录失败");
	}
	
//	12登陆失败-不输入手机号和密码
	@Test
	public void test_login_fail6() {
		String message=loginPage.login_fail("", "");	
		assertEquals(message, "登录失败");
	}
	
//	13特殊字符-在手机号中输入特殊字符
	@Test
	public void test_login_fail7() {
		String message=loginPage.login_fail("19831128152~", "2");	
		assertEquals(message, "登录失败");
	}
	
//	14退出登录
	@Test
	public void test_logout_success() {
		loginPage.logout("19831128153", "123456");	
		
		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}
	
//	15取消退出登录
	@Test
	public void test_logout_fail() {
		loginPage.logout_fail("19831128153", "123456");	
		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}
//	16修改性别
	@Test
	public void test_updateSex() {
		String message=loginPage.update_sex("19831128152","123456");
		assertEquals(message, "保存成功");
	}
//	17修改昵称
	@Test
	public void test_updateName() {
		String message=loginPage.update_name("19831128152","123456","meinv");
		assertEquals(message, "保存成功");
	}
//	18修改个性签名-保存
	@Test
	public void test_updatesignature() {
		String message=loginPage.update_signature("19831128152","123456","~~~~``");
		assertEquals(message, "保存成功");
	}
//	19修改个性签名-不保存
	@Test
	public void test_updatesignatureFail() {
		String message=loginPage.update_signatureFail("19831128152","123456");
		assertEquals(message, "未保存成功");
	}
//	20修改昵称未保存
	@Test
	public void test_updateNameFail() {
		String message=loginPage.update_namefail("19831128152","123456","!!!!");
		assertEquals(message, "未保存");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
