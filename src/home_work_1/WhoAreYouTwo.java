package home_work_1;
import home_work_1.api.ICommunicationPrinter;
import java.util.Scanner;

public class WhoAreYouTwo implements ICommunicationPrinter {
    public String answer = "";
  // вариант if else if/;
    /**
     * Выводит имя введенное в консоль
     * @return строку с именем
     */
    public String myNamePrint(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        answer = scan.nextLine();
        return answer;
    }
    /**
     * проходим првоерку в консоли и принимаем String имя в статический метод
     * в зависимости от ответа позвращаем весту true or false
     * использовались switch case
     * @param answer имя из консоли
     * @return строку с именем
     */
    @Override
    public String welcom(String answer) {
        String name = answer;
        if (name.equals("Вася") || name.equals("вася")){
            name = "Привет!\nЯ тебя так долго ждал.";
        }else
        if(answer.equals("Анастасия") || answer.equals("анастасия")){
            name = "Я тебя так долго ждал.";
        } else
        if(!answer.equals("Вася") && !answer.equals("вася") && !answer.equals("Анастасия") && !answer.equals("анастасия")) {
            name =  "Добрый день, а вы кто?";
        }
        return name;
    }
}
