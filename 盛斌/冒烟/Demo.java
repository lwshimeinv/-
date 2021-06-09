package com.example.testnotes;

import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiCollection;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按字符字典顺序执行
public class Demo1 {
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
    //注册成功
    @Test
    public void signUpSuccess() throws InterruptedException {
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_register")).click();
        mDevice.findObject(By.res("net.onest.timestoryprj:id/et_res_phone")).setText("18831176586");
        mDevice.findObject(By.res("net.onest.timestoryprj:id/et_res_pwd")).setText("123456");
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_res")).click();
    }
    //登录成功
    @Test
    public void loginSuccess() throws InterruptedException {
        mDevice.findObject(By.res("net.onest.timestoryprj:id/et_phone")).setText("18831176586");
        mDevice.findObject(By.res("net.onest.timestoryprj:id/et_pwd")).setText("123456");
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_login")).click();

    }
    @Test
    //登录成功-点击设置-昵称-保存
    public void setting() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_settings")).click();
        mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_niname")).click();
        mDevice.findObject(By.res("net.onest.timestoryprj:id/et_nickname")).setText("2018011876杨秦晋");
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_nickname_save")).click();
    }
    @Test
    //登录成功-点击设置-个性签名-保存
    public void signature() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_settings")).click();
        mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_signature")).click();
        mDevice.findObject(By.res("net.onest.timestoryprj:id/et_signature")).setText("杨秦晋2018011876");
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_signature_save")).click();
    }
    @Test
    //登录成功-童声
    public void student() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_level")).click();
    }
    @Test
    //登录成功-抽卡
    public void card() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_card")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_confirm")).click();

    }
    @Test
    //我的卡片
    public void mycard() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_my_card")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/dynasty")).click();

    }
    @Test
    //收藏品
    public void collection() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_my_collections")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/iv_goToChildLV")).click();

    }
    @Test
    //我的积分
    public void score() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_point")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_plus")).click();

    }
    @Test
    //退出登录
    public void exit() throws InterruptedException {
        loginSuccess();//调用登录
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_settings")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_exit_login")).click();
    }







}
