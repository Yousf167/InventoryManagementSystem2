package org.example.inventorymanagementsystem;

import java.sql.*;
public class Test {
      static final String DB_URL = "jdbc:sqlite:database.db";

      public static void main(String[] args) 
      {
            
            try(Connection conn = DriverManager.getConnection(DB_URL))
            {
                  System.out.println("succesfull");
            }
            catch(Exception SQLException)
            {
                  System.out.println("unsuccessfull");
            } 
      }
}