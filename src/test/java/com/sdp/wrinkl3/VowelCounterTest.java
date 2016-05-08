package com.sdp.wrinkl3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void BasicTest(){
        String testString = "geronimo";
        int num = VowelCounter.countVowels(testString);
        assertEquals(num, 4);

    }
}
