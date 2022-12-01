package home_work_4.hw1;

import home_work_1.EvenOddNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EvenOddNumberTest {
    private final EvenOddNumber rand = new EvenOddNumber();
    @Test
    @DisplayName("Проверка на корректность работы метода mathRandom")
    public void mathRandom1(){
        Assertions.assertEquals("Нечетное число 55", rand.mathRand(55,28));
    }
    @Test
    @DisplayName("Проверка на корректность работы метода mathRandom")
    public void mathRandom2(){
        Assertions.assertEquals("Нечетное число -1", rand.mathRand(-1,28));
    }
}
