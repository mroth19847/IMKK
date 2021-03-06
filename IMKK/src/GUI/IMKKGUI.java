package GUI;

import BL.CellRenderer;
import BL.IMKKBL;
import BL.Player;
import java.io.File;
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
        xpMenu = new javax.swing.JMenu();
        showXP = new javax.swing.JMenuItem();
        sortMenu = new javax.swing.JMenu();
        sortByHp = new javax.swing.JMenuItem();
        sortByXp = new javax.swing.JMenuItem();
        sortByStrengh = new javax.swing.JMenuItem();
        filterMenu = new javax.swing.JMenu();
        filterAlive = new javax.swing.JMenuItem();
        filterKnight = new javax.swing.JMenuItem();
        filterOrc = new javax.swing.JMenuItem();
        filterMage = new javax.swing.JMenuItem();
        resetFilter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMKK");
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

        btFight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fight.png"))); // NOI18N
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

        xpMenu.setText("XP");

        showXP.setText("Show / Decline XP");
        showXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showXPActionPerformed(evt);
            }
        });
        xpMenu.add(showXP);

        Menu.add(xpMenu);

        sortMenu.setText("Sort");

        sortByHp.setText("Sort By HP");
        sortByHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByHpActionPerformed(evt);
            }
        });
        sortMenu.add(sortByHp);

        sortByXp.setText("Sort By Level");
        sortByXp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByXpActionPerformed(evt);
            }
        });
        sortMenu.add(sortByXp);

        sortByStrengh.setText("Sort By Strength");
        sortByStrengh.setToolTipText("");
        sortByStrengh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByStrenghActionPerformed(evt);
            }
        });
        sortMenu.add(sortByStrengh);

        Menu.add(sortMenu);

        filterMenu.setText("Filter");

        filterAlive.setText("Show Alive");
        filterAlive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterAliveActionPerformed(evt);
            }
        });
        filterMenu.add(filterAlive);

        filterKnight.setText("Show Knights");
        filterKnight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterKnightActionPerformed(evt);
            }
        });
        filterMenu.add(filterKnight);

        filterOrc.setText("Show Orcs");
        filterOrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterOrcActionPerformed(evt);
            }
        });
        filterMenu.add(filterOrc);

        filterMage.setText("Show Mages");
        filterMage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterMageActionPerformed(evt);
            }
        });
        filterMenu.add(filterMage);

        resetFilter.setText("Reset Filter");
        resetFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFilterActionPerformed(evt);
            }
        });
        filterMenu.add(resetFilter);

        Menu.add(filterMenu);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        try {
            bl.save(new File("./players.ser"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error accured while trying to save the current game!");
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed
        try {
            bl.load(new File("./players.ser"));
            bl.update();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error accured while trying to load the game!");
        }
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
            bl.update();
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
            if (getPlayerAtIndex(sel).getItemCount() >= 2) {
                JOptionPane.showMessageDialog(null, "A player can't carry more than two items!");
            } else {
                ItemDialog dlg = new ItemDialog(this, true, false, getPlayerAtIndex(sel));
                dlg.setVisible(true);
            }
        }
    }//GEN-LAST:event_addItemActionPerformed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        int sel = playerTable.getSelectedRow();
        if (sel > -1) {
            if (getPlayerAtIndex(sel).getItemCount() <= 0) {
                JOptionPane.showMessageDialog(null, "This player doesn't have any items!");
            } else {
                ItemDialog dlg = new ItemDialog(this, true, false, getPlayerAtIndex(sel));
                dlg.setVisible(true);
            }
            ItemDialog dlg = new ItemDialog(this, true, true, getPlayerAtIndex(sel));
            dlg.setVisible(true);
        }
    }//GEN-LAST:event_deleteItemActionPerformed

    private void btFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFightActionPerformed
        int[] sel = playerTable.getSelectedRows();
        if (sel.length != 2) {
            JOptionPane.showMessageDialog(null, "For fighting two players have to be selected!");
        } else {
            try {
                Player winner = getPlayerAtIndex(sel[0]).fight(getPlayerAtIndex(sel[1]));
                JOptionPane.showMessageDialog(null, "The Fight is over!\n" + winner.getName() + " won!");
                bl.update();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btFightActionPerformed

    private void showXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showXPActionPerformed
        bl.triggerXPcol();
    }//GEN-LAST:event_showXPActionPerformed

    private void sortByHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByHpActionPerformed
        bl.sortByHP();
    }//GEN-LAST:event_sortByHpActionPerformed

    private void sortByXpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByXpActionPerformed
        bl.sortByLevel();
    }//GEN-LAST:event_sortByXpActionPerformed

    private void sortByStrenghActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByStrenghActionPerformed
        bl.sortBYStrength();
    }//GEN-LAST:event_sortByStrenghActionPerformed

    private void filterOrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterOrcActionPerformed
        bl.filterByType(1);
    }//GEN-LAST:event_filterOrcActionPerformed

    private void filterAliveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterAliveActionPerformed
        bl.filterByAlive();
    }//GEN-LAST:event_filterAliveActionPerformed

    private void filterKnightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterKnightActionPerformed
        bl.filterByType(0);
    }//GEN-LAST:event_filterKnightActionPerformed

    private void filterMageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterMageActionPerformed
        bl.filterByType(2);
    }//GEN-LAST:event_filterMageActionPerformed

    private void resetFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFilterActionPerformed
        bl.reset();
    }//GEN-LAST:event_resetFilterActionPerformed

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
    private javax.swing.JMenuItem filterAlive;
    private javax.swing.JMenuItem filterKnight;
    private javax.swing.JMenuItem filterMage;
    private javax.swing.JMenu filterMenu;
    private javax.swing.JMenuItem filterOrc;
    private javax.swing.JMenu itemMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem loadFile;
    private javax.swing.JMenu playerMenu;
    private javax.swing.JTable playerTable;
    private javax.swing.JMenuItem resetFilter;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem showXP;
    private javax.swing.JMenuItem sortByHp;
    private javax.swing.JMenuItem sortByStrengh;
    private javax.swing.JMenuItem sortByXp;
    private javax.swing.JMenu sortMenu;
    private javax.swing.JMenu xpMenu;
    // End of variables declaration//GEN-END:variables

}
