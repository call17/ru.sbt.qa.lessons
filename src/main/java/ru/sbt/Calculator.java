package ru.sbt;


public class Calculator {


    public double add(double a, double b) {
        double answer = a+b;
        return answer;
    }

    public double subtract(double a, double b) {
        double answer = a-b;
        return answer;
    }

    public double multiply(double a, double b) {
        double answer = a*b;
        return answer;
    }

    public double divide(double a, double b) {
        double answer = a/b;
        return answer;
    }

    public double power(double a, double b){
        double answer =a;

        for (int x=2; x<=b; x++){
            answer *= a;
        }

        return answer;
    }

}
