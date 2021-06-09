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

	public AndroidElement btn_details() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_details");
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

	public AndroidElement btn_xijin() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_xijin");
	}

	public AndroidElement btn_dongjin() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_dongjin");
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

	public AndroidElement btn_start() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_start");
	}

	public AndroidElement btn_collect() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_collect");
	}

	public AndroidElement btn_recollect() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_recollect");
	}

	public AndroidElement btn_panorama() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_panorama");
	}

               	public AndroidElement btn_music() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_music");
	}
               	public AndroidElement btn_like() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_like");
	}
               	public AndroidElement btn_location() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_location");
	}
               	public AndroidElement btn_chat() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_chat");
	}
               	public AndroidElement btn_forward() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_forward");
	}
               	public AndroidElement btn_huangji() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_huangji");
	}
               	public AndroidElement btn_yanxi() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_yanxi");
	}
               	public AndroidElement btn_wenhua() {
		return driver.findElementById("net.onest.timestoryprj:id/btn_wenhua");
	} 

//	页面操作方法
	public String skip_fail1() {
		action.click(btn_qinchao());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail2() {
		action.click(btn_xihan());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail3() {
		action.click(btn_xinchao());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail4() {
		action.click(btn_donghan());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail5() {
		action.click(btn_sanguo());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail6() {
		action.click(btn_qinchao());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail7() {
		action.click(btn_xihan());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail8() {
		action.click(btn_xinchao());
		action.click(btn_panorama());
		return action.getToast();
	}

	public String skip_fail9() {
		action.click(btn_donghan());
		action.click(btn_details());
		return action.getToast();
	}

	public String skip_fail10() {
		action.click(btn_sanguo());
		action.click(btn_details());
		return action.getToast();
	}

	public String skip_fail11() {
		action.click(btn_xijin());
		action.click(btn_details());
		return action.getToast();
	}

	public String skip_fail12() {
		action.click(btn_dongjin());
		action.click(btn_details());
		return action.getToast();
	}

	public String collect_success1() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_music());
                                return action.getToast();

	}

	public String collect_success2() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_like());
		return action.getToast();
	}

	public String collect_success3() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_location());
		return action.getToast();
	}

	public String collect_success4() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_chat());
		return action.getToast();
	}

	public String collect_success5() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_forward());
		return action.getToast();

	}

	public String collect_success6() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_huangji());
		return action.getToast();
	}

	public String collect_success7() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_yanxi());
		return action.getToast();
	}

	public String collect_success8() {
		action.click(btn_tangchao());
		action.click(btn_panorama());
		action.click(btn_wenhua());
		return action.getToast();
	}

}
