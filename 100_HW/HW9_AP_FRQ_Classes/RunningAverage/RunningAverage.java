


import java.util.*;

public class RunningAverage{
    private int count;
    private double average;

    public RunningAverage(){
        
    }


    public void updateAverage(double newVal){
        double b = (double)count;
        b = b * average;
        count ++;
        b = b + newVal;
        average = b/count;
    }

    public int processNewRatings(int num){
        int a = 0;
        int i = 0;
        while(a < num){
            double rating = getNewRating();
            if (rating >= 0){
                updateAverage(rating);
            }
            else{
                i++;
            }
            num++;
        }
        return i;
    }


    public double getNewRating(){
        
    }
}

