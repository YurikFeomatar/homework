package home_work_4.hw1;

import home_work_1.CreatePhoneNumber;
import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CrateForNumberTest {
    private final ArraysUtils calc = new ArraysUtils();
    private final CreatePhoneNumber phone = new CreatePhoneNumber();
    @Test
    @DisplayName("тест на корректность работы")
    public void crateForNumberTest1(){

        int[] arr = calc.arrayRandom(10,10);
        Assertions.assertEquals(phone.createPhoneNumber(arr),phone.createPhoneNumber(arr));
    }
    @Test
    @DisplayName("тест на отрицательный размер массива")
    public void arrayRandom4(){
        Assertions.assertThrows(NegativeArraySizeException.class,()->{
            int[] arr = calc.arrayRandom(-1,21);
        });
    }
}
