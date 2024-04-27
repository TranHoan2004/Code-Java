/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author ADMIN
 */
public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Brum Brum");
    }
    public void stop() {
        System.out.println("Kisss");
    }
    protected void move() {
        System.out.println("Car is moving");
    }
}

