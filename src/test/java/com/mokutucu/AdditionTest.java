package com.mokutucu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AdditionTest {

    @Test
    public void nominalAdditionTest()
    {
        assertTrue( Addition.Add(0, 0) == 0 );
    }

    @Test
    public void nominalAdditionTest2()
    {
        assertTrue( Addition.Add(1, 1) == 2 );
    }

}
