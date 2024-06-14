Data Structures and Algorithms
- Syllabus / Contents
	- Lectures 		Topic
	- June 07 		Algorithms Analysis and Time Complexity
					Basic Data Structure Concepts 
						- Arrays, LinkedList, Queue, Stack
					
	- June 14		Basic Data Structures (Java Code)
						- Arrays, LinkedList, In Class Problems at 5:00 - 6:00pm
						
	- June 21		Stacks and Queue (Java Code)
	- June 28		Trees (Concepts, and Java Code)
	- July 12		Hashing (Concepts, and Java Code)
	- July 19		Heaps (Concepts, and Java Code)
	- July 26		Grapsh (Concepts, and Java Code)
	- Aug  02		Important Algorithms (BFS, DFS, Dijkstra's)
	
- Lecture 2 Jun 14, 2024
	- Basic Data Structures
		- Array Basic, ArrayList (Java), LinkedList 
		
	- Array Basic 
		- It is not a primitive data type like int, double, etc.
		- It is an aggregate data type 
		- Once an array is created, its size is fixed; and an array reference variable us used to access the elements in the array.
			- What is a reference variable?
				- Variable
					- represents location in memory and the value at the location is represented by a variable name 
						- int age = 21;
							- int: data type 
							- age: variable
							- 21: value 
							
				- Reference Variable 
					- represents location in memory and the value at that location contains the address. This address will help locate the actual object in memory.
					
						Circle cir = new Circle(3.0);
						- Circle: class name 
						- cir: reference variable which will hold the address of a Circle object 
						- new Circle(3.0): is the object of class Circle location at the address containted in the rerence variable cir 
						- see the Reference Variable.png file
					
		- Declaring Array 
			- elementType[] arrayRefVar;
				- [] identifies an array 
				- contiguous memory location: Consecutive blocks of memory allocated to user processes
				
			- double [] myList; // only myList in the stack 
						myList = new double[10]; // in the heap
						
			  double [] myList = new double[10];
				- allocate 80 contiguous bytes of 10 double elements 
				in the heap referenced by myList in the stack 
				
			- double [] myList = {1.9, 2.9, 3.4};
			  double [] myList = new double[3];
				myList[0] = 1.9;
				myList[1] = 2.9;
				myList[2] = 3.4;
				
			- Problem 1: Initialize Array with input values
				- see ArrayExample1.java
			- Problem 2: Display the contents of the array
				- See Problem 1 above
				
			- Problem 3: Summing all elements: use the same array as in problem 1 and store the sum of the values in a variable called total and diplay the total 
			
			- Problem 4: Finding the largest element: use the array in problem 1
			
			- Problem 5: Find the smallest index of the larget element in the array 
			
			- Problem 6: Random shuffling 
				- see ArrayExample2.java
			
			- Problem 7: Shifting elements 
			
	
		- Copying Arrays 
			double [] myList1 = new double[3];
			double [] myList2 = new double[3];
			... we have assigned values to these arrays 
			myList2 = myList1; // Shallow copy
			- now both myList1 and myList2 are referring to the same memory location as myList1
			
			- deep copy is preferred
				- iterate through the array 