package testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.Page;
import pages.MainPage;

public class test extends BaseDriver {
	Page loginPage;
	@BeforeClass
	public void initPage() {
		loginPage=new Page(driver);
	}
		//登录成功
		@Test
		public void test_login_success() {
			loginPage.login_sucess("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
				
		//登录-错误
		@Test
		public void test_login_fail() {
			String message=loginPage.login_fail("987654321111", "{");
			assertEquals(message, "您的格式不正确，请重新检查");
		}
		//登录-错误
		@Test
		public void test_login_fail1() {
			String message=loginPage.login_fail1();
			assertEquals(message, "您的格式不正确，请重新检查");
		}
			
		//注册成功-密码为123456
		@Test
		public void test_regester() {
			loginPage.regester_n("18831176589", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
					
		}
		// 注册成功-密码为{-密码安全性不高
		@Test
		public void test_regester1() {
			loginPage.regester_n("18831176589", "{");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
		//注册失败-同一电话号码注册失败
		@Test
		public void test_regesterf() {
			String message=loginPage.regester_f("18831176586", "123456");
			assertEquals(message, "注册失败，该用户已存在");
		}
		//注册失败->11位数字
		@Test
		public void test_regesterf1() {
			String message=loginPage.regester_f("188311765861", "123456");
			assertEquals(message, "请检查您的信息格式");
		}
			    
		//登录——记住密码
		@Test 
		public void test_remember() {
			loginPage.regester_n("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.RegisterActivity");
		}
				
		//登录——记住密码-童生
		@Test 
		public void test_student() {
			loginPage.login_Student("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
				
		//登录——记住密码-抽卡
		@Test 
		public void test_card() {
			loginPage.login_card("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
				
		//登录——记住密码-我的卡片
		@Test 
		public void test_card1() {
			loginPage.login_mycard("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.card.MyCardActivity");
		}
			
		//登录——记住密码-我的收藏
		@Test 
		public void test_collect() {
			loginPage.login_mycard("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.card.SpecificDynastyCardActivity");
		}
		
		
		//登录——记住密码-我的积分 有问题 
		@Test 
		public void test_score() {
			MainPage message=loginPage.login_score("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.RechargeActivity");
		}
	
	    //登录——记住密码-左头像
		@Test 
		public void test_pho() {
		   MainPage message=loginPage.login_pic("18831176586", "123456");
		   assertEquals(driver.currentActivity(), ".activity.user.UserCenterActivity");
			}
		
		//登录——记住密码-设置-昵称
		@Test 
		public void test_setup() {
			MainPage message=loginPage.login_setup("18831176586", "123456","yangqinjin");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//登录-记住密码-设置-个性签名
		@Test 
		public void test_setup1() {
			MainPage message=loginPage.login_signature("18831176586", "123456","liangweishimeinv");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
	
	    // 登录-记住密码-设置-二维码
		@Test 
		public void test_code() {
			MainPage message=loginPage.login_code("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//登录-记住密码-设置-性别
		@Test 
		public void test_sex() {
			MainPage message=loginPage.login_sex("18831176586", "123456");		
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//登录-记住密码-音量设置
		@Test 
		public void test_voice() {
			MainPage message=loginPage.login_setvoice("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//登录-记住密码-查看规则
		@Test 
		public void test_() {
			MainPage message=loginPage.login_rule("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
        //登录-记住密码-问题   
		@Test 
		public void test_problem() {
			MainPage message=loginPage.login_problem("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//登录-记住密码-反馈问题   
      @Test 
		public void test_cproblem() {
			MainPage message=loginPage.login_cproblem("18831176586", "123456","梁微是美女");				
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}	
	    //登录-记住密码-右边声音图标   
		@Test 
		public void test_clockvoice() {
			MainPage message=loginPage.login_clockvoice("18831176586", "123456");				
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}	
	    //登录-记住密码-右边设置-图像-取消
		@Test 
		public void test_repic() {
			MainPage message=loginPage.login_repicdelete("18831176586", "123456");				
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}	
		//登录-设置-退出登录-确定
		@Test
		public void test_Logout() {
		MainPage message=loginPage.login_logout("18831176586", "123456");				
		assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
     	}	
}
	

