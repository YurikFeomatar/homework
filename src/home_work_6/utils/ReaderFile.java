package home_work_6.utils;

import home_work_6.api.IReplacer;
import home_work_6.utils.SearchEnginePunctuationNormalizer;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class ReaderFile {
    /**
     * Считывает указанный файл
     * @param link ссылку/ путь к файлу
     * @return файл, помещенный в строку
     * @throws IOException вызывающий метод, должен будет словить ошибку
     */
    public String readerNewFile(String link) throws IOException {
        final IReplacer replacer = new SearchEnginePunctuationNormalizer();
        String dataText = "";

        Reader reader = new FileReader(link);
        StringBuilder builder = new StringBuilder();
        int data;

        while ((data = reader.read()) != -1){
            builder.append(Character.toString(data));
        }

        dataText = builder.toString();
        dataText = replacer.replaceText(dataText);
        return dataText;
    }

}
