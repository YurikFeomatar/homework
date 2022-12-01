package home_work_4.hw1;

import home_work_1.WhoAreYou;
import home_work_1.WhoAreYouThree;
import home_work_1.WhoAreYouTwo;
import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WhoAreYouTest {
    private final ICommunicationPrinter printer = new WhoAreYouTwo();
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYouTwo")
    public void whoAreYouTwo1(){

        Assertions.assertEquals("Добрый день, а вы кто?",printer.welcom("Юрик"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYouTwo")
    public void whoAreYouTwo2(){
        Assertions.assertEquals("Привет!\n" +
                "Я тебя так долго ждал.",printer.welcom("Вася"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYouTwo")
    public void whoAreYouTwo3(){
        Assertions.assertEquals("Я тебя так долго ждал.",printer.welcom("Анастасия"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYouThree")
    public void whoAreYouThree1(){
        Assertions.assertEquals("Добрый день, а вы кто?",printer.welcom("Юрик"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYouThree")
    public void whoAreYouThree2(){
        Assertions.assertEquals("Привет!\n" +
                "Я тебя так долго ждал.",printer.welcom("Вася"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYouThree")
    public void whoAreYouThree3(){
        Assertions.assertEquals("Я тебя так долго ждал.",printer.welcom("Анастасия"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYou")
    public void whoAreYou1(){
        Assertions.assertEquals("Добрый день, а вы кто?",printer.welcom("Юрик"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYou")
    public void whoAreYou2(){
        Assertions.assertEquals("Привет!\n" +
                "Я тебя так долго ждал.",printer.welcom("Вася"));
    }
    @Test
    @DisplayName("Проверка метода welcom в WhoAreYou")
    public void whoAreYou3(){
        Assertions.assertEquals("Я тебя так долго ждал.",printer.welcom("Анастасия"));
    }
}
