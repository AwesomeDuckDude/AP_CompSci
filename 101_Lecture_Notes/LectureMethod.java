/* 
    Lecture note example - Methods
*/

class LectureMethod{
    
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Noah"); 
        greeting("Jack");
        
        double num = raise(200000.42, 5);   
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
	}
	
	
	public static double raise(double salary, int precent){
	    double ammount = salary + (salary * (precent/100.0));
	    return ammount;

	} 
	
	
	public static void greeting(String name){
	   System.out.println("Howdy " + name);
	}
	
	
	public static void printAnimal(){
	    System.out.println("    |\\__/,|   (`\\");
	    System.out.println("  _.|o o  |_   ) )");
	    System.out.println("-(((---(((--------\n\n");
	    
	    System.out.println("   |\\---/|");
	    System.out.println("   | ,_, |");
	    System.out.println("    \\_`_/-..----.");
	    System.out.println(" ___/ `   ' ,  + \\");
	    System.out.println("(__...'   __\\    |`.___.';");
	    System.out.println("  (_,...'(_,.`__)/'.....+\n\n");
	}
	
	
}