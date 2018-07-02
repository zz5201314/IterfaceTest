package com.extentreports.demo;

import org.testng.annotations.Test;
import org.testng.Assert;
public class AssertTest {
    @Test
    public void test01(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test02(){
        Assert.assertEquals(1,2);
    }
}
