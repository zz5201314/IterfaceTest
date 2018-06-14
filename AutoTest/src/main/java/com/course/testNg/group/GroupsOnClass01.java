package com.course.testNg.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass01 {
    public void stu1(){
        System.out.println("GroupsOnClass01中的stu11111111");
    }
    public void stu2(){
        System.out.println("GroupsOnClass01中的stu222222");
    }
}
