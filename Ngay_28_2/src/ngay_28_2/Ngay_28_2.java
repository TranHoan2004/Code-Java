/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngay_28_2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ADMIN
 */
public class Ngay_28_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(12);
        arr.add(4);
        arr.add(3);
        Iterator iter= arr.iterator();
        Sortable obj;
        obj=new BubbleSort();
        ((BubbleSort)obj).sort(arr, arr.size());
    }
    
}
