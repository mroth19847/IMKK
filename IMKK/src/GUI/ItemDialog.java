package GUI;

import BL.Axe;
import BL.Item;
import BL.Player;
import BL.Shield;
import BL.Sword;

public class ItemDialog extends javax.swing.JDialog {

    private Player pl;
    private boolean rem;
    public ItemDialog(java.awt.Frame parent, boolean modal, boolean rem, Player pl) {
        super(parent, modal);
        initComponents();
        this.rem = rem;
        this.pl = pl;
        if(rem){
            lbtitle.setText("Remove Items to "+pl.getName()+"'s Inventory");
            for (Item i : pl.getItems()) {
                cbItem.addItem(i);
            }
        } else {
            lbtitle.setText("Add Items from "+pl.getName()+"'s Inventory");
            cbItem.addItem(new Sword());
            cbItem.addItem(new Axe());
            cbItem.addItem(new Shield());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbtitle = new javax.swing.JLabel();
        cbItem = new javax.swing.JComboBox<>();
        btok = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btok.setText("Ok");
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });

        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btok, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbItem, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbtitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btok, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
        if(rem){
            pl.removeItem((Item) cbItem.getSelectedItem());
        } else {
            pl.addItem((Item) cbItem.getSelectedItem());
        }
        IMKKGUI.bl.update();
        dispose();
    }//GEN-LAST:event_btokActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        dispose();
    }//GEN-LAST:event_btcancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btok;
    private javax.swing.JComboBox<Item> cbItem;
    private javax.swing.JLabel lbtitle;
    // End of variables declaration//GEN-END:variables

}
