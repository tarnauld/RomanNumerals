package com.tim.kata;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Take number to convert:");
        String numberToConvert = scanner.nextLine();
        System.out.print(Processor.process(Integer.parseInt(numberToConvert)));
    }
}
