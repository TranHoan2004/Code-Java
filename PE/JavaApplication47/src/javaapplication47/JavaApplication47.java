/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication47;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SpecCar obj=new SpecCar();
        System.out.println("Enter maker: hala");
        System.out.println("Enter price: 500");
        System.out.println("Enter type: 7");
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1: obj=new SpecCar("hala", 500, 7);
                obj.toString();
                break;
            case 2: obj=new SpecCar("hala", 500, 7);
                ((SpecCar)obj).setData();
                System.out.println(obj.getMaker()+", "+obj.getPrice());
                break;
            case 3: obj=new SpecCar("hala", 500, 6);
                System.out.println(((SpecCar)obj).getValue());
                break;
            case 4: obj=new SpecCar("hala", 500, 8);
                System.out.println(((SpecCar)obj).getValue());
                break;
        }
    }
    
}
