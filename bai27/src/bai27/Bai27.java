/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai27;

/**
 *
 * @author ADMIN
 */
public class Bai27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tu_Giac ob_tg;
        ob_tg=new Tu_Giac((float)5.0,(float)4.0,(float)6.0,(float)3.0,(float)7.0);//...
        
        Hinh_binh_hanh ob_hbh;
        ob_hbh=new Hinh_binh_hanh((float)5.0,(float)8.0,(float)7.0);//...
        
        Hinh_chu_nhat ob_hcn;
        ob_hcn=new Hinh_chu_nhat((float)3.0,(float)4.0);//...
        
        Hinh_vuong ob_hv;
        ob_hv=new Hinh_vuong((float) 6.0);
        
        //Gọi các hàm tính diện tích các hình
        System.out.println("Diện tích hình vuông là:"+ob_hv.tinh_dien_tich());
        System.out.println("Diện thích hình bình hành:"+ob_hbh.tinh_dien_tich());
        System.out.println("Diện tích hình chữ nhật:"+ob_hcn.tinh_dien_tich());
    }
    
}
