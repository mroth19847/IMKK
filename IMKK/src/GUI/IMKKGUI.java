package GUI;

import BL.CellRenderer;
import BL.IMKKBL;
import BL.Player;
import javax.swing.JOptionPane;

public class IMKKGUI extends javax.swing.JFrame {

    public static IMKKBL bl = new IMKKBL();

    public IMKKGUI() {
        initComponents();
        playerTable.setModel(bl);
        playerTable.setDefaultRenderer(Object.class, new CellRenderer());
        playerTable.setRowHeight(60);
    }

    private Player getPlayerAtIndex(int i) {
        return (Player) bl.getValueAt(i, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        playerTable = new javax.swing.JTable();
        btFight = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveFile = new javax.swing.JMenuItem();
        loadFile = new javax.swing.JMenuItem();
        playerMenu = new javax.swing.JMenu();
        addPlayer = new javax.swing.JMenuItem();
        deletePlayer = new javax.swing.JMenuItem();
        changePlayer = new javax.swing.JMenuItem();
        itemMenu = new javax.swing.JMenu();
        addItem = new javax.swing.JMenuItem();
        deleteItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        playerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(playerTable);

        btFight.setText("FIGHT");
        btFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFightActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        fileMenu.add(saveFile);

        loadFile.setText("Load");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileActionPerformed(evt);
            }
        });
        fileMenu.add(loadFile);

        Menu.add(fileMenu);

        playerMenu.setText("Player");

        addPlayer.setText("Add");
        addPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerActionPerformed(evt);
            }
        });
        playerMenu.add(addPlayer);

        deletePlayer.setText("Remove");
        deletePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlayerActionPerformed(evt);
            }
        });
        playerMenu.add(deletePlayer);

        changePlayer.setText("Change Name");
        changePlayer.setToolTipText("");
        changePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePlayerActionPerformed(evt);
            }
        });
        playerMenu.add(changePlayer);

        Menu.add(playerMenu);

        itemMenu.setText("Item");

        addItem.setText("Add");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });
        itemMenu.add(addItem);

        deleteItem.setText("Remove");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        itemMenu.add(deleteItem);

        Menu.add(itemMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(btFight, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFight, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFileActionPerformed

    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadFileActionPerformed

    private void addPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerActionPerformed
        PlayerDialog dlg = new PlayerDialog(this, true);
        dlg.setVisible(true);
        if (dlg.isOk()) {
            bl.add(dlg.getPl());
            bl.update();
        }
    }//GEN-LAST:event_addPlayerActionPerformed

    private void deletePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlayerActionPerformed
        int sel = playerTable.getSelectedRow();
        if (sel > -1) {
            bl.remove(sel);
        }
    }//GEN-LAST:event_deletePlayerActionPerformed

    private void changePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePlayerActionPerformed
        int sel = playerTable.getSelectedRow();
        if (sel > -1) {
            PlayerDialog dlg = new PlayerDialog(this, true);
            dlg.change(getPlayerAtIndex(sel));
            dlg.setVisible(true);
        }
    }//GEN-LAST:event_changePlayerActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        int sel = playerTable.getSelectedRow();
        if (sel > -1) {
            ItemDialog dlg = new ItemDialog(this, true, false, getPlayerAtIndex(sel));
            dlg.setVisible(true);
        }
    }//GEN-LAST:event_addItemActionPerformed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        int sel = playerTable.getSelectedRow();
        if (sel > -1) {
            ItemDialog dlg = new ItemDialog(this, true, true, getPlayerAtIndex(sel));
            dlg.setVisible(true);
        }
    }//GEN-LAST:event_deleteItemActionPerformed

    private void btFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFightActionPerformed
        int[] sel = playerTable.getSelectedRows();
        if (sel.length != 2){
            JOptionPane.showMessageDialog(null, "For fighting two players have to be selected!");
        } else {
            Player winner = getPlayerAtIndex(sel[0]).fight(getPlayerAtIndex(sel[1]));
            JOptionPane.showMessageDialog(null, "The Fight is over!\n"+winner.getName()+" won!");
            bl.update();
        }
    }//GEN-LAST:event_btFightActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IMKKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMKKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMKKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMKKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMKKGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem addItem;
    private javax.swing.JMenuItem addPlayer;
    private javax.swing.JButton btFight;
    private javax.swing.JMenuItem changePlayer;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JMenuItem deletePlayer;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu itemMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem loadFile;
    private javax.swing.JMenu playerMenu;
    private javax.swing.JTable playerTable;
    private javax.swing.JMenuItem saveFile;
    // End of variables declaration//GEN-END:variables

}
