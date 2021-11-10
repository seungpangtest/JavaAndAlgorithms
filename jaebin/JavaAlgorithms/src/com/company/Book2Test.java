package com.example;

public class Book2Test {

    public static void main(String[] args) {

        Book myBook = new Book("java",10000,2014);
        Book yourBook = new Book("database",20000,2013);
        Book ourBook = new Book("computer",30000,2009);

        System.out.println(myBook.print());
        System.out.println(yourBook.print());
        System.out.println(ourBook.print());

        myBook.basicDiscount(1000);
        yourBook.basicDiscount(1000);
        ourBook.basicDiscount(1000);

        myBook.newDiscount();
        yourBook.newDiscount();
        ourBook.newDiscount();

        System.out.println(myBook.print());
        System.out.println(yourBook.print());
        System.out.println(ourBook.print());


    }

}
