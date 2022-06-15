/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cristina
 */
public class Conectar {
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/sistemaventa";
    
       
    Connection cn;
   
    
    public Connection conexion(){
        try {
            
            Class.forName(driver);
            cn=(Connection)DriverManager.getConnection(url,user,pass);
        
            System.out.println("conectado");
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cn;
    }
   
}
