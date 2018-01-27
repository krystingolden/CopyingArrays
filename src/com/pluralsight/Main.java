package com.pluralsight;

import java.util.Random;

public class Main {
    /*
    https://programmingbydoing.com/
    Copying arrays - Assignment #142
     */

    public static void main(String[] args) {

        //Create 2 arrays to hold integers
        Integer[] integers1 = new Integer[10];
        Integer[] integers2 = new Integer[10];

        //Initialize a counter and a randomizer
        int index;
        Random r = new Random();

        //Fill the first array with random numbers between 1 and 100
        for (index = 0; index < integers1.length; index++){
            int number = r.nextInt(100);
            integers1[index] = number;
        }

        //Copy the values of the first array into the second array
        for (index = 0; index < integers1.length; index++){
            integers2[index] = integers1[index];
        }

        //Change the value of the integer in the last spot of the first array
        integers1[9] = -7;

        //Print out the values in the first array
        System.out.print("Array 1: ");
        for (index = 0; index < integers1.length; index++){
            System.out.print(integers1[index] + "  ");
        }

        System.out.println();

        //Print out the values in the second array
        System.out.print("Array 2: ");
        for (index = 0; index < integers1.length; index++){
            System.out.print(integers2[index] + "  ");
        }


    }
}
