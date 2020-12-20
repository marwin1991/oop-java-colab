package com.codecool.enigma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Enigma {

    public static final String rot13 = "rot13";
    public static final String railFence = "rail-fence";
    public static final String morse = "morse";

    private static String MENU = "Enigma Manual\n" +
            "Run options: [-h | -e | -d] {CipherName} {FileName} {EncryptionKey}\n" +
            "   -h : displays this menu; other arguments are ignored.\n" +
            "   -e : encrypt and display\n" +
            "   -d : decrypt and display\n" +
            "   CipherName      : cipher to use when encrypting/decrypting; [rot13, rail-fence, morse]\n" +
            "   FileName        : path to file to encrypt/decrypt\n" +
            "   EncryptionKey   : Optional -> must be provided if cipher requires a key";

    public static void main(String[] args) {
        try {
            ArgsParser argsParser = new ArgsParser(args);
            if (argsParser.getOption().equals(Option.HELP)) {
                System.out.println(MENU);
            } else {
                handleCipherOperation(argsParser);
            }
        } catch (EnigmaException e) {
            System.out.println(e.getMessage());
            System.out.println(MENU);
        }
    }

    private static void handleCipherOperation(ArgsParser argsParser) throws EnigmaException {
        Cipher cipher = CipherFactory.getCipherForArgs(argsParser);

        try {
            File myObj = new File(argsParser.getFile());
            try (Scanner myReader = new Scanner(myObj)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                    if (argsParser.getOption().equals(Option.ENCRYPT)) {
                        System.out.println(cipher.encrypt(data));
                    } else if (argsParser.getOption().equals(Option.DECRYPT)) {
                        System.out.println(cipher.decrypt(data));
                    }
                }
            }

        } catch (FileNotFoundException e) {
            throw new EnigmaException ("File not found");
        }


        // use cipher
    }



}
