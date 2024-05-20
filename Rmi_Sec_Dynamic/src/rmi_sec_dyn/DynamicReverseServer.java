package rmi_sec_dyn;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;

public class DynamicReverseServer {
    public static void main(String[] args) {
        try {
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new RMISecurityManager());
            }
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Serveur : Construction de l'implementation");
            Properties p = System.getProperties();
            String url = p.getProperty("java.rmi.server.codebase");
            Class<?> ClasseServeur = RMIClassLoader.loadClass(url, "FabReverseImpl");
            registry.rebind("Fabrique", (Remote) ClasseServeur.newInstance());
            System.out.println("Serveur prêt.");
        } catch (Exception e) {
            System.out.println("Erreur de liaison de l'objet Fabrique");
            e.printStackTrace();
        }
    }
}
