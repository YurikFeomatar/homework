package home_work_2.arrays;

public class While implements Interfacer {
    public void runLoops(int[] array){
        System.out.println("\n\nВыводим итерацию массива при помощи while ");
        int i = 0;
        while (array.length > i) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи while ");
        i = 0;
        while (array.length > i) {
            if(i% 2 == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println("\n\nВыводим обратную итерацию массива при помощи while ");
        i = array.length -1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i--;
        }
    }
}
