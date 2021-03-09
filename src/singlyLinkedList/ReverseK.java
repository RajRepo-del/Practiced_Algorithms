package singlyLinkedList;

class ReverseK{
	  static ListNode reverseKNodes(ListNode head, int k) {
	    //TODO: Write - Your - Code
	  ListNode head1=head;
	  ListNode firstNode;
	  ListNode lastNode;
	  firstNode = head1;
	  lastNode=head1;
	  int i = 0;
	  while(head1.next!=null){
	    i++;
	    if(i==k){
	      reverseSubNodes(firstNode,lastNode,i);
	      firstNode=head1;
	      i=0;
	    }
	    lastNode=head1;
	    head1=head1.next;

	  }


	    return head;
	  }

	static void reverseSubNodes(ListNode firstNode,ListNode lastNode, int i){
		ListNode next1 = firstNode.next.next;
		ListNode prev = firstNode;
		ListNode startNode = firstNode.next;

	while(i>0)
	{
	  next1 = next1.next;
	  startNode.next = prev;
	  prev=startNode;
	  startNode = next1;
	  i--;

	}

	}

	}  
