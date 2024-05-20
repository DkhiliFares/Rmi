package fabrique;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RemoteObjectFactory extends Remote {
	Voiture createRemoteObject() throws RemoteException;
}
