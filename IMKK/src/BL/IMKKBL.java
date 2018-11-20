package BL;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;

public class IMKKBL extends AbstractTableModel {

    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Player> filtered = new ArrayList<>();
    private String[] colNames = {"Species", "Name", "Attack", "Defense", "HP", "Items", "Level"};
    private String[] xpcolNames = {"Species", "Name", "Attack", "Defense", "HP", "Items", "Level", "XP"};
    public static boolean showXP;

    public void filterByAlive(){
        filtered.clear();
        for (Player player : players) {
            if(!player.dead){
                filtered.add(player);
            }
        }
        update();
    }
    
    public void filterByType(int type){
        filtered.clear();
        for (Player player : players) {
            if(type == 0 && player instanceof Knight){
                filtered.add(player);
            } else if(type == 1 && player instanceof Orc){
                filtered.add(player);
            } else if(type == 2 && player instanceof Mage){
                filtered.add(player);
            }
        }
        update();
    }
    
    public void reset(){
        filtered.clear();
        for (Player player : players) {
            filtered.add(player);
        }
        update();
    }
    
    public void sortByHP() {
        Collections.sort(filtered, new SortByHP());
        update();
    }

    public void sortByLevel() {
        Collections.sort(filtered, new SortByLevel());
        update();
    }

    public void sortBYStrength() {
        Collections.sort(filtered, new SortByStrengh());
        update();
    }

    public void triggerXPcol() {
        showXP = !showXP;
        fireTableStructureChanged();
    }

    public void add(Player p) {
        filtered.add(p);
        players.add(p);
    }

    public void remove(int idx) {
        filtered.remove(idx);
        players.remove(idx);
    }

    public void load(File f) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try {
            Object o;
            while ((o = ois.readObject()) != null) {
                players.add((Player) o);
                filtered.add((Player) o);
            }
        } catch (EOFException eofExc) {
        }
        ois.close();
    }

    public void save(File f) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Player pl : players) {
            oos.writeObject(pl);
        }
        oos.flush();
        oos.close();
    }

    @Override
    public int getRowCount() {
        return filtered.size();
    }

    @Override
    public int getColumnCount() {
        if (showXP) {
            return xpcolNames.length;
        }
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return filtered.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        if (showXP) {
            return xpcolNames[column];
        }
        return colNames[column];
    }

    public void update() {
        fireTableDataChanged();
    }

}
