# How Fibonacci code works

<p>Definition:  A fibonacci series is a series of numbers in which each number is sum of two preceding numbers</p>
First 2 numbers by definition are 0 and 1   
<p>e.g.</p>  

`0,1,1,2,3,5,8,13,21.......`

<br>     
 OR
<br>
<br>

First 2 numbers by definition are 1 and 1
<p>e.g. </p>  

`1,1,2,3,5,8,13,21.......`

<br>
<h2>In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation</h2>

`Fn = Fn-1 + Fn-2`

<h3>with seed values</h3>

`F0 = 0 and F1 = 1.`

<br>
<br>
<b>Here is the following code snippet:</b>
  
    static int findNumberInFibonacci(int num) throws Exception {
      if(num <  1) {
        throw new Exception("number cannot be less than 1");
      }else if(num == 1 || num ==2) {
        return num - 1;
      }else {
        return findNumberInFibonacci(num - 2) + findNumberInFibonacci(num - 1) ;	
      }
    }
    
 <h3> Now how the code work when you try to find the 4th number in fibonacci series:</h3>
 
 1. So the first thing is it is going to check if num  < 1 , since it is 4 then it is going to the else loop to check 
 if num == 1 or num == 2 , since it is neither 1 or 2 so it is going to the next case where its going to return
 findNumberInFibonacci(4 - 2) + findNumberInFibonacci(4 - 1) since we dont know he value of findNumberInFibonacci(2) + 
 findNumberInFibonacci(3) its going to store in stack.
 
 <b>findNumberInFibonacci(4 - 2) + findNumberInFibonacci(4 - 1) ==> findNumberInFibonacci(2) + findNumberInFibonacci(3)</b>
 
 1a. Now it is going to call findNumberInFibonacci(2) with the value 2 so it check if num  < 1 , since it is false then 
 it is going to the else loop to check if num == 1 or num == 2 , since it is 2 it is going to return 2 - 1.
 
 <b>so the value of findNumberInFibonacci(2) = 1</b>
 
 1b. next it is going to call findNumberInFibonacci(3) with the value 3 so it check if num  < 1 , since it is false then 
 it is going to the else loop to check if num == 1 or num == 2 , since it is neither 1 or 2 so it is going to the next 
 case where its going to return findNumberInFibonacci(3 - 2) + findNumberInFibonacci(3 - 1).
 
 <b>findNumberInFibonacci(3 - 2) + findNumberInFibonacci(3 - 1) ==> findNumberInFibonacci(1) + findNumberInFibonacci(2)</b>
 
 <b>we already got the value of findNumberInFibonacci(2) i.e. = 1</b>. 
 
 Now lets find the value of findNumberInFibonacci(1).
 <b>findNumberInFibonacci(1) is equal to case 1 or 2 so it will return num - 1 i.e. 1 - 1 = 0.</b>
 
     so fibonacci of 4 = findNumberInFibonacci(4 - 2) + findNumberInFibonacci(4 - 1)
                       => findNumberInFibonacci(2) + findNumberInFibonacci(3)
                       we got the value of findNumberInFibonacci(2) = 2 so
                       => 1 + findNumberInFibonacci(3)
                       => 1 + (findNumberInFibonacci(3 - 2) + findNumberInFibonacci(3 - 1))
                       => 1 + (findNumberInFibonacci(1) + findNumberInFibonacci(2))
                       => 1 + ((num - 1) + 1)
                       => 1 + (0 + 1)
                       = 1 + 1
                       => 2
   so the output of 4th number in fibonacci series is 2                
 
 
 
 
 
 
 
 
 
 
 
 
 
 
