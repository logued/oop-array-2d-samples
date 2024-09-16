package org.example;            // Updated: Sept 2024

import java.util.Random;

/**
 * Multi-Dimensional Arrays.
 * Demonstrates: Two-Dimensional Arrays (2D Arrays)
*/

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Arrays and 2d Arrays - Demonstrations");
        MainApp app = new MainApp();
        app.start();
    }

    public void start() {
        demo2DArray();
    }

    public void demo2DArray(){

        // create 2x2 2D array - ( an array of arrays)
        int[][] arr = new int[2][2];    // 2 rows x 2 columns

        // 2D arrays have a fixed size - i.e. once created they can not be made bigger or smaller

        // assign values to each element
        arr[0][0] = 3;      // row 0, column 0
        arr[0][1] = 5;      // row 0, column 1
        arr[1][0] = 7;
        arr[1][1] = 9;

        for(int i=0; i<arr.length; i++) {        // row (outer loop)
            for (int j=0; j< arr[0].length; j++)         // column (inner loop)
                System.out.print(arr[i][j]+", ");    // element arr[row][col]
            System.out.println();   // move to next line
        }

        // sudukoBox is a 2D Array

        int[][] sudukoBox = {   {2,4,9},    // initializer -
                                {7,1,8},    // this will create a 3x3 array
                                {3,5,6}
        };

        for( int i=0; i< sudukoBox.length; i++) {   // rows
            for (int j = 0; j < sudukoBox[0].length; j++)  // columns
                System.out.print(sudukoBox[i][j] +", ");

            System.out.println();
        }

        //TODO
        // Write the method sum2DArray that accepts a 2D array as an argument
        // sums up all the elements, and returns the sum
        //
        //int sum = sum2DArray(sudukoBox);

        //TODO
        // Write code to compare the elements of these 2D arrays.
        // Output the positions where the elements do not match
        // e.g "No match at position [0][2], [1][1]"

        int[][] arrA = {   {2,4,9},    // initializer -
                            {7,1,8},    // this will be a 3x3 array
                            {3,5,6}};
        int[][] arrB = {   {2,4,2},    // initializer -
                            {7,0,8},    // this will be a 3x3 array
                            {3,5,6}};

        // add code here to undertake matching.

        // When finished, move the code into a method but this time simply return
        // "true" or "false" to indicate whether the two 2D arrays match overall or not
    }
}