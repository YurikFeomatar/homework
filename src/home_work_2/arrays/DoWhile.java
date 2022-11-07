package home_work_2.arrays;

public class DoWhile implements Interfacer {
    public void runLoops(int[] array){
        System.out.println("Выводим итерацию массива при помощи do while ");
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (array.length > i);
        System.out.println("\n\nВыводим каждый второй элемент массива при помощи do while ");
        i = 0;
        do {
            if(i% 2 == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        } while (array.length > i );
        System.out.println("\n\nВыводим обратную итерацию массива при помощи do while ");
        i = array.length -1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0 );
    }
}
