package com.company;

public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int availables;
    private double price;

    public Book(){

    }
    public Book(String title, Author author, int availables, double price, BookType type) {
        this.title = title;
        this.author = author;
        this.availables = availables;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int getAvailables() {
        return availables;
    }

    public void setAvailables(int availables) {
        this.availables = availables;
    }

    public double getInformation() {
        System.out.println("Title: " + title + ", author: " + author + ", type: " + type);
    }

    public double getPrice(){
        System.out.println(", price: " + price);
    }

    public double getPrice(double priceReduction){
        System.out.println(", price: " + price*0.25);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
