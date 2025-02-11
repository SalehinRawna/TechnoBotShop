/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author saleh
 */
public class AddProducts extends javax.swing.JFrame {

    /**
     * Creates new form AddProducts
     */
    
    Variables vr = new Variables();
    
    
    public void categories()throws SQLException{
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            
            String sql = "Select * From CATEGORY Order By CAT_ID";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String temp = rs.getString("CAT_NAME");
                catDDBox.addItem(temp);   
            }
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR");
        }
    }
    
    public void subcategories()throws SQLException{
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            
            String cat = (String) catDDBox.getSelectedItem();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("Select * From SUBCATEGORY Where CAT_NAME = ? Order By ID");
            pst.setString(1, cat);
            
            //Statement st = conn.createStatement();
            
            ResultSet rs = pst.executeQuery();
            subCatDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            while(rs.next()){
                String temp = rs.getString("SUB_CAT_NAME");
                subCatDDBox.addItem(temp);   
            }
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR");
        }
    }
    
    public void brands()throws SQLException{
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            
            String cat = (String) catDDBox.getSelectedItem();
            String subcat = (String) subCatDDBox.getSelectedItem();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("Select * From BRAND Where CAT_NAME = ? AND SUB_CAT_NAME = ? Order By BRAND_NAME");
            pst.setString(1, cat);
            pst.setString(2, subcat);
            
            //Statement st = conn.createStatement();
            
            ResultSet rs = pst.executeQuery();
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            
            while(rs.next()){
                String temp = rs.getString("BRAND_NAME");
                braDDBox.addItem(temp);   
            }
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR");
        }
    }
    
    public AddProducts() {
        initComponents();
        jLabel5.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
         
        jLabel16.setVisible(false);
        jLabel7.setVisible(false);       
        jLabel8.setVisible(false);       
        
        
        catDDBox.setVisible(false);
        subCatDDBox.setVisible(false);
        braDDBox.setVisible(false);
        
        catBox.setVisible(false);       
        subCatBox.setVisible(false);     
        brandBox.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBTN = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        pIDBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        newSBRad = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        newCatRad = new javax.swing.JRadioButton();
        braDDBox = new javax.swing.JComboBox<>();
        exCatRad = new javax.swing.JRadioButton();
        exSBRad = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        subCatDDBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subCatBox = new javax.swing.JTextField();
        brandBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pNameBox = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();
        clearBTN = new javax.swing.JButton();
        quantity = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        typeBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        warranty = new javax.swing.JSpinner();
        price = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        catDDBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        catBox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        exBRad = new javax.swing.JRadioButton();
        newBRad = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(29, 31, 47));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBTN.setBackground(new java.awt.Color(29, 31, 47));
        backBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        backBTN.setPreferredSize(new java.awt.Dimension(58, 32));
        backBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTNMouseClicked(evt);
            }
        });
        jPanel1.add(backBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Add Products");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 10, -1, -1));

        pIDBox.setBackground(new java.awt.Color(255, 255, 255));
        pIDBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        pIDBox.setForeground(new java.awt.Color(0, 0, 0));
        pIDBox.setPreferredSize(new java.awt.Dimension(300, 45));
        jPanel1.add(pIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Category                    :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        newSBRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newSBRad.setForeground(new java.awt.Color(255, 255, 255));
        newSBRad.setText("New Sub-Category");
        newSBRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSBRadActionPerformed(evt);
            }
        });
        jPanel1.add(newSBRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Sub-Category :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        newCatRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newCatRad.setForeground(new java.awt.Color(255, 255, 255));
        newCatRad.setText("New Category");
        newCatRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCatRadActionPerformed(evt);
            }
        });
        jPanel1.add(newCatRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        braDDBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        braDDBox.setPreferredSize(new java.awt.Dimension(340, 24));
        jPanel1.add(braDDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, -1, -1));

        exCatRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exCatRad.setForeground(new java.awt.Color(255, 255, 255));
        exCatRad.setText("Existing Category");
        exCatRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exCatRadActionPerformed(evt);
            }
        });
        jPanel1.add(exCatRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        exSBRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exSBRad.setForeground(new java.awt.Color(255, 255, 255));
        exSBRad.setText("Existing Sub-Category");
        exSBRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exSBRadActionPerformed(evt);
            }
        });
        jPanel1.add(exSBRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select a Brand            :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, -1, -1));

        subCatDDBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        subCatDDBox.setPreferredSize(new java.awt.Dimension(340, 24));
        subCatDDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCatDDBoxActionPerformed(evt);
            }
        });
        jPanel1.add(subCatDDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Product ID       :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Sub-Category   :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter a Brand             :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, -1, -1));

        subCatBox.setBackground(new java.awt.Color(255, 255, 255));
        subCatBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        subCatBox.setForeground(new java.awt.Color(0, 0, 0));
        subCatBox.setPreferredSize(new java.awt.Dimension(340, 45));
        jPanel1.add(subCatBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, -1, -1));

        brandBox.setBackground(new java.awt.Color(255, 255, 255));
        brandBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        brandBox.setForeground(new java.awt.Color(0, 0, 0));
        brandBox.setPreferredSize(new java.awt.Dimension(340, 45));
        jPanel1.add(brandBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enter Product Name :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        pNameBox.setBackground(new java.awt.Color(255, 255, 255));
        pNameBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        pNameBox.setForeground(new java.awt.Color(0, 0, 0));
        pNameBox.setPreferredSize(new java.awt.Dimension(380, 45));
        jPanel1.add(pNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        addBTN.setBackground(new java.awt.Color(29, 31, 47));
        addBTN.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        addBTN.setForeground(new java.awt.Color(255, 255, 255));
        addBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        addBTN.setText(" Add");
        addBTN.setMaximumSize(new java.awt.Dimension(118, 42));
        addBTN.setMinimumSize(new java.awt.Dimension(118, 42));
        addBTN.setPreferredSize(new java.awt.Dimension(118, 42));
        addBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBTNMouseClicked(evt);
            }
        });
        jPanel1.add(addBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, -1, -1));

        copyright.setForeground(new java.awt.Color(255, 255, 255));
        copyright.setText("Copyright © 2021, TechnoBot BD");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 700, -1, -1));

        clearBTN.setBackground(new java.awt.Color(29, 31, 47));
        clearBTN.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rubber.png"))); // NOI18N
        clearBTN.setText("  Clear");
        clearBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBTNMouseClicked(evt);
            }
        });
        jPanel1.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 620, -1, -1));

        quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        quantity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        quantity.setMinimumSize(new java.awt.Dimension(26, 24));
        quantity.setPreferredSize(new java.awt.Dimension(96, 24));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Type                           :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        typeBox.setBackground(new java.awt.Color(255, 255, 255));
        typeBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        typeBox.setForeground(new java.awt.Color(0, 0, 0));
        typeBox.setPreferredSize(new java.awt.Dimension(300, 45));
        jPanel1.add(typeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Warranty:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));

        warranty.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        warranty.setMinimumSize(new java.awt.Dimension(26, 24));
        warranty.setPreferredSize(new java.awt.Dimension(72, 24));
        jPanel1.add(warranty, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        price.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        price.setMinimumSize(new java.awt.Dimension(26, 24));
        price.setPreferredSize(new java.awt.Dimension(120, 24));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Years");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 513, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("BDT");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 513, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select a Category      :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        catDDBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        catDDBox.setPreferredSize(new java.awt.Dimension(340, 24));
        catDDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catDDBoxActionPerformed(evt);
            }
        });
        jPanel1.add(catDDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sub-Category            :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Enter a Category       :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        catBox.setBackground(new java.awt.Color(255, 255, 255));
        catBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        catBox.setForeground(new java.awt.Color(0, 0, 0));
        catBox.setPreferredSize(new java.awt.Dimension(340, 45));
        jPanel1.add(catBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Brand                          :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        exBRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exBRad.setForeground(new java.awt.Color(255, 255, 255));
        exBRad.setText("Existing Brand");
        exBRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exBRadActionPerformed(evt);
            }
        });
        jPanel1.add(exBRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        newBRad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newBRad.setForeground(new java.awt.Color(255, 255, 255));
        newBRad.setText("New Brand");
        newBRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBRadActionPerformed(evt);
            }
        });
        jPanel1.add(newBRad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTNMouseClicked
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.setLocationRelativeTo(null);
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBTNMouseClicked

    private void newSBRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSBRadActionPerformed
        // TODO add your handling code here:
        if(exCatRad.isSelected())
        {
            if(newSBRad.isSelected())
            {
                exSBRad.setSelected(false);
                exBRad.setSelected(false);
                newBRad.setSelected(true);
                
                jLabel7.setVisible(true);       
                jLabel8.setVisible(true);
                
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                
                
                subCatBox.setVisible(true);     
                brandBox.setVisible(true);
                
                subCatDDBox.setVisible(false);
                braDDBox.setVisible(false);
                
                vr.selectionCase = 2;
            
            }
            else{
                jLabel7.setVisible(false);       
                jLabel8.setVisible(false);
                newBRad.setSelected(false);
                
                subCatBox.setVisible(false);     
                brandBox.setVisible(false);
                
                vr.selectionCase = 0;
            }
        } 
        else if(newCatRad.isSelected()){
            if(newSBRad.isSelected())
            {
                newBRad.setSelected(true);
                exSBRad.setSelected(false);
                exBRad.setSelected(false);
            }
            else{
                newSBRad.setSelected(true);
                newBRad.setSelected(true);
                exSBRad.setSelected(false);
                exBRad.setSelected(false);
            }
        }
        else{
            newSBRad.setSelected(false);
            newBRad.setSelected(false);
        }
    }//GEN-LAST:event_newSBRadActionPerformed

    private void newCatRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCatRadActionPerformed
        // TODO add your handling code here:
        if(newCatRad.isSelected())
        {
            exCatRad.setSelected(false);
            exSBRad.setSelected(false);
            exBRad.setSelected(false);
            newSBRad.setSelected(true);
            newBRad.setSelected(true);
            
            jLabel16.setVisible(true);
            jLabel7.setVisible(true);       
            jLabel8.setVisible(true);       
            
            catBox.setVisible(true);       
            subCatBox.setVisible(true);     
            brandBox.setVisible(true);
            
            jLabel5.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            
            catDDBox.setVisible(false);
            subCatDDBox.setVisible(false);
            braDDBox.setVisible(false);
            
            vr.selectionCase = 1;

        }
        else{
            
            newSBRad.setSelected(false);
            newBRad.setSelected(false);
            
            jLabel16.setVisible(false);
            jLabel7.setVisible(false);       
            jLabel8.setVisible(false);       
            
        
        
            catBox.setVisible(false);       
            subCatBox.setVisible(false);     
            brandBox.setVisible(false);
            vr.selectionCase = 0;
        }
    }//GEN-LAST:event_newCatRadActionPerformed

    private void exCatRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exCatRadActionPerformed
        // TODO add your handling code here:
        if(exCatRad.isSelected())
        {
            newCatRad.setSelected(false);
            
            jLabel5.setVisible(true);
            catDDBox.setVisible(true);
            
            jLabel16.setVisible(false);
            catBox.setVisible(false);
            
            try {
                categories();
            } catch (SQLException ex) {
                Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*subCatDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());*/

        }
        else{
            
            newSBRad.setSelected(false);
            exSBRad.setSelected(false);
            newBRad.setSelected(false);
            exBRad.setSelected(false);
            jLabel5.setVisible(false);
            catDDBox.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
         
            jLabel7.setVisible(false);       
            jLabel8.setVisible(false);       
        
            subCatDDBox.setVisible(false);
            braDDBox.setVisible(false);
      
            subCatBox.setVisible(false);     
            brandBox.setVisible(false);
            
            catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            subCatDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
            braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_exCatRadActionPerformed

    private void exSBRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exSBRadActionPerformed
        // TODO add your handling code here:
        if(exCatRad.isSelected())
        {
           if(exSBRad.isSelected())
            {
                newSBRad.setSelected(false);
           
                jLabel2.setVisible(true);
                
                jLabel7.setVisible(false);  
                
                subCatDDBox.setVisible(true);
                
                subCatBox.setVisible(false);
            }
            else{
               
                exBRad.setSelected(false);
                newBRad.setSelected(false);
               
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                
                subCatDDBox.setVisible(false);
                braDDBox.setVisible(false);
                
                subCatBox.setVisible(false);
                brandBox.setVisible(false);
                
                jLabel8.setVisible(false);
            } 
        }
        else{
            
            exSBRad.setSelected(false);
            exBRad.setSelected(false);
        }
        
    }//GEN-LAST:event_exSBRadActionPerformed

    private void subCatDDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCatDDBoxActionPerformed
        try {
            // TODO add your handling code here:
            brands();
        } catch (SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subCatDDBoxActionPerformed

    private void clearBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBTNMouseClicked
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearBTNMouseClicked

    private void addBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseClicked
        // TODO add your handling code here:
        checkinput();
        //System.out.println(vr.selectionCase);
        if(vr.checkallinput == true)
        {
            if(vr.selectionCase == 1)
            {
                catinsert();
                subcatinsert();
                brandinsert();
                
                selection1insert();
                if(vr.Error == true){
                    JOptionPane.showMessageDialog(null, "Something went WRONG", "Caution", JOptionPane.OK_OPTION);
                }
                else if(vr.selectionerror == true){
                    JOptionPane.showMessageDialog(null, "Wrong Input in\nCategory/Sub-Category/Brand", "Caution", JOptionPane.OK_OPTION);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Successfully Added", "Successs", JOptionPane.INFORMATION_MESSAGE);
                }
                
                
                clear();
            }
            else if(vr.selectionCase == 2){
                excatsubcatinsert();
                excatnsubbrandinsert();
                
                selection2insert();
                
                if(vr.Error == true){
                    JOptionPane.showMessageDialog(null, "Something went WRONG", "Caution", JOptionPane.OK_OPTION);
                }
                else if(vr.selectionerror == true){
                    JOptionPane.showMessageDialog(null, "Wrong Input in\nCategory/Sub-Category/Brand", "Caution", JOptionPane.OK_OPTION);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Successfully Added", "Successs", JOptionPane.INFORMATION_MESSAGE);
                }
                
                clear();
            }
            else if(vr.selectionCase == 3){
                excatexsubbrandinsert();
                
                selection3insert();
                
                if(vr.Error == true){
                    JOptionPane.showMessageDialog(null, "Something went WRONG", "Caution", JOptionPane.OK_OPTION);
                }
                else if(vr.selectionerror == true){
                    JOptionPane.showMessageDialog(null, "Wrong Input in\nCategory/Sub-Category/Brand", "Caution", JOptionPane.OK_OPTION);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Successfully Added", "Successs", JOptionPane.INFORMATION_MESSAGE);
                }
                
                clear();
            }
            else if(vr.selectionCase == 4){
                selection4insert();
                
                if(vr.Error == true){
                    JOptionPane.showMessageDialog(null, "Something went WRONG", "Caution", JOptionPane.OK_OPTION);
                }
                else if(vr.selectionerror == true){
                    JOptionPane.showMessageDialog(null, "Wrong Input in\nCategory/Sub-Category/Brand", "Caution", JOptionPane.OK_OPTION);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Successfully Added", "Successs", JOptionPane.INFORMATION_MESSAGE);
                }
                
                clear();
            }
            else{
                JOptionPane.showMessageDialog(null, "Something went WRONG", "Caution", JOptionPane.OK_OPTION);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "One or more inputs are invalid\nPlease enter proper input", "Caution", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_addBTNMouseClicked

    private void catDDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catDDBoxActionPerformed
        try {
            // TODO add your handling code here:
            subcategories();
        } catch (SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_catDDBoxActionPerformed

    private void exBRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exBRadActionPerformed
        // TODO add your handling code here:
        if(exCatRad.isSelected())
        {
            if(exSBRad.isSelected())
            {
                if(exBRad.isSelected()){
                    newBRad.setSelected(false);
                    jLabel3.setVisible(true);      
                    jLabel8.setVisible(false); 
                    braDDBox.setVisible(true);   
                    brandBox.setVisible(false);
                    
                    vr.selectionCase = 4;
                }
                else{
                    jLabel3.setVisible(false);  
                    braDDBox.setVisible(false);
                    
                    vr.selectionCase = 0;
                }
                
            }
            else{
                exBRad.setSelected(false);
            }
        }
        else{
            exBRad.setSelected(false);
        }
    }//GEN-LAST:event_exBRadActionPerformed

    private void newBRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBRadActionPerformed
        // TODO add your handling code here:
        if(newCatRad.isSelected()){
            if(newSBRad.isSelected()){
                newBRad.setSelected(true);
                exBRad.setSelected(false);
            }   
        }
        else if(exCatRad.isSelected()){
            if(exSBRad.isSelected()){
                if(newBRad.isSelected()){
                    
                    exBRad.setSelected(false);
                    jLabel8.setVisible(true);  
                    brandBox.setVisible(true);
                    
                    jLabel3.setVisible(false);  
                    braDDBox.setVisible(false); 
                    
                    vr.selectionCase = 3;
                }
                else{
                    jLabel8.setVisible(false);   
                    brandBox.setVisible(false);
                    vr.selectionCase = 0;
                }
            }
            else if(newSBRad.isSelected()){
                newBRad.setSelected(true);
                exBRad.setSelected(false);
            }
            else{
                newBRad.setSelected(false);
                exBRad.setSelected(false);
            }
        }
        else{
            newBRad.setSelected(false);
        }
    }//GEN-LAST:event_newBRadActionPerformed

    /**
     * @param args the command line arguments
     */
    public void checkinput() {

        if (pIDBox.getText().length() != 0) {
            if (pIDBox.getText().length() >= 12 && pIDBox.getText().length() <= 13) {
                if (pNameBox.getText().length() != 0 && typeBox.getText().length() != 0 && vr.selectionCase != 0) {
                    if (vr.selectionCase == 1) {
                        if (catBox.getText().length() != 0 && subCatBox.getText().length() != 0 && brandBox.getText().length() != 0) {
                            if (quantity.getValue().equals(0) || warranty.getValue().equals(0) || price.getValue().equals(0)) {
                                vr.checkallinput = false;
                            } else {
                                vr.checkallinput = true;
                            }
                        } else {
                            vr.checkallinput = false;
                        }
                    } else if (vr.selectionCase == 2 || vr.selectionCase == 3 || vr.selectionCase == 4) {
                        if (catDDBox.getSelectedItem().equals("")) {
                            vr.checkallinput = false;
                        } else {
                            if (vr.selectionCase == 2) {
                                if (subCatBox.getText().length() != 0 && brandBox.getText().length() != 0) {
                                    if (quantity.getValue().equals(0) || warranty.getValue().equals(0) || price.getValue().equals(0)) {
                                        vr.checkallinput = false;
                                    } else {
                                        vr.checkallinput = true;
                                    }
                                } else {
                                    vr.checkallinput = false;
                                }
                            } else if (vr.selectionCase == 3 || vr.selectionCase == 4) {
                                if (subCatDDBox.getSelectedItem().equals("")) {
                                    vr.checkallinput = false;
                                } else {
                                    if (vr.selectionCase == 3) {
                                        if (brandBox.getText().length() != 0) {
                                            if (quantity.getValue().equals(0) || warranty.getValue().equals(0) || price.getValue().equals(0)) {
                                                vr.checkallinput = false;
                                            } else {
                                                vr.checkallinput = true;
                                            }
                                        } else {
                                            vr.checkallinput = false;
                                        }
                                    } else if (vr.selectionCase == 4) {
                                        if (braDDBox.getSelectedItem().equals("")) {
                                            vr.checkallinput = false;
                                        } else {
                                            if (quantity.getValue().equals(0) || warranty.getValue().equals(0) || price.getValue().equals(0)) {
                                                vr.checkallinput = false;
                                            } else {
                                                vr.checkallinput = true;
                                            }
                                        }
                                    } else {
                                        System.out.println("ERROR");
                                        vr.checkallinput = false;
                                    }

                                }

                            } else {
                                System.out.println("ERROR");
                                vr.checkallinput = false;
                            }

                        }
                    } else {
                        System.out.println("ERROR");
                        vr.checkallinput = false;
                    }

                } else {
                    vr.checkallinput = false;
                }
            } else {
                vr.checkallinput = false;
                JOptionPane.showMessageDialog(null, "Invalid Product ID\nPlease enter proper Product ID", "Caution", JOptionPane.OK_OPTION);
            }
        } else {
            vr.checkallinput = false;
        }
    }
    public void clear(){
        pIDBox.setText(null);
        pNameBox.setText(null);
        
        exCatRad.setSelected(false);
        newCatRad.setSelected(false);
        exSBRad.setSelected(false);
        newSBRad.setSelected(false);
        exBRad.setSelected(false);
        newBRad.setSelected(false);
        
        
        catDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        subCatDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        braDDBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        
        subCatBox.setText(null);
        brandBox.setText(null);
        
        typeBox.setText(null);
        
        quantity.setValue(0);
        warranty.setValue(0);
        price.setValue(0);
        
        catBox.setText(null);       
        subCatBox.setText(null);    
        brandBox.setText(null);
        
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        
        jLabel7.setVisible(false);       
        jLabel8.setVisible(false);       
        jLabel16.setVisible(false);
        
        catDDBox.setVisible(false);
        subCatDDBox.setVisible(false);
        braDDBox.setVisible(false);
        
        catBox.setVisible(false);       
        subCatBox.setVisible(false);     
        brandBox.setVisible(false);
        
        vr.selectionCase = 0;
        vr.Error = false;
        vr.selectionerror = false;
    }
    
    
    public void catinsert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String cat = catBox.getText();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO CATEGORY (CAT_NAME) VALUES (?)");
            pst.setString(1, cat);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.selectionerror = true;
            System.out.println("ERROR");
        }
    }
    public void subcatinsert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            
            String cat = catBox.getText();
            String subcat = subCatBox.getText();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO SUBCATEGORY (CAT_NAME,SUB_CAT_NAME) VALUES (?,?)");
            pst.setString(1, cat);
            pst.setString(2, subcat);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.selectionerror = true;
            System.out.println("ERROR");
        }
    }
    public void brandinsert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String cat = catBox.getText();
            String subcat = subCatBox.getText();
            String bra = brandBox.getText();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO BRAND (CAT_NAME,SUB_CAT_NAME,BRAND_NAME) VALUES (?,?,?)");
            pst.setString(1, cat);
            pst.setString(2, subcat);
            pst.setString(3, bra);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.selectionerror = true;
            System.out.println("ERROR");
        }
    }
    public void excatsubcatinsert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            
            String cat = (String) catDDBox.getSelectedItem();
            String subcat = subCatBox.getText();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO SUBCATEGORY (CAT_NAME,SUB_CAT_NAME) VALUES (?,?)");
            pst.setString(1, cat);
            pst.setString(2, subcat);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.selectionerror = true;
            System.out.println("ERROR");
        }
    }
    public void excatnsubbrandinsert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String cat = (String) catDDBox.getSelectedItem();
            String subcat = subCatBox.getText();
            String bra = brandBox.getText();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO BRAND (CAT_NAME,SUB_CAT_NAME,BRAND_NAME) VALUES (?,?,?)");
            pst.setString(1, cat);
            pst.setString(2, subcat);
            pst.setString(3, bra);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.selectionerror = true;
            System.out.println("ERROR");
        }
    }
    public void excatexsubbrandinsert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String cat = (String) catDDBox.getSelectedItem();
            String subcat = (String) subCatDDBox.getSelectedItem();
            String bra = brandBox.getText();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO BRAND (CAT_NAME,SUB_CAT_NAME,BRAND_NAME) VALUES (?,?,?)");
            pst.setString(1, cat);
            pst.setString(2, subcat);
            pst.setString(3, bra);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR");
        }
    }
    
    public void selection1insert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String pid = pIDBox.getText();
            String pname = pNameBox.getText();
            String cat = catBox.getText();
            String subcat = subCatBox.getText();
            String bra = brandBox.getText();
            String type = typeBox.getText();
            int qt = (Integer) quantity.getValue();
            int wr = (Integer) warranty.getValue();
            int prc = (Integer) price.getValue();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO PRODUCTS (PRODUCT_ID,PRODUCT_NAME,CAT_NAME,SUB_CAT_NAME,BRAND_NAME,PRODUCT_TYPE,QUANTITY,WARRANTY,PRICE) VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, pid);
            pst.setString(2, pname);
            pst.setString(3, cat);
            pst.setString(4, subcat);
            pst.setString(5, bra);
            pst.setString(6, type);
            pst.setInt(7, qt);
            pst.setInt(8, wr);
            pst.setInt(9, prc);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.Error = true;
            System.out.println("ERROR");
        }
    }
    
    
    public void selection2insert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String pid = pIDBox.getText();
            String pname = pNameBox.getText();
            String cat = (String) catDDBox.getSelectedItem();
            String subcat = subCatBox.getText();
            String bra = brandBox.getText();
            String type = typeBox.getText();
            int qt = (Integer) quantity.getValue();
            int wr = (Integer) warranty.getValue();
            int prc = (Integer) price.getValue();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO PRODUCTS (PRODUCT_ID,PRODUCT_NAME,CAT_NAME,SUB_CAT_NAME,BRAND_NAME,PRODUCT_TYPE,QUANTITY,WARRANTY,PRICE) VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, pid);
            pst.setString(2, pname);
            pst.setString(3, cat);
            pst.setString(4, subcat);
            pst.setString(5, bra);
            pst.setString(6, type);
            pst.setInt(7, qt);
            pst.setInt(8, wr);
            pst.setInt(9, prc);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.Error = true;
            System.out.println("ERROR");
        }
    }
    
    public void selection3insert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String pid = pIDBox.getText();
            String pname = pNameBox.getText();
            String cat = (String) catDDBox.getSelectedItem();
            String subcat = (String) subCatDDBox.getSelectedItem();
            String bra = brandBox.getText();
            String type = typeBox.getText();
            int qt = (Integer) quantity.getValue();
            int wr = (Integer) warranty.getValue();
            int prc = (Integer) price.getValue();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO PRODUCTS (PRODUCT_ID,PRODUCT_NAME,CAT_NAME,SUB_CAT_NAME,BRAND_NAME,PRODUCT_TYPE,QUANTITY,WARRANTY,PRICE) VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, pid);
            pst.setString(2, pname);
            pst.setString(3, cat);
            pst.setString(4, subcat);
            pst.setString(5, bra);
            pst.setString(6, type);
            pst.setInt(7, qt);
            pst.setInt(8, wr);
            pst.setInt(9, prc);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.Error = true;
            System.out.println("ERROR");
        }
    }
    
    public void selection4insert(){
        //String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(vr.url, vr.user, vr.password);
            String pid = pIDBox.getText();
            String pname = pNameBox.getText();
            String cat = (String) catDDBox.getSelectedItem();
            String subcat = (String) subCatDDBox.getSelectedItem();
            String bra = (String) braDDBox.getSelectedItem();
            String type = typeBox.getText();
            int qt = (Integer) quantity.getValue();
            int wr = (Integer) warranty.getValue();
            int prc = (Integer) price.getValue();
            
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO PRODUCTS (PRODUCT_ID,PRODUCT_NAME,CAT_NAME,SUB_CAT_NAME,BRAND_NAME,PRODUCT_TYPE,QUANTITY,WARRANTY,PRICE) VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, pid);
            pst.setString(2, pname);
            pst.setString(3, cat);
            pst.setString(4, subcat);
            pst.setString(5, bra);
            pst.setString(6, type);
            pst.setInt(7, qt);
            pst.setInt(8, wr);
            pst.setInt(9, prc);
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Row has been inserted");
            }
            
            conn.close();
        }catch(SQLException e){
            vr.Error = true;
            System.out.println("ERROR");
        }
    }
    
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
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProducts ap = new AddProducts();
                ap.setLocationRelativeTo(null);
                ap.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton backBTN;
    private javax.swing.JComboBox<String> braDDBox;
    private javax.swing.JTextField brandBox;
    private javax.swing.JTextField catBox;
    private javax.swing.JComboBox<String> catDDBox;
    private javax.swing.JButton clearBTN;
    private javax.swing.JLabel copyright;
    private javax.swing.JRadioButton exBRad;
    private javax.swing.JRadioButton exCatRad;
    private javax.swing.JRadioButton exSBRad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton newBRad;
    private javax.swing.JRadioButton newCatRad;
    private javax.swing.JRadioButton newSBRad;
    private javax.swing.JTextField pIDBox;
    private javax.swing.JTextField pNameBox;
    private javax.swing.JSpinner price;
    private javax.swing.JSpinner quantity;
    private javax.swing.JTextField subCatBox;
    private javax.swing.JComboBox<String> subCatDDBox;
    private javax.swing.JTextField typeBox;
    private javax.swing.JSpinner warranty;
    // End of variables declaration//GEN-END:variables
}
