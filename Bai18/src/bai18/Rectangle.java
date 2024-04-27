/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

/**
 *
 * @author ADMIN
 */
public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(String color) {
        super(color);
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public String toString() {
        return "Rectangle{" +color+ '}';
    }
    
}
