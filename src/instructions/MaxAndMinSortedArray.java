package instructions;

public class MaxAndMinSortedArray {
	
	public static void main(String ars[]){
		int arr[]={1,2,3,4,5,6,7};
		maxMin(arr);
	}
	
	
	public static void maxMin(int[] arr) {
	    int len=arr.length-1;
	    int midlen = arr.length/2;
	    int result[]=new int[len+1];
	    int j=0;
	    // Write - Your - Code
	    for(int i=0;i<midlen;i++){
	      result[j]=arr[len-i];j++;
	      result[j]=arr[i];j++;
	    }
	    if(arr.length%2==1){
	      result[j]=arr[midlen];
	    }
	    arr=result;
	  }

}
