package com.sdp.wrinkl3;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        String hello = "Hello World, Folks!";
        int numVowels = VowelCounter.countVowels(hello);
        System.out.println("The string '" + hello + "' has " + numVowels + " vowels. Cool, right?");

    }
}
