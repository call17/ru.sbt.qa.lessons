package mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ru.sbt.lesson2.CalcType;
import ru.sbt.lesson2.Calculator;

import static org.easymock.EasyMock.*;


public class CalculatorTestWithMock {

    private CalcType calcType;

    @Before
    public void setUp() throws Exception {

        // Мокирование класс, который возвращает нам тип калькулятора
        calcType = createMock(CalcType.class);
    }

    @Test
    public void testCalc1() throws Exception {

        // Устанаваливаем значение, возвращаемое методом getType, которое НЕ имеет реализации
        expect(calcType.getType()).andReturn("default").times(1);
//        // "Активация" мока
        replay(calcType);

        Calculator calculator = new Calculator(calcType);

        Assert.assertEquals(1, calculator.getSum(),0);

        verify(calcType);

    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test()
    public void testCalcException() throws Exception {

        // Устанаваливаем значение, возвращаемое методом getType, которое НЕ обработается в классе калькулятора
        expect(calcType.getType()).andReturn("labuda").times(1);
//        // "Активация" мока
        replay(calcType);

        Calculator calculator = new Calculator(calcType);

        exception.expect(Exception.class);
        exception.expectMessage("Unexpected calculator type.");

        calculator.getSum();


        verify(calcType);

    }
}
