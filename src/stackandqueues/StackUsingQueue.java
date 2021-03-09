package stackandqueues;

public class StackUsingQueue {
	int maxsize = 20;
	  Queue<Integer> queue1 = new Queue<Integer>(maxsize);
	  Queue<Integer> queue2 = new Queue<Integer>(maxsize);
	  
	  void push(int data) {
		  if(queue1.getCurrentSize()+queue2.getCurrentSize()<maxsize && queue2.isEmpty()){
			  queue1.enqueue(data);
		  } else if(queue1.getCurrentSize()+queue2.getCurrentSize()<maxsize){
			  queue2.enqueue(data);
		  }
	  }
	  
	  boolean isEmpty() {
	    return queue1.getCurrentSize()+queue2.getCurrentSize()==0;
	  }

	  int pop() {
		  if(queue2.isEmpty()){
			  
		  while(queue1.getCurrentSize()>1){
			  queue2.enqueue(queue1.dequeue());
		  }
		  if(queue1.isEmpty()){
			  return -1;
		  }
		  return queue1.dequeue();
		  } else{
			  while(queue2.getCurrentSize()>1){
				  queue1.enqueue(queue2.dequeue());
			  }
			  if(queue2.isEmpty()){
				  return -1;
			  }
			  return queue2.dequeue();
			  
		  }
	    
	  }

	  public static void main(String[] args) {
		    StackUsingQueue sq = new StackUsingQueue();
		    System.out.println("Pop(): " + sq.pop());
		    sq.push(3);
		    sq.push(5);
		    sq.push(9);
		    System.out.println("Pop(): " + sq.pop());
		    sq.push(10);
		    sq.push(16);
		    System.out.println("Pop(): " + sq.pop());
		  }    
	  
}
