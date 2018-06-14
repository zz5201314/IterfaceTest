package com.course.testNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignoreTest01(){
        System.out.println("ignoreTest01");
    }
    @Test(enabled = false) //忽略此测试
    public void ignoreTest02(){
        System.out.println("ignoreTest02");
    }
}
