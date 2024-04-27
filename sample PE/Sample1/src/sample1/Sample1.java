/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Sample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Book obj = new Book();
        System.out.print("Enter title: ");
        String Title = sc.nextLine();
        obj.setTitle(Title);
        System.out.print("Enter price: ");
        int Price = sc.nextInt();
        obj.setPrice(Price);
        int choice;
        do {
            System.out.println("1. Test getTitle()");
            System.out.println("2. Test setPrice()");
            System.out.print("Enter TC (1 or 2): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: obj.getTitle();
                        break;
                case 2: System.out.print("Enter new price: ");
                        Price = sc.nextInt();
                        obj.setPrice(Price);
                        obj.getPrice();
                        break;
            }
        }
        while (choice <=2);
    }
    
}
