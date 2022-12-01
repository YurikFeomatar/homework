package home_work_2.arrays;

public class DoWhile implements Interfacer {
    public String runLoopsIter(int[] array) {
        String result = "";
        String text = "Выводим итерацию массива при помощи do while ";
        int i = 0;
        do {
            result = result + array[i] + " ";
            i++;
        } while (array.length > i);
        return text + result;
    }
    public String runLoopsIterOdd(int[] array) {
        String result = "";
        String text = "\nВыводим каждый второй элемент массива при помощи do while ";
        int i = 0;
        do {
            if (i % 2 == 0) {
                result = result + array[i] + " ";
            }
            i++;
        } while (array.length > i);
        return text + result;
    }
    public String runLoopsIterBackArray(int[] array) {
        String result = "";
        String text = "\nВыводим обратную итерацию массива при помощи do while ";
        int i = array.length -1;
        do {
            result = result + array[i] + " ";
            i--;
        } while (i >= 0 );
        return text + result;
    }
}
