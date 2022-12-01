package home_work_1;
import java.util.Arrays;
import  java.util.Scanner;
public class CreatePhoneNumber {
    public static void main(String[] args) {
        final CreatePhoneNumber phone = new CreatePhoneNumber();
        int[] arr = new int[10];
        System.out.println("Заполните массив для форматирования его в телефонный номер");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                }
            System.out.println(phone.createPhoneNumber(arr));
        }else{
            System.err.println("Вы ввели не число");
        }
    }
    /**
     * преобразует массив цифр в формат телефонного номера
     * @param a массив цифр
     * @return строку в формате телефонного номера
     */
    public String createPhoneNumber(int[] a){
        return "PhoneNum = "+" + (" + a[0] + a[1] + a[2] + ") "+ a[3] + a[4] + a[5] + "-" + a[6] + a[7] + a[8] + a[9];
    }
}