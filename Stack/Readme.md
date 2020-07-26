<h2> STACK: </h2> 

   A Stack is a Last In First Out (LIFO) data structure. 
   It supports two basic operations called :
   - Push : The push operation adds an element at the top of the stack
   - Pop : the pop operation removes an element from the top of the stack

<i>Note:</i> Java provides a Stack class which models the Stack data structure.


<br><br>
<h3>Why do we need stack:</h3>
  
  When we need to create an application where we need `last in first out data`.
  e.g. Let say we open any browser and browser google.com , facebook.com, linkedin.com, hotmail.com now when we click 
  the back button we will first go from hotmail.com to linkedin.com then to facebook.com and last we go to google.com

<b>Some Applications where we use stack:</b>

    i. reversing a string or word
    Ii. undo
    Iii. checking the braces closing { { { }}}
    Iv. recursion


<br> <br>
<h3>Rule:</h3>
Insertion and deletion is possible from one end.

<br> <br>
<h3>Common operations in Stack: </h3>

- Create a stack
- Delete a stack
- Push
- Pop
- Peek
- IsEmpty
- isFull


<br> <br>
<h3>Implementation of stack: </h3>

    Stack can be implemented using:
    
    - Array (static memory allocation)
    - Linked List (dynamic memory allocation)

  <b>Note:</b> <i>the core logic will be the same but the implementation will be different.</i>


<br> <br>
<h3>Implementing Stack using Array:</h3>

    Advantage:
    - Easy to implement

    Disadvantage:
    - Has a fixed size.
    
<b>Note: Please check the readMe section of Stack(via Array) </b> 
[Stack Implementation using Array!](https://github.com/tusharsaran/datastructures/tree/master/Stack/src/com/stack/practice/array)    


<br> <br>
<h3>Implementing Stack using Linked List:</h3>

    Advantage:
    - Has a variable size, can increase or decrease the size

    Disadvantage:
    - Moderate in implementation.

<b>Note: Please check the readMe section of Stack(via Linked List) </b> 
[Stack Implementation using Linked List!](https://github.com/tusharsaran/datastructures/tree/master/Stack/src/com/stack/practice/likedlist)   

<br> <br>
<h3>Time and space Complexity of Stack :</h3>

<p>Please make sure the time and space complexity should be the same while implementing using Array or Linked List</p>


    Operation                                Time					  Space
    Create a stack                           O(1)					  O(1)
    Delete a stack                           O(1)					  O(1)
    Push  		                         O(1)					  O(1)
    Pop   		                         O(1)					  O(1)
    Peek     	                         O(1)				  	  O(1)
    IsEmpty   	                         O(1)					  O(1)
    isFull    	                         O(1)					  O(1)
