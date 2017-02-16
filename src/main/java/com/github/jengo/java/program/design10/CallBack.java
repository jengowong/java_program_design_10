package com.github.jengo.java.program.design10;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CallBack extends Remote {
    /** The server notifies the client for taking a turn */
    public void takeTurn(boolean turn) throws RemoteException;

    /** The server sends a message to be displayed by the client */
    public void notify(String message)
            throws RemoteException;

    /** The server notifies a client of the other player's move */
    public void mark(int row, int column, char token)
            throws RemoteException;
}
