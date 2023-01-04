package home_work_6.mains;



import home_work_6.utils.ReaderFile;
import home_work_6.utils.WriterFile;
import home_work_6.utils.EasySearch;

import java.io.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final WriterFile writerFile = new WriterFile();
        final ReaderFile readerFile = new ReaderFile();
        final EasySearch easySearch = new EasySearch();

        //System.out.println("Введите адрес папки");
        String link = "F:\\projects\\homework\\src\\home_work_6\\add";
        File f1 = new File(link);

        if(f1.isDirectory()) {
            try{
                for(File f : f1.listFiles()){
                    System.out.println("файлы из директории " + f.getName());
                }

                System.out.println("Укажите файл для чтения");
                link += "\\" + scan.nextLine();
                String search;
                String answer;
                String result = "";

                do {
                    System.out.println("какое слово хотите найти?");
                    search = scan.nextLine();
                    System.out.println("Слов в тексте нашлось = ");
                    System.out.println(easySearch.search(readerFile.readerNewFile(link), search));
                    result += link + " - " + search + " - " + easySearch.search(readerFile.readerNewFile(link), search);
                    System.out.println("Хотите повторить? true / false    да/нет");
                    answer = scan.nextLine();

                } while (answer.equals("true") || answer.equals("True") || answer.equals("да") || answer.equals("Да"));

                writerFile.createFile(result,"result.txt");

                System.out.println(readerFile.readerNewFile("result.txt"));

            }catch (FileNotFoundException e){
                System.out.println("Файл не найден");
            }catch (IOException e){
                System.out.println("Ошибка ввода/вывода");
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Не верный путь");
        }
    }
}
