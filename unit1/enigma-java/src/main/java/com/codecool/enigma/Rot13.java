package com.codecool.enigma;

class Rot13 implements Cipher {

    @Override
    public String encrypt(String message) {
        return "E";
    }

    @Override
    public String decrypt(String message) {
        return "D";
    }

    private char encryptLetter(char letter) {
        return letter;
    }

    private char decryptLetter(char letter) {
        return letter;
    }

}
