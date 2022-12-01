package home_work_4.hw1;

import home_work_1.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomTest {
    private final Random rand = new Random();
    @Test
    @DisplayName("Проверяем работу метода array")
    public void arrayRandom(){
        Assertions.assertEquals("Длина массива 10", rand.array(10));
    }
}
