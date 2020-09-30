package com.circleci.mfunaki.webinar;

public class App {
    public static void main(String[] args) {
        AddOperator addOperator = new AddOperator();
        System.out.println("1 + 2 = " + addOperator.operate(1, 2));
    }
}
