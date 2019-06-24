
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class PatientDischarge_Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form PatientDischarge_Room
     */
    public PatientDischarge_Ward() {
        initComponents();
        setLocationRelativeTo(null);
        txtDischargeID.setVisible(true);
        txtAdmitID.setVisible(true);
    }
private void Reset()
{
    txtDischargeID.setText("");
    txtAdmitID.setText("");
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    PatientID.setText("");
    txtPatientName.setText("");
    txtBloodGroup.setText("");
    txtGender.setText("");
    txtDisease.setText("");
    txtAdmitDate.setText("");
    txtWardname.setText("");
    txtRemarks.setText("");
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDischargeID = new javax.swing.JTextField();
        txtAdmitID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        PatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtAdmitDate = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        txtWardname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Discharge Patient");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDischargeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDischargeIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtDischargeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 272, 77, -1));
        getContentPane().add(txtAdmitID, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 343, 77, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel1.setText("Discharge ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 246, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel2.setText("Admit ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 311, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel5.setText("Patient ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 23, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel6.setText("Patient Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 67, -1, -1));

        jLabel27.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel27.setText("Blood Group");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 157, -1, -1));

        jLabel28.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel28.setText("Remarks");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 453, -1, -1));

        PatientID.setEditable(false);
        getContentPane().add(PatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 23, 89, 21));

        txtPatientName.setEditable(false);
        getContentPane().add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 64, 193, -1));

        txtAdmitDate.setEditable(false);
        txtAdmitDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        getContentPane().add(txtAdmitDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 246, 120, -1));

        jLabel29.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel29.setText("Gender");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 112, -1, -1));

        txtGender.setEditable(false);
        getContentPane().add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 109, 193, -1));

        txtBloodGroup.setEditable(false);
        getContentPane().add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 154, 193, -1));

        jLabel31.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel31.setText("Disease");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 213, -1, -1));

        jLabel32.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel32.setText("Admit Date");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 249, -1, -1));

        jLabel33.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel33.setText("Ward Name");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 294, -1, -1));

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel34.setText("Doctor ID");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 336, -1, -1));

        jLabel35.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel35.setText("Doctor Name");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 403, -1, -1));

        txtDisease.setEditable(false);
        getContentPane().add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 213, 193, -1));

        txtDoctorID.setEditable(false);
        getContentPane().add(txtDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 336, 75, -1));

        txtDoctorName.setEditable(false);
        getContentPane().add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 400, 209, -1));

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane3.setViewportView(txtRemarks);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 453, 232, 104));

        txtWardname.setEditable(false);
        getContentPane().add(txtWardname, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 291, 120, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText(">");
        jButton1.setPreferredSize(new java.awt.Dimension(41, 21));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 25, -1, -1));

        btnNew.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 23, 97, -1));

        btnSave.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 61, 97, -1));

        btnDelete.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 99, 97, -1));

        btnUpdate.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 137, 97, -1));

        btnGetData.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnGetData.setText("Get Data");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnGetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 175, 97, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        PatientAdmit_WardRecord1 frm = new PatientAdmit_WardRecord1();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
   try{
            con=Connect.ConnectDB();
              if (PatientID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPatientName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtGender.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtBloodGroup.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDisease.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve disease","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtAdmitDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve admit date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter retrieve doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDischargeID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter retrieve doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtAdmitID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter retrieve doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }

              Statement stmt;
       stmt= con.createStatement();
       String sql1="Select admitID from DischargePatient_Ward where AdmitID= " + txtAdmitID.getText() + "";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
     
            String sql= "insert into DischargePatient_Ward(AdmitID,DischargeDate,DP_Remarks,DischargeID)values("+ txtAdmitID.getText() + ",curdate(),'"+ txtRemarks.getText()+"',"+txtDischargeID.getText() + ")";

            pst=con.prepareStatement(sql);
            pst.execute();
            String sql3= "update Ward set NoOfBeds=NoOfBeds+1 where Wardname='" + txtWardname.getText() + "'";
            pst=con.prepareStatement(sql3);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully discharged","Patient",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from DischargePatient_Ward where DischargeID = " + txtDischargeID.getText() + "";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try{
            con=Connect.ConnectDB();
       
            String sql= "update DischargePatient_Ward set AdmitID="+ txtAdmitID.getText() + ",DischargeDate=curdate(),DP_Remarks='"+ txtRemarks.getText() + "' where ID= " + txtDischargeID.getText() + "";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
    this.hide();
        PatientDischargeRecord_Ward frm= new PatientDischargeRecord_Ward();
        frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void txtDischargeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDischargeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDischargeIDActionPerformed

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
            java.util.logging.Logger.getLogger(PatientDischarge_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDischarge_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDischarge_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDischarge_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDischarge_Room().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField PatientID;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JFormattedTextField txtAdmitDate;
    public javax.swing.JTextField txtAdmitID;
    public javax.swing.JTextField txtBloodGroup;
    public javax.swing.JTextField txtDischargeID;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextArea txtRemarks;
    public javax.swing.JTextField txtWardname;
    // End of variables declaration//GEN-END:variables
}