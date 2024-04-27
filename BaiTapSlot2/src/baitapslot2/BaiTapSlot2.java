/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapslot2;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTapSlot2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = 0;
        float[] a;
        do {
            System.out.print("Nhap so nguyen duong trong khoang tu 1 den 20: ");
            try {
                n = sc.nextInt();
            } catch(InputMismatchException e) {
                sc.next();
            }
            
            if (n<1||n>20 ) {
                System.out.println("Nhap sai, vui long nhap lai");
            }
        } while (n<1||n>20);
        a = new float[n];
        for (int i=0;i<n;i++) {
            try {
                a[i]=sc.nextFloat();
                
            } catch (InputMismatchException e) {
                System.out.println("Gia tri k hop le, vui long nhap lai!");
                sc.next();
                i--;
            }
        }
        for (int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
    
}
