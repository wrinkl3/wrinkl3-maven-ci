package com.sdp.wrinkl3;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class VowelCounterTest {
    @Mock List<Character> l;

    @Test
    public void basicTest(){
        String testString = "geronimo";
        int num = VowelCounter.countVowels(testString);
        assertEquals(num, 4);

    }

    @Test
    public void mockitoTest(){
        l = mock(List.class);
        when(l.get(0)).thenReturn('a');
        when(l.get(1)).thenReturn('b');
        when(l.get(2)).thenReturn('b');
        when(l.get(3)).thenReturn('a');
        when(l.size()).thenReturn(4);
        assertEquals(VowelCounter.countVowels(l), 2);
    }
}
