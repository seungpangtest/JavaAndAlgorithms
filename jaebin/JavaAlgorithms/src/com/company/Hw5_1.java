package com.example;

import java.util.Scanner;

public class Hw5_1 {

    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//        //주민번호 앞자리
//        int front;
//        //주민번호 뒷자리
//        int back;
//
//        //생년
//        int year = 0;
//        int month = 0;
//        int day = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//
//        front = sc.nextInt();
//
//        back = sc.nextInt();
//
//        System.out.println(front);
//        System.out.println(back);
////
////        삼항 연산자 a?b:c
////      if(front/10000 >22) {
////         year = 19;
////         }else {
////            year =20;
////         }
//
//        year = (((front / 10000) > 50)) ? (19 * 100 + front / 10000) : (20 * 100 + front / 10000);
//
//        front = front % 10000;
//
//        month = front / 100;
//        month = (month > 10) ? (month = month) : (month = month % 10);
//
//        front = front % 100;
//
//        day = front;
//
//        day = (day >= 10) ? (day= day) : (day = day % 10);
//
//
//        System.out.println("생년월일은 다음과 같습니다.");
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);

//

//        int x = 5;
//        int y =8;
//        System.out.println((x<<4)+(y>>2));
//        System.out.println(x);
//        System.out.println(y);
//
//        int a = 5;
//        int b =8;
//
//        System.out.println(a++*--b);
//        System.out.println(a);
//        System.out.println(b);
//
//        double k =3.1;
//        k *= 2;
//        System.out.println((int)k);
//        System.out.println(k);
//        int n =(-1>0)?2:4;
//        String s ="S";
//        switch (n){
//            case 1 : case 2:
//                s=s+"A";
//            case 3: case 4:
//                s=s+"B";
//            default:
//                s=s+"C";
//
//        }
//        System.out.println(s);


        Account account = new Account();
        account.setBalance(10000);
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(500);
        System.out.println(account.getBalance());

    }


}