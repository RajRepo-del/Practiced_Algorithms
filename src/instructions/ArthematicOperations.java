package instructions;

import java.util.Stack;

public class ArthematicOperations {

	public static void main(String[] args) {
		
		String [] arr = new String[] {"2", "1", "+", "3", "*" };
		System.out.println(evalExpr(arr));
		
	}
	
	public static int evalExpr(String [] arr){
		int sum = 0;
		String operators = "*-+/";
		Stack<String> stack = new Stack<String>();
		for(String str : arr){
			if(operators.contains(str)&&stack.size() >=2){
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch(str){
				case "+": sum = a+b;break;
				case "-": sum = a-b;break;
				case "*": sum = a*b;break;
				case "/": sum = a/b;break;				
				}stack.push(String.valueOf(sum));
			} else{
				stack.push(str);
			}
		}
		
		return sum;
		
	}

}
