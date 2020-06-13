/*
 * This page is the login frame
 */
package java_system;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *The login page that takes the login details to decide which user is logged in based on the entries in the database and log in fields, if specific combination is entered will go to recovery page for the system.
 * Also establishes JDBC connection
 */
public class loginFrame extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int mousepX;
    int mousepY;
    
    public loginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_system/images/login_airplane.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 420));

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldPassword.setBackground(new java.awt.Color(32, 33, 35));
        jTextFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPassword.setBorder(null);
        jTextFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 237, -1));

        jTextFieldUsername.setBackground(new java.awt.Color(32, 33, 35));
        jTextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setBorder(null);
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 237, -1));

        jButtonLogin.setBackground(new java.awt.Color(32, 33, 35));
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLoginKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 240, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 240, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 240, 20));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CREATED BY RUNTIME TERROR (TEAM 14)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 270, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 73, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 370, 420));

        jPanel15.setBackground(new java.awt.Color(247, 247, 247));
        jPanel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel15MouseDragged(evt);
            }
        });
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel15MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(41, 76, 113));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(682, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A button on screen which execute SQL query which selects from staff table where username and password is equal to textField to log in depending on their role
     * 
     * 
     * @param evt Generated when jButton is pressed which is to every ActionListener object
     */
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        //Emergency restore function username and password. Putting them in would take
        //the user to the restore page.
        if(jTextFieldUsername.getText().toString().equals("123456789") &&
            jTextFieldPassword.getText().toString().equals("123456789")){
            Restore ta =new Restore();
            ta.setVisible(true);
            ta.pack();
            ta.setLocationRelativeTo(null); //puts in the center of the screen
            //  sls.setDefultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); //hides previos page
        }else{

            try{
                String query = "SELECT * FROM `staff` WHERE username =? and password=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost/java_system_db", "root", "");
                pst = con.prepareStatement(query);
                pst.setString(1,jTextFieldUsername.getText());
                pst.setString(2,jTextFieldPassword.getText());
                rs = pst.executeQuery();
                updateCommissionAndExchange();
                if(rs.next()){

                    switch (rs.getString("role")) {
                        case "System_Administrator":
                        systemAdmin admin = new systemAdmin(rs.getString("staffID"),rs.getString("firstName"),rs.getString("role"));
                        admin.setVisible(true);
                        this.setVisible(false);
                        admin.setLocationRelativeTo(null);
                        break;
                        case "Office_Manager":
                        officeManager manager = new officeManager(rs.getString("staffID"),rs.getString("firstName"),rs.getString("role"));
                        manager.setVisible(true);
                        this.setVisible(false);
                        manager.setLocationRelativeTo(null);
                        break;
                        default:
                        travelAd advisor = new travelAd(rs.getString("staffID"),rs.getString("firstName"),rs.getString("role"));
                        advisor.setVisible(true);
                        this.setVisible(false);
                        advisor.setLocationRelativeTo(null);
                        break;
                    }

                }
                else{
                    JOptionPane.showMessageDialog(this, "Username and Password doesn't match");}
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());}
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanel15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseDragged
        int cordX= evt.getXOnScreen();
        int cordY = evt.getYOnScreen();

        this.setLocation(cordX-mousepX, cordY-mousepY);
    }//GEN-LAST:event_jPanel15MouseDragged

    private void jPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel15MousePressed

    private void jButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoginKeyPressed

    }//GEN-LAST:event_jButtonLoginKeyPressed

    private void jTextFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            //Emergency restore function username and password. Putting them in would take
        //the user to the restore page.
        if(jTextFieldUsername.getText().toString().equals("123456789") &&
            jTextFieldPassword.getText().toString().equals("123456789")){
            Restore ta =new Restore();
            ta.setVisible(true);
            ta.pack();
            ta.setLocationRelativeTo(null); //puts in the center of the screen
            //  sls.setDefultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); //hides previos page
        }else{

            try{
                String query = "SELECT * FROM `staff` WHERE username =? and password=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost/java_system_db", "root", "");
                pst = con.prepareStatement(query);
                pst.setString(1,jTextFieldUsername.getText());
                pst.setString(2,jTextFieldPassword.getText());
                rs = pst.executeQuery();
                updateCommissionAndExchange();
                if(rs.next()){

                    switch (rs.getString("role")) {
                        case "System_Administrator":
                        systemAdmin admin = new systemAdmin(rs.getString("staffID"),rs.getString("firstName"),rs.getString("role"));
                        admin.setVisible(true);
                        this.setVisible(false);
                        admin.setLocationRelativeTo(null);
                        break;
                        case "Office_Manager":
                        officeManager manager = new officeManager(rs.getString("staffID"),rs.getString("firstName"),rs.getString("role"));
                        manager.setVisible(true);
                        this.setVisible(false);
                        manager.setLocationRelativeTo(null);
                        break;
                        default:
                        travelAd advisor = new travelAd(rs.getString("staffID"),rs.getString("firstName"),rs.getString("role"));
                        advisor.setVisible(true);
                        this.setVisible(false);
                        advisor.setLocationRelativeTo(null);
                        break;
                    }

                }
                else{
                    JOptionPane.showMessageDialog(this, "Username and Password doesn't match");}
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());}
        }
        }
    }//GEN-LAST:event_jTextFieldPasswordKeyPressed

    public void updateCommissionAndExchange(){
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
