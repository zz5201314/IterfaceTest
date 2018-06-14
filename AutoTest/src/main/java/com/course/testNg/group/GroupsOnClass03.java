package com.course.testNg.group;

import org.testng.annotations.Test;

@Test(groups = "techer")
public class GroupsOnClass03 {
    public void teacher1(){
        System.out.println("GroupsOnClass03中的teacher11111111");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass03中的teacher222222");
    }
}
