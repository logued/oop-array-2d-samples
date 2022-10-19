package org.example;

import java.util.Random;

/**
 * Multi-Dimensional Arrays.
 * Sample code to recap on one-dimensional arrays and to   (2022)
 * demonstrate Two-Dimensional Arrays (2D Arrays)
*/

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Arrays and 2d Arrays - Demonstrations");
        MainApp app = new MainApp();
        app.start();
    }

    public void start() {
        demoArray();
        demo2DArray();
    }

    public void demoArray() {

        int[] array1 = {2,4,6,8,10};    // initial array with values

        for(int i=0; i<array1.length; i++) {
            System.out.print(array1[i]+",");
        }
        System.out.println();

        // pass array into a method
        display( array1 );

        int[] array2 = new int[10];  // create array with 10 elements
        populate(array2);
        display(array2);

        //TODO  - write the method sumArray(), and test it.
        //int sum = sumArray( array1 );
    }

    public void display( int[] arr ) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public void populate( int[] arr) {      // arr is a reference to an array of int
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1; // random number 1-100
        }
    }

    public void demo2DArray(){

        // create 2x2 2D array
        int[][] arr = new int[2][2];    // 2 rows x 2 columns

        // assign values to each element
        arr[0][0] = 3;      // row 0, column 0
        arr[0][1] = 5;      // row 0, column 1
        arr[1][0] = 7;
        arr[1][1] = 9;

        for(int i=0; i<2; i++) {        // row (outer loop)
            for (int j=0; j<2; j++)         // column (inner loop)
                System.out.print(arr[i][j]+", ");    // element arr[row][col]
            System.out.println();   // move to next line
        }

        // sudukoBox is a 2D Array

        int[][] sudukoBox = {   {2,4,9},    // initializer -
                                {7,1,8},    // this will be a 3x3 array
                                {3,5,6}};

        for( int i=0; i< sudukoBox.length; i++) {   // rows

            for (int j = 0; j < sudukoBox[0].length; j++)  // columns
                System.out.print(sudukoBox[i][j] +", ");

            System.out.println();
        }

        // TODO
        // write the method sum2DArray that accepts a 2D array as an argument
        // sums up all the elements, and returns the sum
        //
        //int sum = sum2DArray(sudukoBox);

        //TODO
        //Write code to compare the elements of these 2D arrays
        // output the positions where the elements do not match
        // e.g "No match at position [1][2]"

        int[][] arrA = {   {2,4,9},    // initializer -
                            {7,1,8},    // this will be a 3x3 array
                            {3,5,6}};
        int[][] arrB = {   {2,4,9},    // initializer -
                            {7,0,8},    // this will be a 3x3 array
                            {3,5,6}};

        // add code here to undertake matching.

        // When finished, move the code into a method but this time simply return
        // "true" or "false" to indicate whether the 2D arrays match or not overall
    }
}