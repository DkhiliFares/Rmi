package rmi_sec_dyn;
import java.rmi.RMISecurityManager;

public class ReverseClient {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        // Connexion au serveur et appels RMI...
    }
}
