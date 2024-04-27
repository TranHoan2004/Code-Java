/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SavingAccount obj;
        int choice=0;
        int money=0;
        String accountID=null;
        do {
            System.out.println("1. Test savingWithdraw()");
            System.out.println("2. Test savingDeposit()");
            System.out.print("Enter option: ");
            choice=sc.nextInt();
            System.out.print("Enter the money: ");
            money=sc.nextInt();
            System.out.println("OUTPUT:");
            obj=new SavingAccount(accountID, 100);
            switch (choice) {
                case 1: obj.savingWthdraw(money);
                    break;
                case 2: obj.savingDeposit(money);
                    break;
                default: System.out.println("Error");
                    break;
            }
        } while (choice<1||choice>2);
    }
    
}
