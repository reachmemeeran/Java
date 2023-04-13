package com.meeran.datastructure;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

	private LLNode head;
    private LLNode tail;
    private int length;
    class LLNode{
        int value;
        LLNode next;

        LLNode(int value) {
            this.value=value;
        }
    }

    LinkedList(int value){
        LLNode newNode = new LLNode(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    void printLinkedList(){
        LLNode temp = head;
        while(temp!=null){
            System.out.println("Value-->"+temp.value);
            temp=temp.next;
        }
    }

    void getHead(){
        if(head!=null) System.out.println("Head is :"+head.value);
    }

    void getTail(){
        if(tail !=null) System.out.println("Tail is : "+tail.value);
    }
    
    public LLNode getHeadNode(){
        return head;
    }

    public LLNode getTailNode(){
        return tail;
    }

    //Insert last
    void append(int value){
        LLNode newNode = new LLNode(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Insert First
    void prepend(int value){
        LLNode newNode = new LLNode(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Remove First
    LLNode removeFirst(){
        if(length==0) return null;
        LLNode temp=head;
        head=head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }

    //Remove Last
    LLNode removeLast(){
        if(length==0) return null;
        LLNode temp=head;
        LLNode pre = head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    LLNode get(int index){
        if(index<0 || index >=length ) return null;
        LLNode temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    void set(int index, int value){
        LLNode temp = get(index);
        if(temp!=null) temp.value= value;
    }

    void insert(int index, int value){
        if(index==0) prepend(value);
        if(index==length) append(value);
        LLNode newNode = new LLNode(value);
        LLNode pre=get(index-1);
        newNode.next = pre.next;
        pre.next = newNode;
        length++;
    }

    public LLNode remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        LLNode prev = get(index - 1);
        LLNode temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        LLNode temp = head;
        head = tail;
        tail = temp;
        LLNode after = temp.next;
        LLNode before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
    
    public LLNode findMiddleNode() {
    	if(head==null) return null;
    	LLNode slow = head;
    	LLNode fast = head;
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow;
    }
    
    public boolean hasLoop() {
    	if(head==null) return false;
    	LLNode slow = head;
    	LLNode fast = head;
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		if(slow==fast) return true;
    	}
    	return false;
    }
    
    public LLNode findKthFromEnd(int k) {
    	LLNode fast = head;
    	LLNode slow = head;
    	for(int i=0; i<k; i++) {
    		if(fast==null) return null;
    		fast = fast.next;
    	}
    	
    	while(fast!=null) {
    		slow=slow.next;
    		fast=fast.next;
    	}
    	return slow;
    }
    
    public void removeDuplicates() {
    	Set<Integer> values = new HashSet<>();
    	LLNode current = head;
    	LLNode previous = null;
    	while(current != null){
    		if(values.contains(current.value)) {
    			previous.next = current.next;
    			length--;
    		}else {
    			values.add(current.value);
    			previous=current;
    		}
    		current=current.next;
    	}
    }
    
    public void reverseBetween(int m, int n) {
    	if(head==null) return;
    	LLNode dummy = new LLNode(0);
    	dummy.next = head;
    	LLNode previous = dummy;
    	
    	for(int i=0; i<m; i++) previous = previous.next;
    	
    	LLNode current = previous.next;
    	for(int i=0; i<n-m; i++) {
    		LLNode temp = current.next;
    		current.next = temp.next;
    		temp.next = previous.next;
    		previous.next = temp;
    	}
    	
    	head = dummy.next;
    }
    
    public void partitionList(int x) {
        if (head == null) return;
 
        LLNode dummy1 = new LLNode(0);
        LLNode dummy2 = new LLNode(0);
        LLNode prev1 = dummy1;
        LLNode prev2 = dummy2;
        LLNode current = head;
 
        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
 
        prev2.next = null;
        prev1.next = dummy2.next;
 
        head = dummy1.next;
    }  
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList(4);
        ll.printLinkedList();
        System.out.println("----------");
        ll.append(5);
        ll.printLinkedList();

        ll.getHead();
        ll.getTail();

        ll.prepend(3);
        ll.printLinkedList();
        System.out.println("Remove First: "+ll.removeFirst().value);
        ll.printLinkedList();
        System.out.println("Remove First: "+ll.removeFirst().value);
        ll.printLinkedList();
        System.out.println("Remove First: "+ll.removeFirst().value);
        ll.printLinkedList();
        System.out.println("Remove First: "+ll.removeFirst());
        ll.printLinkedList();

        ll.append(1);
        ll.printLinkedList();
        System.out.println("----------");
        ll.append(2);
        ll.printLinkedList();
        System.out.println("----------");
        ll.prepend(0);
        ll.printLinkedList();

        System.out.println("Remove Last: "+ll.removeLast().value);
        ll.printLinkedList();
        System.out.println("Remove Last: "+ll.removeLast().value);
        ll.printLinkedList();
        System.out.println("Remove Last: "+ll.removeLast().value);
        ll.printLinkedList();
        System.out.println("Remove Last: "+ll.removeLast());
        ll.printLinkedList();

        ll.append(1);
        ll.printLinkedList();
        System.out.println("----------");
        ll.append(2);
        ll.printLinkedList();
        System.out.println("----------");
        ll.prepend(0);
        ll.printLinkedList();

        System.out.println("Get the Element of index 1-->"+ll.get(1).value);
        System.out.println("Get the Element of index 2-->"+ll.get(2).value);

        ll.set(0,10);
        ll.printLinkedList();
        System.out.println("----------");
        ll.insert(1,11);
        ll.printLinkedList();
        ll.remove(1);
        System.out.println("----------");
        ll.printLinkedList();
        System.out.println("----Reverse------");
        ll.reverse();
        ll.printLinkedList();
        
        System.out.println("----Middle Node------"+ll.findMiddleNode().value);
        
        ll.append(5);
        ll.append(6);
        
        //ll.getTailNode().next = ll.getHeadNode().next;
        System.out.println(ll.hasLoop());
        ll.printLinkedList();
        int k=2;
        System.out.println(ll.findKthFromEnd(k).value);
        ll.append(5);
        ll.append(6);
        ll.printLinkedList();
        System.out.println("----Remove Duplicates------");
        ll.removeDuplicates();
        ll.printLinkedList();
        System.out.println("----reverse between 1,3------");
        ll.reverseBetween(1, 3);
        ll.printLinkedList();
        
        System.out.println("LL before partitionList:");
        ll.printLinkedList(); 

        ll.partitionList(5);

        System.out.println("\nLL after partitionList:");
        ll.printLinkedList(); 
	}

}
