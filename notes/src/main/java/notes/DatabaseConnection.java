/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lovro
 */
public class DatabaseConnection {
    public Connection con;
    
    public DatabaseConnection(){
        
    }
    public void Open(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7329161", "sql7329161", "dNeDDGsRpE");
            //("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7328719","sql7328719","Xd55U7zAXZ")
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Cant connect to database, please try again");
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Close(){
        try {
            con.close();
        }   
        catch (SQLException ex) {
            
        }
    }
}
