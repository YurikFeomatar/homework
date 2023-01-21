package home_work_8;

import java.util.Objects;

public class Sound {
    private String group;
    private String name;
    private String genre;
    private String mood;
    private int duration;

    @Override
    public String toString() {
        return "Sound{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", mood='" + mood + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sound sound = (Sound) o;
        return duration == sound.duration && Objects.equals(group, sound.group) && Objects.equals(name, sound.name) && Objects.equals(genre, sound.genre) && Objects.equals(mood, sound.mood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, name, genre, mood, duration);
    }
}
