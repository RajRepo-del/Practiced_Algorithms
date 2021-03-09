package strings;

import java.util.*;

class PalindromeSubStrings{
    static Set<String> palindromeStrs = new HashSet<String>();
    static Set<String> parsedStrs = new HashSet<String>();
public static int findAllPalindromeSubstrings(String input) {
    //TODO: Write - Your - Code
    int len=input.length();
    for(int i=2;i<=len;i++){
      String substr = input.substring(0,i);
      for(int j=0;j<substr.length();j++){
    	  if(!parsedStrs.contains(substr.substring(j))){
    		  isPalindrome(substr.substring(j));
    		  parsedStrs.add(substr.substring(j));
    	  }

      }
    }
    
    return palindromeStrs.size();
}
public static void isPalindrome(String str){
  char[] cr = str.toCharArray();
  int beginIndex=0;
  int endIndex = str.length()-1;
  boolean palindrome = true;
  
  if( str.length()==1){
	  return;
  }
  while(beginIndex<endIndex){
	  if(cr[beginIndex] != cr[endIndex]){
		  palindrome = false;
		  break;
	  }
	  beginIndex++;
	  endIndex--;
	  
  }
  
  if(palindrome){
	  palindromeStrs.add(str);
	  System.out.println(str);
  }

}

public static void main(String[] args) {
    String str = "aabbbazz";
    int count = findAllPalindromeSubstrings(str);
    System.out.println("Total palindrome substrings: " + count);
  }
}
