package com.codecool.enigma;

class ArgsParser {

    private final String option;
    private final String cipher;
    private final String file;
    private final String key;

    ArgsParser(String[] args) throws EnigmaException {
        if(args.length >= 1 && "-h".equals(args[0])){
            this.option = args[0];
            this.cipher = null;
            this.file = null;
            this.key = null;
        } else if(args.length >= 4){
            this.option = args[0];
            this.cipher = args[1];
            this.file = args[2];
            this.key = args[3];
        } else {
            throw new EnigmaException("Too few arguments passed!");
        }
    }

    public String getOption() {
        return option;
    }

    public String getCipher() {
        return cipher;
    }

    public String getFile() {
        return file;
    }

    public String getKey() {
        return key;
    }
}
