package com.course.testNg.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "methodData")
    public void test01(String name,int age){
        System.out.println("test01 name="+name+"\n"+"age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test02(String name,int age) {
        System.out.println("test02 name=" + name + "\n" + "age=" + age);
    }
    @DataProvider(name="methodData")
    public Object[][] dataMethod(Method method){
        Object[][] result = null;//接受参数值
        if(method.getName().equals("test01")){
            result = new Object[][]{
                    {"wangjuan",25},
                    {"tiantian",25}
            };
        }else if(method.getName().equals("test02")){
            result = new Object[][]{
                    {"meixi",30},
                    {"kebi",40}
            };
        }
        return result;
    }

}
