package rmi_sec_dyn;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;

public class CallbackClient extends UnicastRemoteObject implements ICallback {
    public CallbackClient() throws RemoteException {
        super();
    }

    @Override
    public void notify(String message) throws RemoteException {
        System.out.println("Notification du serveur: " + message);
    }

    public static void main(String[] args) {
        try {
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new RMISecurityManager());
            }
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            IServer server = (IServer) registry.lookup("Server");
            CallbackClient callback = new CallbackClient();
            server.callMeBack(5, "Message à retourner", callback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
