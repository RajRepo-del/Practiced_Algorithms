package singlyLinkedList;

import java.util.*;


class MergeKSortedLists {

  public static ListNode merge(ListNode[] lists) {
	 Stack<Character> st = new Stack<Character>();
    ListNode result = new ListNode(-1);
    ListNode prev = new ListNode(-1);
    ListNode next2 = new ListNode(-1);
    ListNode temp = new ListNode(-1);
    ListNode curListNode = new ListNode(-1);
    // TODO: Write your code here
    ListNode startNode = new ListNode(-1);
    for(int i=0;i<lists.length;i++){
      curListNode=lists[i];
      result=startNode;
      prev=startNode;
      int turnflag=0;
      while(curListNode.next!=null){
        if(i==0 && lists[0]!=null){
            result = lists[i];
            prev=result;
            startNode=result;
            break;
        }
        if(curListNode.value < result.value){
          next2 = curListNode.next;
          
          curListNode.next = result;
          //prev=curListNode;
          if(turnflag==0){
        	  startNode=curListNode;
        	  turnflag=1;
          }else{
        	  prev.next=curListNode;
          }
          prev=curListNode;
          curListNode=next2;
        }
        else if(curListNode.value == result.value || (result.next!=null && curListNode.value >= result.next.value)){
        prev = result;
        result=result.next;
        turnflag=1;
        }
        else if(curListNode.value > result.value ){
        next2 = curListNode.next;
        temp = result.next;
        result.next=curListNode;
        curListNode.next=temp;
        prev=result;
        result=result.next;
        curListNode=next2;
        turnflag=1;
        }
      }
      
      while(result!=null&&i!=0){
      if(curListNode.value < result.value){
          //next2 = curListNode.next;
          prev.next=curListNode;
          curListNode.next = result;
          prev=curListNode;
          break;
        }
        else if(curListNode.value == result.value || (result.next!=null && curListNode.value >= result.next.value)){
        prev = result;
        result=result.next;
        continue;
        }
        else if(curListNode.value > result.value ){
        temp = result.next;
        result.next=curListNode;
        curListNode.next=temp;
        prev=result;
        result=result.next;
        
        }
      }
      
      
      
      
      
    }


    return startNode;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(6);
    l1.next.next = new ListNode(8);

    ListNode l2 = new ListNode(3);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(7);

    ListNode l3 = new ListNode(1);
    l3.next = new ListNode(3);
    l3.next.next = new ListNode(4);

    ListNode result = MergeKSortedLists.merge(new ListNode[] { l1, l2, l3 });
    System.out.print("Here are the elements form the merged list: ");
    while (result != null) {
      System.out.print(result.value + " ");
      result = result.next;
    }
  }
}
