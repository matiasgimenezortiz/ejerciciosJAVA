package com.datastructures;
/*
In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally
each element has a "priority" associated with it. In a priority queue, an element with high priority is served before
an element with low priority. - Wikipedia

In this problem we will test your knowledge on Java Priority Queue.
There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED,
can take place which are described below.
ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following
criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:

The Student class should implement:
The constructor Student(int id, String name, double cgpa).
The method int getID() to return the id of the student.
The method String getName() to return the name of the student.
The method double getCGPA() to return the CGPA of the student.
The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the
given events and return all the students yet to be served in the priority order.

Input Format
The first line contains an integer, n, describing the total number of events. Each of the n subsequent lines
will be of the following two forms:

ENTER name CGPA id: The student to be inserted into the priority queue.
SERVED: The highest priority student in the queue was served.
The locked stub code in the editor reads the input and tests the correctness of the Student and Priorities
classes implementation.
Output Format
The locked stub code prints the names of the students yet to be served in the priority order. If there are
no such student, then the code prints EMPTY.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class JPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();


    public static void main(String[] args) {


        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student2> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student2 st: students) {
                System.out.println(st.getName());
            }
        }
    }

    }
class Student2{
    int id;
    String name;
    double CGPA;

    public Student2(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.CGPA=cgpa;
    }

    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getCGPA(){
        return this.CGPA;
    }
}

class Priorities{

    public List<Student2> getStudents(List<String> events){
        List<Student2> studentsList = new ArrayList<Student2>();
        Checker controlador = new Checker();
        String[] evento;
        for(int i=0;i<events.size();i++){
            evento = events.get(i).split(" ");
            if(evento[0].equals("ENTER")){
                Student2 newStudent = new Student2(Integer.parseInt(evento[3]),evento[1],Double.parseDouble(evento[2]));
                studentsList.add(newStudent);
                studentsList.sort(controlador);
            }else{
                studentsList.remove(0);
            }
        }
        return studentsList;
    }
}

class Checker implements Comparator<Student2>{

    @Override
    public int compare(Student2 stu1, Student2 stu2){
        if((stu1.CGPA > stu2.CGPA)||
                ((stu1.CGPA == stu2.CGPA) && (stu1.name.compareTo(stu2.name)<0))||
                ((stu1.CGPA == stu2.CGPA) && (stu1.name.compareTo(stu2.name)==0) && (stu1.id<stu2.id))){
            return -1;
        }else{
            return +1;
        }
    }
}
