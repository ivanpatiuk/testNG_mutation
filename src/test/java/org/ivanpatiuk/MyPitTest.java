package org.ivanpatiuk;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MyPitTest {
    private MyClass foo;
    @BeforeTest
    void before() {
        foo = new MyClass();
    }
    @Test
    void fooSum_Scenario_1() {
        Assert.assertEquals(foo.fooSum(1, true, 4, true), 7);
    }
    @Test
    void fooSum_Scenario_2() {
        Assert.assertEquals(foo.fooSum(3, false, 5, false), 7);
    }
}
