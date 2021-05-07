package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class AppTest extends BaseTest{
	String url = "http://47.101.157.246:8889/index-dashboard.html";
	
	@BeforeClass(description = "登录后台")
	public void test() {
		try {
			webtest.open(url);
			webtest.click("name=username");
			webtest.type("name=username", "admin");
			webtest.click("name=password");
			webtest.type("name=password", "123456");
			webtest.click("xpath=//input[@type='submit']");//点击登录
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Reporter.log(e.getMessage());
		}
	}
	
	
	@Test(description = "主菜单账号按钮",priority = 1)
	public void test1()  {
		try {
			
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[3]");
			assertTrue(flag,"页面没有主菜单账号按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[3]");//点击下拉
			webtest.click("xpath=//ul[@class='wraplist']/li[3]/a");//点击回收
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "主菜单信息管理按钮",priority = 2)
	public void test2()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[4]");
			assertTrue(flag,"页面没有主菜单信息管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[4]");//点击下拉
			webtest.click("xpath=//ul[@class='wraplist']/li[4]/a");//点击回收
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(description = "主菜单登录",priority = 3)
	public void test3()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[3]");
			assertTrue(flag,"页面没有主菜单账号按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[3]");//点击账号
			
			webtest.click("xpath=//ul[@class='wraplist']/li[3]/ul/li[1]");//点击登录
			
			webtest.click("name=username");
			webtest.type("name=username", "admin");
			webtest.type("name=password", "123456");
			webtest.click("xpath=//input[@type='submit']");//点击登录
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(description = "主菜单注册",priority = 4)
	public void test4()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[3]");
			assertTrue(flag,"页面没有主菜单账号按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[3]");//点击账号
			
			webtest.click("xpath=//ul[@class='wraplist']/li[3]/ul/li[2]");//点击注册
			
			webtest.click("xpath=//div[@class='col-xs-12']/div[1]/div/div/input");//点击名字
			webtest.type("xpath=//div[@class='col-xs-12']/div[1]/div/div/input", "a");//输入名字
			webtest.type("xpath=//div[@class='col-xs-12']/div[2]/div/div/input", "a@qq.com");//输入邮箱
			webtest.type("xpath=//div[@class='col-xs-12']/div[3]/div/div/input", "a");//输入密码
			webtest.type("xpath=//div[@class='col-xs-12']/div[4]/div/div/input", "a");//再次输入密码
			webtest.click("xpath=//div[@class='col-xs-12']/div[5]/a[1]");//点击sign up
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "错误界面",priority = 5)
	public void test5()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[3]");
			assertTrue(flag,"页面没有主菜单账号按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[3]");//点击账号
			
			webtest.click("xpath=//ul[@class='wraplist']/li[3]/ul/li[3]");//点击错误界面
			
			webtest.goBack();//返回
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "日历按钮",priority = 6)
	public void test6()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[6]");
			assertTrue(flag,"页面没有日历按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[6]");//点击日历
			webtest.click("xpath=//ul[@class='wraplist']/li[2]");//点击首页转换成中文
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "朝代事件信息管理按钮",priority = 7)
	public void test7()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[7]");
			assertTrue(flag,"页面没有日历按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[7]");//点击朝代事件信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[7]/a");//再次点击
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(description = "朝代事件信息管理按钮",priority = 8)
	public void test8()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[7]");
			assertTrue(flag,"页面没有朝代事件信息管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[7]");//点击朝代事件信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[7]/a");//再次点击
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(description = "朝代事件信息管理按钮",priority = 9)
	public void test9()  {
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[7]");
			assertTrue(flag,"页面没有朝代事件信息管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[7]");//点击朝代事件信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[7]/a");//再次点击
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "信息列表按钮",priority = 10)
	public void test10(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[7]");
			assertTrue(flag,"页面没有朝代事件信息管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[7]");//点击朝代事件信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[7]/ul/li[1]");//点击信息列表
			webtest.click("xpath=//ul[@class='wraplist']/li[7]/a");//回收下拉框
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "信息列表按钮",priority = 11)
	public void test11(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[7]");
			assertTrue(flag,"页面没有朝代事件信息管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[7]");//点击朝代事件信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[7]/ul/li[2]");//点击添加朝代
			webtest.click("xpath=//ul[@class='wraplist']/li[7]/a");//回收下拉框
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "卡片管理按钮",priority = 12)
	public void test12(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[8]");
			assertTrue(flag,"页面没有卡片管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[8]");//点击朝代事件信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[8]/a");//回收下拉框
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "卡片管理按钮",priority = 13)
	public void test13(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[8]");
			assertTrue(flag,"页面没有卡片管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[8]");//点击卡片管理
			webtest.click("xpath=//ul[@class='wraplist']/li[8]/ul/li[1]");//点击查看卡片
			webtest.click("xpath=//ul[@class='wraplist']/li[8]/a");//回收下拉框
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "题目信息管理按钮",priority = 14)
	public void test14(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[9]");
			assertTrue(flag,"页面没有题目信息管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[9]");//点击题目信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[9]/a");//回收下拉框
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
		
	@Test(description = "查看题目按钮",priority = 15)
	public void test15(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[9]");
			assertTrue(flag,"页面没有题目信息管理按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[9]");//点击题目信息管理
			webtest.click("xpath=//ul[@class='wraplist']/li[9]/ul/li[1]");//点击查看题目
			webtest.click("xpath=//ul[@class='wraplist']/li[9]/a");//回收下拉框
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(description = "题目信息管理按钮",priority = 16)
	public void test16(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[11]");
			assertTrue(flag,"页面没有用户数据分析按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[11]");//点击用户数据分析
			webtest.click("xpath=//ul[@class='wraplist']/li[11]/a");//回收
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(description = "数据分析按钮",priority = 17)
	public void test17(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[11]");
			assertTrue(flag,"页面没有用户数据分析按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[11]");//点击用户数据分析
			webtest.click("xpath=//ul[@class='wraplist']/li[11]ul/li[1]");//点击第一个分析形式
			
			webtest.click("xpath=//ul[@class='wraplist']/li[2]");//点击首页
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "朝代数据分析按钮",priority = 18)
	public void test18(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[12]");
			assertTrue(flag,"页面没有朝代数据分析按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[12]");//点击朝代数据分析
			webtest.click("xpath=//ul[@class='wraplist']/li[12]/a");//回收
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "朝代数据分析按钮",priority = 19)
	public void test19(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[12]");
			assertTrue(flag,"页面没有朝代数据分析按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[12]");//点击朝代数据分析
			webtest.click("xpath=//ul[@class='wraplist']/li[12]ul/li[1]");//点击第一个分析形式
			
			webtest.click("xpath=//ul[@class='wraplist']/li[2]");//点击首页
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(description = "卡片数据分析",priority = 20)
	public void test20(){
		try {
			boolean flag = webtest.isDisplayed("xpath=//ul[@class='wraplist']/li[13]");
			assertTrue(flag,"页面没有卡片数据分析按钮");
			webtest.click("xpath=//ul[@class='wraplist']/li[13]");//点击卡片数据分析
			webtest.click("xpath=//ul[@class='wraplist']/li[13]ul/li[1]");//点击第一个分析形式
			
			webtest.click("xpath=//ul[@class='wraplist']/li[2]");//点击首页
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}












