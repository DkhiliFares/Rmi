package rmi_sec_dyn;
import java.rmi.*;
import java.rmi.server.*;

public class IServerImp extends UnicastRemoteObject implements IServer {
    public IServerImp() throws RemoteException {
        super();
    }

    @Override
    public void callMeBack(int time, String param, ICallback callback) throws RemoteException {
        Servant servant = new Servant(time, param, callback);
        servant.start();
    }
}
