package com.amigoscode.book;

import java.util.ArrayList;

public class BookShelf {

    private int size;
    private int numberOfBooks;
    private ArrayList<Book> bookList;

    public BookShelf(int size) {
        this.size = size;
        this.numberOfBooks = 0;
        this.bookList = new ArrayList<>(size);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "size=" + size +
                ", numberOfBooks=" + numberOfBooks +
                ", bookList=" + bookList +
                '}';
    }
}
