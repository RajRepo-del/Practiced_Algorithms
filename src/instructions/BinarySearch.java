package instructions;

//devide and conquer
//binary_search({1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 12) 5
//binary_search({1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 44) -1
//binary_search({1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 80) 11

public class BinarySearch {
	
	int binary_search(int A[], int key, int len) {
		  //TODO: Write - Your - Code
		  int midlength = (len-1)/2;
		  int lowlength = 0;
		  int highlength = len-1;
		  while(highlength>midlength && lowlength <midlength){
		    if (key == A[midlength]){
		      return midlength;
		    }else if(key > A[midlength]){
		        lowlength=midlength;
		        midlength = (lowlength+highlength)/2;
		    } else{
		      highlength = midlength;
		      midlength = (lowlength+highlength)/2;
		    }

		  }
		  return -1;
		}

}
