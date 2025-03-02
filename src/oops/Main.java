package oops;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        int[] numbers = new int[5];
        String[] names = new String[5];

        Student[] students = new Student[5];
        Student student1;
        student1=new Student();
        System.out.println(Arrays.toString(students)); // default: [null, null, null, null, null]
        System.out.println(student1);
        student1.rno=11;
        System.out.println(student1.rno);
        student1.greeting();
    }
}

class Student{
    int rno;
    String name;
    float marks=90;

    void greeting(){
        System.out.println("Hello!, My name is "+this.name);
    }
    // add the values of the above properties obj by obj
    Student(){
        this.rno=11;
        this.name="Bhuvana";
        this.marks=90;
    }
}