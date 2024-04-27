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
public class Student extends Person{
    private String StudentID;
    public Student(String name, int age, String StudentID) {
        super(name, age);
        this.StudentID = StudentID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    
    public void displayStudentInfor() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);   
        System.out.println("Student ID: "+ StudentID);
    }
}
