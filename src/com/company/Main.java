package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("What would you like to play? Press 1 for guess a number. Press 2 for me to guess a number");
        System.out.print("Press 1 to guess a number between 1 and 10. \nPress 2 to guess a number between 1 and 100. \nPress 3 to guess a number between 1 and 1000. \nPress 4 to guess a number between 1 and 10000.\n");
        Scanner diffinput = new Scanner(System.in);
        int difficulty = diffinput.nextInt();
        int min = 1;
        int max = 10;
        if(difficulty == 2){
            max = 100;
        }
        if(difficulty == 3){
            max = 1000;
        }
        if(difficulty == 4){
            max = 10000;
        }
        if(difficulty > 4 || difficulty < 1){
            System.out.print("Invalid Input, so you'll just play 1-10.\n");
        }
        System.out.print("Guess a number between "+min+" and "+max+". \n");
        int randnum = (int)(Math.random()*(max-min+1)+1);
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int numguesses = 0;
        while(guess != randnum){
            if(guess < randnum){
                System.out.print("Higher! \n");
            }
            else{
                System.out.print("Lower! \n");
            }
            input = new Scanner(System.in);
            guess = input.nextInt();
            numguesses++;
        }
        System.out.print("You got it! Nice! It took you "+numguesses+" tries.");
    }
}
