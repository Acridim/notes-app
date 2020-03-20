/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;
import java.sql.*;

/**
 *
 * @author lovro
 */
public class DatabaseConnection {
    private Connection con;
    
    public DatabaseConnection(){
        
    }
    public void Open(){
    try{
        con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/m7xp61Lk1E", "m7xp61Lk1E", "nkeQ5jwfMn");
    }
    catch(Exception ex){
    }
    }
}
