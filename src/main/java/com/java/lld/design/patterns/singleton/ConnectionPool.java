package com.java.lld.design.patterns.singleton;

public class ConnectionPool {
    
    private static ConnectionPool INSTANCE = new ConnectionPool();
    private ConnectionPool() {
        
    }
    
    public static ConnectionPool getInstance() {
        return INSTANCE;
    }
}
