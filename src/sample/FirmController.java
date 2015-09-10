package sample;

import java.lang.Thread;
import java.lang.Runnable;

/**
 * Created by inoob on 11/09/15.
 */
public class FirmController implements Runnable{
    Thread t;
    private boolean suspendFlag;

    public FirmController(){
        t = new Thread("firm_control");
        suspendFlag = false;
        t.start();
    }

    public void run(){
        try {
            while (suspendFlag){
                wait();
            }
        }catch(InterruptedException iex){
            iex.printStackTrace();
        }
    }
}
