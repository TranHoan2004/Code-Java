/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.security.acl.Owner;

/**
 *
 * @author ADMIN
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala(int color, String owwner, int price) {
        super(owwner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "SpecCala{" + "color=" + color + '}';
    }
    public void setData() {
        String newString=null;
        String[] array=getOwwner().split("");
        for (String i: array) {
            for (int y=0;y<getOwwner().length();y++) {
                if (y==1) {
                    newString=getOwwner().replace(i, "XX");
                }
            }
        }
    }
    public int getValue() {
        if (color%2==1) {
            return getPrice()+3;
        }
        else {
            return getPrice()+7; 
        }
        
    }
}
