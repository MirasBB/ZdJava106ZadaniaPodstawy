package pl.sdacademy.java.basic.exercises.day2.Task4;

import java.util.Locale;

public class Task4 {

    public static void main(String[] args) {
        String input = "Ala ma, kota a kot, ma Ale";
        System.out.println("Input: " + input);
        System.out.println("After modifications: " + replace(input));

    }

    private static String replace(String input) {
        if(input != null) {
            return input
                    .replace(".", "-STOP-")
                    .replace(",", "-STOP-");
        }
        return input;
    }
}
