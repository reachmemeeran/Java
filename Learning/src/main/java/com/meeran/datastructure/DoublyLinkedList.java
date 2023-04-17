package com.meeran.datastructure;

public class DoublyLinkedList {
	
	class DLLNode{
		int value;
		DLLNode next;
		DLLNode prev;
		
		DLLNode(int value){
			this.value=value;
		}
	}
	
	private int length;
	private DLLNode head, tail;
	
	public DoublyLinkedList(int value){
		DLLNode newNode = new DLLNode(value);
		head = newNode;
		tail = newNode;
		length=1;
	}
	
	public void printList() {
		DLLNode temp = head;
		while(temp!=null) {
			System.out.println("DLL items are: "+temp.value);
			temp = temp.next;
		}
	}
	
	public DLLNode getHeadNode() {
		return head;
	}
	
	public DLLNode getTailNode() {
		return tail;
	}
	
	public void append(int value) {
		DLLNode newNode = new DLLNode(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next = newNode; 
			newNode.prev = tail;
			tail=newNode;
		}
		length++;
	}
	
	public void prepend(int value) {
		DLLNode newNode = new DLLNode(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		} else {
			head.prev=newNode;
			newNode.next = head;
			head=newNode;
		}
		length++;
	}
	
	public void insert(int index, int value) {
		if(index <0 || index>=length) return;
		DLLNode newNode = new DLLNode(value);
		if(index==0) prepend(value);
		if(index==length) append(value);
		DLLNode before = get(index-1);
		DLLNode after = before.next; 
		newNode.prev = before;
		newNode.next = before.next;
		before.next = newNode;
		after.prev = newNode;
		length++;
	}
	
	public DLLNode removeLast() {
		if(length==0) return null;
		DLLNode temp = tail;
		if(length==1){
            head=null;
            tail=null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev=null;
        }
        length--;
        return temp;
	}
	
	public DLLNode removeFirst() {
		if(length==0) return null;
		DLLNode temp = head;
		head = head.next;
		head.prev = null;
		temp.next = null;
		length--;
		if(length==0) {
			head=null;
			tail=null;
		}
		return temp;
	}
	
	public DLLNode remove(int index) {
		if(index<0 || index>=length) return null;
		if(index==0) return removeFirst();
		if(index==length-1) return removeLast();
		DLLNode temp = get(index);
		temp.next.prev=temp.prev;
		temp.prev.next = temp.next;
		temp.next = null;
		temp.prev=null;
		length--;
		return temp;
	}
	
	public DLLNode getLessEfficient(int index) {
		if(index <0 || index>=length) return null;
		DLLNode temp = head;
		for(int i=0; i<index; i++) temp = temp.next;
		return temp;
	}
	
	public DLLNode get(int index) {
		if(index <0 || index>=length) return null;
		DLLNode temp = head;
		if(index<length/2) for(int i=0; i<index; i++) temp = temp.next;
		else {
			temp = tail;
			for(int i=length-1; i>index; i--) temp = temp.prev;
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		DLLNode temp = get(index);
		if(temp!=null) {
			temp.value = value;
			return true;
		}else return false;
	}
	
	public void swapFirstLast() {
		if(length<2) return;
		int temp = head.value;
		head.value = tail.value;
		tail.value=temp;
	}
	
	public void reverse() {
		DLLNode current = head;
		DLLNode temp = null;
		
		while(current!=null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			
			current = current.prev;
		}
		temp = head;
		head = tail;
		tail=temp;
	}
	
	public boolean isPalindrome() {
		if(length<=1) return true;
		if(length==2 && head.value!=tail.value) return false;
		DLLNode forwardNode = head;
		DLLNode backwardNode = tail;
		for(int i=0; i<length/2; i++) {
			if(forwardNode.value!=backwardNode.value) return false;
			forwardNode = forwardNode.next;
			backwardNode = backwardNode.prev;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList(7);
		System.out.println("HEad is: "+dll.getHeadNode().value);
		System.out.println("Tail is: "+dll.getTailNode().value);
		dll.printList();
		System.out.println("----Append TestCase--");
		dll.append(8);
		dll.append(9);
		dll.printList();
		
		System.out.println("----Remove Last TestCase--");
		System.out.println("----Removed Node--"+dll.removeLast().value);
		dll.printList();
		
		System.out.println("----Prepend TestCase--");
		dll.prepend(6);
		dll.prepend(5);
		dll.printList();
		
		System.out.println("----Remove First TestCase--");
		System.out.println("----Removed Node--"+dll.removeFirst().value);
		dll.printList();
		
		System.out.println("----Get - Less Efficient TestCase--");
		System.out.println("----get Node--"+dll.getLessEfficient(1).value);
		
		System.out.println("----Get - Efficient TestCase--");
		dll.append(9);
		dll.append(10);
		dll.printList();
		System.out.println("----get Node--"+dll.get(1).value);
		System.out.println("----get Node--"+dll.get(3).value);
		
		System.out.println("----Set TestCase--");
		System.out.println("----Is set?--"+dll.set(1,5));
		dll.printList();
		System.out.println("----Is set?--"+dll.set(9,5));
		System.out.println("----Is set?--"+dll.set(1,7));
		dll.printList();
		
		System.out.println("----Insert TestCase--");
		dll.insert(3,20);
		dll.printList();
		
		System.out.println("----Remove  TestCase--");
		System.out.println("----Removed Node--"+dll.remove(3).value);
		dll.printList();
		
		System.out.println("----Swap First and Last--");
		dll.swapFirstLast();
		dll.printList();
		
		System.out.println("----Swap First and Last back--");
		dll.swapFirstLast();
		dll.printList();
		
		System.out.println("----Reverse DLL--");
		dll.reverse();
		dll.printList();
		
		System.out.println("----palindrome False case--");
		System.out.println("----Is palindrome?--"+dll.isPalindrome());
		
		System.out.println("----Set Prepare Palindrome--");
		dll.set(0,6);
		dll.set(1,7);
		dll.printList();
		
		System.out.println("----palindrome True case--");
		System.out.println("----Is palindrome?--"+dll.isPalindrome());
		
	}
	

}
