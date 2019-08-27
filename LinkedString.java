/**
Sydney Davidson
CSI 213
Project 2 
**/
	
public class LinkedString{

	private DoubleLinkedList list;

	/**
	The default constructor that creates a
	new doubly linked list 
	*/
	public LinkedString(){
		list = new DoubleLinkedList();

	}
	/**
	A constructor that takes in a character array
	*/
	public LinkedString(char[] c){
		try{
			list = new DoubleLinkedList();

			for(int i = 0; i < c.length; i++){
				Node n = new Node();
				n.setValue(c[i]);
				list.add(n);
			}	
		}
		catch(Exception E){
			System.out.println("Error in input.");
		}	
	}
	/**
	A constructor that takes in a String 
	*/
	public LinkedString(String s){
		try{

			list = new DoubleLinkedList();

			for(int i = 0; i < s.length(); i++){
				Node n = new Node();
				n.setValue(s.charAt(i));
				list.add(n);
			}
		}
		catch(Exception E){
			System.out.print("Error in input");
		}
	}
	/**
	Returns a list
	@return Doubly linked list 
	*/
	public DoubleLinkedList getList(){
		return list;
	}
	/**
	sets up a Doubly Linked List
	@param DoubleLinkedList
	*/
	public void setList(DoubleLinkedList list){
		this.list = list;
	}

	/**
	Returns a char value at some index.
	@param int some integer that represents an index
	@return the char value at some index 
	*/
	public char charAt(int x){
		try{
			Node n = list.getHead();
			for(int i = 0; i < list.length(); i++){
				if(i == x)
					return n.getValue();
				else{
					n = n.getNext();
				}
			}
			return '\0';
		}
		catch(Exception e){
			System.out.println(e);
			return '\0';
		}
	}
	/**
	Concatenates a linked character string to the end
	of this linked character string
	@param LinkedString a linked string
	@return the new concatenated linked String
	*/
	public LinkedString concat(LinkedString string){
		try{
			LinkedString newlist = new LinkedString(this.toString());
			newlist.getList().getTail().setNext(string.getList().getHead());
			string.getList().getHead().setPrevious(newlist.getList().getTail());
			newlist.getList().setTail(string.getList().getTail());
			return newlist;
		}
		catch(Exception e){
			System.out.println(e);
			return null;
		}
	}

	/**
	Returns true is the length is 0
	@return true if the length is 0, false is not 
	*/
	public boolean isEmpty(){
		if(list.getHead() == null)
			return true;
		else{
			return false;
		}
	}

	/**
	Returns the length of the character String
	@return the lenth of the character string as an Int
	*/
	public int length(){
		Node n = list.getHead();
		int i = 0;
		while(n != null){
			n = n.getNext();
			i++;
		}
		return i;
	}

	/**
	Returns a new linked char string that is a substring of
	this linked character string
	@param int index of the starting char
	@param int index of the last char 
	@return a new Linked String
	*/
	public LinkedString substring(int a, int b){
		try{
			Node n = list.getHead();
			char[] cArray = new char[b-a + 1];
			for(int i = 0; i < list.length(); i++){
				if(i == a){
					for(int j = a; j <= b; j++){
						cArray[j-a] = n.getValue();
						n = n.getNext();
					}
					break;
				}
				else{
					n = n.getNext();
				}
			}
			LinkedString substring = new LinkedString(cArray);
			return substring;
		}
		catch(Exception e){
			System.out.println(e);
			return null;

		}
	}
	/**
	Takes a node and turns into a string
	@return a string
	*/
	public String toString(){
		String s = "";
		Node n = list.getHead();
		while(n != null){
			s += n.getValue();
			n = n.getNext();
		}
		return s;
	}

}
	
 