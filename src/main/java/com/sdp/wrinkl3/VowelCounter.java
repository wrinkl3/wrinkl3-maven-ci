package com.sdp.wrinkl3;


public class VowelCounter {

    public static int countVowels(String s){
        int numVowels = 0;
        for(int i =0; i<s.length(); i++){
            switch(s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numVowels++;
                    break;
            }
        }
        return numVowels;
    }
}
