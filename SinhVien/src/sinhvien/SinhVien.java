/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ADMIN
 */
public class SinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int so_sinh_vien = 0;
        float[] diem = null;
        float diem_trung_binh = 0;
        String[] name = null;
        while (true) {
            try {
                System.out.print("Nhập số sinh viên: ");
                so_sinh_vien=sc.nextInt();
                diem = new float[so_sinh_vien];
                name = new String[so_sinh_vien];
                break;
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");  
                sc.next();
            }            
        }
        for (int i=0;i<so_sinh_vien;i++) {
            boolean validInput = true;
            do {
                try {
                    System.out.print("Nhập tên sinh viên số "+(i+1)+ " và điểm: ");
                    name[i]=sc.next();
                    diem[i]=sc.nextFloat();
                } catch (InputMismatchException e) {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại");
                    sc.next();
                    i--;
                }
            } while (!validInput);
        }
        for (int i=0;i<so_sinh_vien;i++) {
            diem_trung_binh+=diem[i];
            System.out.println("Sinh viên "+name[i]+" điểm "+diem[i]);            
        }diem_trung_binh=diem_trung_binh/so_sinh_vien;
            System.out.println("Điểm trung bình của lớp là: "+diem_trung_binh);
    }    
}
