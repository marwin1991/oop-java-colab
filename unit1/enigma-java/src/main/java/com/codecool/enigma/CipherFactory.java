package com.codecool.enigma;

class CipherFactory {

    static boolean isCipherAvailable(String cipherName) {
        return Enigma.rot13.equals(cipherName) || Enigma.railFence.equals(cipherName) || Enigma.morse.equals(cipherName);
    }

    static Cipher getCipherForArgs(ArgsParser args) throws EnigmaException {
        if(Enigma.rot13.equals(args.getCipher())){
            return new Rot13();
        } else if(Enigma.railFence.equals(args.getCipher())){
            return new RailFence();
        } else if(Enigma.morse.equals(args.getCipher())){
            return new MorseCode();
        } else {
            throw new EnigmaException("Unrecognised cipher name !");
        }
    }
}
