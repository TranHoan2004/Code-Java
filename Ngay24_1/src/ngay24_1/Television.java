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
public class Television implements Machine{

    @Override
    public void onDevice() {
        System.out.println("on TV");
    }

    @Override
    public void offDevice() {
        System.out.println("off TV");
    }
    
}