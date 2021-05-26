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

    //1登录成功
    @Test
    public void loginSuccess() throws InterruptedException {
        //找到账号并点击
        UiObject2 phone = mDevice.findObject(By.res("net.onest.timestoryprj:id/et_phone"));
        UiObject2 pwd = mDevice.findObject(By.res("net.onest.timestoryprj:id/et_pwd"));
        UiObject2 btn_login = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_login"));
        phone.setText("18871008816");
        pwd.setText("xzw123");
        btn_login.click();
    }

    //2点击秦朝
    @Test
    public void clickQinchao() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_qinchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_qinchao"));
        btn_qinchao.click();
    }

    //3点击秦朝全景图
    @Test
    public void clickView1() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_qinchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_qinchao"));
        UiObject2 btn_view = mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_view"));
        btn_qinchao.click();
        btn_view.click();
    }

    //4点击秦朝朝代知多少
    @Test
    public void clickDynasty_know1() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_qinchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_qinchao"));
        UiObject2 btn_dynasty_know = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_dynasty_know"));
        btn_qinchao.click();
        btn_dynasty_know.click();
    }

    //5点击秦朝进入详情
    @Test
    public void clickDetails1() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_qinchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_qinchao"));
        UiObject2 btn_details = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_details"));
        btn_qinchao.click();
        btn_details.click();
    }

    //6点击唐朝
    @Test
    public void clickTangchao() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        btn_tangchao.click();
    }

    //7点击唐朝全景图
    @Test
    public void clickView2() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        UiObject2 btn_view = mDevice.findObject(By.res("net.onest.timestoryprj:id/tv_view"));
        btn_tangchao.click();
        btn_view.click();
    }

    //8点击唐朝朝代知多少
    @Test
    public void clickDynasty_know2() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        UiObject2 btn_dynasty_know = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_dynasty_know"));
        btn_tangchao.click();
        btn_dynasty_know.click();
    }

    //9点击唐朝进入详情
    @Test
    public void clickDetails2() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        UiObject2 btn_details = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_details"));
        btn_tangchao.click();
        btn_details.click();
    }

    //10点击唐朝选一选
    @Test
    public void clickSelect() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        UiObject2 btn_dynasty_know = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_dynasty_know"));
        UiObject2 btn_select = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_select"));
        btn_tangchao.click();
        btn_dynasty_know.click();
        btn_select.click();
    }

    //11点击唐朝连一连
    @Test
    public void clickConnect() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        UiObject2 btn_dynasty_know = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_dynasty_know"));
        UiObject2 btn_connect = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_connect"));
        btn_tangchao.click();
        btn_dynasty_know.click();
        btn_connect.click();
    }

    //12点击唐朝排一排
    @Test
    public void clickSort() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        UiObject2 btn_dynasty_know = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_dynasty_know"));
        UiObject2 btn_sort = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_sort"));
        btn_tangchao.click();
        btn_dynasty_know.click();
        btn_sort.click();
    }

    //13点击唐朝快速开始
    @Test
    public void clickStart() throws InterruptedException {
        loginSuccess();
        Thread.sleep(1000);
        UiObject2 btn_tangchao = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_tangchao"));
        UiObject2 btn_dynasty_know = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_dynasty_know"));
        UiObject2 btn_start = mDevice.findObject(By.res("net.onest.timestoryprj:id/btn_start"));
        btn_tangchao.click();
        btn_dynasty_know.click();
        btn_start.click();
    }
}




