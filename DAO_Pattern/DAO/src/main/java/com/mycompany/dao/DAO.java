/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dao;

/**
 *
 * @author HP
 */
public class DAO {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        for(Student student : studentDao.getAllStudents()){
            System.out.println("Student : [RollNo : "+student.getRollNo()+", Name : "+student.getName()+" ]");
        }
        //update student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
        +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
