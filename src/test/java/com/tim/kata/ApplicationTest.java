package com.tim.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApplicationTest {
    private final Map<Integer, String> dictionnaryTest = new LinkedHashMap<>();

    @Before
    public void init() {
        dictionnaryTest.put(0, "");
        dictionnaryTest.put(1, "I");
        dictionnaryTest.put(2, "II");
        dictionnaryTest.put(3, "III");
        dictionnaryTest.put(4, "IV");
        dictionnaryTest.put(5, "V");
        dictionnaryTest.put(6, "VI");
        dictionnaryTest.put(7, "VII");
        dictionnaryTest.put(8, "VIII");
        dictionnaryTest.put(9, "IX");
        dictionnaryTest.put(10, "X");
        dictionnaryTest.put(11, "XI");
        dictionnaryTest.put(12, "XII");
        dictionnaryTest.put(13, "XIII");
        dictionnaryTest.put(14, "XIV");
        dictionnaryTest.put(15, "XV");
        dictionnaryTest.put(16, "XVI");
        dictionnaryTest.put(17, "XVII");
        dictionnaryTest.put(18, "XVIII");
        dictionnaryTest.put(19, "XIX");
        dictionnaryTest.put(20, "XX");
        dictionnaryTest.put(30, "XXX");
        dictionnaryTest.put(40, "XL");
        dictionnaryTest.put(41, "XLI");
        dictionnaryTest.put(50, "L");
        dictionnaryTest.put(54, "LIV");
        dictionnaryTest.put(129, "CXXIX");
        dictionnaryTest.put(1254, "MCCLIV");
        dictionnaryTest.put(2021, "MMXXI");
    }

    @Test
    public void should_test_all() {
        dictionnaryTest.forEach((key, value) -> {
            String result = Processor.process(key);
            Assert.assertEquals(value, result);
        });
    }
}
