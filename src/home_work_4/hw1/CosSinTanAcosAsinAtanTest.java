package home_work_4.hw1;

import home_work_1.CosSinTanAcosAsinAtan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static home_work_1.CosSinTanAcosAsinAtan.*;
import static org.junit.jupiter.api.Assertions.*;

public class CosSinTanAcosAsinAtanTest{
    private final CosSinTanAcosAsinAtan triganom = new CosSinTanAcosAsinAtan();
    @Test
    @DisplayName("Проверка работы метода sin")
    public void cosSinTanAcosAsinAtanTest1(){
        assertEquals("синус 30 = -0.9880316240928618 радиан",triganom.sin(30));
    }
    @Test
    @DisplayName("Проверка работы метода sin ")
    public void cosSinTanAcosAsinAtanTest2(){
        assertEquals("синус 114 = 0.7849803886813105 радиан",triganom.sin(114));
    }
    @Test
    @DisplayName("Проверка работы метода cos ")
    public void cosSinTanAcosAsinAtanTest3(){
        assertEquals("косинус 0 = 1.0 радиан",triganom.cos(0));
    }
    @Test
    @DisplayName("Проверка работы метода cos на неравенсто ")
    public void cosSinTanAcosAsinAtanTest4(){
        assertNotEquals("косинус 0 = 1.0 радиан",triganom.cos(360));
    }
    @Test
    @DisplayName("Проверка работы метода tan на равенсто ")
    public void cosSinTanAcosAsinAtanTest5(){
        assertEquals("тангенс 360 = -3.380140413960958 радиан",triganom.tan(360));
    }
    @Test
    @DisplayName("Проверка работы метода asin на равенсто ")
    public void cosSinTanAcosAsinAtanTest6(){
        assertEquals("арксинус 54 = -0.592924888973515 радиан",triganom.asin(54));
    }
    @Test
    @DisplayName("Проверка работы метода acos на равенсто ")
    public void cosSinTanAcosAsinAtanTest7(){
        assertEquals("арккосинус 67 = 2.115038378975451 радиан",triganom.acos(67));
    }
    @Test
    @DisplayName("Проверка работы метода atan на равенсто ")
    public void cosSinTanAcosAsinAtanTest8(){
        assertEquals("арктангенс 125 = -0.6637061435917295 радиан",triganom.atan(125));
    }
}
