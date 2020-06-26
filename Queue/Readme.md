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
    - if the queue is empty than  beginingQueue and endQueue both are -1 
         -  point `beginingQueue == endQueue + 1` 
         -  point `endqueue ==  endQueue + 1` 
    -  else
         insert in queue :  `queue[endQueue + 1] = data`;
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

     6.enQueue (insert) -  here the concept is also slightly change, lets see:
     
                Algo:
                - if the queue is Full that means `(endQueue + 1) % N == beginingQueue`  exit from method  ----> this is same
                - if the queue is empty than  beginingQueue and endQueue both are -1  ----> this is same
                    -  point `beginingQueue == endQueue + 1` (i.e. 0)
                    -  point `endqueue ==  endQueue + 1` (i.e. 0)
                -  else
                        -  insert in queue :  `queue[(endQueue + 1) % N]  = data`;
                        -  point `endqueue == [endQueue + 1] % N` 
     
              lets see with the same example: 
              here we way array of 5 that has only 3 element and the `endQueue is pointing to 5th element i.e. [9]` and `beginingQueue pointing to 2nd        
              element i.e.[1]`
          
              [][][1][4][9]
              
              now we will enque one record i.e. 45
              
                -> so it will go to first condition if queue is full it is not here queue is not full so it will skip this condition also 
                -> then it will check it it is empty queue here queue is not empty so it will skip this condition also
                -> it will insert a record in queue based on the following formulae:
                    - `queue[(endQueue + 1) % N]  = data`
                    => queue[(4 + 1) % 5]  = 45
                    => lets calculate the inner formulae i.e (endQueue + 1) % N , here endqueue is pointing to cell 4 and N =  total size of array
                    => (endQueue + 1) % N =>  (4 + 1) % 5
                    =>  (4 + 1) % 5 =>  5 % 5 = 0
                    => queue[0] = 45
     
     
     7.deQueue (remove) : here dequeue also has slightly concept, lets see
     
                - if the queue is empty that means `endQueue == -1 && beginingQueue == -1`  exit from method -- it is same and nothing to change
                - else if beginingQueue ==  endQueue  then `endQueue ==  && beginingQueue == -1`-- it is same and nothing to change
                - else if beginingQueue !=  endQueue then  `beginingQueue =  (beginingQueue + 1) % N`;
                
                
                Lets check the dequeue funtionality, here we will take the same example:
                    
                [][][1][4][3]
                
                now we will invoke deque it will go to the code and check :
                - if the queue is empty no it is not so it will skip this condition
                - if beginingQueue ==  endQueue here beginingQueue is pointing to cell 2 and endqueue is pointing to cell 4 so it will skip this condition
                - if beginingQueue !=  endQueue this condition is true as beginingQueue is pointing to cell 2 and endqueue is pointing to cell 4 and they are not 
                equal so it will deque the element based on the formulae:
                beginingQueue =  (beginingQueue + 1) % N
                => beginingQueue = (2 + 1) % 5
                                 = 3 % 5 
                                 = 3 (3 % 5 = 3 and not 0 or 0.6 why lets see 
                                     if the operation is 12 % 5 then 5 * 2 = 10 which is smaller than 12 and 5 * 3 = 15 so we will take 5 * 2 = 10
                                     so 12  - 10 = 2 
                                     similarly for any first digit smaller than the second digit it will multiply by 0 so in this case it will be
                                     => 3 % 5
                                     => 3 - (5 * 0)
                                     => 3  - 0
                                     => 3
                                 
                                 
 
