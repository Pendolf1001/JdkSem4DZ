package org.example;
import java.util.*;

public class Employee{

    private int id;
    private int number;
    private String name;
    private int experience;
    private static final Set <Integer> idSet= new HashSet<>();

    public Employee(int number,String name, int experience ){
        getNewId();
        this.number=number;
        this.name=name;
        this.experience=experience;
    }

    public int getNewId(){
        if (idSet.isEmpty()) idSet.add(1);
        int newId=Collections.max(idSet);
        this.id= newId;
        idSet.add(newId+1);
        return newId;
    }


    public String toString(){
        return String.format("ID: %s, tel: %s, name: %s, (%s)", this.id, this.number, this.name, this.experience);
    }


    public int getExpirience(){
        return this.experience;
    }

    public Integer getNumber(){
        return this.number;
    }

    public Integer getId(){
        return this.id;
    }


    public String getName(){
        return this.name;
    }

}