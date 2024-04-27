/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication45;

import java.util.List;
import java.util.Spliterator;

/**
 *
 * @author ADMIN
 */
public class MyCarp implements JavaApplication45.ICarp{

    @Override
    public int f1(List<Carp> t) {        
        Carp carp = t.get(0);
        String[] arr = carp.getPond().split("");
        int count=0;
        int countWord=0;
        for (int i=0;i<arr.length;i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                continue;
            }
            else {
                count++;
            }
            if (count>=2) {
                countWord++;
                count=0;
            }
        }
        
        return countWord;
    }

    @Override
    public void f2(List<Carp> t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void f3(List<Carp> t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
