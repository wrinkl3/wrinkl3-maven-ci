package com.sdp.wrinkl3;


import java.util.List;

public class VowelCounter {

    public static int countVowels(String s){
        int numVowels = 0;
        for(int i =0; i<s.length(); i++){
            switch(Character.toLowerCase(s.charAt(i))){
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

    public static int countVowels(List<Character> l){
        String s = new String();
        for(int i = 0; i<l.size(); i++)
            s = s.concat(Character.toString(l.get(i)));
        return countVowels(s);
    }
}
