package homework7.utils;

import java.util.Scanner;
import java.util.function.Predicate;

// utility class
public final class ScannerUtils {
    private ScannerUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String readAlphabeticString(String prompt, Predicate<String> condition, String errorMessage) {
        String input = readAlphabeticString(prompt);
        if (condition.test(input)) {
            return input;
        } else {
            System.out.println(errorMessage);
            return readAlphabeticString(prompt, condition, errorMessage);
        }
    }

    public static String readAlphabeticString(String prompt, Predicate<String> condition) {
        return readAlphabeticString(prompt, condition, "Incorrect input");
    }

    public static String readAlphabeticString(String prompt) {
        String input = readString(prompt);
        if (containsNotLetters(input)) {
            System.out.println("String must contain only letters");
            return readAlphabeticString(prompt);
        }
        return input;
    }

    public static String readString(String prompt) {
        String value;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(prompt);
                value = scanner.next();
            } catch (RuntimeException e) {
                System.out.println("Error: cannot read string with Scanner");
                continue;
            }
            break;
        }
        return value;

    }

    public static double readDouble(String prompt) {
        double value;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(prompt);
                value = scanner.nextDouble();
            } catch (RuntimeException e) {
                System.out.println("Error: cannot read number with Scanner");
                continue;
            }
            break;
        }
        return value;
    }

    public static long readLong(String prompt, Predicate<Long> condition) {
        long input = (long) readDouble(prompt);
        if (condition.test(input)) {
            return input;
        } else {
            System.out.println("Incorrect input");
            return readLong(prompt, condition);
        }
    }

    public static long readLong(String prompt) {
        return (long) readDouble(prompt);
    }

    private static boolean containsNotLetters(String str) {
        for (char symbol : str.toCharArray()) {
            if (!Character.isLetter(symbol)) {
                return true;
            }
        }
        return false;
    }
}
