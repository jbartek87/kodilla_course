package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

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
//        poemBeautifier.beautify("Tata Major", text2 -> text2.toUpperCase());
//        poemBeautifier.beautify("Oni ona i PIZZERIA", text2 -> text2.toLowerCase());
//        poemBeautifier.beautify("Synowie i Córki", text2 -> "*** " + text2 + " ***");


//        System.out.println("Using Stream to generate even numbers");
//        NumbersGenerator.generateEven(20);

//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length()>11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) +  ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);


//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String,Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication()>2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n", "<<", ">>"));
//        System.out.println(theResultStringOfBooks);
//
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultListOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 1999)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentyfier, forumUser -> forumUser));
        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
