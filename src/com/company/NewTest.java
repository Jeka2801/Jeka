package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
/**
 * Created by Евгений on 08.04.2015.
 */
public class NewTest {

        @Test
        public void Test1() {
            Assert.fail();
        }
        @Test
        public void Test2() {
            int a = 10;
            int b = 5;
            int expectedResult = 15;
            Assert.assertEquals("Expected results didn match", expectedResult, a + b);
            Assert.assertTrue(expectedResult ==(a+b));
        }
    }
