package algo;

class Merge {
    public static void mergeSortedArrays(int[][]arr, int k, int[] result) 
    {
    	int[] mergedarr=new int[10];
        for(int i=0;i<k;i++){
            if(i==0){
            	mergedarr = mergeArray(arr[0],arr[1]);
                i++;
            } else{
            	mergedarr = mergeArray(mergedarr,arr[i]);
            }
        }
        result = mergedarr;
        for(int i=0;i<12;i++){
    		System.out.println(result[i]);	
    	}
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        int index=0;
        int innerIndex=0;
        for(int i=0;i<arr1.length;i++){

        	
        	for(int j=innerIndex;j<arr2.length;j++){
                if(arr1[i]>arr2[arr2.length-1] || arr1[i]>=arr2[j]){
                    mergedArray[index]=arr2[j];
                    index++;
                    innerIndex++;
                    continue;
                } else if(arr1[i]<arr2[j]){
                    mergedArray[index++]=arr1[i];
                    break;
                }
            }
        	if(innerIndex >=arr2.length){
        		mergedArray[index++]=arr1[i];
        		continue;
            	}
        }
        while(innerIndex < arr2.length){
        	mergedArray[index]=arr2[innerIndex];
            index++;
            innerIndex++;
            
        }
        
        
        
        return mergedArray;

    }
    
    public static void main(String args[]){
    	
    	int arr[][] = {{16, 25, 36}, {2, 9, 15}, {22, 55, 67}, {38, 79, 99}};
    	int result[] = new int[12];
    	mergeSortedArrays(arr, 4, result);
    	
    	for(int i=0;i<12;i++){
    		System.out.println(result[i]);	
    	}
    	
    }


}
