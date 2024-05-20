package clientserveurRmi;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReverseServer {
    public static void main(String[] args) {
        try {
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            ReverseImpl reverse = new ReverseImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // Port par défaut pour RMI Registry
            registry.rebind("ReverseService", reverse);
            System.out.println("ReverseServer ready.");
        } catch (Exception e) {
            System.err.println("ReverseServer exception:");
            e.printStackTrace();
        }
    }
}
