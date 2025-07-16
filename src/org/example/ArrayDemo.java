package org.example;

public class ArrayDemo {
    public static void main(String[] args) {

        //declare two integer arrays

        //declare a two dimensional array
        int[][] a = {
                {1, 2},
                {4, 5}
        };

        //declare a two dimensional array
        int[][] b = {
                {3, 6},
                {6, 3}
        };



        //declare a third array to hold the sum of the first two arrays
        int[][] c = new int[2][2];


        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                //print the elements of the first array
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        // Your code here
    }
}


