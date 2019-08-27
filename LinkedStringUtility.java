/**
Sydney Davidson
CSI 213
Project 2 
**/
import java.io.*;
import java.util.*;
public class LinkedStringUtility{
	public static void start() throws IOException{ 

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		ArrayList<LinkedString> aList = new ArrayList<LinkedString>();
		String line = br.readLine();
		while(line != null){
			LinkedString linkedString = new LinkedString(line);
			aList.add(linkedString);
			line = br.readLine();
		}
		System.out.println("Is the linked strings empty?");
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i).isEmpty());   //checks to make sure the Strings are empty or not
		}
		System.out.println("-----------------------");
		System.out.println("Here is our current list: ");
		for(int i = 0; i < aList.size(); i++){ 
			System.out.println(aList.get(i));            //returns the doubly linked list
		}
		System.out.println("-----------------------");
		System.out.println("These are the lengths of the elements in the list: ");			
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i).length());  //gets the length of elements in the list
		}
		System.out.println("-----------------------");
		System.out.println("Here's a character at some idex: ");			
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i).charAt(1));   //gets a character value at a specific index
		}
		System.out.println("-----------------------");
		for(int i = 0; i < aList.size(); i++){
			System.out.println("Here is our current list: ");			
			System.out.println(aList.get(i));            //returns the doubly linked list 
			System.out.println("-----------------------");	
		}
		System.out.println("Here's a concatentation of some string: ");
		for(int i = 0; i < aList.size(); i++){		
			if(i < aList.size() - 1){
				System.out.println(aList.get(i).concat(aList.get(i+1))); //concatenates the elements together 
			}
		}
		System.out.println("-----------------------");
		System.out.println("Here is our current list: ");
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i));         //returns the doubly linked list 
		}  
		System.out.println("-----------------------");
		System.out.println("Here is a substring from the elements in the list: ");
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i).substring(1, 3));  //creates a substring from two specific points in the elements 
		}
		System.out.println("-----------------------");
		System.out.println("Here is our current list: ");
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i));        //returns the doubly linked list 
		}



	}

}