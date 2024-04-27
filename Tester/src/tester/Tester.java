/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

/**
 *
 * @author ADMIN
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colony obj1 = new BeeColony("honey","land",2000 );
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        
        University obj2 = new FPTUniversity("FPT", "Can Tho", 100000);
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role df= new BeeColony("wasp", "land", 3000);
        System.out.println(df);
        df.createWorker();
        
        df = new FPTUniversity("FPT", "Hanoi", 100000);
        System.out.println(df);
        df.createWorker();
    }
    
}
