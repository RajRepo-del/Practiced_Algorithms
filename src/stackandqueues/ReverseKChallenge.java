package stackandqueues;

public class ReverseKChallenge {
	
	public static <V> void reverseK(Queue<V> queue, int k) {
        
		Stack<V> stack1 = new Stack<V>(k);
		for(int i=0;i<k;i++){
			stack1.push(queue.dequeue());
		}
		Queue<V> queue2 = new Queue<V>(queue.getCurrentSize());
		while(!queue.isEmpty()){
			queue2.enqueue(queue.dequeue());
		}
		while(!stack1.isEmpty()){
			queue.enqueue(stack1.pop());
		}
		while(!queue2.isEmpty()){
			queue.enqueue(queue2.dequeue());
		}
		
    }

}
