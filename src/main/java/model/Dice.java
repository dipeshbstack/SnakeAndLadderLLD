package model;

import lombok.AllArgsConstructor;


public class Dice {

    private int numberOfDice;

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public int roll(){
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++)
        {
            sum = sum + (int)(Math.random() * 6) + 1;
        }
        return sum;
    }

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

}
