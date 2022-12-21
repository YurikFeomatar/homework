package additional.testNew21_12_22;

import java.io.*;

public class TestMain {
    public static void main(String[] args) {
        String dirname = "C:/";
        File f1 = new File(dirname);
        DirectoryReader reader = new DirectoryReader();
        reader.fileReader(f1);
        System.out.println(reader.getResult());
    }
}
