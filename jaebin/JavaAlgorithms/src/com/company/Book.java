package com.example;

public class Book {




    private String title;
    private long price;
    private long createAt;

    public Book(String title, long price, long createAt) {
        this.title = title;
        this.price = price;
        this.createAt = createAt;
    }

    public String getTitle() {
        return title;
    }


    public long getPrice() {
        return price;
    }


    public long getCreateAt() {
        return createAt;
    }


    public String print() {
        return "정보출력 : 제목은 " + this.title + " 가격은 " + this.price + " 발행연도는 " + this.createAt + " 입니다.";
    }

    public long basicDiscount(long p) {
        return this.price - p;
    }

    public void newDiscount() {
        if (this.createAt == 2014) {
            this.price *= 0.9;
        } else if (this.createAt < 2014) {
            this.price *= 0.5;
        }

    }

}
