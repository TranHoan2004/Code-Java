/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication47;

/**
 *
 * @author ADMIN
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    public void setData() {
        String addString="XZ";
        String newString=addString.concat(getMaker());
        setMaker(newString);
        int newValue=getValue()+20;
        System.out.println(newValue);
    }
    
    public int getValue() {
        int newPrice=0;
        if (type<7) {
            newPrice=getPrice()+10;
            setPrice(newPrice);
        }
        else {
            newPrice=getPrice()+15;
            setPrice(newPrice);
        }
        return newPrice;
    }
    
    @Override
    public String toString() {
        System.out.println(super.toString()+", " + type);
        return ", "+ type;
    }
    
}
