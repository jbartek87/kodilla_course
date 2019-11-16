package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String beautyText = poemDecorator.decorator(text);
        System.out.println(beautyText);
    }
}
