package ru.sbt;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double ...args) {
        double answer = 0;
        for (double arg : args)
            answer += arg;

        return answer;
    }
    public double subtract(double a, double b) {
        return a - b;
    }

    public double subtract(double ...args) {
        double answer = args[0] * 2;
        for (double arg : args)
            answer -= arg;

        return answer;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(double ...args) {
        double answer = 1;
        for (double arg : args)
            answer *= arg;

        return answer;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double divide(double ...args) {
        double answer = power(args[0], 2);
        for (double arg : args)
            answer /= arg;

        return answer;
    }

    public double power(double a, double b) {
        double answer = a;

        for (int x = 2; x <= b; x++){
            answer *= a;
        }

        return answer;
    }
}
