package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionsReturnList(){

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(bookLibrary.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20(){
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListOfZeroHandedBooks(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Zenek", "Kowalski", "212312");
        List<Book> handedBooks = new ArrayList<Book>();

        when(bookLibrary.listBooksInHandsOf(libraryUser)).thenReturn(handedBooks);

        //When
        List<Book> bookListTest = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, bookListTest.size());

    }
    @Test
    public void testListOfOneHandedBooks(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Zenek", "Kowalski", "212312");
        List<Book> handedBooks = new ArrayList<Book>();
        Book book1 = new Book("W pustyni i w puszczy", "Kowalski", 1922);
        handedBooks.add(book1);
        when(bookLibrary.listBooksInHandsOf(libraryUser)).thenReturn(handedBooks);

        //When
        List<Book> bookListTest = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, bookListTest.size());

    }
    @Test
    public void testListOfFiveHandedBooks(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Zenek", "Kowalski", "212312");
        List<Book> handedBooks = new ArrayList<Book>();
        Book book1 = new Book("W pustyni i w puszczy", "Kowalski", 1922);
        Book book2 = new Book("Siedem", "Kowalski", 2520);
        Book book3 = new Book("Matrix", "Kowalski", 1999);
        Book book4 = new Book("Pan i Pani", "Kowalski", 2002);
        Book book5 = new Book("Wojna Domowa", "Kowalski", 1918);
        handedBooks.add(book1);
        handedBooks.add(book2);
        handedBooks.add(book3);
        handedBooks.add(book4);
        handedBooks.add(book5);
        when(bookLibrary.listBooksInHandsOf(libraryUser)).thenReturn(handedBooks);

        //When
        List<Book> bookListTest = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, bookListTest.size());

    }




}
