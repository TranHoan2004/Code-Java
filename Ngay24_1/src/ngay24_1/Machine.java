/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay24_1;

/**
 *
 * @author ADMIN
 */
public interface Machine {
    final int MAXofButtons=20;
    int price=10;
    public static void setTimer(int number) {
        System.out.println("Shut down after "+number+" seconds");
    }
    public abstract void onDevice();
    abstract public void offDevice();
    default void setLock() {
        System.out.println("Set lock in the default method");
    }
}
