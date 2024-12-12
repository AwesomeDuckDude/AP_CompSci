/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        int [] arr = new int[(int)(Math.random() * 149)+51];
        int min = Integer.MAX_VALUE;        
        int max = 0;
        int average = 0;


        for(int a = 0; a < arr.length; a++){
            arr[a] = (int)(Math.random() * 100)+1;
            average = average + arr[a];
        }
        for(int b = 0; b < arr.length; b++){
            if(arr[b] > max){
                max = arr[b];
            }
        }
        
        for(int c = 0; c < arr.length; c++){
            if(arr[c] < min){
                min = arr[c];
            }
        }
        System.out.println("There are " + arr.length + " elements");
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        System.out.println("The average is " +  average/arr.length);
        
    }
}