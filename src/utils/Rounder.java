package utils;

public class Rounder {

    public static double round(double value) {
        return Math.rint(value * 100) / 100;
    }
}
