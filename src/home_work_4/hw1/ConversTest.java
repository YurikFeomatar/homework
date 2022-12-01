package home_work_4.hw1;

import home_work_1.Convers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static home_work_1.Convers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversTest {
    private final Convers convers = new Convers();
    @Test
    @DisplayName("Проверка работы метода byteOf")
   public void convers1(){
        assertEquals("Ваше число в байтах = 204800",convers.byteOf(200));
    }
    @Test
    @DisplayName("Проверка работы метода kilobyte")
    public void convers2(){
        assertEquals("Ваше число в килобайтах  = 2000",convers.kilobyte(2048000));
    }

}
