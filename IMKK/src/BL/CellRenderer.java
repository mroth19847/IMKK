package BL;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class CellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        Player pl = (Player) value;
        switch(column){
            case 0: 
                if(pl instanceof Knight){
                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Knight.png")));
                } else {
                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orc.png")));
                }
                break;
            case 1:
                label.setText(pl.getName());
                break;
            case 2:
                label.setText(pl.getAttack()+"");
                break;
            case 3:
                label.setText(pl.getDefense()+"");
                break;
            case 4:
                label.setText(pl.getHp()+"");
                break;
            case 5:
                JList list = new JList();
                DefaultListModel model = new DefaultListModel();
                list.setModel(model);
                for (Item item : pl.getItems()) {
                  model.addElement(item);  
                }
                return list;
        }
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        if(isSelected) label.setBackground(Color.blue);
        return label;
    }

}
