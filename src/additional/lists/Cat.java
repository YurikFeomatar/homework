package additional.lists;

import additional.lists.api.IGeneratorNick;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;


public class Cat extends Animal implements IGeneratorNick {
    private String nick = "";
    private int age = 0;

    public String getNick(){
        return this.nick;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public void getNewNickAll() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();
        int length = rand.nextInt(10);
        if(length == 0){
            length = rand.nextInt(10);
        }
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            nick += String.valueOf(c);
        }
    }

    @Override
    public void getNewNickRus() {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Random rand = new Random();
        int length = rand.nextInt(10);
        if(length == 0){
            length = rand.nextInt(10);
        }
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            nick += String.valueOf(c);
        }
    }

    @Override
    public void getNewNickReal(){
        Random rand = new Random();
        String[] array = new String[]{
                "Васька","Барсик","Мурзик","Черныш","Батон","Свинона","Жорж",
                "Пухлий","Лакшери","Элегант","Филя","Псих","Люцифер","Глиста"
        };
        nick += array[rand.nextInt(14)];
    }

    @Override
    public void getNewNickFile() {
        String filePath = "AnimalNick.txt";

        String content = null;
        try {
            content = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        nick = content;
    }
    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        return reader.lines().collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(nick, cat.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}
