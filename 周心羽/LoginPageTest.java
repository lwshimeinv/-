package testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.LoginPage;
import pages.MainPage;

public class LoginPageTest extends BaseDriver {
	LoginPage loginPage;
	@BeforeClass
	public void initPage() {
		loginPage=new LoginPage(driver);
	}
	//登录成功
	@Test
	public void test_login_success() {
		loginPage.login_sucess("15371906891", "zxy721025");
		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}
	//登录失败1
	@Test
	public void test_login_fail1() {
		String message=loginPage.login_fail("1", "2");
		assertEquals(message, "您的格式不正确，请重新检查");
	}
	//登录失败2
	@Test
	public void test_login_fail2() {
		String message=loginPage.login_fail("153719068", "zxy721025");
		assertEquals(message, "你的格式不正确，请重新检查");
	}
	//登录失败3
	@Test
	public void test_login_fail3() {
		String message=loginPage.login_fail("15371906891", "2");
		assertEquals(message, "登录失败");
	}
	//qq登录失败
	@Test
	public void test_login_qq() {
		loginPage.login_qq();
		assertEquals(driver.currentActivity(), ".activity.user.LoginActivity");
	}

	//记住密码
	@Test 
	public void test_remember() {
		loginPage.regester_n("18831176586", "123456");
		assertEquals(driver.currentActivity(), ".activity.user.RegisterActivity");
	}
	//注册成功
	@Test
	public void test_et_success() {
		loginPage.et_success("15151515153", "123456");
		assertEquals(driver.currentActivity(), ".activity.user.LoginActivity");
	}
	//注册失败1
	@Test
	public void test_et_fail1() {
		String message=loginPage.et_fail("22222222222", "");
		assertEquals(message, "注册失败，该用户存在");
	}
	//注册失败2
	@Test
	public void test_et_fail2() {
		String message=loginPage.et_fail("11111", "1");
		assertEquals(message, "请检查您的信息格式");
	}	
	//注册失败3
	@Test
	public void test_et_fail3() {
		String message=loginPage.et_fail("", "");
		assertEquals(message, "请检查您的信息格式");
	}	
	//注册失败4
	@Test
	public void test_et_fail4() {
		String message=loginPage.et_fail("", "123456");
		assertEquals(message, "请检查您的信息格式");
	}
	//注册成功2
	@Test
	public void test_et_success2() {
	loginPage.et_success("15151515152", ",,,,,");
	assertEquals(driver.currentActivity(), ".activity.user.LoginActivity");
}
	//修改并保存昵称
	@Test
	public void test_change_nickname() {
		loginPage.change_nickname("太外来客");
		assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
}
	//抽卡
	@Test
	public void test_card() {
		loginPage.login_card("15371906891", "zxy721025");
		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}
	//我的收藏
			@Test 
			public void test_collect() {
				loginPage.login_my_card("15371906891", "zxy721025");
				assertEquals(driver.currentActivity(), ".activity.card.SpecificDynastyCardActivity");
			}
	//修改个性签名
	@Test 
	public void test_setup() {
		MainPage message= loginPage.login_signature("15371906891", "zxy721025","zzzzzzzzz");
		assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
	}
	
	//查看等级
			@Test 
			public void test_student() {
				loginPage.login_Student("15371906891", "zxy721025");
				assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
			}
	//设置性别
			@Test 
			public void test_sex() {
				MainPage message=loginPage.login_sex("15371906891", "zxy721025");		
				assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
			}

	//查看规则
			@Test 
			public void test_() {
				MainPage message=loginPage.login_rule("15371906891", "zxy721025");
				assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
			}
	//退出登录
			@Test
			public void test_Logout() {
			MainPage message=loginPage.login_logout("15371906891", "zxy721025");				
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
	     	}	
}
