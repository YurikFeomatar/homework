package home_work_6.mains;

import additional.cw3_Potoki.job.SearchWordInTextCall2;
import home_work_6.utils.ReaderFile;
import home_work_6.utils.WriterFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task8 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final ReaderFile readerFile = new ReaderFile();
        final WriterFile writerFile = new WriterFile();
        String link = "F:\\projects\\homework\\src\\home_work_6\\add";

        File f1 = new File(link);

        ExecutorService executor = null;

        if(f1.isDirectory()) {
            try{
                executor = Executors.newFixedThreadPool(4);
                for(File f : f1.listFiles()){
                    System.out.println("файлы из директории " + f.getName());
                }

                System.out.println("Укажите файл для чтения");
                link += "\\" + scan.nextLine();
                System.out.println(link);
                String totalLink = readerFile.readerNewFile(link);
                String search = "";
                String answer;
                String result = "";
                List<Future<SearchWordInTextCall2.JobResult>> jobResult = new ArrayList<>();
                SearchWordInTextCall2.JobResult totalResult = null;
                do {
                    System.out.println("какое слово хотите найти?");
                    search = scan.nextLine();
                    jobResult.add(executor.submit(new SearchWordInTextCall2(totalLink, search)));

                    do {
                        Iterator<Future<SearchWordInTextCall2.JobResult>> itr = jobResult.iterator();

                        while (itr.hasNext()){
                            Future<SearchWordInTextCall2.JobResult> next = itr.next();
                            if(next.isDone()){
                                totalResult = next.get();
                                System.out.println("Нашли: " + totalResult.getWord() + " " + totalResult.getCount() + " раз");
                                itr.remove();
                            }
                        }
                    } while (jobResult.size() != 0);
                    result += link + " - " + totalResult.getWord() + " - " +  totalResult.getCount() + "\n";

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
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                if(executor != null){
                    executor.shutdown();
                }
            }
        }else{
            System.out.println("Не верный путь");
        }
    }
}
