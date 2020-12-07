/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author User
 */
public class Student1 {
     private String name;
    private String gender;
    private String email;
    private ClassCourse course1;
    private ClassCourse course2;
    private ClassCourse course3;

    public Student1() {
        this.name = null; 
        this.gender = null; 
        this.email = null; 
        this.course1 = null; 
        this.course2 = null; 
        this.course3 = null; 
        
    }

    public Student1(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public Student1(String name, String gender, String email, ClassCourse course1, ClassCourse course2, ClassCourse course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
    public Student1 (Student1 student1){
        this.name = student1.name;
        this.gender = student1.gender;
        this.email = student1.email;
        this.course1 = student1.course1;
        this.course2 = student1.course2;
        this.course3 = student1.course3;
    }
    

    
    
}
