/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fee.management.system;

import static fee.management.system.Accountant_login.emailnotice;
import static fee.management.system.Admin_login.Admin_email;
import static fee.management.system.Admin_login.Admin_pass;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Syedd
 */
public class Admin_Settings extends javax.swing.JFrame {
Connection c;
Statement s;
ResultSet r;
   
   
    /**
     * Creates new form Admin_Settings
     */
    public Admin_Settings() {
        initComponents();
        
        try 
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        c=DriverManager.getConnection("jdbc:odbc:feemanagmenet_db","","");
        s=c.createStatement();
        
        //oldpass.setModel(dtm);
        
            
        } catch (Exception e) {
               //JOptionPane.showMessageDialog(this,e);
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

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        newpass = new javax.swing.JPasswordField();
        jButton9 = new javax.swing.JButton();
        oldpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        oldsa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        oldsq = new javax.swing.JComboBox();
        newsq = new javax.swing.JComboBox();
        newsa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Settings");

        jButton4.setText("Go to Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel1.setText("Admin Settings");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("Change Password");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Old Password");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("New Password");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Confirm Password");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("If you want to\nlogin without\npassword just\ndo empty both\nremaining\nfields");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(46, 46, 46))
                            .addComponent(cpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oldpass)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel6.setText("Change Password");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel7.setText("Change Security Question");

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setText("Change Question");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        oldsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldsaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("Old Question");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("New Question");

        oldsq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is Your Mother Name?", "What is Your Father Name?", "Your favourite Teacher?", "Your first Pet name?", "What is your Birthday?", "Your Birthday Month?", "Your Birthday Year?", "You Created this Account?" }));
        oldsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldsqActionPerformed(evt);
            }
        });

        newsq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is Your Mother Name?", "What is Your Father Name?", "Your favourite Teacher?", "Your first Pet name?", "What is your Birthday?", "Your Birthday Month?", "Your Birthday Year?", "You Created this Account?" }));

        newsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(newsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(newsa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(oldsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oldsa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(oldsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldsa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(newsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(newsa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton11)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(213, 213, 213))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(414, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        this.dispose();
        new Selection_Panel().setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        try {
            r=s.executeQuery("select * from admin where Email='"+Admin_login.Admin_email.getText()+"' and Password ='"+Admin_login.Admin_pass.getText()+"'");
        
                if(r.next())
                {
                    if(Admin_login.Admin_pass.getText().equals(oldpass.getText()))
                    {
                        if(newpass.getText().equals(cpass.getText()))
                        {
                          int result=s.executeUpdate("update admin\n" +
                                        "set email='"+Admin_email.getText()+"',\n" +
                                        "Password='"+newpass.getText()+"'\n" +                                        
                                        "where email='"+Admin_email.getText()+"'");
                    if(result>0)
                    {
                        JOptionPane.showMessageDialog(this,"Password Has been Changed");                        
                    }}else{
                            JOptionPane.showMessageDialog(this,"Password Do not Match");
                        }

                }else{
                        JOptionPane.showMessageDialog(this,"Old Password is incorrect");
                    }
                
                }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Invaild Login");
        }

        
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        try {
            r=s.executeQuery("select * from admin where Email='"+Admin_email.getText()+"' and Password ='"+Admin_pass.getText()+"'");
        
                if(r.next())
                {
                    if(oldsq.getSelectedItem().equals(r.getString(3)))
                    {
                        if(oldsa.getText().equals(r.getString(4)))
                        {
                          int result=s.executeUpdate("update admin\n" +
                                                        "set Email='"+Admin_email.getText()+"',\n" +
                                                        "sq='"+newsq.getSelectedItem()+"',\n" +
                                                        "sa='"+newsa.getText()+"'\n" +
                                                        "where Email='"+Admin_email.getText()+"'");
                    if(result>0)
                    {
                        JOptionPane.showMessageDialog(this,"Security Answer Has been Changed");                        
                    }else{
                            JOptionPane.showMessageDialog(this,"Security Answer not changed");
                        }
                        }else{
                            JOptionPane.showMessageDialog(this,"Old Security Answer is incorrect");
                        }

                }else{
                        JOptionPane.showMessageDialog(this,"Old Security Question is incorrect");
                    }
                
                }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void oldsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldsqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldsqActionPerformed

    private void oldsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldsaActionPerformed

    private void newsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newsaActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpass;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JTextField newsa;
    private javax.swing.JComboBox newsq;
    private javax.swing.JTextField oldpass;
    private javax.swing.JTextField oldsa;
    private javax.swing.JComboBox oldsq;
    // End of variables declaration//GEN-END:variables
}
