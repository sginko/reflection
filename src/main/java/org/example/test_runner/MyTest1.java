package org.example.test_runner;

public class MyTest1 {

    @MyTestCase
    public void testMethod1(){
        System.out.println("Execute testMethod1");
    }

    @MyTestCase
    public void testMethod2(){
        System.out.println("Execute testMethod2");
    }

    public void testMethod(){
        System.out.println("This method is not a test");
    }
}
