/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Statue extends Item {
    private int weight;
    private String color;

    public Statue() {
    }

    public Statue(int weight, String color, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void outputStatue() {
        output();
        System.out.println("Weight:"+weight);
        System.out.println("Colour:"+color);
    }
    public void inputStatue() {
        Scanner sc=new Scanner(System.in);
        weight=sc.nextInt();
        color=sc.next();
    }
}
