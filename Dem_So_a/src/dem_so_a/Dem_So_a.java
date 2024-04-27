/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dem_so_a;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ADMIN
 */
public class Dem_So_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);        
        String a;
        int n;
            while (true) {
                try {
                    a=sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid values, try again");
                    sc.next();            
                }
            }
          
        n = a.length();
        int count=0;
        for (int i=0;i<n;i++) {
            if (a.charAt(i)=='a') {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
