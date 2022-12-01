package home_work_4.hw1;

import home_work_1.LetterOrNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LetterOrNumberTest {
    private final LetterOrNumber div = new LetterOrNumber();
    @Test
    @DisplayName("Проверка метода charASCII")
    public void charaSCII(){
        Assertions.assertEquals(div.charASCII(55),div.charASCII(55));
    }
    @Test
    @DisplayName("Проверка метода charASCII")
    public void charaSCIITwo(){
        Assertions.assertEquals("Ваше введенное число 55 соответствует символу '7' по коду ASCII",div.charASCII(55));
    }
    @Test
    @DisplayName("Проверка метода charASCII")
    public void charaSCIIThree(){
        Assertions.assertEquals("Вы ввели число не соответствующее коду ASCII",div.charASCII(129));
    }
    @Test
    @DisplayName("Проверка метода charASCII")
    public void charaSCIIFour(){
        Assertions.assertEquals("Ваше введенное число 78 соответствует буквое 'N' английского алфавита по коду ASCII",div.charASCII(78));
    }
    @Test
    @DisplayName("Проверка метода charASCII")
    public void charaSCIIFive(){
        Assertions.assertEquals("Вы ввели число не соответствующее коду ASCII",div.charASCII(-1));
    }
}
