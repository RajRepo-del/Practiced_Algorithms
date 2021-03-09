package hashMaps;

import java.util.*;

public class CheckSubZero {

	  public static boolean findSubZero(int[] arr) {

		    HashMap<Integer,int[]> hmap = new HashMap<>();
		    for(int i=0;i<arr.length;i++){
		      for(int j=i;j<arr.length;j++){
		        if(hmap.containsKey(arr[j]*-1)){
		          return true;
		        } 
		        
		        if(i==j){
		          for(HashMap.Entry<Integer,int[]> entry : hmap.entrySet()){
		            int sum1 = arr[j]+entry.getKey();
		            if(!hmap.containsKey(sum1)){
		            	int[] arr1 = new int[entry.getValue().length+1];
		            	arr1=entry.getValue();
		            	arr1[arr1.length-1]=arr[j];
		              hmap.put(sum1,arr1);
		            }
		          }
		        }
		        
		        int sum = arr[i]+arr[j];

		        if(!hmap.containsKey(sum)){
		          hmap.put(sum,new int[]{arr[i],arr[j]});
		        }
		      }
		    }    
		    return false;
		  }
	
	
}
