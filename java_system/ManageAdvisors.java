/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

/**
 *This java class has a table of advisors and a fields to update delete and save new staff users
 *
 */
public class ManageAdvisors extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    
    /**
     * Creates new form ManageAdvisors and establish JDBC connection
     */
    
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ManageAdvisors() {
        initComponents();
        ViewAdvisorTable.doClick();
    }
    
    /** Create new form ManageAdvisors
     * 
     * @param staffID sets staffID to StaffIDLabel to be displayed on ManageAdvisors page.
     * @param firstName sets firstName to StaffNameLabel to be displayed on ManageAdvisors page.
     * @param role  sets role to StaffRoleLabel to be displayed on ManageAdvisors page.
     */
    public ManageAdvisors(String staffID,String firstName, String role) {
        initComponents();
        StaffIDLabel.setText(staffID);
        StaffNameLabel.setText(firstName);
        StaffRoleLabel.setText(role);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldSurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextFieldAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextFieldTelephone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TextFieldUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextFieldPassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ComboBoxRole = new javax.swing.JComboBox<>();
        DOB = new org.jdesktop.swingx.JXDatePicker();
        UpdateButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        NameMessageLabel = new javax.swing.JLabel();
        TelephoneMessageLabel = new javax.swing.JLabel();
        SurnameMessageLabel = new javax.swing.JLabel();
        AddressMessageLabel = new javax.swing.JLabel();
        EmailMessageLabel = new javax.swing.JLabel();
        QuestionMark = new javax.swing.JLabel();
        PasswordMessageLabel = new javax.swing.JLabel();
        UsernameMessageLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AdvisorTable = new javax.swing.JTable();
        ViewAdvisorTable = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        StaffRoleLabel = new javax.swing.JLabel();
        StaffIDLabel = new javax.swing.JLabel();
        StaffNameLabel = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Edit Advisor");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 3, -1, -1));

        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 35, -1, -1));

        TextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameActionPerformed(evt);
            }
        });
        TextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldNameKeyReleased(evt);
            }
        });
        jPanel2.add(TextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 52, 191, -1));

        jLabel3.setText("Surname:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        TextFieldSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldSurnameKeyReleased(evt);
            }
        });
        jPanel2.add(TextFieldSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 200, -1));

        jLabel4.setText("Address:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        TextFieldAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldAddressKeyReleased(evt);
            }
        });
        jPanel2.add(TextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 400, -1));

        jLabel5.setText("Date Of Birth:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel6.setText("Telephone:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        TextFieldTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldTelephoneKeyReleased(evt);
            }
        });
        jPanel2.add(TextFieldTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 250, -1));

        jLabel7.setText("Email:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        TextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldEmailKeyReleased(evt);
            }
        });
        jPanel2.add(TextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 400, -1));

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        jLabel11.setText("Username:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        TextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldUsernameKeyReleased(evt);
            }
        });
        jPanel2.add(TextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 400, -1));

        jLabel12.setText("Password:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        TextFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldPasswordKeyReleased(evt);
            }
        });
        jPanel2.add(TextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 400, -1));

        jLabel13.setText("Role:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        ComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System_Administrator", "Office_Manager", "Travel_Advisor" }));
        jPanel2.add(ComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });
        jPanel2.add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        NameMessageLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        NameMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(NameMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 82, 191, 26));

        TelephoneMessageLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        TelephoneMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(TelephoneMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 250, 26));

        SurnameMessageLabel.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        SurnameMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(SurnameMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 201, 31));

        AddressMessageLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        AddressMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(AddressMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 340, 26));

        EmailMessageLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        EmailMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(EmailMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 189, 26));
        jPanel2.add(QuestionMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 9, -1, -1));

        PasswordMessageLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        PasswordMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(PasswordMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 170, 26));

        UsernameMessageLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        UsernameMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(UsernameMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 150, 26));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 500));

        AdvisorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StaffID", "Name", "Surname", "Address", "Email", "Telephone", "Date", "Username", "Password", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        AdvisorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdvisorTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(AdvisorTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 690, 480));

        ViewAdvisorTable.setText("View Advisor Table");
        ViewAdvisorTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAdvisorTableActionPerformed(evt);
            }
        });
        jPanel1.add(ViewAdvisorTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 690, -1));

        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Advisor Table:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 76, 113));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 20, -1));

        jLabel14.setForeground(java.awt.Color.black);
        jLabel14.setText("Manage Advisors");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1150, 560));

        jPanel5.setBackground(new java.awt.Color(41, 76, 113));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(54, 97, 144));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Home");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel10)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("System Admin");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Role:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 31, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Name:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Staff ID:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 10));

        jPanel15.setBackground(new java.awt.Color(252, 68, 69));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Log Out");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(80, 80, 80))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, -1));

        StaffRoleLabel.setForeground(java.awt.Color.white);
        StaffRoleLabel.setText("jLabel9");
        jPanel5.add(StaffRoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        StaffIDLabel.setForeground(java.awt.Color.white);
        StaffIDLabel.setText("jLabel8");
        jPanel5.add(StaffIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        StaffNameLabel.setForeground(java.awt.Color.white);
        StaffNameLabel.setText("jLabel9");
        jPanel5.add(StaffNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 560));

        jPanel14.setBackground(new java.awt.Color(238, 238, 238));
        jPanel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel14MouseDragged(evt);
            }
        });
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel14MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNameActionPerformed

    /** When user is typing in TextFieldName, if string is [a-z] and/or [A-Z] and is 2-50 characters, SaveButton is set to true, if not then SaveButton
     *  is set to false and NameMessageLabel display text.   
     */
    private void TextFieldNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{2,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TextFieldName.getText());
        if(!match.matches()){
            NameMessageLabel.setText("Name is incorrect");
            SaveButton.setEnabled(false);

        }
        else{
            NameMessageLabel.setText(null);
            SaveButton.setEnabled(true);

        }
    }//GEN-LAST:event_TextFieldNameKeyReleased

    /** When user is typing in TextFieldSurname, if string is [a-z] and/or [A-Z] and is 1-50 characters, SaveButton is set to true, if not then SaveButton
     *  is set to false and SurnameMessageLabel display text.
     */
    private void TextFieldSurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldSurnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{1,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TextFieldSurname.getText());
        if(!match.matches()){
            SurnameMessageLabel.setText("Surname is incorrect");
        }
        else{
            SurnameMessageLabel.setText(null);

        }
    }//GEN-LAST:event_TextFieldSurnameKeyReleased

    /**  When user is typing in TextFieldAddress, if string is [a-z] and/or [A-Z] and/or [0-9] and/or contains whitespace and is 1-50 characters,
     * SaveButton is set true, if not then SaveButton is set to false and AddressMessageLabel displays text. 
     */
    private void TextFieldAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldAddressKeyReleased

        String PATTERN = "^[a-zA-Z0-9\\s]{0,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TextFieldAddress.getText());
        if(!match.matches()){
            AddressMessageLabel.setText("Address is incorrect");
        }
        else{
            AddressMessageLabel.setText(null);

        }
    }//GEN-LAST:event_TextFieldAddressKeyReleased

    /** When user is typing in TextFieldTelephone, if string is [0-9] and between 11-12 characters then SaveButton is enabled to true, if not then SaveButton is enabled to false and 
     * TelephoneMessageLabel displays text.

     */
    private void TextFieldTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldTelephoneKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{11,12}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TextFieldTelephone.getText());
        if(!match.matches()){
            TelephoneMessageLabel.setText("Telephone is incorrect");
        }
        else{
            TelephoneMessageLabel.setText(null);

        }
    }//GEN-LAST:event_TextFieldTelephoneKeyReleased

    /** When user is typing in TextFieldEmail field, the string has to contain "@" and then "." and if wants to then another "."; if not then 
     * SaveButton is set to false and then EmailMessageLabel displays text.
     */
    private void TextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldEmailKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TextFieldEmail.getText());
        if(!match.matches()){
            EmailMessageLabel.setText("Email is incorrect");
        }
        else{
            EmailMessageLabel.setText(null);

        }
    }//GEN-LAST:event_TextFieldEmailKeyReleased

    /** When JButton is pressed on, all textField is taken and inserted into staff table 
     * and all textField is emptied for next entry.
     * @param evt 
     */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        String firstName = TextFieldName.getText();
        String lastName = TextFieldSurname.getText();
        String address = TextFieldAddress.getText();

        String email = TextFieldEmail.getText();
        String username = TextFieldUsername.getText();
        String password = TextFieldPassword.getText();
        String role = (String)ComboBoxRole.getSelectedItem();
        String telephone = TextFieldTelephone.getText();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String bdate = dateFormat.format(DOB.getDate());

        PreparedStatement ps;
        String query = "INSERT INTO `staff`(`staffID`, `commisionRateID`, `firstName`, `lastName`, `username`, `password`, `DOB`, `email`, `telephone`, `role`,`address`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try{
            conn=MyConnection.getConnection();
            System.out.println("Get Connection");
            conn.setAutoCommit(false);
            ps=conn.prepareStatement(query);

            ps.setInt(1,(int) (Math.random() * ( 999-000)));
            ps.setInt(2,(int) (Math.random() * ( 999-000 )));
            ps.setString(3, firstName);
            ps.setString(4,lastName);
            ps.setString(5,username);
            ps.setString(6,password);
            ps.setString(7,bdate);
            ps.setString(8,email);
            ps.setString(9,telephone);
            ps.setString(10,role);
            ps.setString(11,address);

            TextFieldName.setText("");
            TextFieldSurname.setText("");
            TextFieldEmail.setText("");
            TextFieldAddress.setText("");

            TextFieldTelephone.setText("");
            TextFieldUsername.setText("");
            TextFieldPassword.setText("");
            ComboBoxRole.setSelectedIndex(0);
             
            conn.setAutoCommit(true);
            //conn.close();
            System.out.println("Close Connection");
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"Travel Advisor Created");
            }
            

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this,ex);

        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    /** When user is typing in TextFieldUsername, if string at least one lowercase letter, at least
     * one uppercase letter, at least one character symbol, and is between 8 to 40 characters then 
     * enable save button to true, if not then enable to false.
     * 
     * @param evt 
     */
    private void TextFieldUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldUsernameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TextFieldUsername.getText());
        if(!match.matches()){
            UsernameMessageLabel.setText("Username is incorrect");
        }
        else{
            UsernameMessageLabel.setText(null);

        }
    }//GEN-LAST:event_TextFieldUsernameKeyReleased

    /**  When user is typing in TextFieldPassword, if string at least one lowercase letter, at least
     * one uppercase letter, at least one character symbol, and is between 8 to 40 characters then 
     * enable save button to true, if not then enable to false.

     */
    private void TextFieldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldPasswordKeyReleased

        String PATTERN = "^((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TextFieldPassword.getText());
        if(!match.matches()){
            PasswordMessageLabel.setText("Password is incorrect");

        }
        else{
            PasswordMessageLabel.setText(null);

        }
    }//GEN-LAST:event_TextFieldPasswordKeyReleased

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed

    }//GEN-LAST:event_DOBActionPerformed

    /**  When JButton is clicked on, all of textField on ManageAdvisors page is declared to a variable and an SQL query is execute
     * which updates in the staff table
     * 
     * @param evt 
     */
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        try{
            String firstName = TextFieldName.getText();
            String lastName = TextFieldSurname.getText();
            String address = TextFieldAddress.getText();
            String telephone = TextFieldTelephone.getText();
            String email = TextFieldEmail.getText();
            String username= TextFieldUsername.getText();
            String password = TextFieldPassword.getText();
            String role = (String)ComboBoxRole.getSelectedItem();
            con=MyConnection.getConnection();
            System.out.println("Get Connection");
            String query = "update staff set firstName = '"+firstName+"', lastName = '"+lastName+"', telephone = '"+telephone+"',address = '"+address+"', email = '"+email+"', username = '"+username+"', password = '"+password+"',role = '"+role+"' where firstName ='"+firstName+"' ";
            con.setAutoCommit(false);
            pst = con.prepareStatement(query);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Updated");
            
            con.setAutoCommit(true);
            con.close();
            System.out.println("Close Connection");
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    /** When JButton is pressed on, it will select the row that is selected from CustomerTable and then SQL query is execute to delete it from the staff
     * table where staffID is equal the cell .
     * 
     * @param evt 
     */
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        int row = AdvisorTable.getSelectedRow();
        String cell = AdvisorTable.getModel().getValueAt(row,0).toString();
        String query = "DELETE FROM staff where staffID = " + cell;
        try{
            con.setAutoCommit(false);
            con=MyConnection.getConnection();
            System.out.println("Get Connection");
            pst = con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted Successful");
            con.close();
            System.out.println("Close Connection");
            con.setAutoCommit(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    /** When pressed on, a pop up message will show explaining what is included when
     * creating username and password for user using it.
     */
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Requirements for creating/editting advisor: \n"
            + "\n"
            + "Username and Password : \n"
            + " Must be between 8 and 40 character long \n"
            + " Contain at least one digit \n"
            + " Contain at least one upper case character \n"
            + " Contain at least on special character from [ @ # $ % ! . ]");
    }//GEN-LAST:event_jPanel2MousePressed

    /** When AdvisorTable is clicked on, table row value assigned and then SQL query is execute which selected from AdvisorTable where staffID is equal 
     * to table row which was assigned and then all textfield on current page will set to data from table.
     * 
     * @param evt 
     */
    private void AdvisorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdvisorTableMouseClicked
        // TODO add your handling code here:
        int row = AdvisorTable.getSelectedRow();
        String tc = AdvisorTable.getModel().getValueAt(row, 0).toString();
        Connection con=MyConnection.getConnection();
        System.out.println("Get Connection");
        try{
            String query = "SELECT * from staff where staffID=" +tc+"";
            con.setAutoCommit(false);
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)AdvisorTable.getModel();
            if(rs.next()){

                String firstName = (String)rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                //date
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String  role = rs.getString("role");

                String bdate = rs.getString("DOB");
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(bdate);

                TextFieldName.setText(firstName);

                TextFieldSurname.setText(lastName);
                TextFieldAddress.setText(address);
                TextFieldTelephone.setText(telephone);
                TextFieldEmail.setText(email);
                TextFieldUsername.setText(username);
                TextFieldPassword.setText(password);
                DOB.setDate(date);

            }
            con.setAutoCommit(true);
            con.close();
            System.out.println("Close Connection");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_AdvisorTableMouseClicked

    /**  When JButton is pressed on, SQL query is executed which staffID, firstName, lastName, address, email, 
     * telephone,DOB,username,password,role FROM staff and then is displayed in AdvisorTable.
     * 
     * @param evt 
     */
    private void ViewAdvisorTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAdvisorTableActionPerformed
            Connection con=null;
        try{

            String query = "SELECT staffID, firstName, lastName, address, email, telephone,DOB,username,password,role FROM staff";
            System.out.println("Get Connection");
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_system_db", "root", "");
            con.setAutoCommit(false);
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) AdvisorTable.getModel();
            tm.setRowCount(0);

            while (rs.next())
            {

                int staffID = rs.getInt("staffID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String bdate = rs.getString("DOB");
                String role = (String)ComboBoxRole.getSelectedItem();

                tm.addRow(new Object[]{staffID,firstName,lastName,address,email,telephone,bdate,username,password,role});

            }
            con.setAutoCommit(true);
            con.close();
            System.out.println("Close Connection");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_ViewAdvisorTableActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        systemAdmin admin = new systemAdmin(StaffIDLabel.getText(),
            StaffNameLabel.getText(),
            StaffRoleLabel.getText());
        admin.setVisible(true);
        this.setVisible(false);
        admin.setLocationRelativeTo(null);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(81, 135, 194));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(54,97,144));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        // TODO add your handling code here:
        loginFrame lf = new loginFrame();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        // TODO add your handling code here:
        jPanel15.setBackground(new Color(252, 116, 117));
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
        // TODO add your handling code here:
        jPanel15.setBackground(new Color(252,68,69));
    }//GEN-LAST:event_jPanel15MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseDragged
        int cordX= evt.getXOnScreen();
        int cordY = evt.getYOnScreen();

        this.setLocation(cordX-mousepX, cordY-mousepY);
    }//GEN-LAST:event_jPanel14MouseDragged

    private void jPanel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel14MousePressed

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
            java.util.logging.Logger.getLogger(ManageAdvisors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAdvisors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAdvisors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAdvisors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAdvisors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressMessageLabel;
    private javax.swing.JTable AdvisorTable;
    private javax.swing.JComboBox<String> ComboBoxRole;
    private org.jdesktop.swingx.JXDatePicker DOB;
    private javax.swing.JLabel EmailMessageLabel;
    private javax.swing.JLabel NameMessageLabel;
    private javax.swing.JLabel PasswordMessageLabel;
    private javax.swing.JLabel QuestionMark;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel StaffIDLabel;
    private javax.swing.JLabel StaffNameLabel;
    private javax.swing.JLabel StaffRoleLabel;
    private javax.swing.JLabel SurnameMessageLabel;
    private javax.swing.JLabel TelephoneMessageLabel;
    private javax.swing.JTextField TextFieldAddress;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldPassword;
    private javax.swing.JTextField TextFieldSurname;
    private javax.swing.JTextField TextFieldTelephone;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UsernameMessageLabel;
    private javax.swing.JButton ViewAdvisorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
