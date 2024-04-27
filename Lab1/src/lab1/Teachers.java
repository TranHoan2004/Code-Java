/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ADMIN
 */
public class Teachers extends Person{
    private String teacherID;

    public Teachers(String name, int age,String teacherID) {
        super(name, age);
        this.teacherID = teacherID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
    
    @Override
    public void displayInfor() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);   
        System.out.println("Teacher ID: "+ teacherID);
        
    }
        
}
