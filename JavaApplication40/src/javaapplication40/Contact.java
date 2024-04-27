/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication40;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private List<String> obj = new ArrayList<>();

    public Contact() {
    }
    
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getObj() {
        return obj;
    }

    public void setObj(List<String> obj) {
        this.obj = obj;
    }
    
    public void search_By_Name(String name) {
        for (Object i: obj) {
            if (getName()==name) {
                System.out.println("phone number: "+getPhoneNumber());
            }
        }
    }
}
