package ru.job4j.condition;

    public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double first = x2 - x1;
            double second = y2 - y1;
            double third = Math.pow(first, 2);
            double fourth = Math.pow(second, 2);
            double fifth = third + fourth;
            double rsl = Math.sqrt(fifth);
            return rsl;
        }

        public static void main(String[] args) {
            double result = Point.distance(16, 3, 2, 54);
            System.out.println("result (0, 0) to (2, 0) " + result);
        }
    }
