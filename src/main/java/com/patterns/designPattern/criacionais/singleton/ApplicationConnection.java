package com.patterns.designPattern.criacionais.singleton;

import java.sql.Connection;

public class ApplicationConnection {
    public static void main(String[] args){
        DataBaseConnection dataBaseConnection = DataBaseConnection.getInstance();
        Connection connection = dataBaseConnection.getConnection();

        if(connection != null){
            System.out.println("Conexao com a base feita com sucesso");

        }
    }
}
