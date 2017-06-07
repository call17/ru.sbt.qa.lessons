package ru.sbt.lesson2;


public class Calculator {

    private ICalcType calcType;

    public Calculator(ICalcType calcType){

        this.calcType = calcType;
    }

    public Integer getSum() throws Exception {

        String type = calcType.getType();

        if (type.equals("default")){

            return 1;
        }
        if (type.equals("engineering")){

            return 2;
        }

        throw new Exception("Unexpected calculator type.");
    }


}
