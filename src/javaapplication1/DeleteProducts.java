/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saleh
 */
public class DeleteProducts extends javax.swing.JFrame {

    /**
     * Creates new form DeleteProducts
     */
    public DeleteProducts() {
        initComponents();
        try {
            showtable();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteProducts.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        backBTN = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllProductsTable = new javax.swing.JTable();
        SearchBox = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        dltBtn = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(29, 31, 47));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBTN.setBackground(new java.awt.Color(29, 31, 47));
        backBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        backBTN.setMaximumSize(new java.awt.Dimension(58, 32));
        backBTN.setMinimumSize(new java.awt.Dimension(58, 32));
        backBTN.setPreferredSize(new java.awt.Dimension(58, 32));
        backBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTNMouseClicked(evt);
            }
        });
        jPanel1.add(backBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Delete Products");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 10, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(910, 700));

        AllProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Sub-Category", "Brand", "Type", "Quantity", "Warranty(Years)", "Price(BDT)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllProductsTable.setName(""); // NOI18N
        AllProductsTable.setOpaque(false);
        AllProductsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AllProductsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        SearchBox.setBackground(new java.awt.Color(255, 255, 255));
        SearchBox.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        SearchBox.setForeground(new java.awt.Color(102, 102, 102));
        SearchBox.setText("Search here...");
        SearchBox.setPreferredSize(new java.awt.Dimension(300, 45));
        SearchBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchBoxFocusLost(evt);
            }
        });
        jPanel1.add(SearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        SearchBtn.setBackground(new java.awt.Color(29, 31, 47));
        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        SearchBtn.setPreferredSize(new java.awt.Dimension(40, 45));
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        dltBtn.setBackground(new java.awt.Color(29, 31, 47));
        dltBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        dltBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dltBtnMouseClicked(evt);
            }
        });
        jPanel1.add(dltBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 510, -1, -1));

        copyright.setForeground(new java.awt.Color(255, 255, 255));
        copyright.setText("Copyright © 2021, TechnoBot BD");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 700, -1, -1));

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

    private void SearchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusGained
        // TODO add your handling code here:
        if(SearchBox.getText().equals("Search here...")){
            SearchBox.setText("");
            SearchBox.requestFocus();
            SearchBox.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_SearchBoxFocusGained

    private void SearchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchBoxFocusLost
        // TODO add your handling code here:
        if(SearchBox.getText().length()== 0){
            SearchBox.setText("Search here...");
            SearchBox.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_SearchBoxFocusLost

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        // TODO add your handling code here:
        if(SearchBox.getText().length()== 0 || SearchBox.getText().equals("Search here...")){
            JOptionPane.showMessageDialog(null, "Invalid input", "Caution", JOptionPane.OK_OPTION);
        }
        else{
            try {
                searchtable();
            } catch (SQLException ex) {
                Logger.getLogger(AllProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void dltBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dltBtnMouseClicked
        // TODO add your handling code here:
        if(AllProductsTable.getModel().getRowCount()>1 || AllProductsTable.getModel().getRowCount()<1){
            JOptionPane.showMessageDialog(null, "Please Search for the Product \n That you want to DELETE", "Caution", JOptionPane.OK_OPTION);
        }
        else{
            confirmDelete();
            clear();
            try {
                showtable();
            } catch (SQLException ex) {
                Logger.getLogger(DeleteProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_dltBtnMouseClicked
    
    
    public void showtable()throws SQLException{
        String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        String user = "sa";
        String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            
            AllProductsTable.setModel(new DefaultTableModel(null, new String [] {"Product ID", "Product Name", "Category", "Sub-Category", "Brand", "Type", "Quantity", "Warranty(Years)", "Price(BDT)"}));
            
            String sql = "Select * From PRODUCTS";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String pid = rs.getString("PRODUCT_ID");
                String pname = rs.getString("PRODUCT_NAME");
                String cat = rs.getString("CAT_NAME");
                String subcat = rs.getString("SUB_CAT_NAME");
                String bra = rs.getString("BRAND_NAME");
                String ptype = rs.getString("PRODUCT_TYPE");
                String qt = String.valueOf(rs.getInt("QUANTITY"));
                String wr = String.valueOf(rs.getInt("WARRANTY"));
                String prc = String.valueOf(rs.getInt("PRICE"));
                
                String tbdata[] = {pid,pname,cat,subcat,bra,ptype,qt,wr,prc};
                
                DefaultTableModel apt =  (DefaultTableModel) AllProductsTable.getModel();
                apt.addRow(tbdata);
            }
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR");
        }
    }
    
    public void searchtable()throws SQLException{
        String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        String user = "sa";
        String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            
            String srch = SearchBox.getText();
            
            AllProductsTable.setModel(new DefaultTableModel(null, new String [] {"Product ID", "Product Name", "Category", "Sub-Category", "Brand", "Type", "Quantity", "Warranty(Years)", "Price(BDT)"}));
            
            //String sql = "Select * From PRODUCTS";
            
            //Statement st = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?");
            pst.setString(1, srch);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String pid = rs.getString("PRODUCT_ID");
                String pname = rs.getString("PRODUCT_NAME");
                String cat = rs.getString("CAT_NAME");
                String subcat = rs.getString("SUB_CAT_NAME");
                String bra = rs.getString("BRAND_NAME");
                String ptype = rs.getString("PRODUCT_TYPE");
                String qt = String.valueOf(rs.getInt("QUANTITY"));
                String wr = String.valueOf(rs.getInt("WARRANTY"));
                String prc = String.valueOf(rs.getInt("PRICE"));
                
                
                String tbdata[] = {pid,pname,cat,subcat,bra,ptype,qt,wr,prc};
                
                DefaultTableModel apt =  (DefaultTableModel) AllProductsTable.getModel();
                apt.addRow(tbdata);
                
            }
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("ERROR");
        }
    }
    
    
    public void deleteproduct(){
        String url ="jdbc:sqlserver://KAMI\\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        String user = "sa";
        String password = "123456789";
        
        //String url ="jdbc:sqlserver://DESKTOP-4I9BNBL\SQLEXPRESS:1433;databaseName=TECHNOBOT";
        //String user = "sa";
        //String password = "salsabeel02";
        
        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            
            String srch = SearchBox.getText();
            //String sql = "Select * From SUBCATEGORY Where CAT_NAME = " " Order By SUB_CAT_ID";
            
            PreparedStatement pst = conn.prepareStatement("Delete From PRODUCTS WHERE PRODUCT_ID = ?");
            pst.setString(1, srch);
            
            //Statement st = conn.createStatement();
            
            //ResultSet rs = pst.executeQuery();
            
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Product deleted");
            }
            
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR");
        }
    }
    
    public void confirmDelete(){
        int confirm = JOptionPane.showConfirmDialog(null,"Sure? You want to Delete the Product?", "Caution",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            try{
                deleteproduct();
                JOptionPane.showMessageDialog(null, "Successfully Deleted", "Successs", JOptionPane.INFORMATION_MESSAGE);
                    
            }catch(Exception e){
                System.out.println("ERROR");
            }   
        }
    }
    
    public void clear(){
        SearchBox.setText("Search here...");
        SearchBox.setForeground(new Color(102,102,102));
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
            java.util.logging.Logger.getLogger(DeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteProducts dp = new DeleteProducts();
                dp.setLocationRelativeTo(null);
                dp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllProductsTable;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton dltBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
