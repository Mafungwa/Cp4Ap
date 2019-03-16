package com.example.priinciples;
//Liskov's Substitution Principle Violation
public class Liskov implements InterfCl {

    public void intMove() {
        System.out.println("I can walk");
    }

    public void inteFly() {
        System.out.println("no wings");
    }
}
