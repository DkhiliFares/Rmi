package rmi_sec_dyn;
import java.rmi.RMISecurityManager;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;
import java.lang.reflect.Constructor;

public class DynamicClient {
    public DynamicClient(String[] args) throws Exception {
        Properties p = System.getProperties();
        String url = p.getProperty("java.rmi.server.codebase");
        Class<?> ClasseClient = RMIClassLoader.loadClass(url, "ReverseClient");
        Constructor<?>[] constructors = ClasseClient.getConstructors();
        constructors[0].newInstance((Object) args);
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            new DynamicClient(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
