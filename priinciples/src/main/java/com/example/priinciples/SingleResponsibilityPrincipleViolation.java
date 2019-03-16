package com.example.priinciples;

public class SingleResponsibilityPrincipleViolation {


        String text;
        String author;
        int length;

        String getText() {
            return text;
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

        /*methods that change the text*/
        void allLettersToUpperCase() {

        }
        void findSubTextAndDelete(String s) {

        }

        /*method for formatting output*/
        void printText() {

        }
    }



