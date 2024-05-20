package fabrique;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            RemoteObjectFactoryImpl factory = new RemoteObjectFactoryImpl();
            Naming.rebind("rmi://localhost/RemoteObjectFactory", factory);
            System.out.println("Serveur prêt.");
        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}