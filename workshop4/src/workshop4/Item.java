/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        value=sc.nextInt();
        if (value>0) {
            creator=sc.next();
        }
    } 
    public void output() {
        System.out.println("Value:"+value);
        System.out.println("Creator:"+creator);
    }
}
