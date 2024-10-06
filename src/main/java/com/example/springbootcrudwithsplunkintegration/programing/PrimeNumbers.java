package com.example.springbootcrudwithsplunkintegration.programing;

public class PrimeNumbers {

    public static void main(String[] args) {
        printFirst10PrimeNumber();
    }

    public static void printFirst10PrimeNumber() {
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



