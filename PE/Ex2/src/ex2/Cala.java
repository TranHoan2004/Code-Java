/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author ADMIN
 */
public abstract class Cala {
    private String owwner;
    private int price;

    public Cala() {
    }

    public Cala(String owwner, int price) {
        this.owwner = owwner;
        this.price = price;
    }

    public String getOwwner() {
        return owwner;
    }

    public void setOwwner(String owwner) {
        this.owwner = owwner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cala{" + "owwner=" + owwner + ", price=" + price + '}';
    }
    
}
