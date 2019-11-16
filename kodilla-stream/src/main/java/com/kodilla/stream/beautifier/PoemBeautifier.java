package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautifyToUpperCase(String text, PoemDecorator poemDecorator){
        String beautyText = poemDecorator.decorator(text).toUpperCase();
        System.out.println(beautyText);

    }
    public void beautifyToLowerCase(String text, PoemDecorator poemDecorator){
        String beautyText = poemDecorator.decorator(text).toLowerCase();
        System.out.println(beautyText);
    }
    public void beautifyStars(String text, PoemDecorator poemDecorator){
        String beautyText = poemDecorator.decorator(text);
        System.out.println("****---- " + beautyText + " ----****");


    }
}
