package com.example.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {
    @Test
    public void testAddition()
    {
        Arithemetic arithemetic=new Arithemetic();
        float expectedResult=10;
        float actualResult=arithemetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testSubtraction()
    {
        Arithemetic arithemetic=new Arithemetic();
        float expectedResult=2;
        float actualResult=arithemetic.add(6,4);
        assertEquals(expectedResult,actualResult);

    }@Test
    public void testDivision()
    {
        Arithemetic arithemetic=new Arithemetic();
        float expectedResult=2;
        float actualResult=arithemetic.add(12,6);
        assertEquals(expectedResult,actualResult);
    }

}
