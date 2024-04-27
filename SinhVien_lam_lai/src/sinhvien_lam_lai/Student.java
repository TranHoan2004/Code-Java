/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien_lam_lai;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String ten;
    private float diem;

    public Student() {
    }

    public Student(String ten, float diem) {
        this.ten = ten;
        this.diem = diem;
    }

    Student(String[] name, float[] diem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
}
