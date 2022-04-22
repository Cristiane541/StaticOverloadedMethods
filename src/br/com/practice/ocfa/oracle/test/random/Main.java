package br.com.practice.ocfa.oracle.test.random;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //using a function
        int n1 = rndRange(10, 14);
        System.out.println(n1);

        //using an overloaded function
        int n2 = rndRange(5);
        System.out.println(n2);
    }

    //using statics functions and overloaded methods
    public static int rndRange(int start, int finish){
        return (
                new Random().nextInt(finish+1 - start) + start
        );
    }

    public static int rndRange(int finish){
        return rndRange(0, finish);
    }
}
