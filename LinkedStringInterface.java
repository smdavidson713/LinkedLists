/***
Sydney Davidson
CSI 213
Project 2
**/

public interface LinkedStringInterface{

	/**
	Returns a char value at some index.
	@param int some integer that represents an index
	@return the char value at some index 
	*/
	public char charAt(int x);

	/**
	Concatenates a linked character string to the end
	of this linked character string
	@param LinkedString a linked string
	@return the new concatenated linked String
	*/
	public LinkedString concat(LinkedString string);

	/**
	Returns true is the length is 0
	@return true if the length is 0, false is not 
	*/
	public boolean isEmpty();

	/**
	Returns the length of the character String
	@return the lenth of the character string as an Int
	*/
	public int length();

	/**
	Returns a new linked char string that is a substring of
	this linked character string
	@param int index of the starting char
	@param int index of the last char 
	@return a new Linked String
	*/
	public LinkedString substring(int a, int b);
}