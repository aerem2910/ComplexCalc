// calculatorapp/CalculatorApp.java
package calculatorapp;

import calculator.ComplexCalculator;
import calculator.ComplexNumber;
import exceptions.CalculatorException;
import logger.Logger;
import utils.InputHelper;

public class CalculatorApp {
    private final Logger logger;
    private ComplexNumber currentResult;

    public CalculatorApp(Logger logger) {
        this.logger = logger;
        this.currentResult = new ComplexNumber(0, 0);
    }

    public void run() {
        logger.log("Текущий результат: " + currentResult.getReal() + " + " + currentResult.getImaginary() + "i");

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Возведение в степень");
            System.out.println("6. Проценты");
            System.out.println("7. Очистка результатов (С)");
            System.out.print("Введите номер операции (или 'exit' для выхода): ");
            String choice = InputHelper.getUserInput();

            if ("exit".equalsIgnoreCase(choice)) {
                break;
            }

            try {
                ComplexNumber result = performOperation(choice);
                if (result != null) {
                    currentResult = result;
                    logger.log("Новый результат: " + result.getReal() + " + " + result.getImaginary() + "i");
                }
            } catch (CalculatorException e) {
                logger.log("Ошибка: " + e.getMessage());
            }
        }
    }

    private ComplexNumber performOperation(String operation) throws CalculatorException {
        ComplexNumber operand1, operand2;
        switch (operation) {
            case "1":
                operand1 = InputHelper.getComplexNumberInput("Введите первое число (в формате a+bi): ");
                operand2 = InputHelper.getComplexNumberInput("Введите второе число (в формате a+bi): ");
                return ComplexCalculator.add(operand1, operand2);
            case "2":
                operand1 = InputHelper.getComplexNumberInput("Введите первое число (в формате a+bi): ");
                operand2 = InputHelper.getComplexNumberInput("Введите второе число (в формате a+bi): ");
                return ComplexCalculator.subtract(operand1, operand2);
            case "3":
                operand1 = InputHelper.getComplexNumberInput("Введите первое число (в формате a+bi): ");
                operand2 = InputHelper.getComplexNumberInput("Введите второе число (в формате a+bi): ");
                return ComplexCalculator.multiply(operand1, operand2);
            case "4":
                operand1 = InputHelper.getComplexNumberInput("Введите первое число (в формате a+bi): ");
                operand2 = InputHelper.getComplexNumberInput("Введите второе число (в формате a+bi): ");
                return ComplexCalculator.divide(operand1, operand2);
            case "5":
                operand1 = InputHelper.getComplexNumberInput("Введите число (в формате a+bi): ");
                System.out.print("Введите степень: ");
                int exponent = InputHelper.getIntInput();
                return ComplexCalculator.power(operand1, exponent);
            case "6":
                operand1 = InputHelper.getComplexNumberInput("Введите число (в формате a+bi): ");
                System.out.print("Введите процент: ");
                double percent = InputHelper.getDoubleInput();
                return ComplexCalculator.percentage(operand1, percent);
            case "7":
                // Очистка результатов (С)
                logger.log("Очищено");
                return ComplexCalculator.clear();
            default:
                throw new CalculatorException("Некорректная операция: " + operation);
        }
    }
}

