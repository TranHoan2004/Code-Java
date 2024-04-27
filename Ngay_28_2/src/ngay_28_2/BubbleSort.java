/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngay_28_2;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BubbleSort implements Sortable{

    @Override
    public void sort(ArrayList arr, int n) {
        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<=(n-i-1);++j) {
                 if (arr.get(j) <= arr.get(j + 1)) {
                     int temp = (int) arr.get(j);
                     arr.set(j, arr.get(j + 1));                  
                     arr.set(j + 1, temp);
                }
            }
                
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
