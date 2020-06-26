<h2> Queue </h2>

Queue is a linear data structure that follows the concept of FIFO (First in first out).
Queue is same like a real world queue where u have group of people, numbers , elements etc are there and the  one enter first in the queue be the one who will
be out first. 

In the queue you can only enter from the last. One cannot enter from first or in between.

It is implemeneted using the Physical data strture (like Stack) i.e.

- Array
- Linked List


<br>
<h3> Operations in Queue </h3>

- createQueue
- enQueue (insert)
- deQueue (remove)
- peekInQueue (get Queue data)
- isFull  ------------------ only implemented in Arrays and is not applicable in Linked List
- isEmpty
- deleteQueue



<br>
<h3> Types of Queue </h3>

- Linear Queue : Linear queue can be implemented by Arrays and Linked List both
- Circular Queue : Circular queue can only be implemented by Arrays

<br>
<h2>Queue Operations VIA Arrays Algo :</h2>


1. createQueue(size):
    - create queue (array) based on size. `int[] queue = new int[size]`
    - set `beginingQueue == -1`
    - set `endQueue == -1`
    
 
 2. isEmpty
    - check if `endQueue == -1 && beginingQueue == -1` return true else false
 
 
 3. isFull
    - check if `endQueue == array.length` return true else false
    
 4. deleteQueue
    - make array as null  `queue =  null`
          
                                                         
 5. enQueue(data):
    - if the queue is Full that means `endQueue ==  array.length`  exit from method
    -  else create queue :  `queue[endQueue + 1] = data`;
    - if the queue is empty than  beginingQueue and endQueue both are -1 
         -  point `beginingQueue == endQueue + 1` 
         -  point `endqueue ==  endQueue + 1` 
    -  if queue is not empty than 
        point `endqueue == endQueue + 1` 
                        

 6. deQueue():
    - if the queue is empty that means `endQueue == -1 && beginingQueue == -1`  exit from method
    - else if beginingQueue !=  endQueue then  `beginingQueue =  beginingQueue  + 1`;
    - else if beginingQueue ==  endQueue  then `endQueue == -1 && beginingQueue == -1`
 
 7. peekInQueue ()
    - if the queue is empty that means `endQueue == -1 && beginingQueue == -1`  exit from method
    - else  `return queue[beginingQueue]`;
 
 
 
 <br><br>
 <h2>Circular Queue</h2>
 Before we define what is circular queue  lets understand one scenario:
 
 Assume we have a normal queue array of size 5. 
 
 [2][3][1][4][9] - here we have 5 elements and the  `beginingQueue is pointing to [2]` and  `endQueue is pointing to [9]` 
                   
 Now if we call isFull() it will return true.
 
 <br>
 <p>Now we will invoke dequeue  it will return  
    
    [][3][1][4][9] 
    
 and if we call dequeue it will return  
 
    [][][1][4][9] 
 <b>If we again call isFull it will return true which logically is not correct coz we have two empty cells</b></p>
 
 <br>
 Now to fix this kind of issue we have a concept of <br>Circular Queue.</br>
 
 <br>
 Ciricular queue has some diffenent concepts for fewof it operations.

     1.createQueue() - same like Queue nothing change
     2.isEmpty - same like queue nothing change
     3.deleteQueue - same like queue nothing change
     4.peekInQueue - same like queue nothing change
     5.isFull - here the cncept is change let see :
              
              Algo:
              - check if `(endQueue + 1) % N == beginingQueue` return true else false ----> Here N represents the size of an array      
         
              lets see : 
              here we way array of 5 that has only 3 element and the `endQueue is pointing to 5th element i.e. [9]` and `beginingQueue pointing to 2nd        
              element i.e.[1]`
          
              [][][1][4][9] 

               now lets see if it full or not by using the formuale used above `(endQueue + 1) % N == beginingQueue`
                => (4 + 1) % 5 == 2
                => 5 % 5 == 2
                => 0 == 2  =>  Queue is not Full 
                
                Again lets see with another example this time we have added one element in array, this time the beginingQueue is pointing to the 1st cell
                [][2][1][4][9] 
                
                => (4 + 1) % 5 == 1
                => 5 % 5 == 1
                => 0 == 1  =>  Queue is not Full 
                
               One last example: this time we have all the elements in array full with data, this time the beginingQueue is pointing to the 0th cell
               [6][2][1][4][9]
               
               => (4 + 1) % 5 == 0
                => 5 % 5 == 0
                => 0 == 0     =>  Queue is Full 

     6.enQueue (insert) - 
     7.deQueue (remove)

 
 
 
