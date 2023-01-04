package additional.lists;



import java.util.*;

public class ListsMain {
    public static void main(String[] args) {
        final Random rand = new Random();
        {
            Male male1 = new Male();
            male1.getNewNameAll();
            male1.getNewNickNameAll();
            System.out.println("Имя первого мужчины : " + male1.getName());
            System.out.println("Псевдоним первого мужчины : " + male1.getNickName());
        }
        {
            Male male2 = new Male();
            male2.getNewNameRus();
            male2.getNewNickNameRus();
            System.out.println("Имя второго мужчины : " + male2.getName());
            System.out.println("Псевдоним второго мужчины : " + male2.getNickName());
        }
        {
            Male male3 = new Male();
            male3.getNewNameReal();
            System.out.println("Имя третьего мужчины : " + male3.getName());
            System.out.println("Псевдоним третьего мужчины : " + male3.getNickName());
        }
        {
            Male male4 = new Male();
            male4.getNewNameFile();
            male4.getNewNickNameFile();
            System.out.println("Имя четвертого мужчины : " + male4.getName());
            System.out.println("Псевдоним четвертого мужчины : " + male4.getNickName());
        }
        System.out.println("----------------------------------------------");
        {
        }
        System.out.println("----------------------------------------------");
        {
            Cat cat1 = new Cat(rand.nextInt(20));
            cat1.getNewNickAll();
            System.out.println("Кличка первой кошки : " + cat1.getNick());
        }
        {
            Cat cat2 = new Cat(rand.nextInt(20));
            cat2.getNewNickRus();
            System.out.println("Кличка второй кошки : " + cat2.getNick());
        }
        {
            Cat cat3 = new Cat(rand.nextInt(20));
            cat3.getNewNickReal();
            System.out.println("Кличка третьей кошки : " + cat3.getNick());
        }
        {
            Cat cat4 = new Cat(rand.nextInt(20));
            cat4.getNewNickFile();
            System.out.println("Кличка четвертой кошки : " + cat4.getNick());
        }
        List <Person> list1 = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list1.add(new Male());
        }

        List <Animal> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(new Cat(rand.nextInt(20)));
        }
        System.out.println(list2);



        Set <Person> list3 = new HashSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            list3.add(new Male());
        }
    }
}
