package algo;

import java.util.*;
import java.io.*;
public class DutchFlag {
	
	 public static void dutchNationalFlag(int [] arr) 
	  { 
	  Helper helper = new Helper();
	  int startIndex=0;
	  int endIndex = arr.length-1;

	  for(int i=0;i<arr.length;i++){
	    if(arr[i]==0 && i>=startIndex){
	      helper.mySwap(arr,i,startIndex);
	      startIndex++;
	    } else if(arr[i]==2 && i< endIndex){
	    	if(arr[endIndex]==0){
	    		helper.mySwap(arr,startIndex,endIndex);
	    		startIndex++;
	    	}
	      helper.mySwap(arr,i,endIndex);
	      endIndex--;
	    }

	  }
	  
	  for(int token: arr)
	    System.out.print(token + " ");
	  }
	 
	 public static void main(String args[]){
		 int[] arr2 = new int[5];
		 int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		 dutchNationalFlag(arr);
	 }
}

class Helper {
	 void mySwap(int[] arr, int i, int j) {
	  int temp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = temp;
	 }
	}