package com.filopl.shelter.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PostrgreSQLconnect {

    public void saveDataToDataBase() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "5454");
            System.out.println("Connection to databse successfully");
            connection.close();
        } catch (Exception errorMessage) {
            errorMessage.printStackTrace();
            System.out.println(errorMessage);
        }
    }
}
