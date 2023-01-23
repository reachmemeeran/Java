package com.meeran.java.datastructure;

public class LinkedList {

	private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;

        Node(int value) {
            this.value=value;
        }
    }

    LinkedList(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    void printLinkedList(){
        Node temp = head;
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

    //Insert last
    void append(int value){
        Node newNode = new Node(value);
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
        Node newNode = new Node(value);
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
    Node removeFirst(){
        if(length==0) return null;
        Node temp=head;
        head=head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }

    //Remove Last
    Node removeLast(){
        if(length==0) return null;
        Node temp=head;
        Node pre = head;
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

    Node get(int index){
        if(index<0 || index >=length ) return null;
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    void set(int index, int value){
        Node temp = get(index);
        if(temp!=null) temp.value= value;
    }

    void insert(int index, int value){
        if(index==0) prepend(value);
        if(index==length) append(value);
        Node newNode = new Node(value);
        Node pre=get(index-1);
        newNode.next = pre.next;
        pre.next = newNode;
        length++;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
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
	}

}
