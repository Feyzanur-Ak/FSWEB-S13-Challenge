package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id,String name,double giro,String[] developerNames ){
         this.id=id;
         this.name=name;
         this.developerNames=developerNames;

        if(giro<0){
             this.giro=0;
         }
    }

    public void addEmployee(int index, String name) {
        if(index<0 || index>=developerNames.length){
            System.out.println("İndex hatalı");
        }

        if(developerNames[index]==null){
            developerNames[index]=name;
        } else{
            System.out.println("Bu indexte eleman var");
        }
    }

   public double getGiro(){
        return giro;
   }

    public String[] getDeveloperNames(){
        return developerNames;
    }

    public String getName(){
        return name;
    }

}
