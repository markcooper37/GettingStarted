package com.amigoscode.book;

import java.util.ArrayList;

public class BookShelfService {

    public void addBook(Book book, BookShelf bookShelf) {
        if (bookShelf.getSize() == bookShelf.getNumberOfBooks()) {
            System.out.println("Can't add the specified book - the bookshelf is already full!");
        } else {
            bookShelf.setNumberOfBooks(bookShelf.getNumberOfBooks() + 1);
            ArrayList<Book> currentBookList = bookShelf.getBookList();
            currentBookList.add(book);
            bookShelf.setBookList(currentBookList);
            System.out.println("Successfully added book: " + book);
        }
    }

    public void removeBook(Book book, BookShelf bookShelf) {
        if (bookShelf.getBookList().contains(book)) {
            ArrayList<Book> currentBookList = bookShelf.getBookList();
            currentBookList.remove(book);
            bookShelf.setBookList(currentBookList);
            bookShelf.setNumberOfBooks(bookShelf.getSize() - 1);
            System.out.println("Successfully removed book: " + book);
        } else {
            System.out.println("Can't remove the specified book - it is not on the shelf!");
        }
    }


}
