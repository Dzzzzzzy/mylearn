/*
 * @Author: Dzzzzzzy
 * @Date: 2023-10-11 11:04:35
 */
package java8.other;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanLab implements Runnable {

    private static boolean exists = false;

    private static AtomicBoolean EXISTS = new AtomicBoolean(false);

    private String name;

    

    public AtomicBooleanLab(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (!EXISTS.get()) {
            try {
                EXISTS.set(true);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            exists = true;
            System.out.println(name + " enter");
            try {
                System.out.println(name + " working");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " leave");
            exists = false;
            EXISTS.set(false);
        } else {
            System.out.println(name + " give up");
        }
    }

    public static void main(String[] args) {
        AtomicBooleanLab lab1 = new AtomicBooleanLab("lab1");
        AtomicBooleanLab lab2 = new AtomicBooleanLab("lab2");

        new Thread(lab1).start();
        new Thread(lab2).start();

    }
    
    
}
