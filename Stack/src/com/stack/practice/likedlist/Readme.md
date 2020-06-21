<h2>Implementation using Linked List :</h2>

- By default you need to implement using Singly linked List
- Make sure to cover the rule of the stack that is LIFO principles
- Make sure all the operation should be implemented in the the Order of 1
 	Including Push and pop.
- Time as well as space complexity for all operation should be O(1)



<br> <br>
<h3>Stack Operations using linked list:</h3>

      Mostly the stack operations using linked list are almost same only for Push and Pop methods that's why we are 
      only going to cover here what is the change.

      While implementing stack using linked list one thing that we have to sure is that the implementation should be in 
      such a manner that it applies Time Complexity and Space complexity as order of 1

      Therefore at the time of implementing Pop and Push functionality we have to come up with a different logic other than 
      the one that we used in Linked List.

      So let’s say we have a created a first node  with value 20 and want to push a node of value 185
      So in this case the node will be inserted before the first node

      1. Here first node with value 20 with address 001 is created and the head or top points to 20 node

      -----------                           -------------
      |    |    |                           |    |      |
      |TOP(001) |------------------------>	| 20 | null |				
      |___ |____|  		                |    |      |
                                            -------------
                                                      001
     
     
     2. New node created of value 185 
      
      
    -----------                             -------------                            -------------
    |    |    |                             |    |      |                            |    |      |   
    | TOP(002)|------------------------>	| 185| 20   |------------------------>	 | 20 | null |				
    |    |    |  		                |    |      |                            |    |      |
    -----------                             -------------                             -------------
                                                      002                                       001
