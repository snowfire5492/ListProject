
/**
 * CS 240: Introduction to Data Structures
 * Professor: Edwin Rod&iacute;guez
 *
 * Programming Assignment #3
 *
 * <UnboundedList>
 *
 * Eric Schenck
 *   
 */
package edu.cpp.cs.cs240.list_project_hw3;

public class UnboundedList<K extends Comparable<K>,V> extends SimpleBoundedLIst<K,V> {

	public UnboundedList(int bound) {
		super(bound);
	}

	@Override
	public boolean add(K key, V value) {
		ensureCapacity();
		super.add(key, value);
		
		return true;
	}

	private void ensureCapacity() {
		
		//System.out.println("size is " + super.size());
		//System.out.println(super.toString());
	
		if (super.size() == this.values.length) {
			int counter = 0;
			Object[] newArray = new Object[values.length * 2];
			
			for(int i = 0; i<values.length; i++) {
				newArray[i] = values[i];
				counter++;
			}
			
			this.values = newArray;
			super.setStart(0);
			super.setNextEmpty(counter);
		}
		
	}

}