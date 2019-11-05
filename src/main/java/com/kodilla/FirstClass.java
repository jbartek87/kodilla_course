package com.kodilla;

class Kodilla {
    public static void main(String[] args) throws java.lang.Exception {
        int a = 64;
        int b = 160;
        int nwd = 1;

        while (nwd != 0) {
            nwd = a % b;
            if (nwd != 0) {
                a = b;
                b = nwd;
            } else if (nwd == 0) {
                System.out.println("Największy wspólny dzielnik to: " + b);
            }
        }
    }
}
