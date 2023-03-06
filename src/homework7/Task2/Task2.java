package homework7.Task2;

import java.util.Arrays;
import java.util.function.Predicate;

import static homework7.utils.ScannerUtils.readAlphabeticString;
import static homework7.utils.ScannerUtils.readLong;

public class Task2 {

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter worker #" + (i + 1) + " data: ");
            workers[i] = createWorker();
            if (i < 4) {
                System.out.println("Thank you, enter next worker data, please\n");
            } else {
                System.out.println("Thank you");
            }
        }
        Arrays.sort(workers);
        Arrays.stream(workers).forEach(System.out::println);
    }

    public static Worker createWorker() {
        Predicate<String> stringCondition = str -> str.length() <= 20;
        String surname = readAlphabeticString(
                "Enter surname: ", stringCondition, "String length must be less than 21 symbol"
        );
        String nameWork = readAlphabeticString(
                "Enter nameWork: ", stringCondition, "String length must be less than 21 symbol"
        );

        Predicate<Long> yearCondition = input -> input <= 2024 && input >= 1940;
        long year = readLong("Enter year: ", yearCondition);
        return new Worker(surname, nameWork, year);
    }
}