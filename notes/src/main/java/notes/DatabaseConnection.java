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
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/m7xp61Lk1E", "m7xp61Lk1E", "d37KIeRBVX");
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
