package net.htlgkr.berghammert;

import java.util.Scanner;

public class Main implements PrimeSieve{

    public static int obergrenze;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Obergrenze eingeben:");
        obergrenze = sc.nextInt();

    }

    @Override
    public boolean isPrime(int p) {
        boolean prime = false;
        for (int i = 0; i <= p; i++) {
            prime = true;
            for(int j = 2; j < i && prime; j++) {
                if((i % j)==0) {
                    prime = false;
                }
            }
        }
        return prime;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < obergrenze; i++) {
            boolean p = isPrime(i);
            if(p == true) {
                System.out.println(i);
            }
        }
    }
}
