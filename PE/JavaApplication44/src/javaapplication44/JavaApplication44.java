/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication44;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ElectricMotor obj = new ElectricMotor();
        String name=null;
        int voltage=0;
        int current=0;
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter voltage: ");
        voltage=sc.nextInt();
        System.out.print("Enter current: ");
        current=sc.nextInt();
        System.out.println("1. Test getName()");
        System.out.println("2. Test getPower()");
        System.out.println("3. Test setValue()");
        System.out.print("Enter TC(1,2 or 3): ");
        int choice=sc.nextInt();
        obj=new ElectricMotor(name, voltage, current);
        switch (choice) {
            case 1: System.out.println(obj.getName());
                break;
            case 2: System.out.println(obj.getPower());
                break;
            case 3: obj.setVoltage(voltage);
                break;
        }
    }
    
}
