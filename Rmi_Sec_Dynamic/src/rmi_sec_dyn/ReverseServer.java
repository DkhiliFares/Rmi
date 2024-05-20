package rmi_sec_dyn;
import java.rmi.RMISecurityManager;

public class ReverseServer {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        // Configuration et lancement du serveur...
    }
}
