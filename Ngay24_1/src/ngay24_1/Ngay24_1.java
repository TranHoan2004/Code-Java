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
public class Ngay24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Machine remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        Machine.setTimer(10000);
        System.out.println("TV remote's price: "+Machine.price);
        System.out.println("TV remote has: "+Machine.MAXofButtons+" buttons");
    }
    
}
