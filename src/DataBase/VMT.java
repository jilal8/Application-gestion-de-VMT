
package DataBase;


import ApplicationGestionVmt.BDD;
import ApplicationGestionVmt.Parametres;
import ApplicationGestionVmt.ResultSetTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jilalhassanjilal
 */
public class VMT extends javax.swing.JFrame {
BDD db;
 ResultSet rs;
    public VMT() {
   db = new BDD(new Parametres().HOST_DB, new Parametres().USERNAME_DB, new Parametres().PASSWORD_DB, 
           new Parametres().IPHOST, new Parametres().PORT);
        initComponents();
    }
    public void table(){
        String a[]={"id_vmt", "type_vmt", "QtStock"};
        rs=db.querySelect(a, "VMT");
        table_vmt.setModel(new ResultSetTableModel(rs));
    }
    public void actualiser(){
        id_txt.setText("");
        com_type.setSelectedItem("Type_VMT");
        txt_qt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        com_type = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_qt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_vmt = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        com_rech = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        rec_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 163, 177));
        jLabel1.setText("Gestion de VMT(Vechicul Mount Terminal)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 0, 590, 40);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 243, 243));
        jLabel2.setText("ID_VMT:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 240, 70, 30);
        getContentPane().add(id_txt);
        id_txt.setBounds(80, 240, 120, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 243, 243));
        jLabel3.setText("type_vmt:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 270, 80, 40);

        com_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type_VMT", "8055", "8255", "8525G2" }));
        getContentPane().add(com_type);
        com_type.setBounds(80, 280, 120, 27);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 243, 243));
        jLabel4.setText("Quantité Stock :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 230, 130, 50);
        getContentPane().add(txt_qt);
        txt_qt.setBounds(340, 240, 100, 27);

        jButton1.setBackground(new java.awt.Color(184, 218, 241));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(83, 11, 117));
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 140, 130, 60);

        jButton2.setBackground(new java.awt.Color(184, 218, 241));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(83, 11, 117));
        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 140, 110, 60);

        jButton3.setBackground(new java.awt.Color(184, 218, 241));
        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(83, 11, 117));
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 140, 110, 60);

        jButton4.setBackground(new java.awt.Color(184, 218, 241));
        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(83, 11, 117));
        jButton4.setText("Actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 140, 120, 60);

        table_vmt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id_vmt", "type_vmt", "QtStock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_vmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_vmtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_vmt);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 40, 540, 80);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 243, 243));
        jLabel5.setText("Rechercher par categories :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 280, 250, 30);

        com_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_vmt", "type_vmt", "QtStock" }));
        getContentPane().add(com_rech);
        com_rech.setBounds(470, 280, 160, 30);

        jButton5.setBackground(new java.awt.Color(184, 218, 241));
        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(83, 11, 117));
        jButton5.setText("Rechercher");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(270, 310, 140, 50);
        getContentPane().add(rec_txt);
        rec_txt.setBounds(420, 320, 190, 30);

        jLabel6.setBackground(new java.awt.Color(23, 222, 85));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataBase/images/photo.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 660, 440);

        jMenu1.setText("File");

        jMenuItem1.setText("lancer");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("print");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("exite");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        actualiser(); table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(com_type.getSelectedItem().equals("type_vmt")||txt_qt.getText().equals("")){
     JOptionPane jo = new JOptionPane();
     int option = jo.showConfirmDialog(null,"You must complet the information","Warning",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
    String txt = txt_qt.getText();
    int res = Integer.parseInt(txt);
    if(res<0){
    JOptionPane.showConfirmDialog(null,"you can not enter a negatife number, only a positife number","warning",JOptionPane.OK_OPTION,JOptionPane.ERROR_MESSAGE);
    }
    
 }else{
     String colon[]={"type_vmt", "QtStock"};
     String inf[]={com_type.getSelectedItem().toString(), txt_qt.getText()};
     System.out.println(db.queryInsert("VMT", colon, inf));
 }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
String id = String.valueOf(table_vmt.getValueAt(table_vmt.getSelectedRow(),0));

    if(JOptionPane.showConfirmDialog(null,"are you realy sure to delete this", "Warning",JOptionPane.OK_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.OK_OPTION){

System.out.println(db.queryDelete("VMT","id_vmt="+ id));
    }
else{

return;

    }// TODO add your handling code here:
    
table();
    
}//GEN-LAST:event_jButton2ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton3ActionPerformed

    if(com_type.getSelectedItem().equals("type_vmt")||txt_qt.getText().equals("")){

        JOptionPane jo = new JOptionPane();

        jo.showConfirmDialog(null,"you must complet the informations before saving","Warning",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);

    }else{
    
String con[] = {"type_vmt", "Qtstock"};
   
 String inf[] = {com_type.getSelectedItem().toString(),txt_qt.getText()};
 
   String id = String.valueOf(table_vmt.getValueAt(table_vmt.getSelectedRow(),0));
 
  System.out.println(db.queryUpdate("VMT", con, inf, "id_vmt="+id));
  
 table();

   actualiser();

    }        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed


    private void table_vmtMouseClicked(java.awt.event.MouseEvent evt) {
//GEN-FIRST:event_table_vmtMouseClicked

       id_txt.setText(String.valueOf(table_vmt.getValueAt(table_vmt.getSelectedRow(),0)));

        com_type.setSelectedItem(String.valueOf(table_vmt.getValueAt(table_vmt.getSelectedRow(),1)));
  
     txt_qt.setText(String.valueOf(table_vmt.getValueAt(table_vmt.getSelectedRow(),2)));

    }//GEN-LAST:event_table_vmtMouseClicked


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton5ActionPerformed

if(rec_txt.getText().equals("")){

  JOptionPane jo = new JOptionPane();

jo.showConfirmDialog(null,"please enter anything to search","INFORMATION",
JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);

}else{
    
if(com_rech.getSelectedItem().equals("id_vmt")){

        rs=db.querySelectAll("VMT", "id_vmt LIKE '%"+rec_txt.getText()+"%'");

        table_vmt.setModel(new ResultSetTableModel(rs));
    
}else if(com_rech.getSelectedItem().equals("type_vmt")){

           rs=db.querySelectAll("VMT", "type_vmt LIKE '%"+rec_txt.getText()+"%'");

           table_vmt.setModel(new ResultSetTableModel(rs));
    
}else if(com_rech.getSelectedItem().equals("QtStock")){

    rs=db.querySelectAll("VMT", "QtStock LIKE '%"+rec_txt.getText()+"%'");

    table_vmt.setModel(new ResultSetTableModel(rs));
    
}

}
 
   
        
        
    }
//GEN-LAST:event_jButton5ActionPerformed


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jMenuItem2ActionPerformed
System.exit(0);
 
   }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> com_rech;
    private javax.swing.JComboBox<String> com_type;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rec_txt;
    private javax.swing.JTable table_vmt;
    private javax.swing.JTextField txt_qt;
    // End of variables declaration//GEN-END:variables
}
