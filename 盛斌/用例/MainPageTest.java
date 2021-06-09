package testcase;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.LoginPage;
import pages.MainPage;

public class MainPageTest extends BaseDriver {
	MainPage mainPage;

	@BeforeClass
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		mainPage = loginPage.login_sucess("19931338166", "a8321333");
	}

	@Test(priority = 1)
	public void test_skip_fail1() {
		String message = mainPage.skip_fail1();
		assertEquals(message, "���ڿ�����");

	}

	@Test(priority = 2)
	public void test_skip_fail2() {
		String message = mainPage.skip_fail2();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 3)
	public void test_skip_fail3() {
		String message = mainPage.skip_fail3();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 4)
	public void test_skip_fail4() {
		String message = mainPage.skip_fail4();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 5)
	public void test_skip_fail5() {
		String message = mainPage.skip_fail5();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 6)
	public void test_skip_fail6() {
		String message = mainPage.skip_fail6();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 7)
	public void test_skip_fail7() {
		String message = mainPage.skip_fail7();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 8)
	public void test_skip_fail8() {
		String message = mainPage.skip_fail8();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 9)
	public void test_skip_fail9() {
		String message = mainPage.skip_fail9();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 10)
	public void test_skip_fail10() {
		String message = mainPage.skip_fail10();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 11)
	public void test_skip_fail11() {
		String message = mainPage.skip_fail10();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 12)
	public void test_skip_fail12() {
		String message = mainPage.skip_fail10();
		assertEquals(message, "���ڿ�����");
	}

	@Test(priority = 13)
	public void test_collect_success1() {
		String message = mainPage.collect_success1();
		assertEquals(message, "�ɹ�");
	}

	@Test(priority = 14)
	public void test_collect_success2() {
		String message = mainPage.collect_success2();
		assertEquals(message, "�ɹ�");
	}

	@Test(priority = 15)
	public void test_collect_success3() {
		String message = mainPage.collect_success3();
		assertEquals(message, "�ɹ�");
	}

	@Test(priority = 16)
	public void test_collect_success4() {
		String message = mainPage.collect_success4();
		assertEquals(message, "�ɹ�");
	}

	@Test(priority = 17)
	public void test_recollect_success1() {
		String message = mainPage.collect_success5();
		assertEquals(message, "�ɹ�");
	}

	@Test(priority = 18)
	public void test_recollect_success2() {
		String message = mainPage.collect_success6();
		assertEquals(message, "�ɹ�");
	}

	@Test(priority = 19)
	public void test_recollect_success3() {
		String message = mainPage.collect_success7();
		assertEquals(message, "�ɹ�");
	}

	@Test(priority = 20)
	public void test_recollect_success4() {
		String message = mainPage.collect_success8();
		assertEquals(message, "�ɹ�");
	}

}
