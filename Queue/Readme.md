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
 
 
 
