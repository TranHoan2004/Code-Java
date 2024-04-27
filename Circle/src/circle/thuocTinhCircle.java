/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author ADMIN
 */
public class thuocTinhCircle {
    private double radius;

    public thuocTinhCircle() {
    }

    public thuocTinhCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        double S = 3.14*radius*radius;
        System.out.println("Diện tích hình tròn là "+S);
        return S;
    }
}
