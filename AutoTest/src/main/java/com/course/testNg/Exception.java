package com.course.testNg;

import org.testng.annotations.Test;

/**
 * 当期望结果为异常的时候，需要进行异常测试
 * 比如：传入非法参数，程序抛出异常
 */

public class Exception {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
