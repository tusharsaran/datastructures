<h2>Implementing stack using Array:</h2>

<b> Operations: </b>


	  1.Create : For creating a stack following are the steps:
    
        - We will create topOfStack and assign the value -1.
        - We will create an array of a particular size
              int[] stack = new int[5];
        - we will increment the value of topOfStack to 1;  
    
    2. Push -  inserting value in stack, if the statck is full then throw  `stack overflow error`
        
       - check if the stack is full if full then throw `stack overflow error`
       -  if not full then insert the value in array next to the first element
       - increment the value of topOfStack to prevous topOfStack + 1;


     3. Pop - removing value from stack, if the statck is empty then throw  `stack underflow error`
        
       - check if the stack is empty if full then throw `stack underflow error`
       -  if not empty then remove the last element from the stack
       - decrease the value of topOfStack to prevous topOfStack - 1;
       
     4. Peek - is similar to pop but it does not remove value from stack it only returns the value of last elemnt, if the 
               statck is empty then throw  `stack underflow error`
        
       - check if the stack is empty if full then throw `stack underflow error`
       -  if not empty then find the last element from the stack using topOfStack
      
     5. isEmptyStack -  check if the stack is empty
     
      -  check if topOfStack value is -1 if yes then return true or else false.
      
     6. isFullStack -  check if the stack is full
      
      - compare the value of topOfStack with the array lenght if both are equal that means the stack is full.
      
     7. deleteStack -  deleting the stack
     
      - make the array as null
      - and topOfStack to -1
