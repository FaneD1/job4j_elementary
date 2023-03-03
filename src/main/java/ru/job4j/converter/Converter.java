package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return  value / 70;
    }

    public static float rubleToDollars(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollars(400);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("400 rubles are " + dollars + " dollars.");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        float in2 = 400;
        float expected2 = 6.6666665f;
        float out2 = Converter.rubleToDollars(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("400 rubles are 6.6666665 dollars. Test result : " + passed2);
    }
}


