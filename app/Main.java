package app;

import calculatorapp.CalculatorApp;
import logger.ConsoleLogger;
import logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        CalculatorApp calculatorApp = new CalculatorApp(logger);
        calculatorApp.run();
    }
}
