package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.List;

public class Dustbin {

        private String color;
        private List<Garbage> bin;

        public Dustbin(String color) {
                this.color = color;
                this.bin = new ArrayList<>();
        }

        public String getColor() {
                return color;
        }

        public void throwOutGarbage(Garbage garbage) {
                if (garbage instanceof PaperGarbage) {
                        bin.add(garbage);
                }

        }
}
