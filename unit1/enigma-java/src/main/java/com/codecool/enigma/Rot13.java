package com.codecool.enigma;

class Rot13 implements Cipher {

    private static final String decryptionData = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public String encrypt(String message) {
        String output = "";
        for (int i = 0;i<message.length(); i++ ) {
            output += rot13(message.charAt(i));
        }
        return output;
    }

    @Override
    public String decrypt(String message) {
        String output = "";
        for (int i = 0;i<message.length(); i++ ) {
            output += rot13(message.charAt(i));
        }
        return output;
    }

    private char rot13(char letter) {
        int eLetterIndex = decryptionData.indexOf(letter);
        if (eLetterIndex == -1) {
            return letter;
        } else if (eLetterIndex <27) {
            return decryptionData.charAt(eLetterIndex+13);
        } else {
            return decryptionData.charAt(eLetterIndex-13);
        }
    }

}
