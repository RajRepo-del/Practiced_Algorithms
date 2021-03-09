package stackandqueues;

public class SortValuesChallenge {
	  public static void sortStack(Stack<Integer> stack) {
	        Stack<Integer> sortedstack=new Stack<>(stack.getMaxSize());
		  
	        int key;
	        sortedstack.push(stack.pop());
	        while(!stack.isEmpty()){
	        	key=stack.pop();
	        	if(key<=sortedstack.top()){
	        		sortedstack.push(key);
	        	}else{
	        		while(!sortedstack.isEmpty() && key>sortedstack.top()){
	        			stack.push(sortedstack.pop());	
	        		}
	        		sortedstack.push(key);
	        	}
	        	
	        }
	        while(!sortedstack.isEmpty()){
                stack.push(sortedstack.pop());
        }
	        
	    }
	  
	  public static void main(String args[]){
		  Stack<Integer> stack=new Stack<>(5);
		  stack.push(1);
		  stack.push(23);
		  stack.push(112);
		  stack.push(14);
		  stack.push(27);
		  //stack.push(97);
		  //stack.push(2);
		  
		  sortStack(stack);
		  while(!stack.isEmpty()){
			  System.out.println(stack.pop());
		  }
	  }

}
