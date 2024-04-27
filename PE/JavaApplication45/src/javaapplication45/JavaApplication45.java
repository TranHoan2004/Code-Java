/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication45;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public interface ICarp {
        public int f1(List<Carp> t);
        public void f2(List<Carp> t);
        public void f3(List<Carp> t);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Carp> t = new ArrayList<>();
        MyCarp obj= new MyCarp();
        System.out.println("Add how many elements: 0");
        System.out.print("Enter TC(1-f1, 2-f2, 3-f3): ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1: 
                t.add(new Carp("A2", 6));
                t.add(new Carp("BX", 2));
                t.add(new Carp("C1", 4));
                t.add(new Carp("D2", 8));
                t.add(new Carp("E3", 9));
                t.add(new Carp("F1", 7));
                System.out.println(obj.f1(t));
                t.clear();
                break;
            case 2:  
                t.add(new Carp("AB", 6));
                t.add(new Carp("BCB", 2));
                t.add(new Carp("CAC", 4));
                t.add(new Carp("DX", 8));
                t.add(new Carp("EY", 9));
                t.add(new Carp("F", 7));
                obj.f2(t);
                t.clear();
                break;
        }
    }
    
}
