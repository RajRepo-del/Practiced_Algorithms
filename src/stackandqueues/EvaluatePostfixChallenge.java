package stackandqueues;

public class EvaluatePostfixChallenge {

	public static int evaluatePostFix(String expression){
		
		char[] arr = expression.toCharArray();
		StringBuffer operator = new StringBuffer().append('X');
		String operators = "*-+/";
		Stack<Integer> stack = new Stack<Integer>(arr.length); 
		int finalValue=0;
		
		for (char c: arr) {
			operator.deleteCharAt(0);
			if(operators.contains(operator.append(c))){
				finalValue=calculate(stack.pop(),stack.pop(),operator);
				stack.push(finalValue);
			} else{
				stack.push(Integer.parseInt(operator.toString()));
			};
			
		}
		
		return finalValue;
	}
	static int calculate(int c1, int c2, StringBuffer operator){
		int finalvalue=0;
		switch (operator.charAt(0)) {
		case '*':
			finalvalue=c1*c2;
			break;
		case '-':
			finalvalue=c2-c1;
			break;
		case '+':
			finalvalue=c1+c2;
			break;
		case '/':
			finalvalue=c2/c1;
			break;

		default:
			break;
		}
		return finalvalue;
		
	}
	
	public static void main(String args[]){
		
	System.out.println(	evaluatePostFix("642/+"));
	}
	
}
