/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication50;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desert: baLAN");
        System.out.println("Enter step: 13");
        System.out.println("1. Test getDesert()");
        System.out.println("2. Test setStep()");
        System.out.print("Enter TC(1 or 2): ");
        int choice=sc.nextInt();
        Camel obj;
        switch (choice) {
            case 1: obj=new Camel("baLAN", 13);
                System.out.println(obj.getDesert());
                break;
            case 2: System.out.print("Enter new step: ");
                int step=sc.nextInt();
                obj=new Camel("balan", 13);
                obj.setStep(step);
                System.out.println(obj.getStep());
        }
    }
    
}
