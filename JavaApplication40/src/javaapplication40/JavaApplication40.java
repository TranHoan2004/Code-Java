/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList personList = new ArrayList();
        String name = "Long";
        personList.add(new Contact("Long", "0949", "Hehehee"));
        personList.add(new Contact("Quang", "1122", "hoana5k44"));
        personList.add(new Contact("Hoa", "1010", "txhe"));
        Contact obj = new Contact();
        obj.setObj(personList);
        obj.search_By_Name(name);
    }
    
}
