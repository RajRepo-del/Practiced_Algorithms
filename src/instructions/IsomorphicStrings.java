package instructions;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		
		char [] a = {'e','g','g'};
		char [] b = {'f','o','l'};
		
		System.out.println(isIsomorphic(a,b));
		
		}
	
	public static boolean isIsomorphic(char[] a, char[]b){
		
		boolean flag= true;
		
		if(a.length!=b.length){
			return false;
		} else{
			HashMap<Character,Character> h1 = new HashMap<>();
			for(int i=0;i<a.length;i++){
				if(i!=0 && h1.containsKey(a[i])){
					if(b[i] !=h1.get(a[i])){
						return false;
					}
				}else{
					if(h1.containsValue(b[i])){
						return false;
					} else{
						h1.put(a[i], b[i]);
					}
				}
			}
		}
		
		return flag;
		
	}
		
	}
	
