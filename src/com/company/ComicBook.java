package com.company;

public class ComicBook extends Book{
    private String characterName;

    public ComicBook() {
    }

    public ComicBook(String title, Author author, int availables, double price, BookType type, String characterName) {
        super(title, author, availables, price, type);
        this.characterName = characterName;
    }

    public getPrice(){
        double newPrice=getPrice()*0.4;
        return super.getInfo() + newPrice;
    }
}

