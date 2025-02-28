package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test()
    public void test1() {
        Assert.assertEquals("xyz", "xyz", "Invalid strings");
    }

    @Test()
    public void test2() {
        throw new RuntimeException("bad test");
    }
}
