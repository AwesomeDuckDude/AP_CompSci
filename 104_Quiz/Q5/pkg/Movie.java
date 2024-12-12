package pkg;

public class Movie{
    String name = new String();
    double rating;
    int numRating;
    int revenue;

    public Movie(){
        name = "Avengers";
        rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    }
    
    public Movie(String a, double b, int c, int d){
        name = a;
        rating = b;
        numRating = c;
        revenue = d;
        
    }
    
    public void movieToString(){
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Rating: " + numRating);
        System.out.println("Revenue: " + revenue + "\n");
    }
    
    public String getMovieName(){
        return name;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public double getRating(){
        return rating;
    }
    
    public void addRating(double a){
        double b = (double)numRating;
        b = b * rating;
        numRating ++;
        b = b + a;
        rating = b/numRating;
    }
    
    public boolean compareRatings(Movie a){
        return rating > a.getRating();
    }
    
    public int revenueToString(){
        return revenue;
    }
    
    public Movie pirateMovie(){
        return new Movie(name, rating, numRating, revenue);
    }
}
