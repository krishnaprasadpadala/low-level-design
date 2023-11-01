package com.java.lld.design.patterns.singleton;

public class ConnectionPool {
    
    private static ConnectionPool INSTANCE;
    private ConnectionPool() {
        
    }
    
    public static ConnectionPool getInstance() {
        if(INSTANCE == null) {
            synchronized (ConnectionPool.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }
        return INSTANCE;
    }
}
