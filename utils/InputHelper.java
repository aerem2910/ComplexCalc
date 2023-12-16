// utils/InputHelper.java
package utils;

import calculator.ComplexNumber;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        return scanner.next();
    }

    public static ComplexNumber getComplexNumberInput(String message) {
        System.out.print(message);
        String input = scanner.next();

        // Разбиваем строку на действительную и мнимую части
        String[] parts = input.split("\\+");
        if (parts.length != 2) {
            System.out.println("Некорректный формат комплексного числа. Используйте формат a+bi.");
            return getComplexNumberInput(message);
        }

        // Парсим и получаем значения действительной и мнимой части
        double real = Double.parseDouble(parts[0]);
        double imaginary = Double.parseDouble(parts[1].replace("i", ""));

        return new ComplexNumber(real, imaginary);
    }

    public static int getIntInput() {
        System.out.print("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректный ввод. Пожалуйста, введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getDoubleInput() {
        System.out.print("Введите дробное число: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Некорректный ввод. Пожалуйста, введите дробное число: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
