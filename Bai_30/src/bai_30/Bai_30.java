/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_30;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Bai_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            Random r = new Random();
            int num = r.nextInt();
            if (num%2023==0) {
                break;
            }
            Shape obj;
            obj =new Circle();
            obj.Area(num);
        }
        
    }
    
}
