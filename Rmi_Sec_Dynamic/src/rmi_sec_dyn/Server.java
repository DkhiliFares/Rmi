package rmi_sec_dyn;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        IServerImp serveur = new IServerImp();
        registry.rebind("Server", serveur);
        System.out.println("Serveur prêt");
    }
}
