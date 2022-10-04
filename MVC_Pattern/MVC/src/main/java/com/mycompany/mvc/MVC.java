/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvc;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 *
 * @author HP
 */
public class MVC {

    public static void main(String[] args) {
        Student model = RetrievalStudentFromDatabase();
        
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        
        controller.setStudentName("duta");
        controller.updateView();
        
    }

    private static Student RetrievalStudentFromDatabase() {
        Student student = new Student();
        student.setName("Edwin");
        student.setRollNo("10");
        return student;
    }
}
