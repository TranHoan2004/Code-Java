/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngay_28_2;

/**
 *
 * @author ADMIN
 */
public class SelectionSort implements Sortable{

    @Override
    public void sort(int[] arr, int n) {
        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;++j) {
                if (arr[j]<arr[i]) {
                    i=j;
                }
            }
        } 
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
