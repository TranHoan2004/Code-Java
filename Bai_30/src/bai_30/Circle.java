/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_30;

/**
 *
 * @author ADMIN
 */
public class Circle extends Shape {
    @Override    
    public void Area(double radius) {
        System.out.println("Area: "+Math.PI*radius*radius);
    }
}
