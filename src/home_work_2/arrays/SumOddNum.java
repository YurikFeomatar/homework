package home_work_2.arrays;
import java.util.Random;
import home_work_2.utils.ArraysUtils;

public class SumOddNum {
    public static void main(String[] args) {
        final ArraysUtils calc = new ArraysUtils();
        final SumOddNum printer = new SumOddNum();
        final int[] container = calc.arrayRandom(4,100);
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println("\n Сумма положительных четных элементов массива = " + printer.oddEl(container));
        System.out.println("\n Максимальный четный элемент массива = " + printer.maxEl(container));
        System.out.println("\n Элементы, значение которых меньше среднего арифметического элементов массива = "+ printer.middleNum(container));
        System.out.println("\n Два минимальных элемена массива = " + printer.minNum(container));
        printer.deleteEl(container);
        System.out.print("Массив с обнуленным и перемещенным в конец диапазоном : ");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println("\n Сумма цифр массива = " + printer.sumNumArr(container));
    }
    /**
     *  метод oddEl выводит сумму положительных четных элементов массива.
     * @param array принимает массив arrayRandom
     * @return возвращает сумму положительных элементов массива
     */
    public String oddEl(int[] array){
        int a =0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i]% 2 ==0){
                a = a + array[i];
            }
        }
        result = String.valueOf(a);
        return result;
    }
    /**
     * метод maxEl находит максимальный четный элемент массива.
     * @param array принимает массив
     * @return возвращает значение Max - максимальынй четный элемент массива
     */
    public String maxEl(int[] array) {
        int max = 0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if(max < array[i]){
                    max = array[i];
                }
            }
        }
        result = String.valueOf(max);
        return result;
    }
    /**
     * метод middleNum принимает массив и находит элементы, значение которых меньше среднего арифметического элементов массива.
     * @param array принимает массив.
     * @return возвращает строку с элементами, меньшими среднего арифметического элементов массива.
     */
    public String middleNum(int[] array){
        String middle = "";
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < result / array.length){
                middle = middle + array[i]+ " ";
            }
        }
        return middle;
    }
    /**
     * метод minNum принимает массив и находит два минимальных значения в элементах массива.
     * @param array принимает массив с псевдослучайными числами.
     * @return возвращает строку с двумя минимальными элементами массива.
     */
    public String  minNum(int[] array){
        int min1 = array[0];
        int min2 = array[0];
        String min = "";
        for (int i = 0; i < array.length; i++) {
            if(min1 > array[i] ){
                min2 =min1;
                min1 = array[i];
            }else if(min2 > array[i]){
                min2 = array[i];
            }
        }
        min =min1 + " и " + min2;
        return min;
    }
    /**
     * метод deleteEl принимает массив псевдорандомных элементов, обнуляет значения элементов в
     * диапазоне min / max и выносит их в конец массива.
     * @param array принимает массив
     * @return возвращает массив с обнулением заданного диапазона и перемещением его в конец массива
     */
    public int[] deleteEl(int[] array){
        //Random rand = new Random();
        int min = 3;//rand.nextInt(20);
        int max = 6;//rand.nextInt(50);
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if(i >=min && i <=max) {
                c++;
            }else{
                array[i - c] = array[i];
            }
        }
        for (int i = array.length - c; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }
    /**
     * метод SumNumArr принимает массив, переводит его элементы в стоку и с помощью Character.getNumeriValue(charAt())
     * разделяет длину строки на символы, после чего сохраняет и плюсует цифры в Интовое число
     * @param array принимает массив.
     * @return возвращает сумму цифр массива в int.
     */
    public int sumNumArr(int[] array){
        String numb = "";
        int result = 0;
        for (int j = 0; j < array.length; j++) {
            numb = numb + array[j];
        }
        for (int r = 0; r < numb.length(); r++) {
            result = result + Character.getNumericValue(numb.charAt(r));
        }
        return result;
    }
}
