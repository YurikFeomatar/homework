package home_work_6.mains;

import home_work_6.api.IReplacer;
import home_work_6.utils.SearchEnginePunctuationNormalizer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        IReplacer replacer = new SearchEnginePunctuationNormalizer();
        String dataText = "";
        String[] dataArray = new String[0];
        Set<String> wordRare = new HashSet<>();

        try(Reader reader = new FileReader("src/home_work_6/War_and_Peace.txt")){
            StringBuilder builder = new StringBuilder();

            int data;

            while ((data = reader.read()) != -1){
                builder.append(Character.toString(data));
            }
            dataText = builder.toString();
            dataText = replacer.replaceText(dataText);
            dataArray = dataText.split(" ");
            System.out.println("общее количество использованных слов = " + dataArray.length +"\n");

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден " + e.getMessage());
        }catch (IOException e){
            System.out.println("Ошибка чтения файла");
        }
        Collections.addAll(wordRare, dataArray);
        System.out.println(wordRare);
        System.out.println("\nколичество уникальных слов в коллекции Set = " + wordRare.size());
    }
}
