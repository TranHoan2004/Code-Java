/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestArrLst;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.next();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        Book obj = new Book(title, price);
        int choice=0;
        do {
            System.out.println("1. Test getTitle()");
            System.out.println("2. Test setPrice()");
            System.out.print("Enter TC (1 or 2): ");
            choice=sc.nextInt();
            switch(choice) {
                case 1: obj.getTitle();
                    break;
                case 2: 
                    System.out.print("Enter new price: ");
                    price=sc.nextInt(); 
                    obj.setPrice(price);
                    System.out.println(obj.getPrice());
                    break;
                default: break;
            }
        } while (choice != 1 && choice !=2);
    }
}
