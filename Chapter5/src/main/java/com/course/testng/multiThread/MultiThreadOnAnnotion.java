package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

//    10个线程，默认每个线程有1个线程池，下面设置线程池为3
//    单线程，指一个应用程序，如果要出10个结果，那么要按顺序执行
//    多线程，指多个相同的应用程序，如果要出10个结果，可以同时执行
//    线程池，相当于执行人，默认为1，1个人要挨个执行10个相同的应用程序；如果设置为3，3个人同时执行前3个程序，谁先完成就顺序执行后面的程序，直到结束。

//    @Test(invocationCount = 10,threadPoolSize = 3)
    @Test
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
