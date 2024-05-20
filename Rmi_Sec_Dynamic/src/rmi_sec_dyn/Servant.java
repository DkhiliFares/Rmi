package rmi_sec_dyn;
import java.rmi.*;

public class Servant extends Thread {
    private int time;
    private String param;
    private ICallback callback;

    public Servant(int time, String param, ICallback callback) {
        this.time = time;
        this.param = param;
        this.callback = callback;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time * 1000);
            callback.notify(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
