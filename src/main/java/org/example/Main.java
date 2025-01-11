package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Company company=new Company(1,"Tech",50000000.0,new String []{"Bob","Charlie"});

        System.out.println(company);

        Employee employee=new Employee(1,"Johny","johny@gmail.com","124536",new String[]{"Plan A","Plan B"});
        System.out.println(employee);
    }
}