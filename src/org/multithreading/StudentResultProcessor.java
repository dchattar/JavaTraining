package org.multithreading;

import java.util.*;
import java.util.concurrent.*;

public class StudentResultProcessor {

    static class Student {
        int id;
        String name;
        int percentageMarks;
        //array of subjects can be added if needed
        int[] subjects;


        Student(int id, String name,  int[] subjects) {
            this.id = id;
            this.name = name;
            this.subjects = subjects;
        }
    }

    static class Task implements Runnable {
        private Student student;
        private String str;

        Task(Student student, String str) {
            this.student = student;
            this.str = str;
        }

        @Override
        public void run() {
            String grade = "F";
            if(student.percentageMarks < 50) {
                grade = "F";
            }
            else if(student.percentageMarks < 75) {
                    grade = "C";
            } else if(student.percentageMarks < 90) {
                    grade = "B";
            } else {
                      grade = "A";
            }

            //print %
            //add all subject marks/no. subjects



            System.out.println(str);
            // Simulate DB store or email
            System.out.println("Processed Student: " + student.name + " | Grade: " + grade + " | Thread: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Create mock students
        for (int i = 1; i <= 100; i++) {
            studentList.add(new Student(i, "Student" + i, new int[]{(int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100)}));
        }

        // Create thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (Student s : studentList) {
            executor.submit(new Task(s, "Processing student: " + s.name + " with marks: " + s.percentageMarks));
        }

        executor.shutdown();
    }
}
