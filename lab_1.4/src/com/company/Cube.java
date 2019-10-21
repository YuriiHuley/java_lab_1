package com.company;

public class Cube {

    private float length;

    public Cube(float length){

        this.length = length;
    }

    public void FindSquare(){
        float sqare = length*length*6;
        System.out.println("Square = " + sqare);
    }

    public void FindVolume(){
        float volume = length*length*length;
        System.out.println("Volume = " + volume);
    }

    public void FindDiagonale(){
        double x = 3;
        double diagonale = length * Math.sqrt(x);
        System.out.println("Diagonale = " + diagonale);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if(length > 0)
        this.length = length;
    }
}
