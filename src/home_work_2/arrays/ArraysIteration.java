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
    public static int[] iteralOdd(int[] array) {
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
        int[] revArr = new int[array.length];
        i = array.length;
        for (int b : array) {
            i--;
            revArr[i] = b;
        }
        System.out.println("\n\nВыводим обратную итерацию массива при помощи foreach ");
        for (int c : revArr) {
            System.out.print(c + " ");
        }
        return revArr;
    }
}