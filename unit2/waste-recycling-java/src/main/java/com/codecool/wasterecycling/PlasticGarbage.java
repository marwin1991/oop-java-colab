package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {

        private boolean cleanable;

        public PlasticGarbage(String name, boolean cleanable) {
                super(name);
                this.cleanable = cleanable;
        }

        public boolean isClean() {
                return cleanable;
        }

        public void clean(){
                cleanable = true;
        }
}
