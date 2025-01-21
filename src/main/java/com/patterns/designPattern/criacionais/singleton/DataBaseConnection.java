package com.patterns.designPattern.criacionais.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private Connection connection;

    private DataBaseConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "1234";
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException("Falha ao conectar no banco de dados", e);
        }
    }


    public static DataBaseConnection getInstance(){
            if (instance == null){
                synchronized (DataBaseConnection.class){
                    if (instance == null){
                        instance = new DataBaseConnection();
                    }
                }
            }
            return instance;
    }

    public  Connection getConnection(){
        return connection;
    }

}
