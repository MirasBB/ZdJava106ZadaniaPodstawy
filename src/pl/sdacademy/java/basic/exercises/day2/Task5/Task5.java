package pl.sdacademy.java.basic.exercises.day2.Task5;

public class Task5 {

    public static void main(String[] args) {

    }

    public static int timesContained(String input, char character) {
        if(input != null && input.isBlank()) {
        int timesContained = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                timesContained++;
            }
        }
        return timesContained;
    }
        return 0;
    }
}

