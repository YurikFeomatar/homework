package home_work_6.mains;



import home_work_6.utils.DirectoryReader;

import java.io.File;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Введите адрес папки");
        String var = "F:\\projects\\homework\\src\\home_work_6\\add";
        File f1 = new File(var);
        if(f1.isDirectory()) {
            DirectoryReader reader = new DirectoryReader();
            reader.fileReader(f1);
            System.out.println(f1.getPath());

            //System.out.println(reader.getResult());
        }else{
            System.out.println("Не верный путь");
        }
    }
}
