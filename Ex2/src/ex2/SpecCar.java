/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author ADMIN
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar(int type, String maker, int price) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        System.out.println(super.toString()+", "+type);
        return getMaker()+", "+getPrice()+", "+type;
    }

    public void setData() {
        String them="XZ";
        String ketqua=them+getMaker();
        int Price=getPrice()+20;
        System.out.println(ketqua+", "+Price);
    }
    
    public int getValue() {
        int inc=0;
        if (type<7) {
            inc=10;            
        }
        else {
            inc=15;            
        }
        int price=(getPrice()+inc);
        System.out.println(price);
        return getPrice();
    }
}
