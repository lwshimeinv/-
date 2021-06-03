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
        reg_phone.setText("19831128154");
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
        phone.setText("19831128152");
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

    //    5调节音量
    @Test
    public void voiceSet() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        //找到退出并点击
        UiObject2 btn_setting = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_settings"));
        UiObject2 btn_main = mDevice.findObject(By.res("net.onest.timestoryprj:id/mainlayout"));
        UiObject2 btn_voice = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_voice_set"));
        btn_setting.click();
        Thread.sleep(2000);
        btn_main.click();
        Thread.sleep(1000);
        btn_voice.click();
        Thread.sleep(2000);
        mDevice.swipe(460, 257, 700, 257, 100);

    }

    //    6点击个人资料
    @Test
    public void clickPerson() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_Person = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_person"));
        btn_Person.click();
    }

    //    7点击个人资料-name
    @Test
    public void clickPerson1() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_Person = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_person"));
        UiObject2 btn_name = mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_niname"));
        btn_Person.click();
        btn_name.click();
    }

    //    8点击个人资料-phone
    @Test
    public void clickPerson2() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_Person = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_person"));
        UiObject2 btn_num = mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_number"));
        btn_Person.click();
        btn_num.click();
    }

    //    9点击查看规则
    @Test
    public void clickRule() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_rule = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_rule"));
        btn_rule.click();
    }

    //    10点击反馈问题
    @Test
    public void clickRightliner() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_right = mDevice.findObject(By.res("net.onest.timestoryprj:id/rightlinear"));
        btn_right.click();
    }
}




