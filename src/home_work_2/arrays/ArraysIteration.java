package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        iteral(container);
        iteralOdd(container);
        backArray(container);
    }

    /**
     * метод itteral принимает массив, полученный из предыдущего метода ArraysUtils.arrayFromConsole()
     * и выводит элементы массива в консоль.
     *
     * @param array
     * @return возвращает иттерацию.
     */
    public static int[] iteral(int[] array) {
        int i = 0;
        do {
            System.out.println("Выводим итерацию массива при помощи do while " + array[i]);
            i++;
        } while (array.length > i);

        i = 0;
        while (array.length > i) {
            System.out.println("Выводим итерацию массива при помощи while " + array[i]);
            i++;
        }

        for (i = 0; i < array.length; i++) {
            System.out.println("Выводим итерацию массива при помощи for " + array[i]);
        }
        for (int b : array) {
            System.out.println("Выводим итерацию массива при помощи  foreach " + b);
        }
        return array;
    }

    /**
     * метод iteralOdd выводит с помощью четырех циклов каждый второй элемент массива
     * @param array принимает массив чисел
     * @return возвращает итерацию массива "каждый второй".
     */
    public static int[] iteralOdd(int[] array) {
        int i = 0;
        do {
            if(i% 2 == 0) {
                System.out.println("Выводим каждый второй элемент массива при помощи do while " + array[i]);
            }
            i++;
        } while (array.length > i );

        i = 0;
        while (array.length > i) {
            if(i% 2 == 0) {
                System.out.println("Выводим каждый второй элемент массива при помощи while " + array[i]);
            }
            i++;
        }

        for (i = 0; i < array.length; i++) {
            if(i% 2 == 0) {
                System.out.println("Выводим каждый второй элемент массива при помощи for " + array[i]);
            }
        }
        int c = 0;
        for (int b : array) {
                if(c% 2 == 0) {
                    System.out.println("Выводим каждый второй элемент массива при помощи  foreach " + b);
                }
            c++;
        }
        return array;
    }

    /**
     * метод backArray выводит с помощью четырех циклов обратную итерацию элементов массива.
     * у Foreach прямого пути обработать массив в обратном направлении нет, поэтому создаем
     * новый массив revArr[array.length], в который с помощью счетчика int i=array.length, ( i--)
     * элементы массива array записывает с конца. И после этого уже через второй foreach
     * выводим итерацию (обратного массива).
     * по факту получается, что foreach работает по обычной итерации.
     * @param array принимает массив чисел
     * @return возвращает вывод массива с конца в начало.
     */
    public static int[] backArray(int[] array){
        int i = array.length -1;
        do {
            System.out.println("Выводим обратную итерацию массива при помощи do while " + array[i]);
            i--;
        } while (i >= 0 );

        i = array.length -1;
        while (i >= 0) {
            System.out.println("Выводим обратную итерацию массива при помощи while " + array[i]);
            i--;
        }

        for (i = array.length-1; i >= 0; i--) {
            System.out.println("Выводим обратную итерацию массива при помощи for " + array[i]);
        }

        int[] revArr = new int[array.length];
        i = array.length;
        for (int b : array) {
            i--;
            revArr[i] = b;
        }
        for (int c : revArr) {
            System.out.println("Выводим обратную итерацию массива при помощи foreach " + c);
        }
        return revArr;
    }
}