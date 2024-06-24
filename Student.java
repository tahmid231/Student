/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

public class Student {
    // Class variable
    static String university = "ULAB University";

    // Object variables
    private int id;
    private String name;
    private String department;
    private double cgpa;

    // Parameterized constructor
    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        Student.studentCount++;
    }

    // Object method to display student details
    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }

    // Class method to display total number of students
    private static int studentCount = 0;
    public static void displayStudentCount() {
        System.out.println("Total Number of Students: " + studentCount);
    }

    public static void main(String[] args) {
        // Create 3 student objects
        Student student1 = new Student(203014010, "Taqi Tahmid", "Computer Science", 3.5);
        Student student2 = new Student(211014021, "Jannatul Ferdous Shimi", "Computer Science", 3.5);
        Student student3 = new Student(211014011, "Anisul Haque", "Electrical Engineering", 3.2);

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Display total number of students
        Student.displayStudentCount();
    }
}
