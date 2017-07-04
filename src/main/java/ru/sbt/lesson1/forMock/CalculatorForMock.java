package ru.sbt.lesson1.forMock;


public class CalculatorForMock {

    private ICalcType calcType;

    public CalculatorForMock(ICalcType calcType){

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
