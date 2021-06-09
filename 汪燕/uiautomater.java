package com.example.testnotes;

import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiCollection;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按字符字典顺序执行
public class Demo {
    UiDevice mDevice;
    UiCollection collection;

    @Before
    //创建连接
    public void initDevice() throws RemoteException {
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if (mDevice.isScreenOn()) {//判断当前屏幕是否是亮的
            mDevice.wakeUp();//唤醒屏幕
        }
        int width = mDevice.getDisplayWidth();
        int height = mDevice.getDisplayHeight();
        Log.i("Width:", String.valueOf(width));
        Log.i("Height:", String.valueOf(height));
    }

    //11注册成功
    @Test
    public void signUpSuccess() throws InterruptedException {
        //点击注册
        UiObject2 register = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_register"));
        UiObject2 reg_phone = mDevice.findObject(By.res("net.onest.timestoryprj:id/et_res_phone"));
        UiObject2 reg_pwd = mDevice.findObject(By.res("net.onest.timestoryprj:id/et_res_pwd"));
        UiObject2 btn_reg = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_res"));
        register.click();
        reg_phone.setText("18831176581");
        reg_pwd.setText("123456");
        btn_reg.click();
    }

    //2登录成功
    @Test
    public void loginSuccess() throws InterruptedException {
        //找到账号并点击
        UiObject2 phone = mDevice.findObject(By.res("net.onest.timestoryprj:id/et_phone"));
        UiObject2 pwd = mDevice.findObject(By.res("net.onest.timestoryprj:id/et_pwd"));
        UiObject2 btn_login = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_login"));
        phone.setText("18831176581");
        pwd.setText("123456");
        btn_login.click();
    }

    //    3注册并登录
    @Test
    public void signupAndlogin() throws InterruptedException {
        signUpSuccess();
        Thread.sleep(1000);
        loginSuccess();
    }

    //    4退出登录
    @Test
    public void QuitSuccess() throws InterruptedException {
        loginSuccess();
        //找到退出并点击
        UiObject2 btn_setting = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_settings"));
        UiObject2 btn_exit = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_exit_login"));
        UiObject2 btn_right = mDevice.findObject(By.res("net.onest.timestoryprj:id/rightlinear"));
        btn_setting.setText("19831128154");
        btn_exit.setText("123456");
        btn_right.click();
    }

    //    5点击我的卡片
    @Test
    public void myCard() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);

        UiObject2 btn_my_card = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_my_card"));
        UiObject2 btn_back = mDevice.findObject(By.res("net.onest.timestoryprj:id/back"));

        btn_my_card.click();
        Thread.sleep(2000);
        btn_back.click();

    }

    //    6点击重生
    @Test
    public void clickPerson() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tvlevel = mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_level"));

        btn_tvlevel.click();
        Thread.sleep(1000);
        btn_tvlevel.click();
    }

    //    7点击抽卡
    @Test
    public void clickCard() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_card = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_card"));
        UiObject2 btn_confirm = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_confirm"));
        btn_card.click();
        Thread.sleep(1000);
        btn_confirm.click();
    }

    //    8点击头像
    @Test
    public void clickHeader() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_header = mDevice.findObject(By.res("net.onest.timestoryprj:id/iv_header"));
        UiObject2 btn_tvlevel = mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_level"));
        btn_header.click();
        Thread.sleep(1000);

        btn_tvlevel.click();
        Thread.sleep(1000);
        btn_tvlevel.click();
    }

    //    9点击出行
    @Test
    public void clickRule() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_go_dynasty = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_go_dynasty"));
        btn_go_dynasty.click();
    }

    //    10点击头像2
    @Test
    public void clickRightliner() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_header = mDevice.findObject(By.res("net.onest.timestoryprj:id/iv_header"));

        UiObject2 btn_my_card = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_my_card"));
        UiObject2 btn_back = mDevice.findObject(By.res("net.onest.timestoryprj:id/back"));

        btn_header.click();
        Thread.sleep(1000);
        btn_my_card.click();
        Thread.sleep(1000);
        btn_back.click();
    }

}




