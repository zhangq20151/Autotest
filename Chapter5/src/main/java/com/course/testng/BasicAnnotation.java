package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforemethod() {
        System.out.println("这是beforemethod");
    }

    @AfterMethod
    public void aftermethod() {
        System.out.println("这是aftermethod");
    }

    @BeforeClass
    public void beforeclass() {
        System.out.println("这是beforeclass");
    }

    @AfterClass
    public void afterclass() {
        System.out.println("这是afterclass");
    }


    @BeforeSuite
    public void beforesuite() {
        System.out.println("这是beforesuit");
    }

    @AfterSuite
    public void aftersuite() {
        System.out.println("这是aftersuite");
    }


}
