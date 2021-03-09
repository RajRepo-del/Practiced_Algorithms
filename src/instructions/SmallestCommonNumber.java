package instructions;

public class SmallestCommonNumber {
	
	public static void main(String args[]){
		int arr1[]={1, 4, 6, 7, 8, 10, 14};
		int arr2[]={1,4, 5, 6, 7, 8, 50};
		int arr3[]={0,6,7,8,10,25,30,40};
		int key = findLeastCommonNumber(arr1, arr2, arr3);
		System.out.println(key);
	}
	


	static int findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
		  //TODO: Write - Your - Code
		  int arr1len = arr1.length;
		  int arr2len = arr2.length;
		  int arr3len = arr3.length;

		  int key = -1;

		  for(int i=0;i< arr1len;i++){
		    key = arr1[i];
		    for(int j=0;j<arr2len;j++){
		      if(key == arr2[j]){
		        for(int k=0;k<arr3len;k++){
		          if(key==arr3[k]){
		            return key;
		          } else if(key<arr3[k]){
		            break;
		          }
		        }
		       
		      }else if(key<arr2[j]){
		        break;
		      }
		      
		    }

		  }


		  return -1;
	}
	

	
}

