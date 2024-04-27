 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.util.List;
import java.util.Scanner;
import object.Worker;

/**
 *
 * @author ADMIN
 */
public class Validation {
    //intput value
    private static Scanner sc = new Scanner (System.in);
    public static int getInt(String msg, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.print(msg);
                n=Integer.parseInt(sc.nextLine());
                if (min<=n && n<=max) break;
                throw new NumberFormatException();
            }catch (NumberFormatException e){
                System.out.print("Please enter an integer number in range: "+min+"->"+max);
            }
        }
        return n;
    }
    
    public static double getDouble(String msg, double min, double max) {
        double n;
        while (true) {
            try {
                System.out.print(msg);
                n=Double.parseDouble(sc.nextLine());
                if (min<=n && n<=max) break;
                throw new NumberFormatException();
            }catch (NumberFormatException e){
                System.out.println("Please enter a real number in range: "+min+"->"+max);
            }
        }
        return n;
    }
    
    public static String getCode(String msg, String err, List<Worker> wList, int mode) {
        String s;
        while (true) {
            System.out.print(msg);
            s=sc.nextLine();
            if (!s.isEmpty()) {
                //Mode:
                //1: input - id not exist
                //2: update - id must exist
                if ((mode==1 && getWorker(s, wList)==null) || (mode==2 && getWorker(s, wList)!=null)) {
                    break;
                }
                System.out.println(err);
            }
        }
        return s;
    }
    
    public static Worker getWorker(String id, List<Worker> wList) {
        for (Worker o: wList) {
            if (o.getId().equals(id)) {
                return o;
            }            
        }
        return null;
    }
}
