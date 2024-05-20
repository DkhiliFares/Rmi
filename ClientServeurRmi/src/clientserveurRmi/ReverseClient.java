package clientserveurRmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReverseClient {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java ReverseClient <string>");
            System.exit(1);
        }

        try {
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            Registry registry = LocateRegistry.getRegistry("localhost"); // Port par défaut
            ReverseInterface stub = (ReverseInterface) registry.lookup("ReverseService");
            String response = stub.reverseString(args[0]);
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("ReverseClient exception:");
            e.printStackTrace();
        }
    }
}
