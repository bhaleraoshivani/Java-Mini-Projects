package com.shivani;

import java.util.ArrayList;
import java.util.Scanner;

class Student 
{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class StudentManagementSystem 
{
    private static ArrayList<Student> students = new ArrayList<>();
    private static int nextStudentId = 1;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice)
            {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addStudent(Scanner scanner) 
    {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        students.add(new Student(name, nextStudentId));
        System.out.println("Student added with ID: " + nextStudentId);
        nextStudentId++;
    }

    private static void displayStudents() 
    {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nStudent List:");
            System.out.println("ID "+"          "+"Name:");
            
            for (Student student : students)
            {
               
                System.out.println(student.getId()+"          "+student.getName()); 
            }
        }
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter student ID to search: ");
        int idToSearch = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (Student student : students) {
            if (student.getId() == idToSearch) {
                System.out.println("Student found:");
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
                return;
            }
        }
        System.out.println("Student with ID " + idToSearch + " not found.");
    }
}
