package algo;

import java.util.Arrays;

class FloorCeiling
{
	public static void findFloorCeiling(int [] input, int key, int [] output)
	{
		if(key>input[input.length-1]||key<input[0]){
			return;
		}
		
			recurfind(input,key,0,input.length,output);
		
	}

	public static void recurfind(int[] input,int key,int startIndex, int endIndex,int[] output){
		int mid = (startIndex+endIndex)/2;

		if(input[mid]==key || mid==0 || mid==input.length-1){
				if(mid!=0)
				output[0]=input[mid-1];
				if(mid!=input.length-1)
				output[1]=input[mid+1];
		} else if(input[mid]>key){

			recurfind(input,key,startIndex,mid,output);
		} else{
			recurfind(input,key,mid,endIndex,output);
		}

	}

	public static void main(String args[]){
	int[] input = {1,2,3,4,5};
	int[] output = {-1,-1};
	findFloorCeiling(input, 0, output);
	
	System.out.println(output[0]);
	System.out.println(output[1]);
	
	}
}
