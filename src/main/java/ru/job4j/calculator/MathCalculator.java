package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDividing(double first, double second) {
        return difference(first, second)
                + dividing(first, second);
    }

    public static double sumOfAllTransactions(double first, double second) {
        return sumAndMultiply(first, second)
                + differenceAndDividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета первой операции равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета второй операции равен: " + differenceAndDividing(10, 20));
        System.out.println("Результат расчета третей операции равен: " + sumOfAllTransactions(10, 20));

    }

}