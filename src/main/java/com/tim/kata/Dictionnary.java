package com.tim.kata;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dictionnary {
    private final static Map<Integer, String> DICTIONNARY = new LinkedHashMap<>();

    private static void initDictionnary() {
        DICTIONNARY.put(1000, "M");
        DICTIONNARY.put(500, "D");
        DICTIONNARY.put(100, "C");
        DICTIONNARY.put(90, "XC");
        DICTIONNARY.put(50, "L");
        DICTIONNARY.put(40, "XL");
        DICTIONNARY.put(10, "X");
        DICTIONNARY.put(9, "IX");
        DICTIONNARY.put(5, "V");
        DICTIONNARY.put(4, "IV");
        DICTIONNARY.put(1, "I");
    }

    public static Map<Integer, String> get() {
        initDictionnary();
        return DICTIONNARY;
    }
}
