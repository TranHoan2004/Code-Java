/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

/**
 *
 * @author ADMIN
 */
public class FPTUniversity extends University implements Role{
    String address;

    public FPTUniversity() {
    }

    public FPTUniversity(String address, String name, int size) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, Dânng, Can Tho, Quy Nhon";
    }

    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }
    
    
}
