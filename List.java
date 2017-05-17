 /**
 * CS 240: Introduction to Data Structures
 * Professor: Edwin Rod&iacute;guez
 *
 * Programming Assignment #3
 *
 * <List: superclass to SimpleBoundedList and SimpleLinkedList and 
 *  Unbounded List>
 *
 * modified by: Eric Schenck
 * last modified: 4/26/17
 *   
 */
package edu.cpp.cs.cs240.list_project_hw3;


public interface List<K extends Comparable<K>,V> {
	
	/**
	* will check whatever list to make sure
	* list is not full and spot is not taken. if list space is available
	* then this function will add an element or node to list. 
	*
	* @param key specific identifier for each list entry
	* @param value actual data contained in each entry
	* @return 		true when list is not full and entry is added
	*/
	public abstract boolean add(K key,V value);
	
	/**
	* removes a list entry  
	*
	* @param key specific identifier for each list entry 
	* @return		returns value that was removed 
	*/
	public abstract V remove(K key);
	
	/**
	* removes a list entry  
	*
	* @param n integer represents the index of the entry to remove 
	* @return		returns value that was removed 
	*/
	public abstract V remove(int n);
	
	/**
	* removes a list entry  
	*
	* @return		returns value that was removed 
	*/
	public abstract V remove();
	
	/**
	* function that finds an entry based on a key
	* 
	* @param key specific identifier for each list entry
	* @return		returns value that is being looked up
	*/
	public abstract V lookup(K key);
	
	/**
	* returns the size of the list of entries 
	*
	* @return		returns an integer, size of the list 
	*/
	public abstract int size();
	
	/**
	* gets the value of an entry based on an index param 
	*
	* @param n int represents index of entry look up
	* @return 		returns value that is being gotten
	*/
	public abstract V get(int n);
	
	/**
	 * returns String to be printed
	 * 
	 * @return		returns String with all entries
	 */
	public abstract String toString();
	
	/**
	 * copies an array of objects to another array of objects
	 * 
	 * @return 		returns a copy of an array of Objects[]
	 */
	public abstract Object[] toArray();
}