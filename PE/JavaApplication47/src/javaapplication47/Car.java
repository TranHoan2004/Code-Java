/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication47;

/**
 *
 * @author ADMIN
 */
public class Car {
    private String maker;
    private int price;

    public Car() {
    }

    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println(maker + ", " + price);
        return maker + ", " + price;
    }    
}
