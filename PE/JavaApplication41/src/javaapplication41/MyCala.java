/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication41;

import java.util.List;
import javaapplication41.JavaApplication41.ICala;

/**
 *
 * @author ADMIN
 */
public class MyCala implements ICala{
    
    @Override
    public int f1(List<Cala> t) { 
        int count=0;        
        for (Cala str: t) {
            if (Character.isDigit(str.getOwner().charAt(2))) {   
                count++;
            }            
        }
        System.out.println(count);
        return count;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void f2(List<Cala> t) {
        for (Cala str: t) {
            str.getPrice();
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void f3(List<Cala> t) {
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
