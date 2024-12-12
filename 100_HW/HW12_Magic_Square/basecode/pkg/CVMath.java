package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static int MagicSquare(int a){
		boolean tof = true;
		int b = 1;
		int c = 1;

		for(int i = 2; a > 0; i++ ){
			if(b == c * c){
				if(a == 1){
					return b;
				}
			System.out.println(b);
			a--;
			}
			if(b > c * c){
				c++;
			}
			b = b + i;
		}
		return b;
}

}
