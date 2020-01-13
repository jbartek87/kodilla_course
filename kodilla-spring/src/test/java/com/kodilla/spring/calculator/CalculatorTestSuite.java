package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext( "com.kodilla.spring" );
        Calculator calculator = context.getBean( Calculator.class );
        //When
        double add = calculator.add( 1.0,1.1 );
        double sub = calculator.sub(10.0, 8.0);
        double mul = calculator.mul(10.0, 3.0);
        double div = calculator.div(40.0, 4.0);
        //Then
        Assert.assertEquals( 1.1, add, 1 );
        Assert.assertEquals( 2.0, sub, 1);
        Assert.assertEquals( 30.0, mul, 1);
        Assert.assertEquals( 10, div, 1);
    }
}
