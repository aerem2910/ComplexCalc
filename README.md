Программа представляет собой калькулятор для работы с комплексными числами. Комплексные числа представлены в виде чисел вида a + bi, где "a" - это действительная часть, "b" - мнимая часть, а "i" - мнимая единица (i² = -1).

Программа реализует следующие методы для работы с комплексными числами:

1. **Сложение (`add`):**
   ```java
   public static ComplexNumber add(ComplexNumber a, ComplexNumber b)
   ```

2. **Вычитание (`subtract`):**
   ```java
   public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b)
   ```

3. **Умножение (`multiply`):**
   ```java
   public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b)
   ```

4. **Деление (`divide`):**
   ```java
   public static ComplexNumber divide(ComplexNumber a, ComplexNumber b)
   ```

5. **Возведение в степень (`power`):**
   ```java
   public static ComplexNumber power(ComplexNumber base, int exponent)
   ```

6. **Проценты (`percentage`):**
   ```java
   public static ComplexNumber percentage(ComplexNumber number, double percent)
   ```

7. **Очистка (`clear`):**
   ```java
   public static ComplexNumber clear()
   ```

В программе также реализован класс `ComplexNumber`, представляющий комплексное число. У этого класса есть методы `getReal()` и `getImaginary()`, которые возвращают действительную и мнимую части соответственно.

Основной класс приложения `CalculatorApp` взаимодействует с пользователем через консоль, предоставляя меню операций и позволяя вводить данные для выполнения операций над комплексными числами. Каждая операция вызывает соответствующий метод из `ComplexCalculator`, обрабатывает ввод и выводит результат операции, при необходимости.

Также, для логирования в  программе используется интерфейс `Logger`, который реализован в классе `ConsoleLogger`. Это позволяет записывать сообщения о действиях программы.
