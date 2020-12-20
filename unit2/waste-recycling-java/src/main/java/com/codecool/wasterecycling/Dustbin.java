package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.List;

public class Dustbin {

        private String color;
        private List<Garbage> paperBin;
        private List<Garbage> plasticBin;
        private List<Garbage> houseWasteBin;

        public Dustbin(String color) {
                this.color = color;
                this.paperBin = new ArrayList<>();
                this.plasticBin = new ArrayList<>();
                this.houseWasteBin = new ArrayList<>();

        }

        public String getColor() {
                return color;
        }


        public void throwOutGarbage(Object garbage) throws DustbinContentException {
                if (garbage instanceof PaperGarbage) {
                        paperBin.add((PaperGarbage) garbage);
                } else if (garbage instanceof PlasticGarbage) {
                        plasticBin.add((PlasticGarbage) garbage);
                } else if (garbage instanceof Garbage) {
                        houseWasteBin.add((Garbage) garbage);
                } else {
                        throw new DustbinContentException();
                }

        }

        public void emptyContents() {
                paperBin.clear();
                plasticBin.clear();
                houseWasteBin.clear();
        }

//    Green Dustbin! House waste content: 2 item(s) Rotten tomato nr.
//    1 Half-eaten lettuce nr.2 Paper content: 1 item(s) Failed exam nr.1
//    Plastic content: 3 item(s) Empty plastic bottle nr.1 Plastic bag nr.2
//    Wrapper foil nr.3

        public int getHouseWasteCount() {
                return houseWasteBin.size();
        }

        public int getPlasticCount() {
                return plasticBin.size();
        }

        public int getPaperCount() {
                return paperBin.size();
        }

        private String garbageToString(List<Garbage> garbageList) {
                String result = "";
                for (int i = 0; i < garbageList.size(); i++) {
                        result += garbageList.get(i).toString() + " nr." + (i + 1);
                }
                return result;
        }


        @Override
        public String toString() {
                return color + " Dustbin! " + "House waste content: " + getHouseWasteCount() + " item(s) " + garbageToString(houseWasteBin) + System.lineSeparator() +
                        "Paper content: " + getPaperCount() + " item(s) " + garbageToString(paperBin) + System.lineSeparator() +
                        "Plastic waste content: " + getPlasticCount() + " item(s) " + garbageToString(plasticBin);
        }

        public void displayContent() {
                System.out.println(toString());
        }
}
