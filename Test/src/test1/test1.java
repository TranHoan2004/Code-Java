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
public class test1{
    public static void main(String[] args) {
        Vehicle xe = new Motorcycle();
        System.out.println("I have a motorbike");
        xe.start();
        xe.stop();
        Vehicle xe2 = new Car();
        System.out.println("I have a car");
        xe2.start();
        xe2.stop();
//        ((Motorcycle)xe).doXang();
//        ((Car)xe2).move();
        if (xe instanceof Motorcycle) {
            ((Motorcycle)xe).doXang();
        }
        if (xe2 instanceof Car) {
            ((Car)xe2).move();
        }
    }
}
