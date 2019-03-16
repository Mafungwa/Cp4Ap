package com.example.priinciples;

public class SingleResponsibilityPrincipleObey {



        String text;
        String author;
        int length;

        String getText() {
            return  text;
        }
        void setText(String s) {

        }
        String getAuthor() {
            return author;
        }
        void setAuthor(String s) {

        }
        int getLength() {
            return length;
        }
        void setLength(int k) {

        }


        void allLettersToUpperCase() {

        }
        void findSubTextAndDelete(String s) {

        }
    }

    class Printer {
        SingleResponsibilityPrincipleObey text;

        Printer(SingleResponsibilityPrincipleObey t) {
            this.text = t;
        }

        void printText() {

        }
    }


