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
public class Hinh_chu_nhat extends Hinh_binh_hanh{
    
    public Hinh_chu_nhat(float ab, float bc) {
        super(ab, bc);
    }    
    
    @Override
    public float tinh_dien_tich()
    {
        return ab*bc;
    }
}
