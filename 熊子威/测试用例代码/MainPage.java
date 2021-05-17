package pages;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class MainPage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;

//	构造方法
	public MainPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

//	页面对象
	public AndroidElement btn_dynasty_know() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_dynasty_know");
	}

	public AndroidElement btn_view() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_view");
	}

	public AndroidElement btn_qinchao() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_qinchao");
	}

	public AndroidElement btn_xihan() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_xihan");
	}

	public AndroidElement btn_xinchao() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_xinchao");
	}

	public AndroidElement btn_donghan() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_donghan");
	}

	public AndroidElement btn_sanguo() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_sanguo");
	}

	public AndroidElement btn_tangchao() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_tangchao");
	}

	public AndroidElement btn_mingchao() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_mingchao");
	}

	public AndroidElement btn_qingchao() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_qingchao");
	}

	public AndroidElement btn_select() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_select");
	}

	public AndroidElement btn_connect() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_connect");
	}

	public AndroidElement btn_sort() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_sort");
	}

	public AndroidElement btn_random() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_random");
	}

	public AndroidElement btn_collect() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_collect");
	}

	public AndroidElement btn_recollect() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_recollect");
	}

//	页面操作方法
	public String skip_fail1() {
		action.click(btn_qinchao());
		action.click(btn_dynasty_know());
		return action.getToast();
	}

	public String skip_fail2() {
		action.click(btn_xihan());
		action.click(btn_dynasty_know());
		return action.getToast();
	}

	public String skip_fail3() {
		action.click(btn_xinchao());
		action.click(btn_dynasty_know());
		return action.getToast();
	}

	public String skip_fail4() {
		action.click(btn_donghan());
		action.click(btn_dynasty_know());
		return action.getToast();
	}

	public String skip_fail5() {
		action.click(btn_sanguo());
		action.click(btn_dynasty_know());
		return action.getToast();
	}

	public String skip_fail6() {
		action.click(btn_qinchao());
		action.click(btn_view());
		return action.getToast();
	}

	public String skip_fail7() {
		action.click(btn_xihan());
		action.click(btn_view());
		return action.getToast();
	}

	public String skip_fail8() {
		action.click(btn_xinchao());
		action.click(btn_view());
		return action.getToast();
	}

	public String skip_fail9() {
		action.click(btn_donghan());
		action.click(btn_view());
		return action.getToast();
	}

	public String skip_fail10() {
		action.click(btn_sanguo());
		action.click(btn_view());
		return action.getToast();
	}

	public String skip_fail11() {
		action.click(btn_mingchao());
		action.click(btn_view());
		return action.getToast();
	}

	public String skip_fail12() {
		action.click(btn_qingchao());
		action.click(btn_view());
		return action.getToast();
	}

	public String collect_success1() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_select());
		action.click(btn_collect());
		return action.getToast();

	}

	public String collect_success2() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_connect());
		action.click(btn_collect());
		return action.getToast();
	}

	public String collect_success3() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_sort());
		action.click(btn_collect());
		return action.getToast();
	}

	public String collect_success4() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_random());
		action.click(btn_collect());
		return action.getToast();
	}

	public String recollect_success1() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_select());
		action.click(btn_recollect());
		return action.getToast();

	}

	public String recollect_success2() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_connect());
		action.click(btn_recollect());
		return action.getToast();
	}

	public String recollect_success3() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_sort());
		action.click(btn_recollect());
		return action.getToast();
	}

	public String recollect_success4() {
		action.click(btn_tangchao());
		action.click(btn_dynasty_know());
		action.click(btn_random());
		action.click(btn_recollect());
		return action.getToast();
	}

}
