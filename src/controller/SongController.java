package controller;


import model.Song;
import service.song.ISongService;
import service.song.SongServiceMPL;
import java.util.List;

public class SongController{
    private final ISongService songService = new SongServiceMPL();

    public List<Song> getSong(){ return  songService.findAll();}

    public void addSong(Song song) {songService.save(song);}

    public void deleteSong(int id) {
        songService.deleteById(id);
    }

    public Song findSongById(int id) {
        return songService.findById(id);
    }

    public void sortSongList() {
        songService.sort();
    }

}
