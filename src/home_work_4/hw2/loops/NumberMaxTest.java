package home_work_4.hw2.loops;

import home_work_2.loops.MultiNumber;
import home_work_2.loops.NumberMax;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class NumberMaxTest {
    private final NumberMax calc = new NumberMax();
    @Test
    @DisplayName("проверяем метод maxValue")
    public void maxValue1(){
        Assertions.assertEquals(3,calc.maxValue("12323"));
    }
    @RepeatedTest(50)
    @DisplayName("проверяем метод vareblNum")
    public void vareblNum1(){
        Assertions.assertEquals(500,calc.vareblNum(50));
    }
    @Test
    @DisplayName("проверяем метод oddOrEvenNumber")
    public void oddOrEvenNumber1(){
        Assertions.assertEquals(2,calc.oddOrEvenNumber("21323","odd"));
    }
    @Test
    @DisplayName("проверяем метод oddOrEvenNumber")
    public void oddOrEvenNumber2(){
        Assertions.assertEquals(3,calc.oddOrEvenNumber("21323","even"));
    }
    @Test
    @DisplayName("проверяем метод fiboLine")
    public void fiboLine1(){
        Assertions.assertEquals("1 2 3 5 8 13",calc.fiboLine(5));
    }
    @Test
    @DisplayName("проверяем метод stepToStep")
    public void stepToStep1(){
        Assertions.assertEquals("3 5 7 8",calc.stepToStep(1,8,2));
    }
    @Test
    @DisplayName("проверяем метод backNum")
    public void backNum1(){
        Assertions.assertEquals(654321,calc.backNum(123456));
    }
}
