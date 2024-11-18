package com.company;
import java.util.Scanner;
import java.util.Random;
public class CWH_ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        System.out.println("hello welcome to the game of rock paper scissor\n" + "enter 1 for rock\n" + "enter 2 for paper\n" + "enter 3 for scissor");
        Scanner s = new Scanner(System.in);
        int human = s.nextInt();
        switch (human) {
            case 1:
                System.out.println("You choose rock");
                break;
            case 2:
                System.out.println("You choose paper");
                break;
            case 3:
                System.out.println("You choose scissor");

        }

        Random var = new Random();
        int computer = var.nextInt(1, 3);
        if(human<=3){
        switch (computer) {
            case 1:
                System.out.println("Computer choose rock");
                break;
            case 2:
                System.out.println("Computer choose paper");
                break;
            case 3:
                System.out.println(" Computer choose scissor");
        }

        } else {
            System.out.println(" ");
        }
        //winner declaration
        if (human==1 && computer==2){
            System.out.println("CONGRATULATION!! You Win");
        } else if (human==2 && computer==3) {
            System.out.println("computer win");
        } else if (human==3 && computer==1) {
            System.out.println("computer win");
        } else if (human==2 && computer==1) {
            System.out.println("computer win");
        } else if (human==3 && computer==2) {
            System.out.println("CONGRATULATION!! You Win");
        } else if (human==1 && computer==3) {
            System.out.println("CONGRATULATION!! You Win");

        }else {
            System.out.println("invalid error");
        }
    }
}



//answer from youtube

//import java.util.Random;
//import java.util.Scanner;

//(public class CWH_ROCK_PAPER_SCISSOR {
  //  public static void main(String[] args) {
        // Variable Declaration
        /* Here 1 stands for ROck
        and 2 stands for Paper
        and 3 stands for Scissor
         */
    //    System.out.println("Hello sir, Welcome to our rock , paper , scissor game\n" + "Enter 1 for Rock\n" + "Enter 2 for Paper\n" + "Enter 3 for seissor");
      //  Scanner sc = new Scanner(System.in);
        //int userInput = sc.nextInt();
//        Random var = new Random();
//        int computerInput = var.nextInt(1, 3);
//        switch (userInput) {
//            case 1 -> System.out.println("You choose Rock");
//            case 2 -> System.out.println("You choose paper");
//            case 3 -> System.out.println("You choose scissor");
//            default -> System.out.println("please select valid input");
//        }
//
//        if (userInput<=3){
//            switch (computerInput) {
//
//                case 1 -> System.out.println("Computer choose Rock");
//                case 2 -> System.out.println("Computer choose paper");
//                case 3 -> System.out.println("Computer choose scissor");
//
//            }
//
//        }
//        else {
//            System.out.println("");
//        }
// Winner Declaration
//        if (userInput == 1 && computerInput == 2) {
//            System.out.println("Computer won!");
//        } else if (userInput == 2 && computerInput == 3) {
//            System.out.println("Computer won!");
//        } else if (userInput == 3 && computerInput == 1) {
//            System.out.println("Computer won!");
//        } else if (userInput == 2 && computerInput == 1) {
//            System.out.println("you win");
//
//        } else if (userInput == 3 && computerInput == 2) {
//            System.out.println("you win");
//
//        } else if (userInput == 3 && computerInput == 1) {
//            System.out.println("you win");
//
//        } else if (userInput>3) {
//            System.out.println("It is an invalid input game cant be proceed furthur");
//
//        } else {
//            System.out.println("Congrats! you won the match");
//
//        }
//    }
//}


