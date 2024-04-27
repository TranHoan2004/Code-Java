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
public class Tu_Giac {
    protected float ab;
    protected float bc;
    protected float cd;
    protected float da;
    protected float ac;
    
     public Tu_Giac(float ab,float bc,float cd,float da,float ac){
        //|ab-bc| < ac < ab+bc, |cd-da| < ac < cd + da
        this.ab=ab;
        this.bc=bc;
        this.cd=cd;
        this.da=da;
        this.ac=ac;
    }
    public float tinh_dien_tich(){
        // viet sau, bang cong thuc Heron
        return (float)0.0;
        
    }   

}
