package com.librarysystem;

public class Student {

    String name,dept,uni_id,uid;
    int sem;

    public void getdata( String name,String fname, String uni_id, String uid,int sem ){

        this.name=name;
        this.dept=fname;
        this.uni_id=uni_id;
        this.uid=uid;
        this.sem=sem;

    }

    public void setdata(){

        System.out.println("Student's Name: "+name);
        System.out.println("Student's Department Name: "+dept);
        System.out.println("University id: "+uni_id);
        System.out.println("user id"+ uid);
        System.out.println("Semester"+sem);
    }
    
}