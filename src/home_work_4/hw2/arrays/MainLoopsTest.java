package home_work_4.hw2.arrays;

import home_work_2.arrays.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainLoopsTest {
    private final Interfacer calc1 = new While();
    private final Interfacer calc2 = new DoWhile();
    private final Interfacer calc3 = new For();
    private final Interfacer calc4 = new ForEach();
    @Test
    @DisplayName("проверка метода runLoopsIter для while")
    public void mainLoops1(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим итерацию массива при помощи while 1 2 3 4 5 6 7 8 9 0 ",calc1.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIter для do while")
    public void mainLoops2(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("Выводим итерацию массива при помощи do while 1 2 3 4 5 6 7 8 9 0 ",calc2.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIter для for")
    public void mainLoops3(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим итерацию массива при помощи for 1 2 3 4 5 6 7 8 9 0 ",calc3.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIter для foreach")
    public void mainLoops4(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим итерацию массива при помощи foreach 1 2 3 4 5 6 7 8 9 0 ",calc4.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для while")
    public void mainLoops5(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи while 1 3 5 7 9 ",calc1.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для do while")
    public void mainLoops6(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи do while 1 3 5 7 9 ",calc2.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для for")
    public void mainLoops7(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи for 1 3 5 7 9 ",calc3.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для foreach")
    public void mainLoops8(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи foreach 1 3 5 7 9 ",calc4.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для while")
    public void mainLoops9(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи while 0 9 8 7 6 5 4 3 2 1 ",calc1.runLoopsIterBackArray(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для do while")
    public void mainLoops10(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи do while 0 9 8 7 6 5 4 3 2 1 ",calc2.runLoopsIterBackArray(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для for")
    public void mainLoops11(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи for 0 9 8 7 6 5 4 3 2 1 ",calc3.runLoopsIterBackArray(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для foreach")
    public void mainLoops12(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи foreach 0 9 8 7 6 5 4 3 2 1 ",calc4.runLoopsIterBackArray(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIter для while")
    public void mainLoops21(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим итерацию массива при помощи while 1 2 3 4 5 6 7 8 9 0 123 32456 7689 324 ",calc1.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIter для do while")
    public void mainLoops22(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("Выводим итерацию массива при помощи do while 1 2 3 4 5 6 7 8 9 0 123 32456 7689 324 ",calc2.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIter для for")
    public void mainLoops13(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим итерацию массива при помощи for 1 2 3 4 5 6 7 8 9 0 123 32456 7689 324 ",calc3.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIter для foreach")
    public void mainLoops14(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим итерацию массива при помощи foreach 1 2 3 4 5 6 7 8 9 0 123 32456 7689 324 ",calc4.runLoopsIter(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для while")
    public void mainLoops15(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи while 1 3 5 7 9 123 7689 ",calc1.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для do while")
    public void mainLoops16(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи do while 1 3 5 7 9 123 7689 ",calc2.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для for")
    public void mainLoops17(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи for 1 3 5 7 9 123 7689 ",calc3.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterOdd для foreach")
    public void mainLoops18(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим каждый второй элемент массива при помощи foreach 1 3 5 7 9 123 7689 ",calc4.runLoopsIterOdd(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для while")
    public void mainLoops19(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи while 324 7689 32456 123 0 9 8 7 6 5 4 3 2 1 ",calc1.runLoopsIterBackArray(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для do while")
    public void mainLoops110(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи do while 324 7689 32456 123 0 9 8 7 6 5 4 3 2 1 ",calc2.runLoopsIterBackArray(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для for")
    public void mainLoops111(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи for 324 7689 32456 123 0 9 8 7 6 5 4 3 2 1 ",calc3.runLoopsIterBackArray(array));
    }
    @Test
    @DisplayName("проверка метода runLoopsIterBackArray для foreach")
    public void mainLoops112(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0,123,32456,7689,324};
        Assertions.assertEquals("\nВыводим обратную итерацию массива при помощи foreach 324 7689 32456 123 0 9 8 7 6 5 4 3 2 1 ",calc4.runLoopsIterBackArray(array));
    }
}
