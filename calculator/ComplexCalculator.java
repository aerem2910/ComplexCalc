// calculator/ComplexCalculator.java
package calculator;

public class ComplexCalculator {
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber power(ComplexNumber base, int exponent) {
        double angle = Math.atan2(base.getImaginary(), base.getReal());
        double radius = Math.sqrt(base.getReal() * base.getReal() + base.getImaginary() * base.getImaginary());
        double newAngle = angle * exponent;
        double newRadius = Math.pow(radius, exponent);
        double real = newRadius * Math.cos(newAngle);
        double imaginary = newRadius * Math.sin(newAngle);
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber percentage(ComplexNumber number, double percent) {
        double real = number.getReal() * percent / 100;
        double imaginary = number.getImaginary() * percent / 100;
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber clear() {
        return new ComplexNumber(0, 0);
    }
}
