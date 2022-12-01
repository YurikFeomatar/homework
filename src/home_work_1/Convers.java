package home_work_1;
    import java.util.Scanner;

public class Convers {
    public static void main(String[] args) {
        final Convers convers = new Convers();
        Scanner scan = new Scanner(System.in);
        System.out.println("Во что бы хотите его перевести в Байты или Килобайты?");
        if(scan.hasNextLine()){
            String answer = scan.nextLine();
            if(answer.equals("byte") || answer.equals("Byte") || answer.equals("kilobyte") || answer.equals("KiloByte")){
                System.out.println("Введите число");
                if (scan.hasNextInt()) {
                    int num1 = scan.nextInt();
                    if(answer.contains("ilo")) {
                        System.out.println(convers.kilobyte(num1));
                    }else{
                        System.out.println(convers.byteOf(num1));
                    }
                }else{
                    System.out.println("Вы ввели не число");
                }
            }
        }else{
            System.out.println("В этой строке нужно указать либо <byte/Byte> либо <kilobyte/KiloByte>");
        }
    }
    public String byteOf(int num1){
        return  "Ваше число в байтах = " +  num1 * 1024;
    }
    public String kilobyte(int num1){
        return  "Ваше число в килобайтах  = " +  num1 / 1024;
    }
}

