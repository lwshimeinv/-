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
		//��¼�ɹ�
		@Test
		public void test_login_success() {
			loginPage.login_sucess("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
				
		//��¼-����
		@Test
		public void test_login_fail() {
			String message=loginPage.login_fail("987654321111", "{");
			assertEquals(message, "���ĸ�ʽ����ȷ�������¼��");
		}
		//��¼-����
		@Test
		public void test_login_fail1() {
			String message=loginPage.login_fail1();
			assertEquals(message, "���ĸ�ʽ����ȷ�������¼��");
		}
			
		//ע��ɹ�-����Ϊ123456
		@Test
		public void test_regester() {
			loginPage.regester_n("18831176589", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
					
		}
		// ע��ɹ�-����Ϊ{-���밲ȫ�Բ���
		@Test
		public void test_regester1() {
			loginPage.regester_n("18831176589", "{");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
		//ע��ʧ��-ͬһ�绰����ע��ʧ��
		@Test
		public void test_regesterf() {
			String message=loginPage.regester_f("18831176586", "123456");
			assertEquals(message, "ע��ʧ�ܣ����û��Ѵ���");
		}
		//ע��ʧ��->11λ����
		@Test
		public void test_regesterf1() {
			String message=loginPage.regester_f("188311765861", "123456");
			assertEquals(message, "����������Ϣ��ʽ");
		}
			    
		//��¼������ס����
		@Test 
		public void test_remember() {
			loginPage.regester_n("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.RegisterActivity");
		}
				
		//��¼������ס����-ͯ��
		@Test 
		public void test_student() {
			loginPage.login_Student("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
				
		//��¼������ס����-�鿨
		@Test 
		public void test_card() {
			loginPage.login_card("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}
				
		//��¼������ס����-�ҵĿ�Ƭ
		@Test 
		public void test_card1() {
			loginPage.login_mycard("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.card.MyCardActivity");
		}
			
		//��¼������ס����-�ҵ��ղ�
		@Test 
		public void test_collect() {
			loginPage.login_mycard("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.card.SpecificDynastyCardActivity");
		}
		
		
		//��¼������ס����-�ҵĻ��� ������ 
		@Test 
		public void test_score() {
			MainPage message=loginPage.login_score("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.RechargeActivity");
		}
	
	    //��¼������ס����-��ͷ��
		@Test 
		public void test_pho() {
		   MainPage message=loginPage.login_pic("18831176586", "123456");
		   assertEquals(driver.currentActivity(), ".activity.user.UserCenterActivity");
			}
		
		//��¼������ס����-����-�ǳ�
		@Test 
		public void test_setup() {
			MainPage message=loginPage.login_setup("18831176586", "123456","yangqinjin");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//��¼-��ס����-����-����ǩ��
		@Test 
		public void test_setup1() {
			MainPage message=loginPage.login_signature("18831176586", "123456","liangweishimeinv");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
	
	    // ��¼-��ס����-����-��ά��
		@Test 
		public void test_code() {
			MainPage message=loginPage.login_code("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//��¼-��ס����-����-�Ա�
		@Test 
		public void test_sex() {
			MainPage message=loginPage.login_sex("18831176586", "123456");		
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//��¼-��ס����-��������
		@Test 
		public void test_voice() {
			MainPage message=loginPage.login_setvoice("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//��¼-��ס����-�鿴����
		@Test 
		public void test_() {
			MainPage message=loginPage.login_rule("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
        //��¼-��ס����-����   
		@Test 
		public void test_problem() {
			MainPage message=loginPage.login_problem("18831176586", "123456");
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}
		//��¼-��ס����-��������   
      @Test 
		public void test_cproblem() {
			MainPage message=loginPage.login_cproblem("18831176586", "123456","��΢����Ů");				
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}	
	    //��¼-��ס����-�ұ�����ͼ��   
		@Test 
		public void test_clockvoice() {
			MainPage message=loginPage.login_clockvoice("18831176586", "123456");				
			assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
		}	
	    //��¼-��ס����-�ұ�����-ͼ��-ȡ��
		@Test 
		public void test_repic() {
			MainPage message=loginPage.login_repicdelete("18831176586", "123456");				
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
		}	
		//��¼-����-�˳���¼-ȷ��
		@Test
		public void test_Logout() {
		MainPage message=loginPage.login_logout("18831176586", "123456");				
		assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
     	}	
}
	

