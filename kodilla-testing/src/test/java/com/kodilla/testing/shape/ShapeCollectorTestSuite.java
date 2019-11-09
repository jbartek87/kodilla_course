package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("This is beggining of tests. ");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector myCollector = new ShapeCollector();
        Square square = new Square("Kwadrat", 10);
        Circle circle = new Circle("Koło", 10);
        Triangle triangle = new Triangle("Trójkąt", 20, 30);
        //When
        myCollector.addFigure(square);
        myCollector.addFigure(circle);
        myCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(3, myCollector.shapesQuantity());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector myCollector = new ShapeCollector();
        Square square = new Square("Kwadrat", 10);
        Circle circle = new Circle("Koło", 10);
        Triangle triangle = new Triangle("Trójkąt", 20, 30);
        myCollector.addFigure(square);
        myCollector.addFigure(circle);
        myCollector.addFigure(triangle);
        //When
        boolean removedFigure = myCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(removedFigure);
        Assert.assertEquals(2, myCollector.shapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector myCollector = new ShapeCollector();
        Square square = new Square("Kwadrat", 10);
        Circle circle = new Circle("Koło", 10);
        Triangle triangle = new Triangle("Trójkąt", 20, 30);
        myCollector.addFigure(square);
        myCollector.addFigure(circle);
        myCollector.addFigure(triangle);
        //When
        Shape retrievedFigure = myCollector.getFigure(1);
        //Then
        Assert.assertEquals(circle, retrievedFigure);
    }

}
