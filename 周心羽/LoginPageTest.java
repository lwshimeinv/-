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
	//��¼�ɹ�
	@Test
	public void test_login_success() {
		loginPage.login_sucess("15371906891", "zxy721025");
		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}
	//��¼ʧ��1
	@Test
	public void test_login_fail1() {
		String message=loginPage.login_fail("1", "2");
		assertEquals(message, "���ĸ�ʽ����ȷ�������¼��");
	}
	//��¼ʧ��2
	@Test
	public void test_login_fail2() {
		String message=loginPage.login_fail("153719068", "zxy721025");
		assertEquals(message, "��ĸ�ʽ����ȷ�������¼��");
	}
	//��¼ʧ��3
	@Test
	public void test_login_fail3() {
		String message=loginPage.login_fail("15371906891", "2");
		assertEquals(message, "��¼ʧ��");
	}
	//qq��¼ʧ��
	@Test
	public void test_login_qq() {
		loginPage.login_qq();
		assertEquals(driver.currentActivity(), ".activity.user.LoginActivity");
	}

	//��ס����
	@Test 
	public void test_remember() {
		loginPage.regester_n("18831176586", "123456");
		assertEquals(driver.currentActivity(), ".activity.user.RegisterActivity");
	}
	//ע��ɹ�
	@Test
	public void test_et_success() {
		loginPage.et_success("15151515153", "123456");
		assertEquals(driver.currentActivity(), ".activity.user.LoginActivity");
	}
	//ע��ʧ��1
	@Test
	public void test_et_fail1() {
		String message=loginPage.et_fail("22222222222", "");
		assertEquals(message, "ע��ʧ�ܣ����û�����");
	}
	//ע��ʧ��2
	@Test
	public void test_et_fail2() {
		String message=loginPage.et_fail("11111", "1");
		assertEquals(message, "����������Ϣ��ʽ");
	}	
	//ע��ʧ��3
	@Test
	public void test_et_fail3() {
		String message=loginPage.et_fail("", "");
		assertEquals(message, "����������Ϣ��ʽ");
	}	
	//ע��ʧ��4
	@Test
	public void test_et_fail4() {
		String message=loginPage.et_fail("", "123456");
		assertEquals(message, "����������Ϣ��ʽ");
	}
	//ע��ɹ�2
	@Test
	public void test_et_success2() {
	loginPage.et_success("15151515152", ",,,,,");
	assertEquals(driver.currentActivity(), ".activity.user.LoginActivity");
}
	//�޸Ĳ������ǳ�
	@Test
	public void test_change_nickname() {
		loginPage.change_nickname("̫������");
		assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
}
	//�鿨
	@Test
	public void test_card() {
		loginPage.login_card("15371906891", "zxy721025");
		assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
	}
	//�ҵ��ղ�
			@Test 
			public void test_collect() {
				loginPage.login_my_card("15371906891", "zxy721025");
				assertEquals(driver.currentActivity(), ".activity.card.SpecificDynastyCardActivity");
			}
	//�޸ĸ���ǩ��
	@Test 
	public void test_setup() {
		MainPage message= loginPage.login_signature("15371906891", "zxy721025","zzzzzzzzz");
		assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
	}
	
	//�鿴�ȼ�
			@Test 
			public void test_student() {
				loginPage.login_Student("15371906891", "zxy721025");
				assertEquals(driver.currentActivity(), ".activity.dynasty.HomepageActivity");
			}
	//�����Ա�
			@Test 
			public void test_sex() {
				MainPage message=loginPage.login_sex("15371906891", "zxy721025");		
				assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
			}

	//�鿴����
			@Test 
			public void test_() {
				MainPage message=loginPage.login_rule("15371906891", "zxy721025");
				assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
			}
	//�˳���¼
			@Test
			public void test_Logout() {
			MainPage message=loginPage.login_logout("15371906891", "zxy721025");				
			assertEquals(driver.currentActivity(), ".activity.user.SettingActivity");
	     	}	
}
