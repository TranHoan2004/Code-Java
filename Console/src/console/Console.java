/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ADMIN
 */
public class Console {
    

    /**
     * @param args the command line arguments
     */
    /*public static void nhap_x() {
        Scanner sc;
        sc = new Scanner(System.in);
        float x;
        while (true) {
            try {               
                System.out.print("x=");
                x = Float.parseFloat(sc.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid, try again");                
            }
        }
        System.out.println(x);
    }
    public static void nhap_n() {
        Scanner sc;
        sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.print("n=");
                n = Integer.parseInt(sc.nextLine());                
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid, try again");                
            }
        } System.out.println(n);
    }
    public static void main(String[] args) {
        // TODO code application logic here        
        nhap_x();
        nhap_n();
    }*/
    /*c,
    public static void main(String[] args) {
        float[] a;
        a= new float[10];
        
    }*/
    /*d,
    public static void main(String[] args) {
        float[] a;
        a=new float[1000];
        if (a==null) {
            System.out.println("Cấp phát k được");
        }
    }*/
    
    /*  h,
        int n = 0;
        float[] so_thuc = null;
        while (true) {
            try {
                System.out.print("n: ");
                n=sc.nextInt();
                so_thuc = new float[n];                
                break;
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");  
                sc.next();
            }            
        }
        for (int i=0;i<n;i++) {
            boolean validInput = true;
            do {
                try {
                    System.out.print("Nhập số thực số "+(i+1));                    
                    so_thuc[i]=sc.nextFloat();
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                    sc.next();
                    i--;
                }
            } while (!validInput);
        }*/
    
    
}
