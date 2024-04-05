package org.example.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("org.example.reflection_examples.Employee");

//        Object o = (Employee)employeeClass.newInstance();
//        System.out.println(o);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(1, "Serg", "IT");
        System.out.println(obj2);

        Method setSalary = employeeClass.getMethod("setSalary", double.class);
        setSalary.invoke(obj2, 3000);
        System.out.println(obj2);
    }
}
