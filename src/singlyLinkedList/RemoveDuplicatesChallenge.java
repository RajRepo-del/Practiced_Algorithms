package singlyLinkedList;

public class RemoveDuplicatesChallenge {
//removeDuplicates(1000->55->4->2321->55->
	public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        // Write -- Your -- Code
        SinglyLinkedList<T>.Node curNode = list.headNode;
        SinglyLinkedList<T>.Node innerNode;
        SinglyLinkedList<T>.Node prevNode;
        while(curNode!=null){
            innerNode = curNode.nextNode;
            prevNode = curNode;
            while(innerNode!=null){
                if(innerNode.data==curNode.data){
                    prevNode.nextNode = innerNode.nextNode;
                    innerNode =innerNode.nextNode;
                }else{
                prevNode = innerNode;
                innerNode =  innerNode.nextNode;  
                }
            }
            curNode = curNode.nextNode;
        }
    }
	
	public static void main(String args[]){
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.insertAtHead(1000);
		list.insertAtEnd(55);
		list.insertAtEnd(4);
		list.insertAtEnd(2321);
		list.insertAtEnd(55);
		
		removeDuplicates(list);
	}
}
