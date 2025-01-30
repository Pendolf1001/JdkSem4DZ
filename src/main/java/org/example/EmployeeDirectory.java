package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDirectory{

    private List <Employee> listEmployee;


    public EmployeeDirectory(){
        this.listEmployee=new ArrayList<>();
    }


    public String toString(){
        return listEmployee.toString();
    }


    public void add(Employee emp){
        listEmployee.add(emp);
    }

    public List<Employee> findByExpirience(Integer exp){
        List<Employee> findList=listEmployee.stream()
                .filter(u -> u.getExpirience()==exp)
                .collect(Collectors.toList());
        return findList;
    }

    public Employee findById(Integer id){

        Employee findEmp=listEmployee.stream()
                .filter(u -> u.getId()==id)
                .findAny()
                .orElse(null);
        return findEmp;
    }

    public List<Integer> findNumberByName(String name){
        List<Integer> findList=listEmployee.stream()
                .filter(u -> u.getName().equals(name))
                .map(Employee::getNumber)
                .collect(Collectors.toList());
        return findList;
    }
}