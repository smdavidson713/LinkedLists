/**
Sydney Davidson
CSI 213
Project 2 
**/

public class Node{

	private char value;
	private Node previous;
	private Node next;

	/**
	gets the value of the node 
	@return a char value of the node 
	*/
	public char getValue(){
		return value;
	}
	/**
	gets the next node in the doubly linked list
	@return the next node in the list 
	*/
	public Node getNext(){
		return next;
	}
	/**
	gets the previous node in the doubly linked list
	@return the previous node in the list
	*/
	public Node getPrevious(){
		return previous;
	}
	/**
	sets the value of the node
	@param char sets the value of a node to a char value
	*/
	public void setValue(char value){
		this.value = value;
	}
	/**
	sets the next node in the list
	@param Node the next node in the list
	*/
	public void setNext(Node next){
		this.next = next;
	}
	/**
	sets the previous node in the list 
	@param Node the previous node in the list
	*/
	public void setPrevious(Node previous){
		this.previous = previous; 
	}
}