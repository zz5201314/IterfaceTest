package com.course.testNg;

import org.testng.annotations.Test;

/**
 * 超时测试
 */

public class TimeOut {
    @Test(timeOut = 3000)
    public void timeOutTest() throws InterruptedException {
         Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void timeOutTtest02() throws InterruptedException {
        Thread.sleep(3000);
    }
}
