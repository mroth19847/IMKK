
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class IMKKBL extends AbstractTableModel{

    private ArrayList<Player> players = new ArrayList<>();
    private String[] colNames = {"Type", "Name", "Attack", "Defense", "HP", "Items"};
    
    public void add(Player p){
        players.add(p);
        update();
    }
    
    public void remove(int idx){
        players.remove(idx);
        update();
    }

    @Override
    public int getRowCount() {
        return players.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return players.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    public void update(){
        fireTableDataChanged();
    }
    
    

}
