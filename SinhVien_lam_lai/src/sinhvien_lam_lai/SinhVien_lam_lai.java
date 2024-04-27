/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien_lam_lai;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ADMIN
 */

public class SinhVien_lam_lai {
    public static void diem_trung_binh(float[] diem, int s) {
        float diem_tb=0;
        for (int i=0;i<s;i++) {
            diem_tb+=diem[i];
        }
        diem_tb=diem_tb/s;
        System.out.println("Điểm trung bình của lớp là "+diem_tb+" điểm");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);  
        Student[] st;
        int so_sinh_vien=0;
        String[] name=null;
        float[] diem=null;
        while (true) {
            try {
                System.out.print("Nhập số sinh viên trong lớp: ");
                so_sinh_vien = sc.nextInt();
                st = new Student[so_sinh_vien];
                name = new String[so_sinh_vien];
                diem = new float[so_sinh_vien];
                break;
            } catch (InputMismatchException e) {
                System.out.println("Định dạng sai, vui lòng nhập lại!");
                sc.next();
            }
        }            
        for (int i=0;i<so_sinh_vien;i++) {
            boolean validInput=true;
            do {
            try {
                System.out.print("Nhập tên sinh viên số "+(i+1)+" và điểm: ");
                name[i]=sc.next();
                diem[i]=sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Sai định dạng, vui lòng nhập lại");
                sc.next();
                i--;
            }            
            } while (!validInput);
            st[i]=new Student(name[i], diem[i]);
        }
        for (int i=0;i<so_sinh_vien;i++) {
            System.out.println("Điểm của sinh viên "+name[i]+" là "+diem[i]+" điểm.");
        }
        diem_trung_binh(diem, so_sinh_vien);
    }
    
}
