/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import java.sql.*;
import java.util.*;
public class Cargo {
    public Connection connection;
    
  
    public void connectDB(){
    
    
    try{
    
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=cargo;selectMethod=cursor", "sa", "123456");
            
            
  
            
              System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            
            
            
           
             
            
                                                                   
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM register");
            
            
              while (resultSet.next()) {
             
                System.out.println("Customer NAME:" + resultSet.getString("name") +" "+resultSet.getString("contact"));
                
            }
            
       
             
             
            
            
    }catch(Exception e){
    
       e.printStackTrace();
    
    
    }
    
    
    }
    
    
    
    public static void main(String[] args) {
       Cargo cnObj = new Cargo();
        cnObj.connectDB();
    }
    
}