package strings;



class RegxMatch{
	  static boolean regxMatch(String text, String pattern) {
	    //TODO: Write - Your - Code
    if(text.length()==0){
      return false;
    }
	    char arr[] = text.toCharArray();
	    char pat[] = pattern.toCharArray();
	    int j=0;
	    boolean flag=true;
    boolean prevMatch = false;
	    for(int i=0;i<text.length();i++){
	    char key = pat[j];
	    	if(key=='.'){
	    		j++;
	    		continue;
	    	}else if(key=='*'){
	    		if(arr[i-1]!=arr[i]){
          if(prevMatch){
            j++;
            i--;
            continue;
          } else{
            return false;
          }
	    			
	    		} else{
          prevMatch = true;
	    			continue;
	    		}
	    	} else{
	    		if(arr[i]!=pat[j]){
	    			return false;
	    		} else{
	    			j++;
	    			continue;
	    		}
	    	}
	    	
	    }

	    return flag;
	  }
	  
	  public static void main(String args[]){
		  boolean flag = regxMatch("aaabbbbbcccd","a*bbb*.*d");
		  System.out.println(flag);
	  }
	}
