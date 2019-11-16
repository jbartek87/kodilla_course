package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text"));

//        System.out.println("Calculating expressions with lambdas");
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3,4, FuncionalCalculator::multiplyBy);
//        expressionExecutor.executeExpression(3,4,FuncionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3,4,FuncionalCalculator::subFromA);
//        expressionExecutor.executeExpression(3,4,FuncionalCalculator::divideAByB);
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautifyToUpperCase("tata major", text2 -> text2);
//        poemBeautifier.beautifyToLowerCase("Papier z Domu", text2 -> text2);
//        poemBeautifier.beautifyStars("Bierzesz ufo, skończysz krucho", text2 -> text2);

        System.out.println("Using Stream to generate even numbers");
        NumbersGenerator.generateEven(20);
    }
}
