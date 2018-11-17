package BL;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class CellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setFont(new Font("Carstellar", Font.BOLD, 24));
        Player pl = (Player) value;
        label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        if (isSelected) {
            label.setBackground(Color.blue);
            label.setForeground(Color.white);
        }
        switch (column) {
            case 0:
                if (pl instanceof Knight) {
                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Knight.png")));
                } else if (pl instanceof Orc) {
                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orc.png")));
                } else {
                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Mage.png")));
                }
                break;
            case 1:
                label.setText(pl.getName());
                break;
            case 2:
                label.setText(pl.getAttack() + "");
                break;
            case 3:
                label.setText(pl.getDefense() + "");
                break;
            case 4:
                if (pl.dead) {
                    label.setBackground(Color.red);
                    label.setForeground(Color.black);
                    label.setText("DEAD");
                } else {
                    label.setText(pl.getHp() + "");

                }
                break;
            case 5:
                JList list = new JList();
                DefaultListModel model = new DefaultListModel();
                list.setModel(model);
                list.setOpaque(true);
                list.setFont(new Font("Carstellar", Font.PLAIN, 14));
                if (isSelected) {
                    list.setBackground(Color.blue);
                    list.setForeground(Color.white);
                }
                for (Item item : pl.getItems()) {
                    model.addElement(item);
                }
                list.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                return list;
        }
        return label;
    }

}
