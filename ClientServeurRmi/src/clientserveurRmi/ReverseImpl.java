package clientserveurRmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseImpl extends UnicastRemoteObject implements ReverseInterface {
    protected ReverseImpl() throws RemoteException {
        super();
    }

    @Override
    public String reverseString(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}
