package singlyLinkedList;
import java.util.*;

class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

class ReverseSubList {

	  public static ListNode reverse(ListNode head, int p, int q) {
	    // TODO: Write your code here
	    int index = 1;
	    ListNode next2=head;
	    ListNode prev=head;
	    ListNode next1=head;
	    ListNode startNode=head;
	    ListNode result = head;
	    ListNode prev1=head;

	    while(index<=q){
	      if(index ==p ){
	        startNode = head;
	        prev1=prev;
	        next2=head.next.next;
	        prev = head.next;
	        prev.next=head;
	        head=next2;
	        index++;
	        continue;
	      }
	      if(index >= p && index <q){
	        //next2=head.next;
	        next1 = head.next;
	        head.next=prev;
	        prev=head;
	        head=next1;
	        index++;
	        continue;
	      }
	      if(index==q){
	        startNode.next=head;
	        prev1.next=prev;
	        index++;
	        continue;
	      }
	      index++;
	      prev=head;
	      head=head.next;
	    }

	    return result;
	  }

	  public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    head.next = new ListNode(2);
	    head.next.next = new ListNode(3);
	    head.next.next.next = new ListNode(4);
	    head.next.next.next.next = new ListNode(5);

	    ListNode result = ReverseSubList.reverse(head, 2, 4);
	    System.out.print("Nodes of the reversed LinkedList are: ");
	    while (result != null) {
	      System.out.print(result.value + " ");
	      result = result.next;
	    }
	  }
	}