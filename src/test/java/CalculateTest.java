package org.example;

import junit.framework.TestCase;

public class CalculateTest extends TestCase {

    private Calculate calculate;
    public void setUp() throws Exception
    {
        calculate= new Calculate();
      //  super.setUp();
    }

    public void tearDown() throws Exception
    {
       calculate= null;
    }


    public void testAddSum()
    {
        int sum=calculate.addSum(20,30);
        assertEquals(50,sum);
    }

    public void testIsEven() {
        Boolean even = calculate.isEven(20);
        assertEquals(true, even);
    }
    public void testIsOdd()
    {
        Boolean odd = calculate.isEven(25);
        assertEquals(false,odd);
    }
}