package BL;

import java.util.Comparator;

public class SortByLevel implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getLevel()>o2.getLevel()) return -1;
        if(o1.getLevel()<o2.getLevel()) return 1;
        return 0;
    }

}