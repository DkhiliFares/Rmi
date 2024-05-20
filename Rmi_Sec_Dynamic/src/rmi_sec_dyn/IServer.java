package rmi_sec_dyn;
import java.rmi.*;

public interface IServer extends Remote {
    void callMeBack(int time, String param, ICallback callback) throws RemoteException;
}
