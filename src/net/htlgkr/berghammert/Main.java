package net.htlgkr.berghammert;

public class Main implements PrimeSieve{

    public static void main(String[] args) {

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

    }
}
