**Lets see how the Facorial class works:**

  Below is the code snippet from <b>"Factorial_MoreOptimized"</b> class:
  
    static int findFactorial(int num) {
      if(num < 1) {
        return 1;
      }else {
        return (num * findFactorial(num -1));
      }
    }

<br>
 <p> So when the main method will call the `findFactorial(5)` - with the value 5: </p>
 <p>  1. it will check if the num i.e. 5 < 1 if yes then return 1 or else call num * findFactorial(5-1) => 5 *  
         findFactorial(4) here we dont know the value of findFactorial(4) so in the stack it will store the value as:</p>
  <table>
    <thead>
    </thead>
    <tbody>
        <b> STACK </b>
        <tr>
          <td><pre>POP           PUSH</pre></b></td>
         </tr>
      <tr>
          <td> <b>  </b></td>
         </tr>
      <tr>
          <td> <b>  </b></td>
         </tr>
       <tr>
          <td> <b>  </b></td>
         </tr>
       <tr>
          <td> <b>  </b></td>
         </tr>  
      <tr>
          <td> <b> 5 * ? </b></td>
         </tr>
    </tbody>
  </table>
 
   
  
  <p> 2. then it will again it check if the num i.e. 4 < 1 if yes then return 1 or else call num * findFactorial(4-1) => 4 *  
         findFactorial(3) here we dont know the value of findFactorial(3) so in the stack it will store the value as:</p>
  
  <table>
    <thead>
    </thead>
    <tbody>
      <b>STACK </b>
        <tr>
          <td><pre>POP           PUSH</pre></td>
         </tr>
      <tr>
          <td> <b>  </b></td>
         </tr>
      <tr>
          <td> <b>  </b></td>
         </tr>
       <tr>
          <td> <b>  </b></td>
         </tr>
       <tr>
          <td> <b> 4 * ?  </b></td>
         </tr>  
      <tr>
          <td> <b> 5 * ? </b></td>
         </tr>
    </tbody>
  </table>
  
 <p> Similarly it will do it for the rest of the numbers till the num < 1 i.e. the value of num  == 0.</p>
  
   <table>
    <thead>
    </thead>
    <tbody>
      <b>STACK </b>
        <tr>
          <td><pre>POP           PUSH</pre></td>
         </tr>
      <tr>
          <td> <b> 1 * ? </b></td>
         </tr>
      <tr>
          <td> <b> 2 * ? </b></td>
         </tr>
       <tr>
          <td> <b> 3 * ?  </b></td>
         </tr>
       <tr>
          <td> <b> 4 * ? </b></td>
         </tr>  
      <tr>
          <td> <b> 5 * ? </b></td>
         </tr>
    </tbody>
  </table>
  
 
  
  Now when the value of num < 1 it enters the if case (if  num < 1), prints the value "the number is  : 0) but jvm will not  
  call the return statement as if it does then the return statement   will come out of the showNumber(0) and due to that  
  it is not going to call the statements part of other recursion methods (showNumber(1), showNumber(2), showNumber(3), 
  showNumber(4), showNumber(5)) failing the functionality of stack. 
  Therefore it is going to call the rest of the statements of recurvise method that are part of else block. And once it 
  calls/prints all the recursive method, it will then call the return statement in else block (returning the value of num).
  Here the method will return the value of num  == 5 as before calling the return statement the value of um was 5.
  
