package home_work_1;
    // вариант if else;

    import home_work_1.api.ICommunicationPrinter;
    import java.util.Scanner;
public class WhoAreYou implements ICommunicationPrinter {
    public String answer = "";
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
     * использовались if else
     * @param answer Имя из консоли
     * @return возвращает строку с именем
     */
    public String welcom(String answer){
        String name = answer;
            if (answer.equals("Вася")||answer.equals("вася")) {
                name = "Привет!\nЯ тебя так долго ждал.";
            }
            if (answer.equals("Анастасия")||answer.equals("анастасия")) {
                name = "Я тебя так долго ждал.";
            }
            if (!answer.equals("Вася") && !answer.equals("Анастасия") && !answer.equals("вася")&& !answer.equals("анастасия") ) {
                name = "Добрый день, а вы кто?";
            }
        return name;
    }
}
