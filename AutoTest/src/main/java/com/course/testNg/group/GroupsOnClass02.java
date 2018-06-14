package com.course.testNg.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass02 {
    public void stu1(){
        System.out.println("GroupsOnClass02中的stu11111111");
    }
    public void stu2(){
        System.out.println("GroupsOnClass02中的stu222222");
    }
}
