package instructions;

public class MergeSortedArrays {
	
	public static void main(String args[]){
		
		int[] arr1 = {1,3,4,5};
		int[] arr2 = {2,6,7,8};
		int[] arr3 = CheckMergeArray.mergeArrays(arr1, arr2);
		
		for(int i =0;i<arr3.length;i++){
			System.out.println("array element at"+ i +" is " + arr3[i]);
		}
	}

}

class CheckMergeArray 
{ 
    // merge arr1 and arr2 into a new result array 
    public static int[] mergeArrays(int[] arr1, int[] arr2) 
    {  
      // write your code here
      int[] mergedarray = new int[arr1.length+arr2.length];
      int resultindex = 0;
      for(int i=0,j=0; i<arr1.length || j<arr2.length;){
        if(i<arr1.length && arr1[i]<=arr2[j]){
            mergedarray[resultindex]=arr1[i];
            i++;
            resultindex++;
        }else if(j<arr2.length){
          mergedarray[resultindex]=arr2[j];
          j++;
          resultindex++;
        }
        
      }


      return mergedarray; // make a new resultant array and return your results in that
    } 
}