package com.java.lld.design.patterns.singleton;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionPoolTest {
    
    @Test
    void shouldCreateSingleInstanceWhenGetInstanceIsCalledMultipleTimes() {
        ConnectionPool connectionPool1 = ConnectionPool.getInstance();
        ConnectionPool connectionPool2 = ConnectionPool.getInstance();

        assertEquals(connectionPool1, connectionPool2);
    }

}