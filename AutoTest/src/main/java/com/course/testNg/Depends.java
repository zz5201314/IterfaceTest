package com.course.testNg;

import org.testng.annotations.Test;

/**
 * 依赖测试
 */

public class Depends {
    @Test
    public void test01(){
        System.out.println("test01 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test01"})
    public void test02(){
        System.out.println("test02 run");
    }
}
