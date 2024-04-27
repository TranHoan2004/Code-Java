/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe;

/**
 *
 * @author ADMIN
 */
public class Van {
    String driver;
    int rate;

    public Van(String driver, int rate) {
        this.driver = driver;
        this.rate = rate;
    }

    public Van() {
        driver="unknown";
        rate=5;
    }

    @Override
    public String toString() {
        return "Van{" + "driver=" + driver + ", rate=" + rate + '}';
    }
    
}
