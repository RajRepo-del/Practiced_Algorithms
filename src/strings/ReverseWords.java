package strings;

class ReverseWords{
	  public static void reverseWords (char[] sentence) {
	    //TODO: Write - Your - Code
	    
	    int len = sentence.length;
	    int startindex=0;
	    int endindex=0;
	    char[] revStr = new char[len];
	    for(int i=0;i<len;i++){
	      revStr[len-i-1] = sentence[i];
	      
	    }
	    for(int i=0;i<len;i++){
	    	sentence[i] = revStr[i];
	    	if(i==len-1 || revStr[i]==' '){
	    		if(i==len-1) endindex++;
		    	  reverseWord(sentence,startindex,endindex-1);
		    	  startindex=i+1;
		      }
		      endindex++;
	      
	      
	    }

	  }
	  private static void reverseWord(char[] revStr, int startindex, int endindex) {
		// TODO Auto-generated method stub
		  char temp;
		  while(startindex<=endindex){
			  temp=revStr[startindex];
			  revStr[startindex]=revStr[endindex];
			  revStr[endindex]=temp;
			  startindex++;
			  endindex--;
		  }
		
	}
	static char[] getArray(String t) {
		    char[] s = new char[t.length() + 1];
		    int i = 0;
		    for (; i < t.length(); ++i) {
		      s[i] = t.charAt(i);
		    }
		    return s;
		  }
	  public static void main(String[] args) {
		    char[] s = getArray("Hello World!");
		    System.out.println(s);
		    reverseWords(s);
		    System.out.println(s);
		  }
	}  
