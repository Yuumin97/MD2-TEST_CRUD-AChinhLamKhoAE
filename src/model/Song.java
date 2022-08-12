package model;

import java.util.ArrayList;
import java.util.List;

public class Song implements Comparable<Song>, CompareTo {
    private int id;
    private int listen;
    private int like;
    private String name;
    private List<Singer> singer = new ArrayList<>();
    public Song(int id, String name){
        this.id = id;
        this.name = name;


    }
    public void getSinger(List<Singer> singer){
        this.singer = singer;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getListen() {
        return listen;
    }

    public void setListen(int listen) {
        this.listen = listen;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song() {
        super();
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listen=" + listen + '\''+
                ", like=" + like +
                '}';
    }

    @Override
    public int compareTo(Song o) {

        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        } else {
            return this.listen - o.listen;
        }
    }
}

