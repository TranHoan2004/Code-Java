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
public class Teacher {
    public static int so_gv=0;
    private String name;

    public Teacher(String ten_gv) {
        this.name = ten_gv;
        so_gv++;
    }

    public String getName() {
        return name;
    }
    
    public static int so_gv() {
        return so_gv;
    }
}
