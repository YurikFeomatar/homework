package home_work_4.hw2.utils;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {
    private final SortsUtils sorter = new SortsUtils();
    private final ArraysUtils calc = new ArraysUtils();
    @Test
    @DisplayName("проверка метода sort")
    public void sort1(){
        int[] array= calc.arrayRandom(10,5);
        for (int element: array){
            Assertions.assertTrue(element < 20);
        }
    }
    @Test
    @DisplayName("проверка метода sort")
    public void sort2(){
        int[] array= new int[]{9,8,7,6,5,4,3,2,1,0};
        sorter.sort(array);
        Assertions.assertArrayEquals(array,new int[]{0,1,2,3,4,5,6,7,8,9}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода sort")
    public void sort3(){
        int[] array= new int[]{9,8,7,1,1,-4,3,2,1,0};
        sorter.sort(array);
        Assertions.assertArrayEquals(array,new int[]{-4,0,1,1,1,2,3,7,8,9}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода sort")
    public void sort4(){
        int[] container1 = new int[]{1,2,3,4,5,6};
        sorter.sort(container1);
        Assertions.assertArrayEquals(container1,new int[]{1,2,3,4,5,6}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода sort")
    public void sort5(){
        int[] container2 = new int[]{1,1,1,1};
        sorter.sort(container2);
        Assertions.assertArrayEquals(container2,new int[]{1,1,1,1}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода sort")
    public void sort6(){
        int[] container3 = new int[]{9,1,5,99,9,9};
        sorter.sort(container3);
        Assertions.assertArrayEquals(container3,new int[]{1,5,9,9,9,99}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода sort")
    public void sort7(){
        int[] container4 = new int[]{};
        sorter.sort(container4);
        Assertions.assertArrayEquals(container4,new int[]{}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода sort")
    public void sort8(){
        int[] container5 = new int[]{6,5,4,3,2,1};
        sorter.sort(container5);
        Assertions.assertArrayEquals(container5,new int[]{1,2,3,4,5,6}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake1(){
        int[] array= calc.arrayRandom(10,5);
        for (int element: array){
            Assertions.assertTrue(element < 20);
        }
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake2(){
        int[] array= new int[]{2,1,5,3,4};
        array = sorter.shake(array);
        Assertions.assertArrayEquals(array,new int[]{1,2,3,4,5}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake3(){
        int[] array= new int[]{0,0,0,0,0,0};
        sorter.shake(array);
        Assertions.assertArrayEquals(array,new int[6], "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake4(){
        int[] container1 = new int[]{1,2,3,4,5,6};
        sorter.shake(container1);
        Assertions.assertArrayEquals(container1,new int[]{1,2,3,4,5,6}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake5(){
        int[] container2 = new int[]{1,1,1,1};
        sorter.shake(container2);
        Assertions.assertArrayEquals(container2,new int[]{1,1,1,1}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake6(){
        int[] container3 = new int[]{9,1,5,99,9,9};
        sorter.shake(container3);
        Assertions.assertArrayEquals(container3,new int[]{1,5,9,9,9,99}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake7(){
        int[] container4 = new int[]{};
        sorter.shake(container4);
        Assertions.assertArrayEquals(container4,new int[]{}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake8(){
        int[] container5 = new int[]{6,5,4,3,2,1};
        sorter.shake(container5);
        Assertions.assertArrayEquals(container5,new int[]{1,2,3,4,5,6}, "Array Equal Test");
    }
    @Test
    @DisplayName("проверка метода shake")
    public void shake9(){
        int[] array = new int[]{123,567,2130,-1230,21330,20};
        sorter.shake(array);
        Assertions.assertArrayEquals(array,new int[]{-1230,20,123,567,2130,21330}, "Array Equal Test");
    }
}
