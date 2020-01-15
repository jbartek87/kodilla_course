package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;
import prototype.library.Book;
import prototype.library.Library;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        //creating books
        Book book = new Book( "John Wick" , "Marcelo Wales" , LocalDate.of( 1999 , 3 , 10 ) );
        Book book2 = new Book( "Mr and Ms Smith" , "Peter Doupre" , LocalDate.of( 2010 , 1 , 25 ) );
        Book book3 = new Book( "Matrix" , "Kowalski Andrew" , LocalDate.of( 1980 , 5 , 5 ));

        //creating the library for books
        Library library = new Library( "Library nr 1" );
        library.getBooks().add( book );
        library.getBooks().add( book2 );
        library.getBooks().add( book3 );

        //making a shallow clone of object board
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName( "Library shallow copy" );
        } catch (CloneNotSupportedException e) {
            System.out.println( e );
        }

        //making a deep copy of object board
        Library deepClonedCopy = null;
        try{
            deepClonedCopy = library.deepCopy();
            deepClonedCopy.setName( "Library deep copy" );
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove( book2 );
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedCopy);
        Assert.assertEquals( 2, library.getBooks().size() );
        Assert.assertEquals( 2, cloneLibrary.getBooks().size() );
        Assert.assertEquals( 3, deepClonedCopy.getBooks().size() );
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals( deepClonedCopy.getBooks(), library.getBooks() );
    }
}
