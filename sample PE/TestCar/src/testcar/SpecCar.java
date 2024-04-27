/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcar;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class SpecCar extends Car {
    private int type;

    public SpecCar() {
    }

    public SpecCar(int type, String maker, int price) {
        super(maker, price);
        this.type = type;
    }
    
    public void setData() {
        Scanner sc = new Scanner(System.in);
        String str = "XZ";
        String kq = str+maker;
        System.out.println(kq);
        int price1 = getPrice() +20;
        System.out.println(price1);
    }
    
    public int getValue() {
        int pr;
        if (type < 7) {
            pr=getPrice() + 10;
            System.out.println(pr);
        } 
        else {
            pr=getPrice() + 15;
            System.out.println(pr);
        }
        return getPrice();
    }

    @Override
    public String toString() {
        System.out.println(super.toString()+", " + type);
        return ", " + type;
    }
    
}
