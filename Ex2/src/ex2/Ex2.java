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
        System.out.print("Enter maker: ");
        String maker = sc.next();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("Enter type: ");
        int type=sc.nextInt();
        int choice=0;
        Car obj = new SpecCar(type, maker, price);
        do {
            System.out.println("1. Test toString()");
            System.out.println("2. Test setData()");
            System.out.println("3. Test getValue()");
            System.out.print("Enter TC (1,2,3): ");
            choice=sc.nextInt();
            switch(choice) {
                case 1: ((SpecCar)obj).toString();
                    break;
                case 2: ((SpecCar)obj).setData();
                    break;
                case 3: ((SpecCar)obj).getValue();
                    break;
                default: break;
            } 
        }while (choice>3 || choice <1);
    }
    
}
