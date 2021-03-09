package strings;

import java.util.*;

class RemoveDuplicates{
	  static void removeDuplicates(char[] str){
	      //TODO: Write - Your - Code
	      HashSet<Character> st = new HashSet<Character>();
	      for(int i=0; i<str.length; i++){
	        if(!st.contains(str[i]) && str[i] !='\0'){
	          st.add(str[i]);
	        }
	      }
	      int j=0;
	      Iterator<Character> it = st.iterator();
	      while(it.hasNext()){
	        str[j]=(Character)it.next();
	        j++;
	      }
	      str[j]='\0';
	  }
	  
	  public static void main(String[] args) {
		  
		    char[] input = getArray("dabbac");
		    System.out.print("Before: ");
		    System.out.println(input);
		    RemoveDuplicates.removeDuplicates(input);
		    System.out.print("After: ");
		    print(input);
		  }
	  static char[] getArray(String t) {
		    char[] s = new char[t.length() + 1];
		    int i = 0;
		    for (; i < t.length(); ++i) {
		      s[i] = t.charAt(i);
		    }
		    s[i] = '\0';
		    return s;
		  }

		  static void print(char[] s) {
		    int i = 0;
		    while (s[i] != '\0') {
		      System.out.print(s[i]);
		      ++i;
		    }
		    System.out.println();
		  }

	}  
