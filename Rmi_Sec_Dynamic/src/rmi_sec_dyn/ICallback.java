package rmi_sec_dyn;
import java.rmi.*;

public interface ICallback extends Remote {
    void notify(String message) throws RemoteException;
}
