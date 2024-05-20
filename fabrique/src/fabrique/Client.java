package fabrique;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Recherche de l'objet fabrique distant
            RemoteObjectFactory factory = (RemoteObjectFactory) Naming.lookup("rmi://localhost/RemoteObjectFactory");

            // Création de l'objet distant à l'aide de la fabrique
            Voiture remoteObject = factory.createRemoteObject();

            // Appel de méthode sur l'objet distant
            ((Object) remoteObject).performAction();
        } catch (Exception e) {
            System.err.println("Erreur du client : " + e.getMessage());
            e.printStackTrace();
        }
    }
}