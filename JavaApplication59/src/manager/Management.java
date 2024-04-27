/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import object.SalaryHistory;
import object.*;

/**
 *
 * @author ADMIN
 */
public class Management {
    private static Scanner sc = new Scanner (System.in);
    private List<Worker> wList;
    private List<SalaryHistory> shList;
    final double epsi=0.00001;
    public Management() {
        wList = new ArrayList<>();
        shList = new ArrayList<>();
    }
    
    public void addWorker() {
        String id, name, workLocation;
        int age;
        double salary;
        id = Validation.getCode("Enter worker id: ","Id should be unique and not null", wList, 1);
        System.out.print("Enter worker name: ");
        name=sc.nextLine();
        
        
        age=Validation.getInt("Enter worker age: ", 18, 50);
        
        salary=Validation.getDouble("Enter worker salary: ", epsi, Double.MAX_VALUE);
        
        System.out.print("Enter worker location: ");
        workLocation=sc.nextLine();
        
        wList.add(new Worker(id, name, age, salary, workLocation)); 
    }
    
    public void updateSalary(int mode) {
        String id=Validation.getCode("Enter worker id to be updated: ", "ID must exist in database and not null", wList, 2);
        double money = Validation.getDouble("Amount of money: ", epsi, Double.MAX_VALUE);
        Worker o = Validation.getWorker(id, wList);
        double update = 0;
        String status="";
        if (mode==1) {
            update=o.getSalary()+money;
            status="UP";
        }
        else if (mode==2) {
            if (o.getSalary()>money) {
                update=o.getSalary()-money;
            }
            status="DOWN";
        }
        o.setSalary(update);
        shList.add(new SalaryHistory(id, o.getName(), o.getAge(), o.getSalary(), status, java.time.LocalDate.now()));
    }
    
    public void getInformation() {
        display(shList);
    }
    
    public void displayAll() {
        display(wList);
    }
    private void display(List list) {
        for (Object o: list) {
            System.out.println(o.toString());
        }
    }
}
