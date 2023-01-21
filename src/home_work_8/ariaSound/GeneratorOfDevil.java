package home_work_8.ariaSound;

import home_work_8.aria.AriaSound;

public class GeneratorOfDevil extends AriaSound {
    private String group = "Aria";
    private String name = "Генератор зла";
    private String genre = "Rock";
    private String mood = "lirycs";

    public String getGenre() {
        return genre;
    }

    public String getMood() {
        return mood;
    }

    private int duration =  450;

    @Override
    public String toString() {
        return "GeneratorOfDevil{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", mood='" + mood + '\'' +
                ", duration=" + duration +
                '}';
    }
}
