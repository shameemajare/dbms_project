
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Ward
     */
    public Ward() {
        initComponents();
         con= Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
    private void Reset()
{
    txtWardName.setText("");
    txtCharges.setText("");
    cmbWardType.setSelectedIndex(-1);
    txtNoOfbeds.setText("");
    btnSave.setEnabled(true);
    btnDelete.setEnabled(false);
    btnUpdate.setEnabled(false);
    txtWardName.requestDefaultFocus();
    Get_Data();
}
 private void Get_Data(){
          String sql="select WardName as 'Ward Name',WardType as 'Ward Type',NoOfbeds as 'No Of Beds',Charges from Ward";
          try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         Room_table.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Room_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCharges = new javax.swing.JTextField();
        txtNoOfbeds = new javax.swing.JTextField();
        cmbWardType = new javax.swing.JComboBox();
        txtWardName = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ward");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Room_table.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        Room_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ward Name", "Ward Type", "No. Of Beds", "Charges"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Room_table.getTableHeader().setReorderingAllowed(false);
        Room_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Room_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Room_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 221, 590, 187));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel1.setText("Ward Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel2.setText("Ward Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 69, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel3.setText("No. Of Beds");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel4.setText("Charges per bed");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 165, -1, 14));

        txtCharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChargesKeyTyped(evt);
            }
        });
        getContentPane().add(txtCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 159, 84, -1));

        txtNoOfbeds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoOfbedsKeyTyped(evt);
            }
        });
        getContentPane().add(txtNoOfbeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 111, 84, -1));

        cmbWardType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Special" }));
        cmbWardType.setSelectedIndex(-1);
        getContentPane().add(cmbWardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 66, 111, -1));
        getContentPane().add(txtWardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 21, 111, -1));

        btnNew.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 21, 107, 27));

        btnSave.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 57, 107, -1));

        btnUpdate.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 98, 107, -1));

        btnDelete.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 139, 107, -1));

        btnGetData.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnGetData.setText("Get Data");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnGetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 180, 107, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            con=Connect.ConnectDB();
            if (txtWardName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter ward name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbWardType.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select ward type","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtNoOfbeds.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter no. of beds","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select Wardname from Ward where Wardname= '" + txtWardName.getText() + "'";
            rs=stmt.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "ward name already exists","Error", JOptionPane.ERROR_MESSAGE);
                txtWardName.setText("");
                txtWardName.requestDefaultFocus();
                return;
            }

            String sql= "insert into Ward(Wardname,wardType,NoOfBeds,Charges)values('"+ txtWardName.getText() + "','"+ cmbWardType.getSelectedItem() + "'," + txtNoOfbeds.getText() + "," + txtCharges.getText() + ")";
            pst=con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(this,"Successfully saved","Ward Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);
            Get_Data();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            con=Connect.ConnectDB();
            String sql= "update Ward set Wardtype='"+ cmbWardType.getSelectedItem() + "',NoOfBeds=" + txtNoOfbeds.getText() + ",Charges=" + txtCharges.getText() + " where Wardname='" + txtWardName.getText() + "'";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Room Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);
            Get_Data();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try
        {
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();

                String sql= "delete from Ward where wardname = '" + txtWardName.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
        Get_Data();
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void Room_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Room_tableMouseClicked
        try{
            con=Connect.ConnectDB();
            int row= Room_table.getSelectedRow();
            String table_click= Room_table.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Ward where wardname = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){

                String add1=rs.getString("Wardname");
                txtWardName.setText(add1);
                String add2=rs.getString("Wardtype");
                cmbWardType.setSelectedItem(add2);
                int add3 = rs.getInt("NoOfBeds");
                String add4= Integer.toString(add3);
                txtNoOfbeds.setText(add4);
                 int add5 = rs.getInt("Charges");
                String add6= Integer.toString(add5);
                txtCharges.setText(add6);
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
                btnSave.setEnabled(false);

            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_Room_tableMouseClicked

    private void txtChargesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChargesKeyTyped
        char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtChargesKeyTyped

    private void txtNoOfbedsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfbedsKeyTyped
       char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtNoOfbedsKeyTyped

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ward().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Room_table;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbWardType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCharges;
    private javax.swing.JTextField txtNoOfbeds;
    private javax.swing.JTextField txtWardName;
    // End of variables declaration//GEN-END:variables
}
