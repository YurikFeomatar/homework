package home_work_8;

import home_work_8.Creator.CreatorSound;
import home_work_8.aria.AriaSound;
import home_work_8.ariaSound.GeneratorOfDevil;
import home_work_8.ariaSound.Unnamed;
import home_work_8.creatorSound.ISeeYou;
import home_work_8.utils.WriterFile;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scan =  new Scanner(System.in);
        final WriterFile writerFile = new WriterFile();
        final CreatorSound ISeeYou = new ISeeYou();
        final AriaSound generator  = new GeneratorOfDevil();
        final AriaSound unnamed = new Unnamed();
        Map < String, String> map = new HashMap<>();
        List<Sound> soundList = new ArrayList<>();


        PlayList playList1 = new PlayList("Aria and Creator","Rock",soundList);

        playList1.addSound("F:\\Yurik music\\Rod Stewart\\Rod Stewart - Sailing.mp3",soundList);
        System.out.println("playList" + playList1);

        soundList.add(ISeeYou);
        soundList.add(generator);
        soundList.add(unnamed);

        System.out.println("playList add" + playList1);

        String link = "F:\\projects\\homework\\src\\home_work_8\\add\\";
        try {
            writerFile.createFile(soundList,link + "result.txt");
        }catch (IOException | NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
