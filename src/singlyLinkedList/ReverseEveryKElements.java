package singlyLinkedList;

import java.util.*;


class ReverseEveryKElements {

  public static ListNode reverse(ListNode head, int k) {
    // TODO: Write your code here
    int p=0;
    int q=1;
    ListNode startNode=head;
    ListNode endNode = new ListNode(0);
    ListNode result = new ListNode(0);
    ListNode prev=head;
    ListNode next2=head;
    while(head.next!=null){
      if(q==1){
        startNode=head;
      }
      if(q==k){
        for(int i=1; i<=k;i++){
          if(i==1)
          {
            next2 = startNode.next.next;
            prev = startNode.next;
            prev.next=startNode;
            head=next2;
          }
          else if(i<k){
            next2=head.next;
            head.next=prev;
            prev=head;
            head=next2;
          }else if(i==k){
            if(p==0){
              result=prev;
              p++;
            }
            //next2=head.next;
            //head.next=prev;
            endNode.next=prev;
            prev=startNode;
            endNode=startNode;
            startNode.next = null;
            //head=next2;
            
          }

        }

        q=1;
        continue;
      }
      q++;
      head=head.next;
    }
    
    if(q==1){
    	endNode.next=head;
  	  //startNode.next = null;
    }
    
    if(q<=k && q!=1){
    	
    	for(int i=1; i<=q;i++){
            if(i==1)
            {
              if(startNode.next.next==null){
            	  startNode.next.next=startNode;
            	  endNode.next=startNode.next;
            	  startNode.next = null;
            	  break;
              }
              next2 = startNode.next.next;
              prev = startNode.next;
              prev.next=startNode;
              head=next2;
            }
            else if(i<q){
              next2=head.next;
              head.next=prev;
              prev=head;
              head=next2;
            }else if(i==q){
              
              //next2=head.next;
              //head.next=prev;
              endNode.next=prev;
              prev=startNode;
              endNode=startNode;
              startNode.next = null;
              //head=next2;
              
            }
    	}
    	
    	
    }


    return result;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    //head.next.next.next.next.next.next.next = new ListNode(8);
    //head.next.next.next.next.next.next.next.next = new ListNode(9);

    ListNode result = ReverseEveryKElements.reverse(head, 3);
    System.out.print("Nodes of the reversed LinkedList are: ");
    while (result != null) {
      System.out.print(result.value + " ");
      result = result.next;
    }
  }
}
