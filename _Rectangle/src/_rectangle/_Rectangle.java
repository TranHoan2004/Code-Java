/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _rectangle;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ADMIN
 */
public class _Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Rectangle obj;
        obj=new Rectangle();
        
        double width, height;
        while (true) {
            try {
                System.out.print("height ");
                height=sc.nextDouble();
                System.out.print("width ");
                width = sc.nextDouble();
                obj.setHeight(height);
                obj.setWidth(width);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid, try again");
                sc.next();
            }
        }
        sc.close();
        System.out.println("Area: "+obj.calculateArea());
        System.out.println("Perimeter: "+obj.calculatePerimeter());
    }
    
}
