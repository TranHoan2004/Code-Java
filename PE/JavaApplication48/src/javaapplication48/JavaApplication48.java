/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication48;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public interface ICar {
        public int f1(List<Car> t);
        public void f2(List<Car> t);
        public void f3(List<Car> t);
    }
    class MyCar implements ICar {

        @Override
        public int f1(List<Car> t) {
            int average=0;
            int sum=0;
            for (Car i: t) {
                sum+=i.getRate();
            }
            average=sum/t.size();
            return average;                    
        }

        @Override
        public void f2(List<Car> t) {
            Car max=t.get(0);
            for (Car car: t) {                
                if (car.getRate()>max.getRate()) {
                    max=car;
                }
            }
            Car min=t.get(0);
            for (Car car: t) {
                if (car.getRate()<min.getRate()){
                    min=car;
                }
            }
            Car temp;
            temp=max;
            max=min;
            min=temp;
        }

        @Override
        public void f3(List<Car> t) {
            
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
