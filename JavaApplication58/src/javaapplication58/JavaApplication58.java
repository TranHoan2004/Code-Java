/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication58;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author ADMIN
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        LinkedList<Integer> t = new LinkedList<>();
//        int n=sc.nextInt();
//        for (int i=0;i<n;++i) {
//            int index=sc.nextInt();
//            t.add(index);
//        }
//        int k=sc.nextInt();
//        while (k<0 || k>n) {
//            k=sc.nextInt();
//        }
//        for (int i=0;i<t.size();++i) {
//            if (t.get(i)>t.get(k)) {
//                t.remove(i); 
//                --i;
//            }            
//        }
//        for (Integer i: t) {            
//            System.out.print(t.get(i)+" ");
//        }
        
        
        
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            list.add(x);
        }
        int k = sc.nextInt();
        int x = list.get(k);
        // list.removeIf(i -> i > x);
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) > x) {
                list.remove(i);
                --i;
            }
        }
        for (int i = 0; i < list.size(); ++i) {
             System.out.print(list.get(i) + " ");
        }
    }
}
