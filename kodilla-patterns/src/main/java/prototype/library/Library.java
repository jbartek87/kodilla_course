package prototype.library;

import prototype.Prorotype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prorotype {
     String name;
    Set<Book> books = new HashSet<>(  );

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "   Library [" + name + "]";
        for(Book book : books) {
            s = s + "\n" + book.toString();
        }
        return s;
    }

    public Library shallowCopy()throws CloneNotSupportedException{
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>(  );
        for(Book theBook : books) {
            Book clonedBooks = new Book( theBook.getTitle(),theBook.getAuthor(),theBook.getPublicationDate() );
            clonedLibrary.getBooks().add( clonedBooks );
        }
        return clonedLibrary;
    }
}
