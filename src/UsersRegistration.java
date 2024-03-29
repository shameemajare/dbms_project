
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
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

/**
 *
 * @author Raj
 */
public class UsersRegistration extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form UsersRegistration
     */
    public UsersRegistration() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private void Reset()
{
    txtName.setText("");
    txtUserName.setText("");
    txtPassword.setText("");
    txtEmailID.setText("");
    txtContactNo.setText("");
    Save.setEnabled(true);
    Delete.setEnabled(false);
    Update.setEnabled(false);
    txtUserName.requestDefaultFocus();
   
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        New = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        GetData = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Registration");
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(txtName);
        txtName.setBounds(132, 34, 212, 27);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(22, 39, 50, 20);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(17, 79, 90, 20);
        getContentPane().add(txtUserName);
        txtUserName.setBounds(132, 74, 212, 27);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(132, 115, 212, 27);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 120, 80, 20);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel4.setText("Email ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(25, 155, 80, 20);
        getContentPane().add(txtEmailID);
        txtEmailID.setBounds(132, 156, 212, 27);

        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });
        getContentPane().add(txtContactNo);
        txtContactNo.setBounds(132, 192, 212, 27);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel5.setText("Contact No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(24, 197, 100, 20);

        New.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        getContentPane().add(New);
        New.setBounds(377, 34, 101, 32);

        Save.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save);
        Save.setBounds(377, 73, 101, 32);

        Delete.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        Delete.setText("Delete");
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(377, 114, 101, 32);

        Update.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        Update.setText("Update");
        Update.setEnabled(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(377, 155, 101, 32);

        GetData.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        getContentPane().add(GetData);
        GetData.setBounds(377, 196, 101, 32);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 530, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
    Reset();
    }//GEN-LAST:event_NewActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
         try{
      con=Connect.ConnectDB();
       if (txtName.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
        if (txtUserName.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
        String Password= String.valueOf(txtPassword.getPassword());
         if (Password.equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
          if (txtContactNo.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
           return;
            }
          
       Statement stmt;
       stmt= con.createStatement();
       String sql1="Select username from Registration where Username= '" + txtUserName.getText() + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "User name already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtUserName.setText("");
        txtUserName.requestDefaultFocus();
       return;
   }
       String Password1= String.valueOf(txtPassword.getPassword());
       String sql= "insert into Registration(username,password,nameofuser,Email,ContactNo)values('"+ txtUserName.getText() + "','" + Password1 + "','" + txtName.getText() + "','" + txtEmailID.getText() + "','" + txtContactNo.getText() + "')";
      
      pst=con.prepareStatement(sql);
      pst.execute();
       String sql2= "insert into users(Username,User_Password)values('" + txtUserName.getText() + "','" + Password1 + "')";
      
      pst=con.prepareStatement(sql2);
      pst.execute();
      JOptionPane.showMessageDialog(this,"Successfully Registered","User",JOptionPane.INFORMATION_MESSAGE); 
      Save.setEnabled(false);
        }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
                }
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
          try
          {
        int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
     if (P==0)
     {
        con=Connect.ConnectDB();
       
        String sql= "delete from Registration where Username = '" + txtUserName.getText() + "'";
        pst=con.prepareStatement(sql);
        pst.execute();  
         String sql1= "delete from users where Username = '" + txtUserName.getText() + "'";
        pst=con.prepareStatement(sql1);
        pst.execute(); 
        JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE); 
        Reset();
     }
      }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
                }
         
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
    try{
      con=Connect.ConnectDB();
     String Password1= String.valueOf(txtPassword.getPassword());
       String sql= "update Registration set Password='" + Password1 + "',NameOfUser='" + txtName.getText() + "',Email='" + txtEmailID.getText() + "',ContactNo='" + txtContactNo.getText() + "' where Username='" + txtUserName.getText() + "'";
      
      pst=con.prepareStatement(sql);
      pst.execute();
       String sql2= "update users set User_Password='" + Password1 + "' where UserName='" + txtUserName.getText() + "'";
      
      pst=con.prepareStatement(sql2);
      pst.execute();
      JOptionPane.showMessageDialog(this,"Successfully updated","User info",JOptionPane.INFORMATION_MESSAGE); 
      Update.setEnabled(false);
        }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
                }
    }//GEN-LAST:event_UpdateActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
      this.hide();
      UsersRegistrationRecord frm = new UsersRegistrationRecord();
      frm.setVisible(true); 
    }//GEN-LAST:event_GetDataActionPerformed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
   char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtContactNoKeyTyped

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
            java.util.logging.Logger.getLogger(UsersRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UsersRegistration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Delete;
    private javax.swing.JButton GetData;
    private javax.swing.JButton New;
    public javax.swing.JButton Save;
    public javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtContactNo;
    public javax.swing.JTextField txtEmailID;
    public javax.swing.JTextField txtName;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
