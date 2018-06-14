package com.course.testNg;
import org.testng.annotations.*;

/**
 * @author zz 2018-06-12
 */
public class AutoDemo01 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforMethod是在测试方法之前运行");
    }
    @Test
    public void tsetCase01(){
        System.out.println("test01这是第一个测试用例");
    }
    @Test
    public void testCase02(){
        System.out.println("test02这是第二个测试用例");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod是在测试方法之后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforClass是在类运行之前");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是在类运行之后");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuiter测试套件");
    }
}
