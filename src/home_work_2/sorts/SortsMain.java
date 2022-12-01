package home_work_2.sorts;
import java.util.Scanner;
import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {

    /**
     * метод itter повторяет итерацию для вывода чисел массива
     * @param array принимает массив
     * @return возвращает печать элементов массива
     */
    public int[] itter(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        final SortsMain var = new SortsMain();
        final ArraysUtils calc = new ArraysUtils();
        final SortsUtils sort = new SortsUtils();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Какой массив вы хотите отсортировать?\n 1. container1;\n 2. container2;\n 3. container3;" +
                "\n 4. container4;\n 5. container5;\n 6. containerConsole;\n 7. containerRandom;\n 8. Все сразу");
        if(scan.hasNextInt()){
            int num = scan.nextInt();
            if(num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8){


                int[] container1 = new int[]{1,2,3,4,5,6};
                int[] container2 = new int[]{1,1,1,1};
                int[] container3 = new int[]{9,1,5,99,9,9};
                int[] container4 = new int[]{};
                int[] container5 = new int[]{6,5,4,3,2,1};
                if(num == 1 || num == 8) {
                    System.out.print("Массив container1 до сортировки" + " : ");
                    var.itter(container1);
                    sort.sort(container1);
                    System.out.print("\nМассив container1 после пузырьковой сортировки" + " : ");
                    var.itter(container1);
                    sort.shake(container1);
                    System.out.print("\nМассив container1 после Шейкерной сортировки" + " : ");
                    var.itter(container1);
                    System.out.println("\n");
                }
                //__________________________________________________________________________________
                if(num == 2 || num == 8) {
                    System.out.print("Массив container2 до сортировки" + " : ");
                    var.itter(container2);
                    sort.sort(container2);
                    System.out.print("\nМассив container2 после пузырьковой сортировки" + " : ");
                    var.itter(container2);
                    sort.shake(container2);
                    System.out.print("\nМассив container2 после Шейкерной сортировки" + " : ");
                    var.itter(container2);
                    System.out.println("\n");
                }
                //__________________________________________________________________________________
                if(num == 3 || num == 8) {
                    System.out.print("Массив container3 до сортировки" + " : ");
                    var.itter(container3);
                    sort.sort(container3);
                    System.out.print("\nМассив container3 после пузырьковой сортировки" + " : ");
                    var.itter(container3);
                    sort.shake(container3);
                    System.out.print("\nМассив container3 после Шейкерной сортировки" + " : ");
                    var.itter(container3);
                    System.out.println("\n");
                }
                //__________________________________________________________________________________
                if(num == 4 || num == 8) {
                    System.out.print("Массив container4 до сортировки" + " : ");
                    var.itter(container4);
                    sort.sort(container4);
                    System.out.print("\nМассив container4 после пузырьковой сортировки" + " : ");
                    var.itter(container4);
                    sort.shake(container4);
                    System.out.print("\nМассив container4 после Шейкерной сортировки" + " : ");
                    var.itter(container4);
                    System.out.println("\n");
                }
                //__________________________________________________________________________________
                if(num == 5 || num == 8) {
                    System.out.print("Массив container5 до сортировки" + " : ");
                    var.itter(container5);
                    sort.sort(container5);
                    System.out.print("\nМассив container5 после пузырьковой сортировки" + " : ");
                    var.itter(container5);
                    sort.shake(container5);
                    System.out.print("\nМассив container5 после Шейкерной сортировки" + " : ");
                    var.itter(container5);
                    System.out.println("\n");
                }
                //__________________________________________________________________________________
                if(num == 6 || num == 8) {
                    int[] containerConsole = calc.arrayFromConsole();
                    System.out.print("Массив containerConsole до сортировки" + " : ");
                    var.itter(containerConsole);
                    sort.sort(containerConsole);
                    System.out.print("\nМассив containerConsole после пузырьковой сортировки" + " : ");
                    var.itter(containerConsole);
                    sort.shake(containerConsole);
                    System.out.print("\nМассив containerConsole после Шейкерной сортировки" + " : ");
                    var.itter(containerConsole);
                    System.out.println("\n");
                }
                //__________________________________________________________________________________
                if(num == 7 || num == 8) {
                    int[] containerRandom = calc.arrayRandom(10, 100);
                    System.out.print("Массив containerRandom до сортировки" + " : ");
                    var.itter(containerRandom);
                    sort.sort(containerRandom);
                    System.out.print("\nМассив containerRandom после пузырьковой сортировки" + " : ");
                    var.itter(containerRandom);
                    sort.shake(containerRandom);
                    System.out.print("\nМассив containerRandom после Шейкерной сортировки" + " : ");
                    var.itter(containerRandom);
                }
            }else{
                System.out.println("Введите число 1 . 2 . 3 . 4 . 5 . 6 . 7 . 8 .");
            }
        }else{
            System.out.println("Вы ввели не число");
        }
    }
}
