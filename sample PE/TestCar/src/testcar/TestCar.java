/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcar;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class TestCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SpecCar obj = new SpecCar();
        System.out.print("Enter maker: ");
        String maker = sc.nextLine();
        obj.setMaker(maker);
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        obj.setPrice(price);
        System.out.print("Enter type: ");
        int type = sc.nextInt();
        int choice;
        do {
            System.out.println("1. Test toString()");
            System.out.println("2. Test setData()");
            System.out.println("3. Test getValue()");
            System.out.print("Enter TC (1,2,3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: obj.toString();
                        
                        break;
                case 2:
                    obj.setData();
                    break;
                case 3: 
                    obj.getValue();
                    break;
            }
        } while (choice ==1 || choice ==2 || choice ==3);
    }
    
}
