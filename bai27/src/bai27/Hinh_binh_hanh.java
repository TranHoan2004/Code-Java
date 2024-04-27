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
public class Hinh_binh_hanh extends Tu_Giac {
    public Hinh_binh_hanh(float ab,float bc)
    {                
        super(ab,bc,ab,bc,ab);
    }
    @Override
    public float tinh_dien_tich(){
        // viet sau, bang cong thuc Heron
        float p=2*(ab+bc);                
        return (float) (2*Math.sqrt(p*(p-ab)));     
    }
}
