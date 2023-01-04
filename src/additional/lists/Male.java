package additional.lists;

import additional.lists.api.IGeneratorName;
import additional.lists.api.IGeneratorNickName;

import java.io.*;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class Male extends Person implements IGeneratorName, IGeneratorNickName {
    private Random rand = new Random();
    private String nickName = "";
    private String password = "";
    private String name = "";

    public Male(){
        //getNewNameReal();
        //getNewNickNameAll();
    }


    @Override
    public void getNewNameAll() {
        final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789";
        int length = rand.nextInt(10);
        if(length == 0){
            length = rand.nextInt(10);
        }
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            name += String.valueOf(c);
        }
    }

    @Override
    public void getNewNameRus() {
        final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        int length = rand.nextInt(10);
        if(length == 0){
            length = rand.nextInt(10);
        }
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            name += String.valueOf(c);
        }
    }

    @Override
    public void getNewNameReal() {
        final String[] array = new String[]{
                "Вася","Петя","Дима","Коля","Антон","Эдик","Жора",
                "Максим","Андрей","Витя","Филлип","Кирилл","Люцифер","Бонбон"
        };
        name += array[rand.nextInt(14)];
    }

    @Override
    public void getNewNameFile(){
        final String filePath = "src/additional/lists/PersonName.txt";
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
        name = dataArray[rand.nextInt(dataArray.length)];
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNewNickNameAll() {
        final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789";
        int length = rand.nextInt(10);
        if(length == 0){
            length = rand.nextInt(10);
        }
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            nickName += String.valueOf(c);
        }
    }

    @Override
    public void getNewNickNameRus() {
        final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        int length = rand.nextInt(10);
        if(length == 0){
            length = rand.nextInt(10);
        }
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            nickName += String.valueOf(c);
        }
    }

    @Override
    public void getNewNickNameFile() {
        final String filePath = "src/additional/lists/PersonName.txt";
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
        nickName = dataArray[rand.nextInt(dataArray.length)];
    }

    @Override
    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "Male{" +
                ", name='" + name + '\'' +
                "nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Male male = (Male) o;
        return Objects.equals(nickName, male.nickName) && Objects.equals(password, male.password) && Objects.equals(name, male.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, password, name);
    }
}
