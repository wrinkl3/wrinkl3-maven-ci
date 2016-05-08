package com.sdp.wrinkl3;

import org.junit.Test;
import org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class VowelCounterTest {

    @Test
    public void BasicTest(){
        String testString = "geronimo";
        int num = VowelCounter.countVowels(testString);
        assertThat(num, is(equalTo(4)));
    }
}
