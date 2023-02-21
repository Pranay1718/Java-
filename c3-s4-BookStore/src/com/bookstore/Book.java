package com.bookstore;

public class Book {

    private String title;
    private int isbnNumber;
    private String discription;
    private double price;
    private Author author;



    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display()
    {
        System.out.println("Book Title : "+getTitle());
        System.out.println("ISBN Number : "+getIsbnNumber());
        System.out.println("Description : "+getDiscription());
        System.out.println("Price : "+getPrice());
        System.out.println("Author Name : "+getAuthor().getAuthorName());
        System.out.println("Author Pen Name : "+getAuthor().getAuthorPenName());
    }
}
