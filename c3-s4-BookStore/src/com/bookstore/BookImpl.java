package com.bookstore;

public class BookImpl {

    public static void main(String [] args)
    {
        Author a1=new Author("Robert","Cello");
        Book book=new Book();

        book.setTitle("Rich Dad Poor Dad");
        book.setIsbnNumber(6776);
        book.setDiscription("_________________");
        book.setPrice(6798);
        book.setAuthor(a1);
        book.display();
    }
}
