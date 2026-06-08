package com.junitdemo;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    @BeforeAll
    public static void begin(){
        System.out.println("Begin process....");
    }

    @BeforeEach
    public void inIt(){
        System.out.println("Before Test case");
    }

    @Test
    public void addTest(){
        System.out.println("Test case 1");
        Assertions.assertEquals(4, Calculator.add(2 ,2));
    }

    @Test
    public void subtractTest(){
        System.out.println("Test case 2");
        Assertions.assertEquals(0, Calculator.subtract(2 ,2));
    }

    @Test
    public void multiplyTest(){
        System.out.println("Test case 3");
        Assertions.assertEquals(6, Calculator.multiply(2 ,3));
    }

    @Test
    public void divideTest(){
        System.out.println("Test case 4");
        Assertions.assertEquals(5, Calculator.divide(10 ,2));
    }

    @Test
    public void modulusTest(){
        System.out.println("Test case 5");
        Assertions.assertEquals(1, Calculator.modulus(9 ,2));
    }
    @AfterEach
    public void cleanUp(){
        System.out.println("After Test case");
    }

    @AfterAll
    public static void end(){
        System.out.println("Ending the process...");
    }
}
