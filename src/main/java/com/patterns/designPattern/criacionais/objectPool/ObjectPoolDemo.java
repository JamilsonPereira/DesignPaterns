package com.patterns.designPattern.criacionais.objectPool;

public class ObjectPoolDemo {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool(3);

        DataBaseConnection connection1 = connectionPool.acquireConnection();
        DataBaseConnection connection2 = connectionPool.acquireConnection();
        DataBaseConnection connection3 = connectionPool.acquireConnection();

        DataBaseConnection connection4 = connectionPool.acquireConnection();


        connectionPool.releaseConnection(connection1);
        connectionPool.releaseConnection(connection2);

        DataBaseConnection connection5 = connectionPool.acquireConnection();

    }
}
