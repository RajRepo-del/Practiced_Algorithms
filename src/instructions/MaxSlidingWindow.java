package instructions;

import java.util.ArrayDeque;

//MaxSlidingWindow(windowSize: [1, 2, 3, 4, 3, 2, 1, 2, 5],3) [3, 4, 4, 4, 3, 2, 5]
//MaxSlidingWindow(windowSize: [1, 2, 3, 4, 3, 2, 1, 2, 5],4) [4, 4, 4, 4, 3, 5]
//MaxSlidingWindow(windowSize: [1, 2, 3, 4, 3, 2, 1, 2, 5],5) [4, 4, 4, 4, 5]

class MaxSlidingWindow{
	
	  public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
	    ArrayDeque<Integer> result = new ArrayDeque<>(); 
	    //Write your code
	    int minIndex = 0;
	    int maxIndex = windowSize-1;
	    int keyIndex = -1;
	    //int keyIndex = findmax(arr,minIndex,maxIndex);
	    //result.push(arr[keyIndex]);
	    do {
	      
	      if(minIndex > keyIndex){
	        keyIndex = findmax(arr,minIndex,maxIndex);
	        result.add(arr[keyIndex]);
	      }else{
	        if(arr[keyIndex] < arr[maxIndex]){
	          keyIndex = maxIndex;
	          result.add(arr[keyIndex]);
	        } else{
	          result.add(arr[keyIndex]);
	        }
	      }
	      minIndex++;maxIndex++;
	    }while(maxIndex<arr.length);

	    return result; 
	  }
	   static int findmax(int[] arr, int minind, int maxind){
	      int keyind = minind;
	      for(int i=minind;i<=maxind;i++){
	        if(arr[i]>arr[keyind]){
	          keyind = i;
	        }
	      }
	     return keyind;
	    }

	}
