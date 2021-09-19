package com.amigoscode.book;

public class Main {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(3);
        Book book1 = new Book("The Kite Runner", "Khaled Hosseini");
        Book book2 = new Book("The Code Book", "Simon Singh");
        Book book3 = new Book("Hello World", "Hannah Fry");
        Book book4 = new Book("The Romance of the Three Kingdoms", "Luo Guanzhong");

        BookShelfService bss = new BookShelfService();

        bss.addBook(book1, bookShelf);
        bss.addBook(book2, bookShelf);
        bss.addBook(book3, bookShelf);
        bss.addBook(book4, bookShelf);
        bss.removeBook(book2, bookShelf);
        System.out.println(bookShelf);

    }

}
