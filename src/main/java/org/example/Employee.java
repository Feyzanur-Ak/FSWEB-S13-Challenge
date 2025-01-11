package org.example;
import java.util.Arrays;

public class Employee {

    private long id;
    private String fullName;
    private String email;
    private String password;
    private String [] healthPlans;

public Employee(long id,String fullName,String email,String password,String [] healthPlans )
{
     this.id=id;
    this.fullName=fullName;
    this.email=email;
    this.password=password;
    this.healthPlans=healthPlans;

}

public void addHealthPlan(int index, String name)
{

      if(index<0 || index>=healthPlans.length){
          System.out.println("Dizi boyutunu aşan index");
          return;
      }

      if(healthPlans[index]==null){
          healthPlans[index]=name;
      }else{
          System.out.println("Bu index daha dolu");
      }

}

    public String getFullName(){
        return  fullName;
    }

    public String getEmail(){
        return  email;
    }

    public String [] getHealthPlans(){
        return  healthPlans;
    }

    public  String toString(){ //Bu metodu yazmazsam bana referans adresi yazdırır
        return id + ", " + fullName + ", " + email + ", " + password + ", " + Arrays.toString(healthPlans);
    }
}
