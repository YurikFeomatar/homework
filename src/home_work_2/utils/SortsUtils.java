package home_work_2.utils;

public class SortsUtils  {
    /**
     * метод sort принимает массив и сортирует его элементы по возрастанию, по принципу
     * пузырьковой сортировки (bubbleSort).
     * пузырьковый метод (прямой обмен)
     * работает следующим образом:
     * если расположить массив вертикально, то * чем *тяжелее* пузырек, тем ниже он находится в массиве.
     * А более легкий пузырек смещается вверх.
     * Пузырьковая сортировка начинает работу с конца массива, сравнивая пары элементов, и если текущий элемент меньше
     *  искомого, то меняет их местами.
     * @param array принимает массив целочисленных элементов.
     */
    public void sort(int[] array){
        int sort;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = array.length -1; j > i; j--) {
                if(array[j -1] > array[j]) {
                    sort = array[j -1];
                    array[j -1] = array[j];
                    array[j] = sort;
                }
            }
        }
    }
    /**
     * метод shake принимает массив, и сортирует его элементы по возрастанию, по принципу
     * Шейкерной сортировки (cocktailSort).
     * Шейкерная метод работает следующим образом:
     * слева - направо: ищем максимальное значение и перемещеаем его в конец массива,
     * уменьшая диапазон прочесывания массива max--;
     * далее, справа - налево: ищем минимальное значение и перемещаем его в начало массива,
     * уменьшая диапазон прочесывания массива min++;
     * и так до тех пор, пока min диапазона не дойдет до точки max, либо в массиве происходит перемещение элементов.
     * @param array массив
     * @return отсортированный массив
     */
    public int[] shake(int[] array){
        int min = 0;
        int max = array.length -1;
        int flag = 1;
        while ((min < max) && flag > 0){
            flag = 0;
            for (int i = min; i < max; i++) {
                if(array[i] > array[i + 1]){
                    int a = array[i];
                    array[i] = array[i +1];
                    array[i + 1] = a;
                    flag = 1;
                }
            }
            max--;
            for (int i = max; i > min ; i--) {
                if(array[i] < array[i -1]){
                    int a = array[i];
                    array[i] = array[i -1];
                    array[i - 1] = a;
                    flag = 1;
                }
            }
            min++;
        }
        return array;
    }
}
