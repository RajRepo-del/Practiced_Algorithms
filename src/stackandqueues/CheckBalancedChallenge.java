package stackandqueues;

public class CheckBalancedChallenge {
	public static boolean isBalanced(String exp) {
        char[] arr = exp.toCharArray();
        String charseq = "{[(";
        Stack<Character> stack = new Stack<>(exp.length());
        for( char c : arr){
        	if(charseq.contains(Character.toString(c))){
        		stack.push(c);
        	} else{
        		char c2 = stack.pop();
        		if(c2=='(' && c ==')'){
        			continue;
        		}else if(c2=='{' && c =='}'){
        			continue;
        		}else if(c2=='[' && c ==']'){
        			continue;
        		} else{
        			return false;
        		}
        	}
        }
         return true;
    }

}
