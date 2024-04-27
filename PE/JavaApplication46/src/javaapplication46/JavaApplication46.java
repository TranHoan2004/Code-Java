/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication46;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Book obj;
        obj=new Book("atlanta", 12);
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.println(obj.getTitle());
                break;
            case 2: int newPrice=20;
                obj.setPrice(newPrice);
                System.out.println(obj.getPrice());
        }
    }
    
}
