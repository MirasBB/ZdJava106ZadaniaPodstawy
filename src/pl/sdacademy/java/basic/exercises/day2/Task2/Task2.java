package pl.sdacademy.java.basic.exercises.day2.Task2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(isWordStartsWithPrefix(null, "pro"));
        System.out.println(isWordStartsWithPrefix("programowanie", "pro"));
        System.out.println(isWordStartsWithPrefix("", "pro"));

        System.out.println(isWordEndsWithPrefix(null, "pro"));

    }

    private static boolean isWordStartsWithPrefix(String input, String prefix) {
        return input != null ? input.startsWith(prefix) : false; //logika ? akcja gdy true : akcja gdy false
//        if (input != null) {
//            return input.startsWith(prefix);
//        }
//return false;
    }

    private static boolean isWordEndsWithPrefix(String input, String prefix) {
        return input != null ? input.endsWith(prefix) : false; //logika ? akcja gdy true : akcja gdy false
//        
    }
}
