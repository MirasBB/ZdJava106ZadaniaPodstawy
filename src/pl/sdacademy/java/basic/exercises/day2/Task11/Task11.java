package pl.sdacademy.java.basic.exercises.day2.Task11;

public class Task11 {

    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + input);
        System.out.println("Result: " + ifPalndrome(input));
    }

    private static boolean ifPalndrome(String input) {
        if (input != null) {
            String AfterReverse = new StringBuilder(input).reverse().toString();
            return AfterReverse.equals(input);
        }
        return false;
    }
}