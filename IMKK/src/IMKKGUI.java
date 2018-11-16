public class IMKKGUI extends javax.swing.JFrame {

    public IMKKGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        playerTable = new javax.swing.JTable();
        btFight = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
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

        playerMenu.setText("Player");

        addPlayer.setText("Add");
        playerMenu.add(addPlayer);

        deletePlayer.setText("Remove");
        playerMenu.add(deletePlayer);

        changePlayer.setText("Change");
        changePlayer.setToolTipText("");
        playerMenu.add(changePlayer);

        Menu.add(playerMenu);

        itemMenu.setText("Item");

        addItem.setText("Add");
        itemMenu.add(addItem);

        deleteItem.setText("Remove");
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFight, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JMenu itemMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu playerMenu;
    private javax.swing.JTable playerTable;
    // End of variables declaration//GEN-END:variables

}
