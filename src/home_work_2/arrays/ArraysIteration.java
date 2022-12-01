package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        final ArraysIteration var = new ArraysIteration();
        final ArraysUtils calc = new ArraysUtils();
        final int[] container = calc.arrayFromConsole();
        var.iteral(container);
        var.iteralOdd(container);
        var.backArray(container);
    }
    /**
     * метод itteral принимает массив, полученный из предыдущего метода ArraysUtils.arrayFromConsole()
     * и выводит элементы массива в консоль.
     * @param array массив
     * @return возвращает иттерацию.
     */
    public int[] iteral(int[] array) {
        System.out.println("Выводим итерацию массива при помощи do while ");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (array.length > i);
        System.out.println("\n\nВыводим итерацию массива при помощи while ");
        i = 0;
        while (array.length > i) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println("\n\nВыводим итерацию массива при помощи for ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nВыводим итерацию массива при помощи foreach ");
        for (int b : array) {
            System.out.print(b + " ");
        }
        return array;
    }
    /**
     * метод iteralOdd выводит с помощью четырех циклов каждый второй элемент массива
     * @param array принимает массив чисел
     * @return возвращает итерацию массива "каждый второй".
     */
    public int[] iteralOdd(int[] array) {
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи do while ");
        int i = 0;
        do {
            if(i% 2 == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        } while (array.length > i );
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи while ");
        i = 0;
        while (array.length > i) {
            if(i% 2 == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи for ");
        for (i = 0; i < array.length; i++) {
            if(i% 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи foreach ");
        int c = 0;
        for (int b : array) {
                if(c% 2 == 0) {
                    System.out.print( b+ " ");
                }
            c++;
        }
        return array;
    }

    /**
     * переделал свой forEach на forEach из лекции, (мой forEach создавал новый массив и обрабатывал обратную итерацию уже его.
     *
     * @param array массив int[]
     * @return массив
     */
    public int[] backArray(int[] array){
        System.out.println("\n\nВыводим обратную итерацию массива при помощи do while ");
        int i = array.length -1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0 );
        System.out.println("\n\nВыводим обратную итерацию массива при помощи while ");
        i = array.length -1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println("\n\nВыводим обратную итерацию массива при помощи for ");
        for (i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        int b = array.length -1;
        System.out.println("\n\nВыводим обратную итерацию массива при помощи foreach ");
        for(int element : array){
            System.out.print(array[b--] + " ");
        }
        return array;
    }
}