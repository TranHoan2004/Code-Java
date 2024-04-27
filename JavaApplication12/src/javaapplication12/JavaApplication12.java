/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author ADMIN
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher ob;
        ob = new Teacher("Dung");
        System.out.println("Name of lecture: "+ob.getName());
        Teacher ob2;
        ob2= new Teacher("Nam");
        System.out.println("Name of lecture: "+ob2.getName());
        System.out.println(Teacher.so_gv());
        
    }
    
}
