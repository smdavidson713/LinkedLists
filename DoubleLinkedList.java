/**
Sydney Davidson
CSI 213
Project 2 
**/

public class DoubleLinkedList{

	private Node head;
	private Node tail; 

	/**
	gets the head of the Double linked list
	@return Node 
	*/
	public Node getHead(){
		return head;
	}
	/**
	gets the tail of the Double Linked List
	@return Node 
	*/
	public Node getTail(){
		return tail;
	}
	/**
	Sets the head for the double linked list
	@param Node the head node 
	*/
	public void setHead(Node head){
		this.head = head;
	}
	/**
	sets the tail of the double linked list
	@param Node the tail node 
	*/
	public void setTail(Node tail){
		this.tail = tail; 
	}
	/**
	adds a new node to the doubly linked list
	@param Node some node that is being added 
	*/
	public void add(Node n){
		if(head == null){
			head = n;
			tail = head;
		}
		else{
			tail.setNext(n);
			n.setPrevious(tail);
			tail = n; 
		}
	}
	/**
	gets the length of the double linked list
	@return an integer that represents the length of the list 
	*/
	public int length(){
		Node n = head;
		int i = 0;
		while(n != null){
			n = n.getNext();
			i ++;
		}

		return i;
	}
}