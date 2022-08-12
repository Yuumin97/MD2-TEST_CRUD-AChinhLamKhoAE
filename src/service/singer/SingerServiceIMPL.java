package service.singer;

import model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {

    public static List<Singer> singerList = new ArrayList<>();

    static {
        singerList.add(new Singer(1, "Đạt G", 27));
        singerList.add(new Singer(2, "Đức Daddy", 25));
        singerList.add(new Singer(3, "Mỹ Tâm", 37));
        singerList.add(new Singer(4, "Đức Phúc", 26));
        singerList.add(new Singer(5, "Sơn MTP", 27));
        singerList.add(new Singer(6, "Đàm Vĩnh Hưng",47));
        singerList.add(new Singer(7, "Erik", 23));
    }


    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public void save(Singer e) {
        singerList.add(e);
    }

    @Override
    public void deleteById(int id) {
        singerList.remove(id - 1);
        updateId();
    }

    @Override
    public Singer findById(int id) {
        return singerList.get(id - 1);
    }

    public void sort() {
        Collections.sort(singerList);
        updateId();
    }

    public void updateId() {
        for (int i = 0; i < singerList.size(); i++) {
            singerList.get(i).setId(i + 1);
        }
    }
}
