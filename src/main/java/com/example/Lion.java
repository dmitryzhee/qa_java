package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public IFeline feline;

    public Lion (IFeline feline) {
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }



}
