/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.util.Scanner;
import manager.*;
import manager.Validation;
/**
 *
 * @author ADMIN
 */
public class Menu {
    private static String[] ops = {
        "Add Worker",
        "Up salary",
        "Down salary",
        "Display information salary",
        "Exit"
    };
    
    private static int getChoice() {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<ops.length;i++) {
            System.out.println((i+1)+". "+ops[i]);
        }
        return Validation.getInt("Your choice: ", 1, ops.length);
    }
    
    public static void display() {
        Management m = new Management();
        int choice=0;
        do {
            System.out.println("======== Worker Management ========");
            choice=getChoice();
            switch (choice) {
                case 1:
                    m.addWorker();
                    break;
                case 2:
                    m.updateSalary(1);
                    break;
                case 3:
                    m.updateSalary(2);
                    break;
                case 4:
                    m.getInformation();
                    break;
                case 5:                    
                    break;                
            }
        } while (choice != 5);
    }
}
