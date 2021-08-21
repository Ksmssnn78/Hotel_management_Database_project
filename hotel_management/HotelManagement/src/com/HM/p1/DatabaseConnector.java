/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HM.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mohd Ashraf
 */
public class DatabaseConnector {
    Connection con1;

    public DatabaseConnector() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        database_connect();
    }
    
    public Connection database_connect()
    {
        try{
            //con1=DriverManager.getConnection("jdbc:mysql://localhost/hotel_manegement","root","");
            con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
            
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return con1;
    }
    
}
