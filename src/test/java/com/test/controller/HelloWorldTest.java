package com.test.controller;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testhello() {
        HelloWorld helloWorld = new HelloWorld();
        String comment = helloWorld.hello();
        //assertEquals 断言判断结果的正确性。
        assertEquals("success", comment);
        //最简单的测试类 用于判断结果的正确性
    }

}
