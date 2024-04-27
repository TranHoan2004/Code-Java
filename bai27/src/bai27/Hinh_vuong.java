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
public class Hinh_vuong extends Hinh_chu_nhat{
    
    public Hinh_vuong(float ab){
        super(ab,ab);
    }
    
    @Override
    public float tinh_dien_tich()
    {
        return ab*ab;
    }
}
