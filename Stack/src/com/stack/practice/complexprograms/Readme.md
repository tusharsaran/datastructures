<h3> Infix Postfix & Prefix </h3>

<b>1. Infix:</b>

    Evaluation of Arithmetic or Logical expressions
    
    An expression can have constants , variables , symbols,parenthesis, operators etc. these expressions are arranged according 
    to the set of rule.
    e.g.
  
    2 + 3
    p + q 
    (a* b) + c
    
    <b>Expression has a common structure:</b>
    
    <operand> <operator> <operand>
    Operand : an object or value on which operation is performed
    
    p + q here p and q are operand and  
    + is an operator.
    
    This is the most common way of writing expression but this is not the only way.
    This way in which we write operator between Operands is called `INFIX`
    
    We can also have complex Infix where we have multiple expression
    (a* b) + (c* d) -- here we have two expressions here (a* b) and (c* d). Once common this is operator is used in middle of
    operand.
    
    Note:  here we are doing operations on Binary Operators.
    
    In case of complex expression like :
    
    2 * 3 + 5  can be 6 + 5 = 11 or 2 * 8 =  16 so here we can have 2 answers but how to we calculate Infix expressions.
    
<h2> OPERATOR PRECEDENCE AND ASSOCIATIVITY </h2>

    For such kind of expression we have certain rules that is also known Operator Precedence and Operator Associativity.
    
    Rule: Precedence also known as Order of Operators
     
     1. Paranthesis () {} []
     2. Exponent ^(power of)  2^3 =  2*2*2 = 8  -----  Associativity  (Right to Left)
     3. Mulitplication and Division ---------  Associativity  (Left to Right)
     4. Addition and Subtraction ---------  Associativity  (Left to Right)
     
     
     Lets take a complex expression and calculate using Operator Precedence and Operator Associativity
     2 * 5 / 2 + 3 * (2+3) = ?
     
     So here we will first apply Operator Precedence 
        - so first come Parenthesis (2+3) =>    2 * 5 / 2 + 3 * 5
        - next come Mulitplication and Division, now we have both operators 2 * 5 / 4 so we will used Operator Associativity 
        which is Left to right so:
        =>  2 * 5 / 2 + 3 * 5 = > 10 / 2 + 3 * 5  = > 5 + 3 * 5 => 5 + 15 = > 20;
    
    Infix expression can cause lot of ambiguity therefore there are 2 more way of expressions which will nremove the ambiguity
    and also we dont have to worry about Operator Precedence and Operator Associativity.
  
 
 <br><br>  
 <b>2. Postfix</b>(also known as Reverse Polish notation)
    
      They are the easiest to parse and least costly based on time and space complexity.
       Structure of Postfix -   <operand> <operand> <operator>
        
        here:  
        a + b can be written as =>  a b +
        a + b * c  =>   a  b c * + -- here operand is only associated with one operator 
    
<br><br>      
<b>3. Prefix (also known as Polish notation) </b>
        
       Structure of Prefix -  <operator> <operand> <operand> 
        
        here:  
        a + b can be written as => + a b
        a + b * c  =>  + a * b c  -- here operand is only associated with one operator 
        
<br><br>
<table>
<tr>
<th>Expression</th><th>Infix</th><th>Prefix</th><th>Postfix</th>
</tr>
<tr>
<th>2 + 3</th><th>2 + 3</th><th>+ 2 3</th><th>2 3 +</th>
</tr>
<tr>
<th>p - q</th><th>p - q</th><th>- p q</th><th>p q -</th>
</tr>
<tr>
<th>a + b * c</th><th>a + b * c</th><th>+ a * b c</th><th>a b c * +</th>
</tr>
</table>



<br> <br>
<h2> Evaluation of Expression from Infix to  Postfix </h2>

<br>
        
        We have seen what is infix and postfix now lets see how to evaluate or parse an infix to postfix.
        Lets say we have the following expression:
        9 + 4 * 3 - 2
        
        so the first thing we will do is we will start adding expression in stack lets see the algorithm of 
           adding it in stack
            
            Rule :  we will keep the operand in String and push only the operator in stack 
            Infix = 9 + 4 * 3 - 2 * 5
            Output =  9 + 4 3 *  - 2 * 5
                   => 9 + 4 3 *  - 2 5 *
                   => 9 4 3 * +  - 2 5 *
                   => 9 4 3 * + 2 5 *
            Output  => 9 4 3 * + 2 5 * -
                   
                a. we will create a stack and a String 
                b. we will start from left 9 is operand so 9 will be stored in string
                c. next + is operator so we will check if the stack is not empty and since its the first operator we will 
                move it 
                d. next 4 is operand so  4 will be appended in string
                5. next * is operator so we will check if the stack is not empty here stack is not empty now we check in 
                the stack if the precedence of the top of the stack is higher then this next operator we will append this 
                to the String and pop the value from stack.
                we will do the same for the other operators present in the stack till the stack is not empty.
                
                In this case we will check if + has more precedence than * then we will append + since * is higher we will 
                append * in string
                6. next we have 3 its a operand we will append it 
                7.  next -  we will do the same since  - is same as plus so here the precedence is same  but then we will 
                check the associativity here since it is left to right so + (in stack) has higer associativity  in this case 
                we will append the + to string and pop + out of stack 
                now we will push - in the stack
                8. next 2 we will append
                9. next * we will check if the stack is not empty here stack is not empty now we check in 
                the stack if the precedence of the top of the stack is higher then this next operator we will append this 
                to the String and pop the value from stack.
                we will do the same for the other operators present in the stack till the stack is not empty.Since * is 
                higher we will append t the string
                10. next 5 we will append in string 
                11. next we are left with -  in stack we will append that too.
                
            
            
            pseudo code :
            
            public void infixtopostfix(char[] exp){
            
            create stack;
            String output = null;
            for(i = 0 ; i , exp.length - 1; i++){
            if(exp[i] != operator){
                output = output.append(exp[i]);
            }else if(exp[i] == operator){
                while(!stack.empty) && topOfStackHasHigerPrecedence(exp[i], stack){
                    output = output.append(stack.top);
                    stack.pop;  
                }
                stack.push(exp[i]);
            }//end of else if
         }//end of for
             while(!stack.empty){
              output = output.append(stack.top);
               stack.pop;
               }
            return output;   
            }
            
            
<br> <br>

<h2> Evaluation of Expression from Infix to  Prefix </h2>

it is same like postfix the oly thing is we have to loop the expression from right to left.

            
            pseudo code :
            
            public void infixtopostfix(char[] exp){
            
            create stack;
            String output = null;
            for(i = exp.length - 1 ; i >= 0, ; i--){
            if(exp[i] != operator){
                output = output.append(exp[i]);
            }else if(exp[i] == operator){
                while(!stack.empty) && topOfStackHasHigerPrecedence(exp[i], stack){
                    output = output.append(stack.top);
                    stack.pop;  
                }
                stack.push(exp[i]);
            }//end of else if
         }//end of for
             while(!stack.empty){
              output = output.append(stack.top);
               stack.pop;
               }
            return output;   
            }
            
            
     
        
