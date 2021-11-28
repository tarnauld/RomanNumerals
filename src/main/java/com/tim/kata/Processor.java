package com.tim.kata;

import java.util.Map;

public class Processor {
    private final static Map<Integer, String> dictionnary = Dictionnary.get();
    private final static StringBuilder result = new StringBuilder();
    private static int numberToConvert;

    public static String process(final int numberToConvert) {
        result.setLength(0);
        Processor.numberToConvert = numberToConvert;
        dictionnary.entrySet()
                .stream()
                .takeWhile(n -> Processor.numberToConvert > 0)
                .forEach(((element) -> {
                    Processor.numberToConvert = getResult(element.getKey(), element.getValue());
                }));
        return result.toString();
    }

    private static int getResult(int arabicValue, String romanValue) {
        if (numberToConvert - arabicValue >= 0) {
            result.append(romanValue);
            numberToConvert = numberToConvert - arabicValue;
            if (numberToConvert != 0) {
                getResult(arabicValue, romanValue);
            }
        }
        return numberToConvert;
    }
}
