package fabrique;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObjectImpl extends UnicastRemoteObject implements RemoteObject {
    protected RemoteObjectImpl() throws RemoteException {
        super();
    }

    public void performAction() throws RemoteException {
        System.out.println("Action effectuée sur l'objet distant !");
    }
}