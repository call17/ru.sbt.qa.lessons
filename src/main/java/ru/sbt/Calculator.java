package ru.sbt;

import java.util.Scanner;

/**
 * Created by victo on 21.05.2017.
 */
public class Calculator {

    private static Scanner read;

    public static void main (String[] args){


        while (true){

            Maths maths = new Maths();

            double first;
            double second;
            Character operator;
            double answer = 0;

            System.out.print(">> ");

            first = readDouble();
            operator = readOperation();
            second = readDouble();

            switch (operator) {
                case '+': answer = maths.add(first, second);
                    break;
                case '-': answer = maths.subtract(first, second);
                    break;
                case '*': answer = maths.multiply(first, second);
                    break;
                case '/': answer = maths.divide(first, second);
                    break;
                case '^': answer = maths.power(first, second);
                    break;
            }

            System.out.println("= " + answer);


        }

    }

    private static Character readOperation() {

        read = new Scanner(System.in);

        while (true) {

            String c = read.next();

            char operation = c.trim().charAt(0);

            switch (operation) {
                case '-':
                case '+':
                case '*':
                case '/':
                case '^':
                    return operation;

                default:
                    System.out.println("Неизвестная операция. Введите еще раз");
            }
        }
    }

    private static Double readDouble(){

        read = new Scanner(System.in);

        while (true){

            String c = read.next();

            try{

                return Double.parseDouble(c.trim());

            }catch (Exception e ){

                System.out.println("Введенное значение не является чилом. Введите другое значение ! ");
            }
        }
    }


}
