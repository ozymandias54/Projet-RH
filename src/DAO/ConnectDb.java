/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DAO;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectDb {
private static String url = "jdbc:mysql://localhost/RH";
private static String user = "root";
private static String password = "";
private static Connection connect;

public static Connection getConnection (){
if (connect ==null) {
     try {
         connect = (Connection) DriverManager.getConnection (url, user, password);
     } catch (SQLException ex) {
         Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
     }
}
return connect;
}

   
    public static void main(String[] args) {
     Connection connect=ConnectDb.getConnection();
        if(connect!=null)
            System.out.println("connection reussi");
        else
            System.out.println("pas de connection");
    }
       
}
    

