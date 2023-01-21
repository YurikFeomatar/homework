package home_work_8;

import home_work_8.utils.WriterFile;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class PlayList {
    private String name;
    private String description;
    private List <String> listSounds;


    public PlayList(String name, String description, List listSounds){
        this.name = name;
        this.description = description;
        this.listSounds = listSounds;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", listSounds='" + listSounds + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayList playList = (PlayList) o;
        return Objects.equals(name, playList.name) && Objects.equals(description, playList.description) && Objects.equals(listSounds, playList.listSounds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, listSounds);
    }

    /**
     * создает новый Объект PlayList
     * @return возвращает новый Объект PlayList
     */
    public PlayList createNewPlaylist(){
        return new PlayList(name,description,listSounds);
    }

    /**
     * Добавляет в лист песню из источника
     * @param link ссылка на песню
     * @param list лист, в который хотим добавить песню
     * @return лист с песней
     */
    public List addSound(String link, List list){
        list.add(link);
        return list;
    }


}
