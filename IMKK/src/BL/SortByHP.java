package BL;

import java.util.Comparator;

public class SortByHP implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getHp()>o2.getHp()) return -1;
        if(o1.getHp()<o2.getHp()) return 1;
        return 0;
    }

}
