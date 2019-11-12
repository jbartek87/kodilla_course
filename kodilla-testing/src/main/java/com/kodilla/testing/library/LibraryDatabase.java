package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //list of books having title begininning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //list of books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book for libraryUser
    //returns true when succesfull
    //and return false when book is unavaible to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
