package org.example.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(1, "Serg", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        Object salaryValue = (Double)field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 3000);
        System.out.println(employee);
    }
}
