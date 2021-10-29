package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

//   如果被依赖的测试抛出异常，那么依赖测试会忽略不执行
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");

    }
}
