/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe;

/**
 *
 * @author ADMIN
 */
public class SpecVan extends Van{ 
    int type;

    public SpecVan() {
    }

    public SpecVan(String driver, int rate,int type) {
        super(driver, rate);
        this.type = type;
    }
    void display() {
        String s=super.toString()+" "+type;
        System.out.println(s);
    }
}
