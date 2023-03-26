package com.kodilla.kodilla.patterns.prototype.library;

import com.kodilla.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Library extends Prototype<Library> {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook  : books) {
            Book clonedBook = new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }
}
