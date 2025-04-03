package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    public void setUp(){
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    public void remove(){
        db.disconnect();
    }

    @Test
    public void testConnectionEstablish(){
        assertTrue(db.isConnected());
    }

    @Test
    public void testConnectionClose(){
        db.disconnect();
        assertFalse(db.isConnected());
    }

}
