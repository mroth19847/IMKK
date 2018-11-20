package BL;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class IMKKBL extends AbstractTableModel{

    private ArrayList<Player> players = new ArrayList<>();
    private String[] colNames = {"Species", "Name", "Attack", "Defense", "HP", "Items", "Level"};
    private String[] xpcolNames = {"Species", "Name", "Attack", "Defense", "HP", "Items", "Level", "XP"};
    private boolean showXP;
    
    public void triggerXPcol(){
        showXP = !showXP;
        fireTableStructureChanged();
    }
    
    public void add(Player p){
        players.add(p);
    }
    
    public void remove(int idx){
        players.remove(idx);
    }
    
    public void load(File f) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try{
            Object o;
            while((o = ois.readObject()) != null){
                players.add((Player) o);
            }
        } catch(EOFException eofExc){}
        ois.close();
    }
    
    public void save(File f) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Player pl : players) {
            oos.writeObject(pl);
        }
        oos.flush();
        oos.close();
    }

    @Override
    public int getRowCount() {
        return players.size();
    }

    @Override
    public int getColumnCount() {
        if(showXP){
            return xpcolNames.length;
        }
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return players.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        if(showXP){
            return xpcolNames[column];
        }
        return colNames[column];
    }
    
    public void update(){
        fireTableDataChanged();
    }
    
    

}
