package service.song;

import model.Singer;
import model.Song;
import service.singer.SingerServiceIMPL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongServiceMPL implements ISongService{
    public static  final List<Song> songList = new ArrayList<>();
    public static  final List<Singer> singerList = new ArrayList<>();
    static {
        singerList.add(SingerServiceIMPL.singerList.get(0));
        singerList.add(SingerServiceIMPL.singerList.get(1));
    }

    static {
        songList.add(new Song(1,"Em yêu Đức Daddy"));
        songList.add(new Song(2, "Em của ngày hôm qua"));
        songList.add(new Song(3,"Họa My tóc nâu"));
        songList.add(new Song(4,"Lâu Đài tình ái"));
        songList.add(new Song(5,"Ghen"));
        songList.add(new Song(6,"Ánh Nắng Của Anh"));
        songList.add(new Song(7,"Ngày Đầu tiên"));
    }
    @Override
    public List<Song> findAll() {
        return songList;
    }

    @Override
    public void save(Song e) {
        songList.add(e);
    }

    @Override
    public void deleteById(int id) {
        songList.remove(id - 1);
        updateId();
    }

    @Override
    public Song findById(int id) {
        return songList.get(id - 1);
    }

    @Override
    public void sort() {

    }


    public void updateId() {
        for (int i = 0; i < songList.size(); i++) {
            songList.get(i).setId(i + 1);
        }
    }
}
