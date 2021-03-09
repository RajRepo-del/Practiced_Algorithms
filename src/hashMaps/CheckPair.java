package hashMaps;

import java.util.*;

public class CheckPair {
	
	  public static String findPair(int[] arr) {

		    String result = "";
		    HashMap<Integer,HashMap<Integer,Integer>> hMap = new HashMap<>();
		    HashSet<Integer> hSet= new HashSet<>();
		    for(int i=0;i<arr.length;i++){
		      for(int j=i+1;j<arr.length;j++){
		        int sum = arr[i]+arr[j];
		          if(!hMap.containsKey(sum)){
		        	  HashMap<Integer,Integer> hmap1 =  new HashMap<>();
		        	  hmap1.put(arr[i],arr[j]);
		            hMap.put(sum,hmap1);
		          }
		          else{
		        	  HashMap<Integer,Integer> hmap2 = hMap.get(sum);
		            for(HashMap.Entry<Integer,Integer> entry : hmap2.entrySet()){
		              result+="{"+entry.getKey()+","+entry.getValue()+"}"+"{"+arr[i]+","+arr[j]+"}";
		            } 
		          } 
		      }
		    }

		       
		    return result; 
		  }
	  
	  public static void main(String args[]){
		  
		  //int[] arr = {3,4,7,1,12,9};
		  String str = findPair(new int[]{3,4,7,1,2,9,8});
		  System.out.println(str);
		  ArrayList<String> str1 = new ArrayList<>();
		  str1.size();
		  LinkedList < Integer > llist= new LinkedList < Integer >();
		  llist.get(1);
		  //Queue<Integer> queue= new Queue<Integer>();
		  
		  
	  }

}
