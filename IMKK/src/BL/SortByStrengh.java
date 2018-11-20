package BL;

import java.util.Comparator;

public class SortByStrengh implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        int strength1 = o1.getAttack() + o1.getDefense();
        int strength2 = o2.getAttack() + o2.getDefense();
        if(strength1>strength2) return -1;
        if(strength1<strength2) return 1;
        return 0;
    }

}