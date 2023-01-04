package additional.lists;

import additional.lists.api.IGeneratorNick;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Cat extends Animal implements IGeneratorNick {
    private Random rand = new Random();
    private String nick = "";
    private int age = 0;

    public Cat(int age){
        this.age = age;
    }
    public String getNick(){
        return this.nick;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public void getNewNickAll() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789";
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
        String[] array = new String[]{
                "Васька","Барсик","Мурзик","Черныш","Батон","Свинона","Жорж",
                "Пухлий","Лакшери","Элегант","Филя","Псих","Люцифер","Глиста"
        };
        nick += array[rand.nextInt(14)];
    }

    @Override
    public void getNewNickFile() {
        String filePath = "src/additional/lists/AnimalNick.txt";
        String content = "";
        String[] dataArray = new String[0];
        try(Reader reader = new FileReader(filePath)) {
            StringBuilder builder = new StringBuilder();
            int data;

            while ((data = reader.read()) != -1) {
                builder.append(Character.toString(data));
            }
            content = builder.toString();
            content = content.replaceAll(",", "");
            dataArray = content.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        nick = dataArray[rand.nextInt(dataArray.length)];
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
