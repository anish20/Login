/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectivity;
import java.sql.*;
import  javax.swing.*;
/**
 *
 * @author ANISH
 */
public class ConnectDb {
    public static Connection con=null;
    public static Connection getConnect(){
        try {
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\netBeans project\\Login\\login_db.sqlite");
            JOptionPane.showMessageDialog(null, "Connection Created Suceessfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    public static void main(String[] args) {
        getConnect();
    }
}
