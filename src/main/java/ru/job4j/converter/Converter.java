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

        in = 400;
        expected = 6.6666665f;
        out = Converter.rubleToDollars(in);
        passed = expected == out;
        System.out.println("400 rubles are 6.6666665 dollars. Test result : " + passed);
    }
}


