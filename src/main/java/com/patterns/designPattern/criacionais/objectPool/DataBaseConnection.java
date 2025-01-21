package com.patterns.designPattern.criacionais.objectPool;

public class DataBaseConnection {

    private final String connectionId;

    public DataBaseConnection(String connectionId) {
        this.connectionId = connectionId;
    }

    public void connect() {
        System.out.println("Connection " + connectionId + "Ok");
    }

    public void disconnect(){
        System.out.println("Connection" + connectionId + "disconnected");
    }

    @Override
    public String toString() {
        return "DataBaseConnection{" + "connectionId" + connectionId + '\'' + '}';
    }
}
