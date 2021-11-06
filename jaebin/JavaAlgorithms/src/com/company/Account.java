package com.example;

public class Account {

    private String owner;
    private long balance;


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String deposit(long p){
        this.balance += p;
        return "저축이 완료되었습니다. 현재 남은 금액은" + this.balance+"입니다.";
    }

    public String withdraw(long p){
        if(this.balance<p){
            return "남은 잔액 보다 더 큰 금액을 인출 할 수 없습니다. 현재 남은 금액은 "+this.balance+"입니다.";
        }else {
            this.balance -= p;
            return "출금이 완료 되었습니다.현재 남은 금액은" +this.balance+"입니다." ;
        }

    }

}
