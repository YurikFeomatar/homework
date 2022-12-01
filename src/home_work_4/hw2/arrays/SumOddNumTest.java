package home_work_4.hw2.arrays;

import home_work_2.arrays.SumOddNum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumOddNumTest {
    private final SumOddNum print = new SumOddNum();
    @Test
    @DisplayName("проверяем работу метода oddEl")
    public void oddEl1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("20",print.oddEl(array));
    }
    @Test
    @DisplayName("проверяем работу метода middleNum")
    public void middleNum1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("1 2 3 0 ",print.middleNum(array));
    }
    @Test
    @DisplayName("проверяем работу метода maxEl")
    public void maxEl1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("8",print.maxEl(array));
    }
    @Test
    @DisplayName("проверяем работу метода minNum")
    public void minNum1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("0 и 1",print.minNum(array));
    }
    @Test
    @DisplayName("проверяем работу метода deleteEl")
    public void deleteEl1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals(array,print.deleteEl(array));
    }
    @Test
    @DisplayName("проверяем работу метода sumNumArr и deleteEl")
    public void sumNumArr1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals(23,print.sumNumArr(print.deleteEl(array)));
    }
}
