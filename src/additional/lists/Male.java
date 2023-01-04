package additional.lists;

import additional.lists.api.IGeneratorName;
import additional.lists.api.IGeneratorNickName;

import java.io.*;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class Male extends Person implements IGeneratorName, IGeneratorNickName {
    private String nickName = "";
    private String password = "";
    private String name = "";

    public Male(){
        getNewNameReal();
        getNewNickNameAll();
    }


    @Override
    public void getNewNameAll() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();
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
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Random rand = new Random();
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
        Random rand = new Random();
        String[] array = new String[]{
                "Вася","Петя","Дима","Коля","Антон","Эдик","Жора",
                "Максим","Андрей","Витя","Филлип","Кирилл","Люцифер","Бонбон"
        };
        name += array[rand.nextInt(14)];
    }

    @Override
    public void getNewNameFile(){
        String filePath = "PersonName.txt";

        String content = null;
        try {
            content = readFile(filePath);
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        name = content;
    }
    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        return reader.lines().collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNewNickNameAll() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();
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
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        Random rand = new Random();
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
        String filePath = "PersonName.txt";

        String content = null;
        try {
            content = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        nickName = content;
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
