/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HM.p1;

import java.sql.Connection;
import java.sql.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;


/**
 *
 * @author Mohd Ashraf
 */
public class RoomUi extends javax.swing.JFrame {
    
    int x=0;
    ResultSet rs;
    Connection con;
    DatabaseConnector db;
    PreparedStatement select,insert;
    int roomid,cusid;
    Date cin,cout;
    String emp;
    

    /**
     * Creates new form RoomUi
     */
    public RoomUi() {
        initComponents();
        db = new DatabaseConnector();
        con = db.database_connect();
        combo_box();
        tableread();
        table_show();
        
    }
    
    public RoomUi(int fl,String id){
        initComponents();
        db = new DatabaseConnector();
        con = db.database_connect();
        combo_box();
        tableread();
        table_show();
        x=fl;
        emp = id;
        
    }
    
    public RoomUi(int fl){
        initComponents();
        db = new DatabaseConnector();
        con = db.database_connect();
        combo_box();
        tableread();
        table_show();
        x=fl;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfld_nid = new javax.swing.JTextField();
        txtfld_name = new javax.swing.JTextField();
        txtfld_address = new javax.swing.JTextField();
        txtfld_contact = new javax.swing.JTextField();
        txtfld_room = new javax.swing.JTextField();
        DateChooser_check_in = new com.toedter.calendar.JDateChooser();
        DateChooser_check_out = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboBox_room_type = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btn_logout_ = new javax.swing.JButton();
        ComboBox_payment = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_room_info = new javax.swing.JTable();
        btn_search_ = new javax.swing.JButton();
        btn_confirm_ = new javax.swing.JButton();
        btn_cancel_ = new javax.swing.JButton();
        btn_Update_info_ = new javax.swing.JButton();
        btn_customer_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("New Booking");

        DateChooser_check_in.setDateFormatString("MON-DD-YYYY");

        DateChooser_check_out.setDateFormatString("MON-DD-YYYY");

        jLabel2.setText("Customer NID:");

        jLabel3.setText("Name:");

        jLabel4.setText("Address:");

        jLabel5.setText("Contact no:");

        jLabel6.setText("Room No:");

        jLabel8.setText("Check-in :");

        jLabel9.setText("Check-out:");

        ComboBox_room_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel10.setText("Room Type:");

        btn_logout_.setText("Logout/Return");
        btn_logout_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout_ActionPerformed(evt);
            }
        });

        ComboBox_payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "On cash", "Card", "Cheque" }));

        jLabel11.setText("Payment:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel8)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBox_payment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_room_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfld_nid)
                            .addComponent(txtfld_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfld_address, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfld_contact, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfld_room, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateChooser_check_in, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(DateChooser_check_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_logout_)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btn_logout_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfld_nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfld_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfld_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_room_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26)
                        .addComponent(DateChooser_check_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateChooser_check_out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jTable_room_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Room Type", "Bed Number", "Bed Type", "Cost", "TV", "WIFI", "Status"
            }
        ));
        jTable_room_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_room_infoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_room_info);

        btn_search_.setText("Search");
        btn_search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_ActionPerformed(evt);
            }
        });

        btn_confirm_.setText("Confirm");
        btn_confirm_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirm_ActionPerformed(evt);
            }
        });

        btn_cancel_.setText("Cancel");
        btn_cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_ActionPerformed(evt);
            }
        });

        btn_Update_info_.setText("Update Info");
        btn_Update_info_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Update_info_ActionPerformed(evt);
            }
        });

        btn_customer_.setText("Customer info");
        btn_customer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customer_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_confirm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Update_info_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_customer_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_Update_info_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_search_)
                .addGap(50, 50, 50)
                .addComponent(btn_confirm_)
                .addGap(51, 51, 51)
                .addComponent(btn_cancel_)
                .addGap(108, 108, 108)
                .addComponent(btn_customer_)
                .addGap(41, 41, 41))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combo_box(){
        try{
            select = con.prepareStatement("select * from test.ROOMTYPE");
            rs = select.executeQuery();
            while(rs.next())
            {
                String rm;
                rm = rs.getString("ROOM_CLASS");
                ComboBox_room_type.addItem(rm);
            }
        }catch(SQLException ex){
             System.out.println(ex);
        }
    }
    
    private void tableread()
    {
        try
        {
            select = con.prepareStatement("select * from test.ROOM");
            rs = select.executeQuery();
            
        }catch(SQLException ex){
             System.out.println(ex);
        }
          
    }
    
    private void table_show()
    {
        try{
            DefaultTableModel df = (DefaultTableModel) jTable_room_info.getModel();
            df.setRowCount(0);
            
            while(rs.next())
            {
               Vector v1 = new Vector();
               
               v1.add(rs.getString("ROOM_NAME"));
               v1.add(rs.getString("ROOM_TYPE"));
               v1.add(rs.getInt("BED_NUMBER"));
               v1.add(rs.getString("BED_TYPE"));
               v1.add(rs.getInt("COST"));
               v1.add(rs.getString("TV"));
               v1.add(rs.getString("WIFI"));
               v1.add(rs.getString("STATUS"));
               
                df.addRow(v1);
               
               //df.addRow(v1);
            }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
    }
    
    private void btn_search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_ActionPerformed
        // TODO add your handling code here:
        
        String room_no,room_type;
        
        room_no = txtfld_room.getText();
        room_type = ComboBox_room_type.getSelectedItem().toString();
        if(!(room_no.isEmpty()) && !(room_type.isEmpty()))
        {
            try {
                select = con.prepareStatement("select * from test.ROOM where ROOM_TYPE=? AND ROOM_NAME=?");
                select.setString(1, room_type);
                select.setString(2, room_no);
                rs = select.executeQuery();
                table_show();
            } catch (SQLException ex) {
               System.out.println(ex);
            }
            
        }else if(!(room_no.isEmpty()) && room_type.isEmpty()){
            try {
                select = con.prepareStatement("select * from test.ROOM where ROOM_NAME=?");
                select.setString(1, room_no);
                rs = select.executeQuery();
                table_show();
            } catch (SQLException ex) {
               System.out.println(ex);
            }
            
        }else if(room_no.isEmpty() && !(room_type.isEmpty())){
            try {
                select = con.prepareStatement("select * from test.ROOM where ROOM_TYPE=?");
                select.setString(1, room_type);
                rs = select.executeQuery();
                table_show();
            } catch (SQLException ex) {
               System.out.println(ex);
            }
        }else{
            tableread();
            table_show();
        }
       
    }//GEN-LAST:event_btn_search_ActionPerformed

    private void jTable_room_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_room_infoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dt= (DefaultTableModel) jTable_room_info.getModel();
        int row = jTable_room_info.getSelectedRow();
        String r_nm = dt.getValueAt(row, 0).toString();
        txtfld_room.setText(r_nm);
        String r_tp = dt.getValueAt(row, 1).toString();
        int l = ComboBox_room_type.getItemCount();
        int i=0;
        while(i<=l)
        {
            String temp= ComboBox_room_type.getItemAt(i);
            if(temp.equals(r_tp))
            {
                break;
            }
            i++;
        }
        ComboBox_room_type.setSelectedIndex(i);
        
    }//GEN-LAST:event_jTable_room_infoMouseClicked

    private void btn_logout_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout_ActionPerformed
        // TODO add your handling code here:
        if(x==2)
        {
            this.dispose();
            new loginUi().setVisible(true);
            
        }else{
            this.dispose();
            new MainMenuUi().setVisible(true);
        }
        
    }//GEN-LAST:event_btn_logout_ActionPerformed

    private void btn_customer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customer_ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CustomerUi(x,emp).setVisible(true);
    }//GEN-LAST:event_btn_customer_ActionPerformed

    private void btn_cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_ActionPerformed
        // TODO add your handling code here:
        txtfld_name.setText("");
        txtfld_nid.setText("");
        txtfld_address.setText("");
        txtfld_contact.setText("");
        txtfld_room.setText("");
        ComboBox_room_type.setSelectedIndex(0);
        ComboBox_payment.setSelectedIndex(0);
        DateChooser_check_in.setDate(null);
        DateChooser_check_out.setDate(null);
    }//GEN-LAST:event_btn_cancel_ActionPerformed

    private void btn_confirm_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirm_ActionPerformed
        // TODO add your handling code here:
        
        String nid,name,addr,cont,room,rmtp,pay,cin_Date="",cout_Date="";
        
        
        nid = txtfld_nid.getText().toString();
        name = txtfld_name.getText().toString();
        addr = txtfld_address.getText().toString();
        cont = txtfld_contact.getText().toString();
        room = txtfld_room.getText().toString();
        rmtp = ComboBox_room_type.getSelectedItem().toString();
        pay = ComboBox_payment.getSelectedItem().toString();
        //DateChooser_check_in.getDate().toString();
        //DateChooser_check_out.getDate().toString();
        
        if(nid.isEmpty() || name.isEmpty() || addr.isEmpty() || cont.isEmpty() || room.isEmpty() || rmtp.isEmpty() || pay.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please inset all data.");
            return;
        }
       
        
        if(DateChooser_check_in.getDate().toString() == null  || DateChooser_check_out.getDate().toString()==null)
        {
            JOptionPane.showMessageDialog(this, "Please inset all data.");
        }else{
            cin = new Date(DateChooser_check_in.getDate().getTime());
            cout = new Date(DateChooser_check_out.getDate().getTime());
        }
        
        //cin =  (Date) DateChooser_check_in.getDate();
        //cout =  (Date) DateChooser_check_out.getDate();
        
        
        //insert into BOOKING(ROOM_ID,CUSTOMER_ID,CHECK_IN,CHECK_OUT,STATUS)
        //VALUES(1001,1,TO_DATE('OCT-03-2021','MON-DD-YYYY'),TO_DATE('OCT-06-2021','MON-DD-YYYY'),'BOOKED');
            
