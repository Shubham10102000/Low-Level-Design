package com.lld.creational.objectPool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    List<DBConnection> freeConnectionsInPool = new ArrayList<>();
    List<DBConnection> connectionsCurrentlyInUse = new ArrayList<>();
    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;
    public static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnectionsInPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance() {
        synchronized (DBConnectionPoolManager.class) {
            if (dbConnectionPoolManagerInstance == null) {
                dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DBConnection getDBConnection() {
        if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() < MAX_POOL_SIZE) {
            freeConnectionsInPool.add(new DBConnection());
            System.out.println("creating new connection and putting into the pool, free pool size: " + freeConnectionsInPool.size());
        } else if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() >= MAX_POOL_SIZE) {
            System.out.println("can not create new DBConnection, as max limit reached");
            return null;
        }
        DBConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size() - 1);
        connectionsCurrentlyInUse.add(dbConnection);
        System.out.println("Adding db connection into Use pool, size: " + connectionsCurrentlyInUse.size());
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            connectionsCurrentlyInUse.remove(dbConnection);
            System.out.println("Removing db connection from use poll, size: " + connectionsCurrentlyInUse.size());
            freeConnectionsInPool.add(dbConnection);
            System.out.println("Adding db connection from free poll, size: " + freeConnectionsInPool.size());
        }
    }
}
