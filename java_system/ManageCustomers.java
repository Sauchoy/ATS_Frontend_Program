
package java_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * This page has all customer information, also being able to create new customers
 * but also edit customer information. 
 */
public class ManageCustomers extends javax.swing.JFrame {
    
    int mousepX;
    int mousepY;

    /**
     * Creates new form ManageCustomers and establish JDBC connection.
     */
    
     Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /** Runs method doClick() to viewTableButton and also sets SaveButton to false meaning it is not able to be used.
     * 
     */
    public ManageCustomers() {
        initComponents();
       
    }
    
    /** Creates new form ManageCustomers
     * 
     * @param staffID sets staffID to StaffIDLabel to be displayed on ManageCustomers page.
     * @param firstName sets firstName to StaffNameLabel to be displayed on ManageCustomers page.
     * @param role  sets role to StaffRoleLabel to be displayed on ManageCustomers page.
     */
      public ManageCustomers(String staffID,String firstName, String role) {
        initComponents();
        StaffIDLabel.setText(staffID);
        StaffNameLabel.setText(firstName);
        StaffRoleLabel.setText(role);
        viewTableButton.doClick();
        SaveButton.setEnabled(false);
      }
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CreateCustomerNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CreateCustomerSurnameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CreateCustomerAddressField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CreateCustomerTelephone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CreateCustomerEmail = new javax.swing.JTextField();
        CreateCustomerDOBField = new org.jdesktop.swingx.JXDatePicker();
        CustomerID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CustomerIDLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        TelephoneLabel = new javax.swing.JLabel();
        FixedDiscountField = new javax.swing.JLabel();
        FlexibleDiscountField = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        SurnameLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CustomerType = new javax.swing.JComboBox<>();
        SaveButton = new javax.swing.JButton();
        discountRateIDField = new javax.swing.JTextField();
        customerIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        telephoneLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        DiscountRateIDLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        viewTableButton = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        StaffIDLabel = new javax.swing.JLabel();
        StaffNameLabel = new javax.swing.JLabel();
        StaffRoleLabel = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("View Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 1474, -1, -1));

        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Customer Table:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Customers");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 1439, -1, -1));

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CustomerID", "Name", "Surname", "Address", "Email", "Telephpne", "DOB", "IsValued", "DiscountRateID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 840, 430));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Edit Customer");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 0, -1, -1));

        CreateCustomerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCustomerNameFieldActionPerformed(evt);
            }
        });
        CreateCustomerNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CreateCustomerNameFieldKeyReleased(evt);
            }
        });
        jPanel2.add(CreateCustomerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, -1));

        jLabel5.setText("Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setText("Surname:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        CreateCustomerSurnameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CreateCustomerSurnameFieldMousePressed(evt);
            }
        });
        CreateCustomerSurnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCustomerSurnameFieldActionPerformed(evt);
            }
        });
        CreateCustomerSurnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CreateCustomerSurnameFieldKeyReleased(evt);
            }
        });
        jPanel2.add(CreateCustomerSurnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, -1));

        jLabel8.setText("DOB:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel9.setText("Address:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        CreateCustomerAddressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CreateCustomerAddressFieldKeyReleased(evt);
            }
        });
        jPanel2.add(CreateCustomerAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 230, -1));

        jLabel4.setText("Telephone");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        CreateCustomerTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCustomerTelephoneActionPerformed(evt);
            }
        });
        CreateCustomerTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CreateCustomerTelephoneKeyReleased(evt);
            }
        });
        jPanel2.add(CreateCustomerTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 230, -1));

        jLabel15.setText("Email");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        CreateCustomerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCustomerEmailActionPerformed(evt);
            }
        });
        CreateCustomerEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CreateCustomerEmailKeyReleased(evt);
            }
        });
        jPanel2.add(CreateCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 230, -1));
        jPanel2.add(CreateCustomerDOBField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, -1));

        CustomerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CustomerIDKeyReleased(evt);
            }
        });
        jPanel2.add(CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, -1));

        jLabel16.setText("CustomerID:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 472, -1, -1));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 88, 112, -1));

        CustomerIDLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CustomerIDLabelMousePressed(evt);
            }
        });
        jPanel2.add(CustomerIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 88, 149, 23));

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 418, 147, 33));

        TelephoneLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TelephoneLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(TelephoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 538, 163, 32));

        FixedDiscountField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FixedDiscountField.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(FixedDiscountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 708, 140, 30));

        FlexibleDiscountField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FlexibleDiscountField.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(FlexibleDiscountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 783, 165, 31));
        jPanel2.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 561, 121, 26));

        SurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SurnameLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(SurnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 288, 131, 30));

        jLabel17.setText("Customer Type:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        CustomerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Causal", "Regular", "Valued" }));
        CustomerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerTypeActionPerformed(evt);
            }
        });
        CustomerType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CustomerTypeKeyReleased(evt);
            }
        });
        jPanel2.add(CustomerType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        discountRateIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountRateIDFieldKeyReleased(evt);
            }
        });
        jPanel2.add(discountRateIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 110, -1));

        customerIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        customerIDLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(customerIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 23));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 190, 24));

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 175, 24));

        telephoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        telephoneLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(telephoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 160, 18));

        jLabel13.setText("DiscountRate ID:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 170, -1));

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 153, 18));

        DiscountRateIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DiscountRateIDLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(DiscountRateIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 576, 191, 20));

        surnameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        surnameLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(surnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, 24));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 470));

        viewTableButton.setText("View Table");
        viewTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTableButtonActionPerformed(evt);
            }
        });
        jPanel3.add(viewTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 840, 40));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(41, 76, 113));
        jLabel25.setText("X");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 20, -1));

        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Manage Customer");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1120, 540));

        jPanel5.setBackground(new java.awt.Color(41, 76, 113));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(54, 97, 144));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Home");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel10)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Travel Advisor");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Role:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 31, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Staff ID:");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

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

        StaffIDLabel.setForeground(java.awt.Color.white);
        StaffIDLabel.setText("jLabel8");
        jPanel5.add(StaffIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        StaffNameLabel.setForeground(java.awt.Color.white);
        StaffNameLabel.setText("jLabel9");
        jPanel5.add(StaffNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        StaffRoleLabel.setForeground(java.awt.Color.white);
        StaffRoleLabel.setText("jLabel9");
        jPanel5.add(StaffRoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 540));

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
            .addGap(0, 1330, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    /** When JButton is pressed on, SQL query is executed which selects SELECT customerID, firstName, lastName, telephone, email,
     * DOB,address,fixedDiscount,flexibleDiscount,type from customer and then is displayed in CustomerTable.
     *  
     */
    private void viewTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTableButtonActionPerformed
        // TODO add your handling code here:
        try{
            String query = "SELECT customerID, firstName, lastName, telephone, email,DOB,address,DiscountRateID,type FROM customer";
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_system_db", "root", "");
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) CustomerTable.getModel();
            tm.setRowCount(0);

            while(rs.next())
            {
                int customerID = rs.getInt("customerID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                String bdate = rs.getString("DOB");
                int DiscountRateID = rs.getInt("DiscountRateID");
                String isValued = rs.getString("type");

                tm.addRow(new Object[]{customerID,firstName,lastName,address,email,telephone,bdate,isValued,DiscountRateID});

            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_viewTableButtonActionPerformed

    /** When JButton is pressed on, all textField is taken and inserted into the customers table
     * and all textField is emptied for next entry. 
     */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

        String firstName = CreateCustomerNameField.getText();
        String lastName = CreateCustomerSurnameField.getText();

        String address = CreateCustomerAddressField.getText();
        String telephone = CreateCustomerTelephone.getText();
        String email = CreateCustomerEmail.getText();
        int customerID = Integer.parseInt(CustomerID.getText());

        int DiscountRateID = Integer.parseInt(discountRateIDField.getText());

        String customerType = (String)CustomerType.getSelectedItem();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String bdate = dateFormat.format(CreateCustomerDOBField.getDate());

        //seting database link and which action to do
        PreparedStatement ps;
        String query= "INSERT INTO `customer`(`customerID`, `firstName`, `lastName`, `address`, `DOB`, `telephone`, `email`,`type`,`DiscountRateID`,outstandingTicket) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try{

            ps=MyConnection.getConnection().prepareStatement(query);

            ps.setInt(1,customerID);
            ps.setString(2,firstName);
            ps.setString(3,lastName);
            ps.setString(4,address);
            ps.setString(5,bdate);
            ps.setString(6,telephone);
            ps.setString(7,email);

            ps.setString(8,customerType);

            ps.setInt(9,DiscountRateID);
            ps.setInt(10,0);
            CreateCustomerNameField.setText("");
            CreateCustomerSurnameField.setText("");
            CreateCustomerAddressField.setText("");
            CreateCustomerTelephone.setText("");
            CreateCustomerEmail.setText("");
            CustomerID.setText("");
            discountRateIDField.setText("");

            

            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"Customer Created");
            }

        }catch (SQLException ex){
            Logger.getLogger(RecordPayment.class.getName()).log(Level.SEVERE,null,ex);

        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void CustomerTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerTypeKeyReleased

        if(CustomerType.equals("Causal"))
        {
            System.out.println("HELLLO");
        }
    }//GEN-LAST:event_CustomerTypeKeyReleased

    /** When a value in combo box is selected, such as "Causal", SetFixedDiscountField,FlexDiscountField,
     *   isn't able to be typed in and FixedDiscountField, FlexibleDiscountField is not visible; If value is "Regular" then
     * SetFixedDiscountField and FlexDiscountField isn't able to be typed in and FixedDiscountField is not visible;
     * and if value is "Valued", SetFixedDiscountField, FlexDiscountField and FlexDiscountFieldis able to be typed in and 
     * FixedDiscountField is set to visible.
     * 
     */
    private void CustomerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerTypeActionPerformed

    }//GEN-LAST:event_CustomerTypeActionPerformed

    private void CustomerIDLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerIDLabelMousePressed

    }//GEN-LAST:event_CustomerIDLabelMousePressed
    
    /** When JButton is pressed on, it will select the row that is selected from CustomerTable and then SQL query is execute to delete it from the customer
     * table where customerID is equal the cell .
     *  
     */
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
        int row = CustomerTable.getSelectedRow();
        String cell = CustomerTable.getModel().getValueAt(row,0).toString();
        String query = "DELETE FROM customer where customerID = " + cell;
        try{
            pst=con.prepareStatement(query);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted Successful");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    /** When JButton is clicked on, all of textField on ManageCustomer page is declared
     * to a variable and an SQL query is execute which updates in the customers table
     *  .
     */
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        try{

            int customerID = Integer.parseInt(CustomerID.getText());
            String firstName = CreateCustomerNameField.getText();
            String lastName = CreateCustomerSurnameField.getText();
            String address = CreateCustomerAddressField.getText();
            String telephone = CreateCustomerTelephone.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(CreateCustomerDOBField.getDate());
            String email = CreateCustomerEmail.getText();
            
           int DiscountRateID = Integer.parseInt(discountRateIDField.getText());


            String query = "update customer set customerID = '"+customerID+"', firstName = '"+firstName+"', lastName = '"+lastName+"', address = '"+address+"', DOB = '"+bdate+"', telephone = '"+telephone+"', email = '"+email+"', DiscountRateID = '"+DiscountRateID+"' where customerID ='"+customerID+"' ";
            pst = con.prepareStatement(query);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Updated");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    /** When user is typing in CustomerID field, if string is [0-9] and between 2-12 characters then SaveButton is enabled to true, if not then SaveButton is enabled to false and
     * EmailLabel displays texts. 
     * @param evt 
     */
    private void CustomerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerIDKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{2,12}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CustomerID.getText());
        if(!match.matches()){
            customerIDLabel.setText("CustomerID is incorrect");
            SaveButton.setEnabled(false);
        }
        else{
            customerIDLabel.setText(null);
            SaveButton.setEnabled(true);
        }
    }//GEN-LAST:event_CustomerIDKeyReleased

    /** When user is typing in CreateCustomerEmail field, the string has to contain "@" and then "." and if wants to then another "."; if not then 
     * SaveButton is set to false and then EmailLabel displays text.
     * 
     * @param evt 
     */
    private void CreateCustomerEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateCustomerEmailKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CreateCustomerEmail.getText());
        if(!match.matches()){
            emailLabel.setText("Email is incorrect");
            SaveButton.setEnabled(true);
        }
        else{
            emailLabel.setText(null);
            SaveButton.setEnabled(false);

        }
    }//GEN-LAST:event_CreateCustomerEmailKeyReleased

    private void CreateCustomerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCustomerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateCustomerEmailActionPerformed

    /** When user is typing in CreateCustomerTelephone, if string is [0-9] and between 11-12 characters then SaveButton is enabled to true, if not then SaveButton is enabled to false and 
     * TelephoneLabel displays text.
     * 
     */
    private void CreateCustomerTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateCustomerTelephoneKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{11,12}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CreateCustomerTelephone.getText());
        if(!match.matches()){
            telephoneLabel.setText("Telephone is incorrect");
            SaveButton.setEnabled(false);
        }
        else{
            telephoneLabel.setText(null);
            SaveButton.setEnabled(true);
        }
    }//GEN-LAST:event_CreateCustomerTelephoneKeyReleased

    private void CreateCustomerTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCustomerTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateCustomerTelephoneActionPerformed

    /** When user is typing in CreatedCustomerAddressField, if string is [a-z] and/or [A-Z] and/or [0-9] and/or contains whitespace and is 1-40 characters,
     * SaveButton is set true, if not then SaveButton is set to false and AddressLabel displays text.
     *  
     */
    private void CreateCustomerAddressFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateCustomerAddressFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9\\s]{1,40}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CreateCustomerAddressField.getText());
        if(!match.matches()){
            addressLabel.setText("Address is incorrect");
            SaveButton.setEnabled(false);
        }
        else{
            addressLabel.setText(null);
            SaveButton.setEnabled(true);
        }
    }//GEN-LAST:event_CreateCustomerAddressFieldKeyReleased

    /** When user is typing in CreatedCustomerSurnameField, if string is [a-z] and/or [A-Z] and is 1-20 characters, SaveButton is set to true, if not then SaveButton
     * is set to false and SurnameLabel display text.
     * 
     * @param evt 
     */
    private void CreateCustomerSurnameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateCustomerSurnameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{1,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CreateCustomerSurnameField.getText());
        if(!match.matches()){
            surnameLabel.setText("Surname is incorrect");
                        SaveButton.setEnabled(false);

        }
        else{
            surnameLabel.setText(null);
            SaveButton.setEnabled(true);
            

        }
    }//GEN-LAST:event_CreateCustomerSurnameFieldKeyReleased

    private void CreateCustomerSurnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCustomerSurnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateCustomerSurnameFieldActionPerformed

    private void CreateCustomerSurnameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateCustomerSurnameFieldMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateCustomerSurnameFieldMousePressed


    
         /** When user is typing in CreatedCustomerSurnameField, if string is [a-z] and/or [A-Z] and is 1-20 characters, SaveButton is set to true, if not then SaveButton
          *  is set to false and SurnameLabel display text.
          */
    private void CreateCustomerNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateCustomerNameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{1,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CreateCustomerNameField.getText());
        if(!match.matches()){
            nameLabel.setText("Name is incorrect");
            SaveButton.setEnabled(false);
        }
        else{
            nameLabel.setText(null);
            SaveButton.setEnabled(true);
        }
    }//GEN-LAST:event_CreateCustomerNameFieldKeyReleased

    private void CreateCustomerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCustomerNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateCustomerNameFieldActionPerformed

    /** When CustomerTable is clicked on, table row value assigned and then SQL query is execute which selected from CustomerTable where customerID is equal 
     * to table row which was assigned and then all textfield on current page will set to data from table.
     * 
     * @param evt 
     */
    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        // TODO add your handling code here:
        int row = CustomerTable.getSelectedRow();
        String tc = CustomerTable.getModel().getValueAt(row,0).toString();
        try{
            String query = "SELECT * from customer where customerID = " + tc +"";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)CustomerTable.getModel();
            if (rs.next()){
                int customerID = rs.getInt("customerID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");

                String address = rs.getString("address");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                
                int DiscountRateID = rs.getInt("DiscountRateID");
                String bdate = rs.getString("DOB");
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(bdate);

                CustomerID.setText(String.valueOf(customerID));
                CreateCustomerNameField.setText(firstName);
                CreateCustomerSurnameField.setText(lastName);
                CreateCustomerAddressField.setText(address);
                CreateCustomerTelephone.setText(telephone);
                CreateCustomerEmail.setText(email);
                discountRateIDField.setText(String.valueOf(DiscountRateID));

                
                CreateCustomerDOBField.setDate(date);
            }
        }catch(Exception e) {

        }
    }//GEN-LAST:event_CustomerTableMouseClicked

    /** When JButton is pressed, SQL query is executed which will select customerID, firstName, lastName, telephone, email,DOB,address,fixedDiscount,flexibleDiscount from customer table
     * and then displayed onto CustomerTable.

     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            String query = "SELECT customerID, firstName, lastName, telephone, email,DOB,address,DiscountRateID FROM customer";
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_system_db", "root", "");
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) CustomerTable.getModel();
            tm.setRowCount(0);

            while(rs.next())
            {
                int customerID = rs.getInt("customerID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String telephone = rs.getString("telephone");
                String bdate = rs.getString("DOB");
                int isValued = rs.getInt("isValued");

                int DiscountRateID = rs.getInt("DiscountRateID");
                tm.addRow(new Object[] { customerID, firstName,lastName,address,email,telephone,bdate,isValued,DiscountRateID});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void discountRateIDFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountRateIDFieldKeyReleased
        // TODO add your handling code here:
                String PATTERN = "^[0,9]{1,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(discountRateIDField.getText());
        if(!match.matches()){
            DiscountRateIDLabel.setText("Name is incorrect");
            SaveButton.setEnabled(false);
        }
        else{
            DiscountRateIDLabel.setText(null);
            SaveButton.setEnabled(true);
        }
    }//GEN-LAST:event_discountRateIDFieldKeyReleased

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        if(StaffRoleLabel.getText().equals("Travel_Advisor")){
            travelAd ta =new travelAd(StaffIDLabel.getText(),
                StaffNameLabel.getText(),
                StaffRoleLabel.getText());
            ta.setVisible(true);
            ta.pack();
            ta.setLocationRelativeTo(null); //puts in the center of the screen
            this.dispose(); //hides previos page
        }else{
            officeManager om = new officeManager(StaffIDLabel.getText(),
                StaffNameLabel.getText(),
                StaffRoleLabel.getText());
            om.setVisible(true);
            this.setVisible(false);
            om.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(81, 135, 194));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(54,97,144));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MousePressed

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

    private void jPanel14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseDragged
        int cordX= evt.getXOnScreen();
        int cordY = evt.getYOnScreen();

        this.setLocation(cordX-mousepX, cordY-mousepY);
    }//GEN-LAST:event_jPanel14MouseDragged

    private void jPanel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel14MousePressed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel25MouseClicked

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
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField CreateCustomerAddressField;
    private org.jdesktop.swingx.JXDatePicker CreateCustomerDOBField;
    private javax.swing.JTextField CreateCustomerEmail;
    private javax.swing.JTextField CreateCustomerNameField;
    private javax.swing.JTextField CreateCustomerSurnameField;
    private javax.swing.JTextField CreateCustomerTelephone;
    private javax.swing.JTextField CustomerID;
    private javax.swing.JLabel CustomerIDLabel;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JComboBox<String> CustomerType;
    private javax.swing.JLabel DiscountRateIDLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FixedDiscountField;
    private javax.swing.JLabel FlexibleDiscountField;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel StaffIDLabel;
    private javax.swing.JLabel StaffNameLabel;
    private javax.swing.JLabel StaffRoleLabel;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel TelephoneLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel customerIDLabel;
    private javax.swing.JTextField discountRateIDField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JButton viewTableButton;
    // End of variables declaration//GEN-END:variables
}
