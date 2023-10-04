package Eletronic;

import java.util.Arrays;
import java.util.Random;

public class CellSim {
    Random random = new Random();
    private double credit;

    private int number;

    private String[] lastCalls;


//costruttore
    public CellSim(double credit ){
        this.credit = 0.00;
        this.number = random.nextInt(1 , 9999999);
        this.lastCalls = new String[5];
    }
//getters
    public void info(){
        System.out.println("salve il tuo numero è " + this.number + " hai : " + this.credit + "le tue ultime chiamate sono : " + Arrays.toString(this.lastCalls));

    }

    public void call(int numberToCall , int seconds){
        if((this.credit -= ((double) seconds / 10)) > 0){
        String call =  numberToCall + " per " + Math.round((float) seconds / 60) + ":" + (seconds % 60);
        for(int i = 4 ; i >= 0 ; i--){
            if(i == 0){
            this.lastCalls[i] = call;
            }else {
                this.lastCalls[i] = this.lastCalls[i - 1];
            }
        }
        }else{
            System.out.println("credito esaurito");
        }

    }


    public void addCredit(double credit){
        this.credit += credit;
    }



}
