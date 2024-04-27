/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String owner=null;
        int price=0;
        int color=0;
        int choice=0;
        SpecCala obj;
        do {
            System.out.print("Enter owner: ");
            owner=sc.next();
            System.out.print("Enter price: ");
            price=sc.nextInt();
            System.out.println("1. Test toString()");
            System.out.println("2. Test setData()");
            System.out.println("3. Test getValue()");
            System.out.print("Enter TC (1,2,3): ");
            choice=sc.nextInt();
            obj = new SpecCala(color, owner, price);
            switch (choice) {
                case 1: obj.toString();
                    break;
                case 2: obj.setData();
                    break;
                case 3: obj.getValue();
                    break;
                default: System.out.println("Error");
                    break;
            }
        } while (choice<1&&choice>3);
    }
    
}
