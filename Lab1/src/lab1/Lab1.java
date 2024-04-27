/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ADMIN
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teachers t1 = new Teachers("Nam",30,"001");
        Teachers t2 = new Teachers("Hung",29,"002");
        Student st1 = new Student("Long",20,"HE180030");
        t1.displayInfor();
        t2.displayInfor();
        st1.displayStudentInfor();
    }
    
}
