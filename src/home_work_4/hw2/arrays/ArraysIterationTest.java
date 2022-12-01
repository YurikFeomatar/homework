package home_work_4.hw2.arrays;

import home_work_2.arrays.ArraysIteration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraysIterationTest {
    private final ArraysIteration calc = new ArraysIteration();
    @Test
    @DisplayName("проверяем метод iteral")
    public void iteral1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals(array, calc.iteral(array));
    }
    @Test
    @DisplayName("проверяем метод iteralOdd")
    public void iteralOdd1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals(array, calc.iteralOdd(array));
    }
    @Test
    @DisplayName("проверяем метод backArray")
    public void backArray1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals(array, calc.backArray(array));
    }
}
