package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 异常测试目的：测试结果为异常的结果，则测试通过
     */
//    这个测试结果未通过，因为它是正常输出，没有抛出异常
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败和异常测试");
    }

//  这个测试结果通过，因为它抛出了异常，是我们想要的结果
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个失败和异常测试");
        throw new RuntimeException();
    }
}
