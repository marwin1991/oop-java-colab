package com.codecool.wasterecycling;

public class Garbage {

        private String name;

        public Garbage(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

        @Override
        public String toString() {
                return name;
        }
}
