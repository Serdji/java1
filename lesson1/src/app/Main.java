package app;

public class Main {
    public static void main(String[] args) {
        initVariables();
        initMathematicalExpression();
        initLimit();
        initMessagePositiveVal();
        initIsNegative();
        initHelloName();
        initLeapYear();
    }

    public static void initVariables() {

        byte varByte = 1;
        short varShort = 2;
        int varInt = 3;
        long varLong = 4L;
        float varFloat = 2.3F;
        double varDouble = 2.5;
        char varChar = 10254;
        boolean isVarBoolean = true;

        System.out.println("---------------------- Задание 2 ------------------------");
        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(varChar);
        System.out.println(isVarBoolean);
        System.out.println("---------------------------------------------------------");

    }

    public static void initMathematicalExpression() {
        System.out.println("---------------------- Задание 3 ------------------------");
        int varA = 10;
        int varB = 7;
        int varC = 9;
        int varD = 14;
        System.out.println(mathematicalExpressionFn(varA, varB, varC, varD));
        System.out.println("---------------------------------------------------------");
    }

    public static void initLimit() {
        System.out.println("---------------------- Задание 4 ------------------------");
        int varA = 9;
        int varB = 8;
        System.out.println(isLimitSum(varA, varB));
        System.out.println("---------------------------------------------------------");
    }

    public static void initMessagePositiveVal() {
        System.out.println("---------------------- Задание 5 ------------------------");
        int val = 5;
        if (isPositive(val)) {
            System.out.printf("Число %d плоложительное\n", val);
        } else {
            System.out.printf("Число %d отрицательное\n", val);
        }
        System.out.println("---------------------------------------------------------");
    }

    public static void initIsNegative() {
        System.out.println("---------------------- Задание 6 ------------------------");
        int val = -5;
        System.out.println(!isPositive(val));
        System.out.println("---------------------------------------------------------");
    }

    public static void initHelloName() {
        System.out.println("---------------------- Задание 7 ------------------------");
        System.out.println(helloNameFn("Сергей"));
        System.out.println("---------------------------------------------------------");
    }

    public static void initLeapYear() {
        System.out.println("---------------------- Задание 8 ------------------------");
        int year = 2020;
        if (isLeapYear(year)) {
            System.out.printf("Года %d высокосный\n", year);
        } else {
            System.out.printf("Года %d не высокосный\n", year);
        }
        System.out.println("---------------------------------------------------------");
    }

    public static double mathematicalExpressionFn(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean isLimitSum(int a, int b) {
        int sum = a + b;
        int limitBegin = 10;
        int limitEnd = 20;
        return sum >= limitBegin && sum <= limitEnd;
    }

    public static boolean isPositive(int val) {
        return val >= 0;
    }

    public static String helloNameFn(String name) {
        return "Привет, " + name;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
