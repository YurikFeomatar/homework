package home_work_1;
    import java.util.Scanner;

public class Convers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Во что бы хотите его перевести в Байты или Килобайты?");
            if(scan.hasNextLine()){
                String answer = scan.nextLine();
                if(!answer.equals("byte") && !answer.equals("Byte") && !answer.equals("kilobyte") && !answer.equals("KiloByte")){
                    System.out.println("В этой строке нужно указать либо <byte/Byte> либо <kilobyte/KiloByte>");
                    return;
                }
                String result = answer;
                System.out.println("Введите число");
                    if (scan.hasNextInt()) {
                        int num1 = scan.nextInt();
                        if(result.contains("ilo")){
                           num1= num1/1024;
                            System.out.println("Ваше число в килобайтах = " + num1);
                        }else {
                            num1=num1*1024;
                            System.out.println("Ваше число в байтах = " + num1);
                        }
                    }else{
                        System.out.println("Вы ввели не число");
                    }
            }
    }
}

