/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        //Your Code Goes here!
        int[] arr = {5, 5, 7, 7, 4, 2, 9, 1};
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] + " ");
   
        }
        
        int x = 8;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 8 ){
                System.out.print("\nDupe found at index " + i);
            }
        }
        
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print("\nConsecutive numbers at index " + i + " and " + (i+1));
            }
        }
	}
}