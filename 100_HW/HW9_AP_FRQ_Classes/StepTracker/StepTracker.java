import java.util.*;


public class StepTracker{
    int goal;
    int step;
    int active;
    int total;
    
    public StepTracker(int goal){
        this.goal = goal;
        step = 0;
        active= 0;
        total = 0;
    }
    
    public void addDailySteps(int step){
        this.step = this.step + step;
        total++;
        if(step >= goal){
            active++;
        }
    }
        
    public int activeDays(){
        return active;
    }
    
    public double averageSteps(){
        return (double) step/total;
    }
}
