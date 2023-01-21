package home_work_8.creatorSound;

import home_work_8.Creator.CreatorSound;

public class ISeeYou extends CreatorSound {
    private String group = "Creator";
    private String nam = "I See You";
    private String genre = "Metal";
    private String mood = "HardWork";
    private int duration = 400;

    public String getGenre() {
        return genre;
    }

    public String getMood() {
        return mood;
    }

    @Override
    public String toString() {
        return "ISeeYou{" +
                "group='" + group + '\'' +
                ", nam='" + nam + '\'' +
                ", genre='" + genre + '\'' +
                ", mood='" + mood + '\'' +
                ", duration=" + duration +
                '}';
    }
}
