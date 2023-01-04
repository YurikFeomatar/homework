package home_work_6.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterFile {
    /**
     * создает новый файл, в который записывает результат поиска слов
     * @param result строку с результатами поиска
     * @param NewFileName имя для создания файла
     * @throws IOException вызывающий метод, должен будет словить ошибку
     */
    public void createFile(String result, String NewFileName) throws IOException{

        final Writer writer = new FileWriter(NewFileName,true);
            writer.write(result);
            writer.close();
    }
}
