/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication41;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public interface ICala {
        public int f1(List<Cala> t);
        public void f2(List<Cala> t);
        public void f3(List<Cala> t);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<Cala> t = new ArrayList();
        t.add(new Cala("hohohoho", 12));
        t.add(new Cala("ho2ohoho", 12));
        t.add(new Cala("áhhhashdhasdh", 12));
        t.add(new Cala("ả234ghfgncse", 12));
        MyCala myCala = new MyCala();
        myCala.f1(t);
    }
    
}
