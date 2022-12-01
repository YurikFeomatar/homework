package home_work_4.hw2.utils;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.*;

public class ArrayUtilsTest {
    private final ArraysUtils calc = new ArraysUtils();
    @Test
    @DisplayName("Проверка корректного размера массива arrayRandom")
    public void arrayRandom1(){
        int[] ints = calc.arrayRandom(10,20);
        Assertions.assertEquals(10,ints.length);
    }
    @RepeatedTest(20)
    @DisplayName("Проверка корректного заполнения массива arrayRandom")
    public void arrayRandom2(){
        int[] ints = calc.arrayRandom(10,20);
        for (int element: ints){
            Assertions.assertTrue(element < 20);
        }
    }
    @Test
    @Order(4)
    @DisplayName("Проверка работы массива arrayRandom")
    public void arrayRandom3(){
        int[] ints = calc.arrayRandom(0,20);
        Assertions.assertEquals(0,ints.length);
    }
    @Test
    @Order(1)
    @DisplayName("Проверка на ошибку arrayRandom")
    public void arrayRandom4(){
        Assertions.assertThrows(NegativeArraySizeException.class,()->{
            calc.arrayRandom(-1,20);
        });
    }
}
