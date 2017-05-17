/**
 * CS 240: Introduction to Data Structures
 * Professor: Edwin Rod&iacute;guez
 *
 * Programming Assignment #3
 *
 * <List>
 *
 * Eric Schenck
 *   
 */

package edu.cpp.cs.cs240.list_project_hw3;

import java.util.Scanner;

public class ListProgram {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		int bound, userChoice;
		boolean dontQuit = true;
		String idNum, name;
		
		System.out.println("Please Enter the amount of entries you would like to make... ");
		
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		
		bound = keyboard1.nextInt();
		
		UnboundedList userList = new UnboundedList(bound);
		
		for(int i = 0; i<bound; i++) {
			System.out.println("Name to Enter: ");
			name = keyboard2.nextLine();
			System.out.println("ID: ");
			idNum = keyboard2.nextLine();
			userList.add(idNum, name);
		}
		
		while (dontQuit) {
			System.out.println("Please choose from the following: ");
			System.out.println("To show a list of names - Press 1");
			System.out.println("To lookup an ID number  - Press 2");
			System.out.println("To add new Entries      - Press 3");
			//System.out.println("To Delete an Entry      - Press 4");
			System.out.println("To Quit the Program     - Press 0");
			
			userChoice = keyboard1.nextInt();
			
			switch(userChoice) {
			
			case 1:	
				
				Object[] tempList = userList.sortList();
				
				//print out
				System.out.print("\n\n");
				for(int i = 0; i < userList.size(); i++) {
					System.out.print(tempList[i] + " ");
				}
				System.out.print("\n\n");
				// must be alphabetized list of only names. 
				break;
			case 2:
				System.out.println("ID Number: ");
				idNum = keyboard2.nextLine();
				System.out.println("Name is: " + userList.lookup(idNum));
				break;
				
			case 3:
				System.out.println("Name to Enter: ");
				name = keyboard2.nextLine();
				System.out.println("ID: ");
				idNum = keyboard2.nextLine();
				userList.add(idNum, name);
				break;
				
			case 0:
				System.out.println("Goodbye");
				dontQuit = false;
				break;
				
			default: 
				System.out.println("Wrong Entry");
				break;
				
				
				
				
			}
		}
		
		keyboard1.close();
		keyboard2.close();
		
	}
	
}
