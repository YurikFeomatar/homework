package home_work_6;

import home_work_6.api.IReplacer;
import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import home_work_6.utils.RegExSearch;
import home_work_6.utils.SearchEnginePunctuationNormalizer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ISearchEngine easySearch = new EasySearch();
        ISearchEngine regExSearch = new RegExSearch();
        IReplacer replacer = new SearchEnginePunctuationNormalizer();
        //Pattern pattern = Pattern.compile("/^.*?\\s/");
        String dataText = "";
        String[] dataArray;
        Map<String, Integer> map = new HashMap<>();
        List<Map.Entry<String, Integer>> entryList = null;
        try (Reader reader = new FileReader("War_and_Peace.txt")) {
            StringBuilder builder = new StringBuilder();

            int data;

            while ((data = reader.read()) != -1) {
                builder.append(Character.toString(data));
            }
            dataText = builder.toString();
            dataText = replacer.replaceText(dataText);
            dataArray = dataText.split(" ");

            int v = 1;
            for (String s : dataArray) {
                if (!s.equals("")) {
                    if (!map.containsKey(s)) {
                        map.put(s, v);
                    } else {
                        map.put(s, map.get(s) + v);
                    }
                }
            }
            entryList = new ArrayList<>(map.entrySet());
            entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        } catch (NullPointerException e) {
            System.err.println("Ошибка нулевого значения");
        } catch (ClassCastException e) {
            System.out.println("неподходящий ключ");
        }
        System.out.println("отсортированный List Key-Maps " + entryList);
        System.out.println("\nТоп 20 использованных слов : ");

        try{
        for (int i = 0; i < 20; i++) {
            assert entryList != null;
            System.out.println(entryList.get(i)+ " раз ");
        }
        }catch (NullPointerException e){
            System.out.println("Ошибка нулевого значения");
        }
        {
            System.out.println("Слово 'Война' встречается " + easySearch.search(dataText, "Война") + " раз");
            System.out.println("Слово 'война' встречается " + easySearch.search(dataText, "война") + " раз");
            System.out.println("Слово 'же' встречается " + easySearch.search(dataText, "же") + " раз");
            System.out.println("Слово 'и' встречается " + easySearch.search(dataText, "и") + " раз");
            System.out.println("Слово 'мир' встречается " + easySearch.search(dataText, "мир") + " раз");
        }
        System.out.println("-------------------------------------------------------------------------------------");
        {
            System.out.println("Слово 'Война' встречается " + regExSearch.search(dataText, "Война") + " раз");
            System.out.println("Слово 'война' встречается " + regExSearch.search(dataText, "война") + " раз");
            System.out.println("Слово 'же' встречается " + regExSearch.search(dataText, "же") + " раз");
            System.out.println("Слово 'и' встречается " + regExSearch.search(dataText, "и") + " раз");
            System.out.println("Слово 'мир' встречается " + regExSearch.search(dataText, "мир") + " раз");
        }

    }
}
