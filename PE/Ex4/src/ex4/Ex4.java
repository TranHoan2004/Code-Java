/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public interface IString {
        public int f1(String str);
        public String f2(String str);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MyString obj = new MyString();
        int choice=0;
        String str=null;
        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        choice = sc.nextInt();
        System.out.print("Enter a string: ");
        str = sc.next();
        switch (choice) {
            case 1: System.out.println(obj.f1(str));
                break;
            case 2: obj.f2(str);
                break;
        }
    }
    
}
