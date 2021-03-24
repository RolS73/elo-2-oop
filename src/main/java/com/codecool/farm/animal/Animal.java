package com.codecool.farm.animal;

public abstract class Animal {

    private int size;

    public Animal() {
        this.size = 0;
    }

    public abstract void feed();

    public int getSize() {
        return size;
    }

    protected void setSize(int sizeAddition) {
        this.size += sizeAddition;
    }


    public String getLowercaseClassSimpleName() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
