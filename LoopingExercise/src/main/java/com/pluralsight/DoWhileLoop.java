package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException {
        int count =0;
        do {
            System.out.println("I love Java");
            Thread.sleep(1000);
            count++;

        }while(count <5);

    }
}
