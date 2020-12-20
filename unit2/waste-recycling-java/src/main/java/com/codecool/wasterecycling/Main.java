package com.codecool.wasterecycling;

public class Main {

        public static void main(String[] args) throws DustbinContentException {

                Dustbin dustbin = new Dustbin("Blue");

                dustbin.throwOutGarbage(new Garbage("Apple"));
                dustbin.throwOutGarbage(new PlasticGarbage("Bottle", true));

                dustbin.displayContent();
        }
}
