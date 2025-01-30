package org.example;


/***
 *Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Employee emp1= new Employee(123, "Sara", 13);
        Employee emp2= new Employee(32465, "John", 1);
        Employee emp3= new Employee(3221325, "Rick", 13);
        Employee emp4= new Employee(2344, "Rick", 10);
        EmployeeDirectory empDir= new EmployeeDirectory();
        empDir.add(emp1);
        empDir.add(emp2);
        empDir.add(emp3);
        empDir.add(emp4);
        System.out.println(empDir);
        System.out.println(empDir.findByExpirience(13));
        System.out.println(empDir.findNumberByName("Rick"));
        System.out.println(empDir.findById(2));
    }
}