//insert into BOOKING(ROOM_ID,CUSTOMER_ID,CHECK_IN,CHECK_OUT)
//VALUES(1001,1,'OCT-03-2021','OCT-06-2021');

            //insert into table CUSTOMER
        try {
            insert = con.prepareStatement("insert into test.CUSTOMER(CUS_NID,CUS_NAME,CUS_ADDRESS,CUS_CONTACT) values(?,?,?,?)");
            insert.setString(1, nid);
            insert.setString(2, name);
            insert.setString(3, addr);
            insert.setString(4, cont); 
            insert.executeUpdate();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        
        // select from ROOM table
        try{
            select = con.prepareStatement("select * from test.ROOM where ROOM_NAME=?");
            select.setString(1, room);
            rs = select.executeQuery();
            while(rs.next())
            {
                roomid = rs.getInt("ROOM_ID");
            } 
        }catch(SQLException ex)
        {
            System.out.print(ex);
        }
        //Select from table CUSTOMER
        try{
            select = con.prepareStatement("select * from test.CUSTOMER where CUS_NID=?");
            select.setString(1, nid);
            rs = select.executeQuery();
            while(rs.next())
            {
                cusid = rs.getInt("CUSTOMER_ID");
            } 
        }catch(SQLException ex)
        {
            System.out.print(ex);
        }
        
        try {
            insert = con.prepareStatement("insert into test.BOOKING(ROOM_ID,CUSTOMER_ID,CHECK_IN,CHECK_OUT,PAYMENT) values(?,?,?,?,?)");
            insert.setInt(1, roomid);
            insert.setInt(2, cusid);
            insert.setDate(3,cin);
            insert.setDate(4,cout); 
            insert.setString(5, pay); 
            insert.executeUpdate();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        
    }//GEN-LAST:event_btn_confirm_ActionPerformed

    private void btn_Update_info_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Update_info_ActionPerformed
        
        if(x==2){
            this.dispose();
            new UpdateInfoUi(emp).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"This option is only for NON-admin user");
        }
    }//GEN-LAST:event_btn_Update_info_ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_payment;
    private javax.swing.JComboBox<String> ComboBox_room_type;
    private com.toedter.calendar.JDateChooser DateChooser_check_in;
    private com.toedter.calendar.JDateChooser DateChooser_check_out;
    private javax.swing.JButton btn_Update_info_;
    private javax.swing.JButton btn_cancel_;
    private javax.swing.JButton btn_confirm_;
    private javax.swing.JButton btn_customer_;
    private javax.swing.JButton btn_logout_;
    private javax.swing.JButton btn_search_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_room_info;
    private javax.swing.JTextField txtfld_address;
    private javax.swing.JTextField txtfld_contact;
    private javax.swing.JTextField txtfld_name;
    private javax.swing.JTextField txtfld_nid;
    private javax.swing.JTextField txtfld_room;
    // End of variables declaration//GEN-END:variables
}
