package home_work_2.arrays;

public class For implements Interfacer {
    public void runLoops(int[] array){
        System.out.println("\n\nВыводим итерацию массива при помощи for ");
        int i = 0;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи for ");
        for (i = 0; i < array.length; i++) {
            if(i% 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n\nВыводим обратную итерацию массива при помощи for ");
        for (i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
