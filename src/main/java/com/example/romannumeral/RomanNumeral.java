package com.example.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {


    public static int Roman(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int value = 0;
        int n= s.length();

        for(int i=0; i<n; i++){
            if(i < s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                value -=map.get(s.charAt(i));

            }
            else {
                value +=map.get(s.charAt(i));

            }

            }
        return value;

    }

    public static void printValue(String s){

        int converted = Roman(s);
        System.out.println("Roman number : " + s);
        System.out.println("Converted number : " + converted);

    }

    public static void main(String[] args) {

        printValue("VI");
    }

}
