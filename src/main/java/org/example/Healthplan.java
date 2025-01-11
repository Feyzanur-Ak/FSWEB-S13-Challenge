package org.example;

import org.example.enums.Plan;

public class Healthplan {

    private long id;
    private  String name;
    Plan plan;

    public Healthplan(long id, String name,    Plan plan ){
         this.id=id;
         this.name=name;
         this.plan=plan;
    }

    public String getName(){
        return  name;
    }

    public long getId(){
        return  id;
    }

    public Plan getPlan(){
        return  plan;
    }
}
