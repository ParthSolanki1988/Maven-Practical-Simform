package com.simformsolution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SQLConnection {


  public static void main(String[] args) {
    // Database credentials
    String url = "jdbc:mysql://localhost:3306/mydatabase";
    String username = "root";
    String password = "Parth@1988";


    Product product = new Product(103 , "RFile" , 3000 , 1);
    int id = product.getProductId();
    String name = product.getProductName();
    float price = product.getProductPrice();
    int quantity = product.getProductQuantity();


    try {
      // Register the JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish a connection
      Connection connection = DriverManager.getConnection(url, username, password);

      // Connection successful
      System.out.println("Connected to the MySQL database!");

      // Perform database operations


      // SQL INSERT statement
      String sql = "INSERT INTO products (id, name , price , quantity) VALUES (? , ? , ? , ?)";

      // Prepare the statement
      PreparedStatement statement = connection.prepareStatement(sql);

      // Set parameter values
      statement.setInt(1, id);
      statement.setString(2, name);
      statement.setFloat(3,price);
      statement.setInt(4,quantity);


      // Execute the statement
      int rowsAffected = statement.executeUpdate();

      // Check if the insertion was successful
      if (rowsAffected > 0) {
        System.out.println("Inserting Product like => ");
        System.out.println("id : " + id);
        System.out.println("name : " + name );
        System.out.println("price per unit: " + price);
        System.out.println("quantity : " + quantity );
        System.out.println("Product inserted successfully!");
      } else {
        System.out.println("Failed to insert product.");
      }

      // Close the resources
      statement.close();
      connection.close();


      // Close the connection
      connection.close();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
