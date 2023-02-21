package com.bookstore;

public class Author {

    private String authorName;

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorPenName='" + authorPenName + '\'' +
                '}';
    }

    private String authorPenName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }
    public Author(String authorName,String authorPenName)
    {
        this.authorName=authorName;
        this.authorPenName=authorPenName;
    }
}
