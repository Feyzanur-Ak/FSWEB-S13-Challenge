package org.example;

public class Employee {

 long id;
 String fullName;
 String email;
 String password;
 String [] healthplans;

public Employee(long id,String fullName,String email,String password,String [] healthplans )
{
     this.id=id;
    this.fullName=fullName;
    this.email=email;
    this.password=password;
    this.healthplans=healthplans;

}

public void addHealthplan(int index, String name)
{

      if(index<0 || index>=healthplans.length){
          System.out.println("Dizi boyutunu aşan index");
          return;
      }

      if(healthplans[index]==null){
          healthplans[index]=name;
      }else{
          System.out.println("Bu index daha dolu");
      }

}


}
