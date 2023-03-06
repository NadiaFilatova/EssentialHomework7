package homework7.Task5;

//Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator.
// У тілі класу створіть чотири методи для арифметичних дій: (add – додавання, sub – віднімання, mul – множення, div – поділ).
// Метод поділу повинен перевірити поділ на нуль, якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення,
// над якими хоче зробити операцію та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.
public class Calculator extends Exception {

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static Object divide(float a, float b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else throw new ArithmeticException("Error. Division by zero is impossible.");
    }
}