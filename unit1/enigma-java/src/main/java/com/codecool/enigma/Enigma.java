package com.codecool.enigma;

class Enigma {

    private static String MENU = "Enigma Manual\n" +
            "Run options: [-h | -e | -d] {CipherName} {FileName} {EncryptionKey}\n" +
            "   -h : displays this menu; other arguments are ignored.\n" +
            "   -e : encrypt and display\n" +
            "   -d : decrypt and display\n" +
            "   CipherName      : cipher to use when encrypting/decrypting; [rot13, rail-fence, morse]\n" +
            "   FileName        : path to file to encrypt/decrypt\n" +
            "   EncryptionKey   : Optional -> must be provided if cipher requires a key";

    public static void main(String[] args) {
        ArgsParser argsParser = new ArgsParser(args);
        handleCipherOperation(argsParser);
    }

    private static void handleCipherOperation(ArgsParser argsParser) {
        Cipher cipher = CipherFactory.getCipherForArgs(argsParser);
        // use cipher
    }

}
