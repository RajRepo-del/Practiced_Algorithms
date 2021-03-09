package stackandqueues;

class QueueUsingStack{
	  //TODO: Write - Your - Code
	int maxsize = 20;
	  Stack<Integer> stack1 = new Stack<Integer>(maxsize);
	  Stack<Integer> stack2 = new Stack<Integer>(maxsize);
	  void enqueue(int data) {
		  if(stack1.getMaxSize()+stack2.getMaxSize() != maxsize){
			  stack1.push(data);
		  }
	  }

	  boolean isEmpty() {
	    return stack1.getMaxSize()+stack2.getMaxSize() == maxsize;
	  }

	  int dequeue() {
		  if(stack2.isEmpty()){
			  while(!stack1.isEmpty()){
				  stack2.push(stack1.pop());
			  }
		  }
		  if(stack2.isEmpty()){
			  return -1;
			  }
	    return stack2.pop();
	  }
	  public static void main(String[] args) {
		  
		    QueueUsingStack qs = new QueueUsingStack();
		    
		    System.out.println("dequeue()" + " = " + qs.dequeue());
		    qs.enqueue(3);
		    qs.enqueue(6);
		    qs.enqueue(16);
		    System.out.println("dequeue()" + " = " + qs.dequeue());
		    qs.enqueue(8);
		    qs.enqueue(4);
		    System.out.println("dequeue()" + " = " + qs.dequeue());
		  }
	}  