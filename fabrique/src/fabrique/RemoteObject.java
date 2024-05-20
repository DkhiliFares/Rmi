package fabrique;

import java.rmi.Remote;
 import java.rmi.RemoteException;
 
public interface RemoteObject extends Remote {
void performAction() throws RemoteException;
}
