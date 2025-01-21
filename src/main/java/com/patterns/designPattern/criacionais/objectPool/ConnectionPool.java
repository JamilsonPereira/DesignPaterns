package com.patterns.designPattern.criacionais.objectPool;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {
    private final Queue<DataBaseConnection> availableConnections = new LinkedList<>();
    private final int maxSize;


public ConnectionPool(int maxSize){
        this.maxSize =  maxSize;
    for (int i = 1; i <= maxSize; i++){
        availableConnections.add(new DataBaseConnection("Conn-" + i));
    }
    }
    public synchronized DataBaseConnection acquireConnection() {
        if (availableConnections.isEmpty()) {
            System.out.println("Nenhuma conexão disponível. Aguarde...");
            return null; // Ou você pode implementar uma lógica para esperar.
        }
        DataBaseConnection connection = availableConnections.poll();
        connection.connect();
        return connection;
    }

    public synchronized void releaseConnection(DataBaseConnection connection) {
        if (availableConnections.size() < maxSize) {
            connection.disconnect();
            availableConnections.add(connection);
            System.out.println("Conexão retornada ao pool: " + connection);
        }
    }

}
