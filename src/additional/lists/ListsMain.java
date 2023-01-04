package additional.lists;

import java.util.LinkedList;

public class ListsMain {
    public static void main(String[] args) {
        {
            Male male1 = new Male();
            male1.getNewNameAll();
            male1.getNewNickNameAll();
            System.out.println("Имя первого мужчины :" + male1.getName());
            System.out.println("Псевдоним первого мужчины :" + male1.getNickName());
        }
        {
            Male male2 = new Male();
            male2.getNewNameRus();
            male2.getNewNickNameRus();
            System.out.println("Имя второго мужчины :" + male2.getName());
            System.out.println("Псевдоним второго мужчины :" + male2.getNickName());
        }
        {
            Male male3 = new Male();
            male3.getNewNameReal();
            System.out.println("Имя третьего мужчины :" + male3.getName());
        }
        {
            Male male4 = new Male();
            male4.getNewNameFile();
            male4.getNewNickNameFile();
            System.out.println("Имя четвертого мужчины :" + male4.getName());
            System.out.println("Псевдоним четвертого мужчины :" + male4.getNickName());
        }
        System.out.println("----------------------------------------------");
        {
        }
        System.out.println("----------------------------------------------");
        {
            Cat cat1 = new Cat();
            cat1.getNewNickAll();
            System.out.println("Кличка первой кошки : " + cat1.getNick());
        }
        {
            Cat cat2 = new Cat();
            cat2.getNewNickRus();
            System.out.println("Кличка второй кошки : " + cat2.getNick());
        }
        {
            Cat cat3 = new Cat();
            cat3.getNewNickReal();
            System.out.println("Кличка третьей кошки : " + cat3.getNick());
        }
        {
            Cat cat4 = new Cat();
            cat4.getNewNickFile();
            System.out.println("Кличка четвертой кошки : " + cat4.getNick());
        }
        LinkedList list = new LinkedList();
        for (int i = 0; i < 1000000; i++) {
            list.add(new Male());
        }
        System.out.println(list);
    }
}
