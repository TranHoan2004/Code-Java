/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author ADMIN
 */
public class SavingAccount {
    private String accountID;
    private int balance;

    public SavingAccount(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public boolean savingWthdraw(int money) {
        if (money>0&& money<balance) {
            balance-=money;
            getMoney();
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
    public boolean savingDeposit(int money) {
        if (money>0) {
            balance+=money;
            getMoney();
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
    public int getMoney() {
        System.out.println(getBalance());
        return balance;
    }
}
