package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

    Arithemetic arithemetic=null;
    @Before
    public void setUp()
    {
        arithemetic =new Arithemetic();
    }
    @Test
    public void testAddition()
    {
        float expectedResult=10;
        float actualResult=arithemetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testSubtract()
    {
        float expectedResult=10;
        float actualResult=arithemetic.subtract(20,10);
        assertEquals(expectedResult,actualResult);

    }@Test
    public void testDivide()
    {
        float expectedResult=2;
        float actualResult=arithemetic.divide(12,6);
        assertEquals(expectedResult,actualResult);
    }
    @After
    public void tearDown()
    {
        arithemetic=null;
    }

}
