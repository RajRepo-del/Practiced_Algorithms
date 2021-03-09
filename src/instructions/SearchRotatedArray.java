package instructions;

public class SearchRotatedArray {

	
		  static int binarySearchRotated(int[] arr,int key) {
		    //TODO: Write - Your - Code
		    int len = arr.length;
		    int minIndex = 0;
		    int maxIndex = arr.length -1;
		    int midIndex = (minIndex+maxIndex)/2;

		    while(midIndex>=minIndex && midIndex<=maxIndex){
		      if(key==arr[midIndex]){
		        return midIndex;
		      }else if(key==arr[minIndex]){
		    	  return minIndex;
		      }else if(key == arr[maxIndex]){
		    	  return maxIndex;
		      }
		      else if(arr[minIndex]<=key && (arr[midIndex]>=key || arr[midIndex] < arr[minIndex])){
		        maxIndex = midIndex;
		        midIndex = (minIndex+maxIndex)/2;
		      } else if(arr[midIndex]<key && (arr[maxIndex]>=key || arr[maxIndex] < arr[midIndex])){
		        minIndex = midIndex;
		        midIndex = (minIndex+maxIndex)/2;
		      } else if(arr[maxIndex] < arr[midIndex] && key<=arr[maxIndex]  ){
		    	  minIndex = midIndex;
			        midIndex = (minIndex+maxIndex)/2;
		      }
		    }

		    return -1;
		  }
		  
		  public static void main(String args[]){
			  int[] v1 = {6, 7, 1, 2, 3, 4, 5};
			  //  System.out.println("Key(3) found at: " + binarySearchRotated(v1, 3));
			  //  System.out.println("Key(6) found at: " + binarySearchRotated(v1, 6));
			    int[] v2 = {4, 5, 6, 7, 2, 3};
			    System.out.println("Key(3) found at: " + binarySearchRotated(v2, 2));
			    System.out.println("Key(3) found at: " + binarySearchRotated(v2, 3));
				   System.out.println("Key(6) found at: " + binarySearchRotated(v2, 4)); 
			  
		  }
		
	
}
