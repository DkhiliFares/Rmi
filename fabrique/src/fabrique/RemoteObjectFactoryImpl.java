package fabrique;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObjectFactoryImpl extends UnicastRemoteObject implements RemoteObjectFactory{
protected RemoteObjectFactoryImpl() throws RemoteException{
	super();
}
public Voiture createRemoteObject() throws RemoteException{
	return new Voiture();
}
}
