/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ADMIN
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        thuocTinhCircle obj = new thuocTinhCircle();
        System.out.print("Nhập bán kính hình tròn: ");
        double nhap = 0;
        while (true) {
            try {
                nhap = sc.nextDouble();
                obj.setRadius(nhap);
                obj.calculateArea();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.print("Nhập sai, mời nhập lại");
            }
        }
    }    
}
