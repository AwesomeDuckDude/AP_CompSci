/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]);
		}
		return;
	}
	
	public static int getArrayAverage(int[] a){
		int avg = 0;
		for(int i = 0; i < a.lenght; i++){
			avg = avg + i;
		}
		avg = avg/arr.length;
		return avg;
	}
	
	public static int getArrayMax(int[] a){
		int max = 0
		 for(int i = 0; i < arr.length; u++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
	}
	
	public static int getArrayMin(int[] a){
		int min = Integer.MAX_VALUE;  
		for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
	}
	
	public static void main(String args[]) {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 99) + 1;
		}
	}
	toStringArray(arr);
}
